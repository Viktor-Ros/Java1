package HomeWork3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParserJSON{
	
	public static ArrayList<Organization> parserToAddress(String address){
	
		ArrayList<Organization> org = new ArrayList<>();
		FileReader reader = null;
		try {
			reader = new FileReader(address);//"jsonHomeWork3.json"
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		JSONParser jsonParser = new JSONParser();
		
		JSONObject jsonObject = null;
		try {
			jsonObject = (JSONObject) jsonParser.parse(reader);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONArray jsonOrg = (JSONArray) jsonObject.get("organization");
		

		for(int i = 0; i < jsonOrg.size(); i++){
			
			JSONObject jsO = (JSONObject) jsonOrg.get(i);
			LocalDate dateOpen = LocalDate.parse((CharSequence) jsO.get("OpenDate"));
					
			JSONArray secO = (JSONArray) jsO.get("Securities");
			ArrayList<Securities> sec = new ArrayList<>();
			
			for(int j = 0; j < secO.size(); j++){
				JSONObject se = (JSONObject) secO.get(j);
				LocalDate date = LocalDate.parse((CharSequence) se.get("endDate"));
				sec.add(new Securities(se.get("id"), date, se.get("currency")));
			}
			
			org.add(new Organization(jsO.get("Name"), jsO.get("ShortName"), jsO.get("Adress"),
					jsO.get("Phone"), jsO.get("INN"), jsO.get("OGRN"), dateOpen, sec));
		}
		return org;
	}
	
	static LocalDate dateParse(String dateStr) {
		
		LocalDate date = null;
		DateTimeFormatter form = null;
		
		if(dateStr.length() == 10) {
			
			if(dateStr.charAt(2) == '/') {
				form = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
			}
			else form = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);	
		}
		
		else {
			
			if(dateStr.charAt(2) == '/') {
				form = DateTimeFormatter.ofPattern("dd/MM/yy", Locale.ENGLISH);
			}
			else form = DateTimeFormatter.ofPattern("dd.MM.yy", Locale.ENGLISH);	
		}
		
		return date = LocalDate.parse(dateStr,form);
	}
}
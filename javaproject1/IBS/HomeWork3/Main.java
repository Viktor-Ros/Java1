package HomeWork3;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader reader = new FileReader("jsonHomeWork3.json");
		
		JSONParser jsonParser = new JSONParser();
		
		JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
		JSONArray org = (JSONArray) jsonObject.get("organization");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy", Locale.US);

		System.out.println("Организации:");
		
		for(int i = 0; i < org.size(); i++){
			JSONObject JO = (JSONObject) org.get(i);
			LocalDate date = LocalDate.parse((CharSequence) JO.get("OpenDate"));
			System.out.println(JO.get("ShortName") + " - Дата основания " + date.format(formatter));
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		LocalDate nowDate = LocalDate.now();
		
		System.out.println("Просроченные ценные бумаги:");

		int count = 0;
		for(int i = 0; i < org.size(); i++){
			
			JSONObject JO = (JSONObject) org.get(i);
			JSONArray sec = (JSONArray) JO.get("Securities");
			
			for(int j = 0; j < sec.size(); j++){
				
				JSONObject se = (JSONObject) sec.get(j);
				LocalDate date = LocalDate.parse((CharSequence) se.get("endDate"));
				
				if(nowDate.isAfter(date)) {
					System.out.println("ID: " + se.get("id") + " Дата истечения: " + se.get("endDate") + " Название организации: " + JO.get("Name"));
					count++;
				}
			}
		}
		System.out.println("Просроченных ценных бумаг:" + count + "шт.");

		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Введите дату для поиска организаций:");
		
		//String dateStr = new Scanner(System.in).nextLine();
		
		String dateStr = "04/02/03";
		LocalDate date = dateParse(dateStr);
		
		for(int i = 0; i < org.size(); i++){
			
			JSONObject JO = (JSONObject) org.get(i);
			LocalDate dateJO = LocalDate.parse((CharSequence) JO.get("OpenDate"));

			if(dateJO.isAfter(date)) {
				System.out.println(JO.get("ShortName") + " - Дата основания " + dateJO.format(formatter));
			}
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Введите код валюты ценных бумаг:");
		
		//String curСode = new Scanner(System.in).nextLine();
		String curСode = "USD";
		
		for(int i = 0; i < org.size(); i++){
			
			JSONObject JO = (JSONObject) org.get(i);
			JSONArray sec = (JSONArray) JO.get("Securities");
			
			for(int j = 0; j < sec.size(); j++){
				
				JSONObject se = (JSONObject) sec.get(j);
				
				if(se.get("currency").equals(curСode)) {
					System.out.println("ID: " + se.get("id") + " Код валюты: " + se.get("currency") );
				}
			}
		}	
	}
	
	static LocalDate dateParse(String dateStr) {//метод для парсинга даты
		
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
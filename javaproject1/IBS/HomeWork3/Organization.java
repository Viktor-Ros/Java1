package HomeWork3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Organization {

	private Object name;
	private Object shortName;
	private Object address;
	private Object phone;
	private Object inn;
	private Object ogrn;
	private LocalDate openDate;
	private ArrayList<Securities> secList;
	
	Organization(Object name, Object shortName, Object address, Object phone,
			Object inn, Object ogrn, LocalDate openDate, ArrayList<Securities> secList) {
		
		this.name = name;
		this.shortName = shortName;
		this.address = address;
		this.phone = phone;
		this.inn = inn;
		this.ogrn = ogrn;
		this.openDate = openDate;
		this.secList = secList;	
	}
	
	public String getName() {
		return (String) name;
	}
	
	public String getShortName() {
		return (String) shortName;
	}
	
	public LocalDate getOpenDate() {
		return (LocalDate) openDate;
	}
	
	public ArrayList<Securities> getSecuritiesList(){
		return secList;
	}
}
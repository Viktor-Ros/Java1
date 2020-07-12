package HomeWork3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		String address = "jsonHomeWork3.json";
		
		ArrayList<Organization> orgList = ParserJSON.parserToAddress(address);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy", Locale.ENGLISH);

		for(Organization org : orgList){
			System.out.println("Краткое название: " + org.getShortName() 
			+ ", Дата основания: " + org.getOpenDate().format(formatter));	
		}
		
		int count = 0;
		LocalDate nowDate = LocalDate.now();
		 
		for(Organization org : orgList){

			ArrayList<Securities> secList = org.getSecuritiesList();	
			
			for(Securities sec : secList){
				
				if(nowDate.isAfter(sec.getEndDate())){
					System.out.println("ID: " + sec.getId()
					+ " Дата истечения: " 
				+ sec.getEndDate() + " Название организации: " + org.getName());
					count++;
				}
			}
		}
		System.out.println("Просроченных ценных бумаг:" + count + "шт.");

		
		System.out.println("Введите дату для поиска организаций:");
		
		String dateSearch = new Scanner(System.in).nextLine();
		
		LocalDate date = ParserJSON.dateParse(dateSearch);

		for(Organization org : orgList){
						
			if(org.getOpenDate().isAfter(date)) {
				System.out.println("Название организации: " + org.getName() 
				+ "  Дата основания " + org.getOpenDate());
			}
		}

		System.out.println("Введите код валюты ценных бумаг:");

		String curСode = new Scanner(System.in).nextLine();
		
		for(Organization org : orgList){

			ArrayList<Securities> secList = org.getSecuritiesList();	
			
			for(Securities sec : secList){
				
				if(sec.getCurrencyCod().equals(curСode)) {
					System.out.println("ID: " + sec.getId() + " Код валюты: " + sec.getCurrencyCod());
				}
			}
		}
	}
}
package com.gridnine.testing;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Flight> listFlight = FlightBuilder.createFlights();
		
		for(int i = 0; i < listFlight.size(); i++) {//перебор полетов
			
			System.out.println("Полет " + " ::::::::::::::::::::::::::::::::::::::::");

			System.out.println(listFlight.get(i).toString());
			
		}
		
		System.out.println("------------------------------------------------------------------------------");
	
		Filters filters = new Filters(listFlight);
		
		listFlight = filters.Filter();
		
		System.out.println("Полеты после фильтрации:");


		for(int i = 0; i < listFlight.size(); i++) {//перебор полетов
			
			System.out.println("Полет " + " ::::::::::::::::::::::::::::::::::::::::");

			System.out.println(listFlight.get(i).toString());
			
		}
	}

}

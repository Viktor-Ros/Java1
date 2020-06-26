package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Flight> listFlight = FlightBuilder.createFlights();
		
		for(int i = 0; i < listFlight.size(); i++) {//перебор полетов
			
			System.out.println("Полет " + " ::::::::::::::::::::::::::::::::::::::::");

			System.out.println(listFlight.get(i).toString());	
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		//listFlight = Filters.flihgtsFilters(listFlight, new Filter1(LocalDateTime.now()));
		//listFlight = Filters.flihgtsFilters(listFlight, new Filter2(true));
		//listFlight = Filters.flihgtsFilters(listFlight, new Filter3(2));
		//listFlight = Filters.flihgtsFilters(listFlight, new OrFilters(new FlightExcludeFilter(LocalDateTime.now()), new SegmentArrBeforeDepFilter(true), new LandTimeFilter(2)));

		listFlight = Filters.flihgtsFilters(listFlight, new AndFilters(new FlightExcludeFilter(LocalDateTime.now()), new SegmentArrBeforeDepFilter(true), new LandTimeFilter(2)));

		for(int i = 0; i < listFlight.size(); i++) {//перебор полетов
			
			System.out.println("Полет " + " ::::::::::::::::::::::::::::::::::::::::");
			System.out.println(listFlight.get(i).toString());
		}
	}
}
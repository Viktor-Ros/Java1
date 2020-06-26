package com.gridnine.testing;

import java.time.LocalDateTime;


public class FlightExcludeFilter extends Filters{//исключает полеты до определенного момента времени

	private LocalDateTime date;
	
	FlightExcludeFilter(LocalDateTime date){
		
		this.date = date;
	}
	
	@Override
	boolean match(Flight flight) {//исключает полеты до определенного момента времени
				
		LocalDateTime dataFlight = flight.getSegments().get(0).getDepartureDate();//получение даты вылета					
		
		if(date.isAfter(dataFlight) == false) {
			
			return true;
		}
		else return false;
	}
}
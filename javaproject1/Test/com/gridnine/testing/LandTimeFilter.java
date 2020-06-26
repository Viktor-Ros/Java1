package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;

public class LandTimeFilter extends Filters{//исключает полеты, у которых общее время на земле больше заданного времени в часах

	private long landTime;
	
	LandTimeFilter(long landTime){
		
		this.landTime = landTime;
	}
	
	@Override
	boolean match(Flight flight) {
		
		long flightLandTime = 0;//время на земле
		
		for(int i = 1; i < flight.getSegments().size(); i++) {
		
			Segment segment1 = flight.getSegments().get(i);
			Segment segment2 = flight.getSegments().get(i-1);

			LocalDateTime depTime = segment1.getDepartureDate();//время отбытия
			LocalDateTime arTime = segment2.getArrivalDate();//время прибытия 
															
			flightLandTime += Duration.between(arTime, depTime).toHours();
		}
						
		if(flightLandTime <= landTime) {
			return true;
		}	
		else return false;
	}
}
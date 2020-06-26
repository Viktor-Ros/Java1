package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Filters {
	
	abstract boolean match(Flight flight);
	
	static List<Flight> flihgtsFilters(List<Flight> listFlight, Filters filters){
		
		ArrayList<Flight> arraylistFlight = new ArrayList<>();

		for(int i = 0; i < listFlight.size(); i++) {
			
			boolean indicator = false;
						
				if(filters.match(listFlight.get(i)) == true) {
					indicator = true;
				
			}
			
			if(indicator == true) {
				
				arraylistFlight.add(listFlight.get(i));
			}	
		}
		return arraylistFlight;
	}
}
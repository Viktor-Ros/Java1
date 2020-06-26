package com.gridnine.testing;

import java.util.Arrays;
import java.util.List;

public class OrFilters extends Filters{

	
	private List<Filters> filters;
	
	OrFilters(Filters ...filters){
		
		this.filters = Arrays.asList(filters);
	}
	
	
	@Override
	boolean match(Flight flight) {
		
		boolean indicator = false;

		for(int i = 0; i < filters.size(); i++) {
			
			indicator = filters.get(i).match(flight);
				
			if(indicator == true) {
				break;
			}
		}
		
		return indicator;
	}
}
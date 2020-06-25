package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Filters {
	
	private List<Flight> listFlight;
	private LocalDateTime data;
	private boolean arrBeforeDep;
	private long landTime;
	
	Filters(List<Flight> listFlight, LocalDateTime data,boolean arrBeforeDep, long landTime){
		
		this.listFlight = listFlight;
		this.data = data;
		this.arrBeforeDep = arrBeforeDep;
		this.landTime = landTime;
	}
	
	public List<Flight> Filter(){
		
		listFlight = flightExclude(listFlight, data);
		if(arrBeforeDep == true) {
			listFlight = segmentArrBeforeDep(listFlight);
		}
		listFlight = landTime(listFlight, landTime);
		
		return listFlight;
	}
	
	private static List<Flight> flightExclude(List<Flight> listFlight, LocalDateTime data){//исключает полеты до определенного момента времени
				
		ArrayList<Flight> arraylistFlight = new ArrayList<>();	
		for(int i = 0; i < listFlight.size(); i++) {
			LocalDateTime dataFlight = listFlight.get(i).getSegments().get(0).getDepartureDate();//получение даты вылета					
			if(data.isAfter(dataFlight) == false) {
				arraylistFlight.add(listFlight.get(i));
			}
		}
		return arraylistFlight;	
	}
	
	private static List<Flight> segmentArrBeforeDep(List<Flight> listFlight){//исключает полеты с сегментами у которых дата прилета раньше даты вылета
		
		ArrayList<Flight> arraylistFlight = new ArrayList<>();	

		for(int i = 0; i < listFlight.size(); i++) {
						
			for(int j = 0; j < listFlight.get(i).getSegments().size(); j++) {
				
				Segment segment = listFlight.get(i).getSegments().get(j);
								
				if(segment.getDepartureDate().isAfter((segment.getArrivalDate())) == false) {//сравнение даты прилета и даты вылета

					arraylistFlight.add(listFlight.get(i));
					break;
				}
			}
		}
		
		return arraylistFlight;
	}
	
	private static List<Flight> landTime(List<Flight> listFlight, long landTime){//исключает полеты, у которых общее время на земле больше 2-х часов
		
		ArrayList<Flight> arraylistFlight = new ArrayList<>();
		
		for(int i = 0; i < listFlight.size(); i++) {
			
			long flightLandTime = 0;//время на земле
							
				for(int j = 1; j < listFlight.get(i).getSegments().size(); j++) {
				
					Segment segment1 = listFlight.get(i).getSegments().get(j);
					Segment segment2 = listFlight.get(i).getSegments().get(j-1);

					LocalDateTime depTime = segment1.getDepartureDate();//время отбытия
					LocalDateTime arTime = segment2.getArrivalDate();//время прибытия 
																	
					flightLandTime += Duration.between(arTime, depTime).toHours();
				}
								
				if(flightLandTime <= landTime) {
					arraylistFlight.add(listFlight.get(i));
				}	
		}
		return arraylistFlight;
	}	
}
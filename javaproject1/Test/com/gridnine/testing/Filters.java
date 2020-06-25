package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Filters {
	
	private List<Flight> listFlight;
	
	Filters(List<Flight> listFlight){
		
		this.listFlight = listFlight;
	}
	
	public List<Flight> Filter(){
		
		listFlight = FlightBeforeNow(listFlight);
		listFlight = SegmentArrBeforeDep(listFlight);
		listFlight = LandTime(listFlight);
		
		return listFlight;
	}
	
	private static List<Flight> FlightBeforeNow(List<Flight> listFlight){//исключает полеты до текущего момента времени
				
		ArrayList<Flight> arraylistFlight = new ArrayList<>();	
		
		for(int i = 0; i < listFlight.size(); i++) {
			 
			LocalDateTime data = listFlight.get(i).getSegments().get(0).getDepartureDate();//получение даты вылета
						
			LocalDateTime threeDaysFromNow = LocalDateTime.now();//получение текущей даты
			
			if(threeDaysFromNow.isAfter(data) == false) {
				
				arraylistFlight.add(listFlight.get(i));
			}
		}
		
		return arraylistFlight;	
	}
	
	private static List<Flight> SegmentArrBeforeDep(List<Flight> listFlight){//исключает полеты с сегментами у которых дата прилета раньше даты вылета
		
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
	
	private static List<Flight> LandTime(List<Flight> listFlight){//исключает полеты, у которых общее время на земле больше 2-х часов
		
		ArrayList<Flight> arraylistFlight = new ArrayList<>();
		
		for(int i = 0; i < listFlight.size(); i++) {
			
			long landTime = 0;//время на земле
							
				for(int j = 1; j < listFlight.get(i).getSegments().size(); j++) {
				
					Segment segment1 = listFlight.get(i).getSegments().get(j);
					Segment segment2 = listFlight.get(i).getSegments().get(j-1);

					LocalDateTime depTime = segment1.getDepartureDate();//время отбытия
					LocalDateTime arTime = segment2.getArrivalDate();//время прибытия 
																	
					landTime += Duration.between(arTime, depTime).toHours();
				}
								
				if(landTime <= 2) {
					arraylistFlight.add(listFlight.get(i));
				}	
		}
		return arraylistFlight;
	}	
}
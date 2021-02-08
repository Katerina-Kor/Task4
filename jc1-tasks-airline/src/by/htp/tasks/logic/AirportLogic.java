package by.htp.tasks.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.tasks.bean.Airline;
import by.htp.tasks.bean.Time;

public class AirportLogic {
	
	public List<Airline> searchByDestination(List<Airline> airportAirlines, String destinationPoint){
		List<Airline> rezult = new ArrayList<Airline>();
		
		for(Airline currentAirline : airportAirlines) {
			if (currentAirline.getDestinationPoint().equalsIgnoreCase(destinationPoint)) {
				rezult.add(currentAirline);
			}
		}
		return rezult;
		
	}
	
	public List<Airline> searchByDay(List<Airline> airportAirlines, String dayOfWeek){
		List<Airline> rezult = new ArrayList<Airline>();
		
		for(Airline currentAirline : airportAirlines) {		
			if (currentAirline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				rezult.add(currentAirline);
			}
		}
		return rezult;
		
	}
	
	public List<Airline> searchByDayTime(List<Airline> airportAirlines, String dayOfWeek, Time afterThisTime){
		List<Airline> rezult = new ArrayList<Airline>();
		
		for(Airline currentAirline : airportAirlines) {
			Time currentDepatureTime = currentAirline.getDepartureTime();
			if (currentAirline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				if (currentDepatureTime.getHour() > afterThisTime.getHour()) {
					rezult.add(currentAirline);
				}else if (currentDepatureTime.getHour() == afterThisTime.getHour()) {
					if (currentDepatureTime.getMinute() >= afterThisTime.getMinute()) {
						rezult.add(currentAirline);
					}
				}
			}
		}
		return rezult;
	}

}

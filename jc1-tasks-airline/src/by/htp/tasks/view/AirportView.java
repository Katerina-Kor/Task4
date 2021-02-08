package by.htp.tasks.view;

import java.util.List;

import by.htp.tasks.bean.Airline;

public class AirportView {
	
	public void printAirlines (String message, List<Airline> airline) {
		
		
		System.out.println(" -------- " + message + " -------- ");
		
		for(Airline airlines : airline) {
			System.out.println("Plane N" + airlines.getFlightNumber() + " to " + airlines.getDestinationPoint());
			System.out.println("On " + airlines.getDayOfWeek() + " in " + airlines.getDepartureTime());
			System.out.println("***");
		}
		
		System.out.println(" ------------------ ");
	}

}

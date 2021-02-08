package by.htp.tasks.main;

import java.util.List;

import by.htp.tasks.bean.Airline;
import by.htp.tasks.bean.Airport;
import by.htp.tasks.bean.Time;
import by.htp.tasks.logic.AirportLogic;
import by.htp.tasks.view.AirportView;

public class Main {
	public static void main(String[] args) {
		Time t = new Time (12, 00);
		Time t1 = new Time (12, 15);
		Time t2 = new Time(15, 00);
		Time t3 = new Time(16, 45);
		Time t4 = new Time(18, 20);
		Time t5 = new Time(23, 00);
		Time t6 = new Time(23, 55);
		Time t7 = new Time(0, 49);
		Time t8 = new Time(5, 45);
		Time t9 = new Time(7, 25);
		Time t10 = new Time(10, 00);
		
		
		Airline a1 = new Airline ("Moscow", "1256", "AB", t, "Monday");
		Airline a2 = new Airline ("Moscow", "1202", "A", t1, "Monday");
		Airline a3 = new Airline ("Minsk", "1300", "AB", t2, "Tuesday");
		Airline a4 = new Airline ("Berlin", "1500", "B", t3, "Sanday");
		Airline a5 = new Airline ("Paris", "1423", "A", t4, "Thusday");
		Airline a6 = new Airline ("Minsk", "1900", "B", t5, "Thusday");
		Airline a7 = new Airline ("New York", "1314", "AB", t6, "Sanday");
		Airline a8 = new Airline ("Berlin", "1601", "B", t7, "Tuesday");
		Airline a9 = new Airline ("Moscow", "1456", "AB", t8, "Saturday");
		Airline a10 = new Airline ("New York", "0012", "B", t9, "Saturday");
		Airline a11 = new Airline ("Minsk", "9999", "A", t10, "Monday");
		
		Airport PiterAirport = new Airport();
		PiterAirport.add(a1);
		PiterAirport.add(a2);
		PiterAirport.add(a3);
		PiterAirport.add(a4);
		PiterAirport.add(a5);
		PiterAirport.add(a6);
		PiterAirport.add(a7);
		PiterAirport.add(a8);
		PiterAirport.add(a9);
		PiterAirport.add(a10);
		PiterAirport.add(a11);
		
		AirportLogic airportLogic = new AirportLogic();
		AirportView airportView = new AirportView();
		
		List<Airline> airlines;
		airlines = airportLogic.searchByDestination(PiterAirport.getAirlines(), "berlin");
		
		//airportView.printAirlines("List of Flight number which are flying to your city", airlines);
		
		airlines = airportLogic.searchByDay(PiterAirport.getAirlines(), "TUESDAY");
		//airportView.printAirlines("List of Flight number which fly on the day of the week you specified", airlines);
		
		airlines = airportLogic.searchByDayTime(PiterAirport.getAirlines(), "thusday", t5);
		airportView.printAirlines("List of Flight number which fly on the day of the week and after time you specified", airlines);
		
		
		
	}

}

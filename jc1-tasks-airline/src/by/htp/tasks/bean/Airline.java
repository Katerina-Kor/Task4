package by.htp.tasks.bean;

import java.io.Serializable;

public class Airline implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String destinationPoint;
	private String flightNumber;
	private String planeType;
	private Time departureTime;
	private String dayOfWeek;
	
	public Airline() {}
	
	public Airline(String destinationPoint, String flightNumber, String planeType, Time departureTime, String dayOfWeek) {
		this.destinationPoint = destinationPoint;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationPoint == null) ? 0 : destinationPoint.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + ((planeType == null) ? 0 : planeType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationPoint == null) {
			if (other.destinationPoint != null)
				return false;
		} else if (!destinationPoint.equals(other.destinationPoint))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (planeType == null) {
			if (other.planeType != null)
				return false;
		} else if (!planeType.equals(other.planeType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destinationPoint=" + destinationPoint + ", flightNumber=" + flightNumber + ", planeType="
				+ planeType + ", departureTime=" + departureTime + ", dayOfWeek=" + dayOfWeek + "]";
	}

	
	
	

}

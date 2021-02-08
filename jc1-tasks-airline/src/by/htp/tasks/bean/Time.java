package by.htp.tasks.bean;

public class Time {
	private int hour;
	private int minute;
	
	public Time() {
		hour = 0;
		minute = 0;
	}
	
	public Time(int hour, int minute) {
		if (hour > 23 || hour < 0) {
			hour = 0;
		}else {
			this.hour = hour;
		}
		
		if (minute > 59 || minute < 0) {
			minute = 0;
		}else {
			this.minute = minute;
		}
	}
	
	public void setHour(int hour) {
		if (hour > 23 || hour < 0) {
			hour = 0;
		}else {
			this.hour = hour;
		}
	}
	
	public void setMinute(int minute) {
		if (minute > 59 || minute < 0) {
			minute = 0;
		}else {
			this.minute = minute;
		}
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return hour + ":" + minute;
	}
	
	

}

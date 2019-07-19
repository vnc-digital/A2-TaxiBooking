package com.example.carbooking.Dto;


public class DriverSheduleDto {
	
	private int sheduleId;
	
	private String fromTime;
	
	private String toTime;

	public int getSheduleId() {
		return sheduleId;
	}

	public void setSheduleId(int sheduleId) {
		this.sheduleId = sheduleId;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}


}
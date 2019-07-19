package com.example.carbooking.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="driver_shedule")
public class DriverSchedule {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    @Column(name="shedule_id")
	private int sheduleId;
	
    @Column(name="from_time") 
	private String fromTime;
	
    @Column(name="to_time")
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
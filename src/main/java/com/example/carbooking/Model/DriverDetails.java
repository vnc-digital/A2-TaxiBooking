package com.example.carbooking.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DriverDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="driver_id")
	private int driverId;
	
	@Column(name="driverName")
	private String driverName;
	
	@Column(name="mobileNo")
	private long mobileNo;
	

	@Column(name="status")
	private String status;
	
	@OneToOne
	@JoinColumn(name="car_id")
	private Car car;
	
	@OneToOne(mappedBy = "driverBooking",cascade = CascadeType.ALL)
	private BookingDetails bookingDetails;


	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
	
}

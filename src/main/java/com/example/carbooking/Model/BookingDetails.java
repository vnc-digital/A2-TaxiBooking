package com.example.carbooking.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class BookingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="booking_status")
	private String bookingStatus;
	
	
	@OneToOne
	@JoinColumn(name="car_id")
	private Car carBooking;
	
	@OneToOne
	@JoinColumn(name="driver_id")
	private DriverDetails driverBooking;
	
	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public Car getCarBooking() {
		return carBooking;
	}


	public void setCarBooking(Car carBooking) {
		this.carBooking = carBooking;
	}


	public DriverDetails getDriverBooking() {
		return driverBooking;
	}


	public void setDriverBooking(DriverDetails driverBooking) {
		this.driverBooking = driverBooking;
	}


	public CustomerDetails getCustomerDetailsBooking() {
		return customerDetailsBooking;
	}


	public void setCustomerDetailsBooking(CustomerDetails customerDetailsBooking) {
		this.customerDetailsBooking = customerDetailsBooking;
	}


	public DriverSchedule getDriverSchedulebooking() {
		return driverSchedulebooking;
	}


	public void setDriverSchedulebooking(DriverSchedule driverSchedulebooking) {
		this.driverSchedulebooking = driverSchedulebooking;
	}


	@OneToOne
	@JoinColumn(name="customer_id")
	private CustomerDetails customerDetailsBooking;
	
	
	@OneToOne
	@JoinColumn(name="shedule_id")
	private DriverSchedule driverSchedulebooking;
	

}

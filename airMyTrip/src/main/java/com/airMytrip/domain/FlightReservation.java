package com.airMytrip.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airMytrip.repository.ReservationDao;

@Component
public class FlightReservation implements Reservation {
	
	private String passengerName;
	private String departureTime;
	private String arrivalTime;
	private String departureDate;
	private String arrivalDate;
	private String passengerContact;
private Integer id;
  

@Autowired
ReservationDao  reservationDao;

	@Override
	public boolean createUser(String passengerName, String departureTime, String arrivalTime, String departureDate,
			String arrivalDate, String passengerContact) {
		this.passengerName = passengerName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.passengerContact = passengerContact;
		return true;
	}

	@Override
	public Integer saveUser() {
		System.out.println(this.passengerName);
		return reservationDao.save(this);
		
	}
	
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departTime) {
		this.departureTime = departTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureDate() {
		return this.departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getPassengerContact() {
		return passengerContact;
	}

	public void setPassengerContact(String passengerContact) {
		this.passengerContact = passengerContact;
	}

}

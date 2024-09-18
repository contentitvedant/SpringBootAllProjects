package com.airMytrip.service;


import com.airMytrip.domain.Reservation;

public interface ReservationService {
	
public Reservation  getUser();
public boolean doBookingSignUp(String passengerName, String departureTime, String arrivalTime, String departureDate,
		String arrivalDate, String passengerContact);
}

package com.airMytrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airMytrip.domain.Reservation;

@Service
public class FlightReservationService  implements ReservationService{

	
	@Autowired
	Reservation flightReservation;
	
	@Override
	public Reservation getUser() {
		return flightReservation;
	}

	@Override
	public boolean doBookingSignUp(String passengerName, String departureTime, String arrivalTime, String departureDate,
			String arrivalDate, String passengerContact) {
		boolean isBookingDone = flightReservation.createUser(passengerName, departureTime, arrivalTime, departureDate, arrivalDate, passengerContact);
		if(isBookingDone) {
	 flightReservation.saveUser();
	return isBookingDone;
		}else {
			return false;
		}
	
	}
	
}

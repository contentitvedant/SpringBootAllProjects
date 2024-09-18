package com.airMytrip.domain;

public interface Reservation {
	public boolean createUser(String passengerName, String departTime, String arrivalTime, String DepartureDate
			,String arrivalDate,String passengerContact);
	public Integer saveUser();
}

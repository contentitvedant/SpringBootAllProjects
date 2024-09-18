package com.airMytrip.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airMytrip.domain.FlightReservation;
import com.airMytrip.domain.Reservation;
import com.airMytrip.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	ReservationService reservationService;

	@RequestMapping("/flightreservationpage")
	public String getReservationpage(Model uiModel) {
		Reservation user = reservationService.getUser();
		uiModel.addAttribute("user", user);
		return "flightreservationpage";
	}

	@RequestMapping("/booked")
	public String makeReservation(@ModelAttribute(value = "user") FlightReservation reservation) {
		if (reservationService.doBookingSignUp(reservation.getPassengerName(), reservation.getDepartureTime(),
				reservation.getArrivalTime(), reservation.getDepartureDate(), reservation.getArrivalDate()
				,reservation.getPassengerContact())) {

          return "successfullybooked";
		}else {
			return "flightreservationpage";
		}

	}
	
	@RequestMapping("/successfullybooked")
	public String getSuccessfullyBooked() 
	{
		return "successfullybooked";
	}
	
	
}
//String passengerName, String departureTime, String arrivalTime, String departureDate,
//String arrivalDate, String passengerContact
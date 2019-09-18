package com.tts.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.flightreservation.dto.ReservationRequest;
import com.tts.flightreservation.entities.Flight;
import com.tts.flightreservation.entities.Reservation;
import com.tts.flightreservation.repos.FlightRepository;
import com.tts.flightreservation.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private FlightRepository flightrepo;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightrepo.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";

	}
	
	@RequestMapping(value = "/completeReservation",method = RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation Id is :" + reservation.getId());
		return "reservationConfirmation";
	}

}

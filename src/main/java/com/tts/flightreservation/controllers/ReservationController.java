package com.tts.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.flightreservation.entities.Flight;
import com.tts.flightreservation.repos.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	private FlightRepository flightrepo;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightrepo.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";

	}

}

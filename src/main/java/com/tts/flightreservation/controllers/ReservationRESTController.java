package com.tts.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.flightreservation.dto.ReservationUpdateRequest;
import com.tts.flightreservation.entities.Reservation;
import com.tts.flightreservation.repos.ReservationRepository;

@RestController
public class ReservationRESTController {
	
	@Autowired
	ReservationRepository reservationRepo;

	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Reservation reservation = reservationRepo.findById(id).get();
		return reservation;
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepo.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNumOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		Reservation updateReservation = reservationRepo.save(reservation);
		return updateReservation;
	}
}

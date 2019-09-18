package com.tts.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.flightreservation.dto.ReservationRequest;
import com.tts.flightreservation.entities.Flight;
import com.tts.flightreservation.entities.Passenger;
import com.tts.flightreservation.entities.Reservation;
import com.tts.flightreservation.repos.FlightRepository;
import com.tts.flightreservation.repos.PassengerRepository;
import com.tts.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		//Make Payment
		
		
		Long flightId =  request.getFlightId();
		
		Flight flight =  flightRepo.findById(flightId).get();
						
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		
		Passenger savedPassenger = passengerRepo.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		
		Reservation savedReservation =reservationRepo.save(reservation);
		return savedReservation;
	}

}

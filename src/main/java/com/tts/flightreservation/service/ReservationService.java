package com.tts.flightreservation.service;

import com.tts.flightreservation.dto.ReservationRequest;
import com.tts.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}

package com.tts.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}

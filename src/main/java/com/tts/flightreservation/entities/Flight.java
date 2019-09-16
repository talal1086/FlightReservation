package com.tts.flightreservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{

	@Column(name = "flight_number")
	private String flightNumber;
	@Column(name = "operating_airlines")
	private String operatingAirlines;
	@Column(name = "departure_city")
	private String departureCity;
	@Column(name = "arrival_city")
	private String arrivalCity;
	@Column(name = "date_of_departure")
	private Date dateOfDeparture;
	@Column(name = "estimated_departure_time")
	private Timestamp estimatedDepartureTime;


	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

}

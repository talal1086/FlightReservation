<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compete Reservation</title>
</head>
<body>

<h2>Compete Reservation</h2>

	Airline: ${flight.operatingAirlines }
	<br /> Departure City: ${flight.departureCity }
	<br /> Arrival City: ${flight.arrivalCity }
	<br />Flight Time: ${flight.estimatedDepartureTime }
	<br />
	<form action="completeReservation" method="post">
		<pre>
			<h2> Passenger Details</h2>
			First Name:<input type="text" name="passengerFirstName" />
			Middle Name:<input type="text" name="passengerMiddleName" />
			Last Name:<input type="text" name="passengerLastName" />
			Email:<input type="text" name="passengerEmail" />
			Phone:<input type="text" name="passengerPhone" />
			<h2> Card Details</h2>
			Name On the Card:<input type="text" name="NameOnTheCard" />
			Card Number:<input type="text" name="cardNumber" />
			Expiration Date:<input type="text" name="expirationDate" />
			Security Code:<input type="text" name="securityCode" />
			
			<input type="hidden" name="flightId" value="${flight.id}" />
			<input type="submit" value="Confirm" />
		</pre>
	</form>

</body>
</html>
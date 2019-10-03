package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSeeker {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("London", true);
        airports.put("New York", true);
        airports.put("Berlin", true);
        airports.put("Paris", true);

        if (!airports.containsKey(flight.getDepartureAirport()) || !airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightSeeker seeker = new FlightSeeker();

        Flight flight1 = new Flight("London", "Paris");
        Flight flight2 = new Flight("Warsaw", "Vienna");

        try {
            seeker.findFlight(flight2);
            System.out.println("Route exists");
        } catch (RouteNotFoundException e) {
            System.out.println("Flight does not exist");
        }

        System.out.println("Try another one");
    }
}
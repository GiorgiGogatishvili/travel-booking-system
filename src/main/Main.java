package main;

import agency.*;
import booking.*;
import people.*;
import trip.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Giorgi", "giorgi@mail.com");
        Agent agent = new Agent("Nika", "Manager");

        Flight flight = new Flight("Lufthansa", new BigDecimal("300"));
        Hotel hotel = new Hotel("Hilton", new BigDecimal("120"), 2);
        Taxibooking taxi = new Taxibooking("Taxi", new BigDecimal("40"), LocalDateTime.now());

        Service[] services = {flight, hotel, taxi};

        Schedule schedule = new Schedule(LocalDate.now(), services);
        Trip trip = new Trip("Rome", schedule);

        Payment payment = new Payment(new BigDecimal("460"));
        Booking booking = new Booking(customer, trip, payment);

        Agency agency = new Agency("TravelAgency", new Trip[]{trip}, new Booking[]{booking});

        BookingService service = new BookingService();

        System.out.println(agency);
        System.out.println(customer);
        System.out.println("Agent: " + agent.getName());

        for (Service s : services) {
            System.out.println(s + " cost=" + s.calculateCost());
        }

        System.out.println("Total: " + service.calculateTotal(services));
    }
}
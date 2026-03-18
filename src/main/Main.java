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


        Customer customer = new Customer("Giorgi");
        customer.setEmail("giorgi@mail.com");

        Agent agent = new Agent("Nika", "Manager");


        Ticket ticket = new Ticket("T1");
        Voucher voucher = new Voucher("V1", "Hotel discount");


        Flight flight = new Flight("Lufthansa", new BigDecimal("300"));
        Hotel hotel = new Hotel("Hilton", new BigDecimal("120"), 2);
        Taxibooking taxi = new Taxibooking("Taxi", new BigDecimal("40"), LocalDateTime.now());


        Service[] services = {flight, hotel, taxi};


        Schedule schedule = new Schedule(LocalDate.now(), services);


        Trip trip = new Trip("Rome", schedule);
        Trip[] trips = {trip};


        Payment payment = new Payment(new BigDecimal("460"));
        Refund refund = new Refund(new BigDecimal("50"));


        Booking booking = new Booking(customer, trip, payment);
        Booking[] bookings = {booking};


        Agency agency = new Agency("TravelAgency", trips, bookings);


        BookingService bookingService = new BookingService();


        System.out.println(agency);
        System.out.println(customer);
        System.out.println("Agent: " + agent.getName());

        System.out.println("---- Services ----");
        for (Service s : services) {
            System.out.println(s + " cost=" + s.calculateCost());
        }

        System.out.println("Total cost: " + bookingService.calculateTotal(services));
    }
}
        package main;

import agency.BookingService;
import booking.Ticket;
import people.Customer;
import trip.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Giorgi", "giorgi@mail.com");

        Ticket ticket = new Ticket("T123", customer);
        Ticket[] tickets = {ticket};

        Flight flight = new Flight("Lufthansa", new BigDecimal("300"), tickets);
        Hotel hotel = new Hotel("Hilton", new BigDecimal("120"), 2);
        Taxibooking taxi = new Taxibooking(
                "AirportTaxi",
                new BigDecimal("40"),
                LocalDateTime.now()
        );

        Service[] services = {flight, hotel, taxi};

        BookingService bookingService = new BookingService();

        System.out.println("---- CUSTOMER ----");
        System.out.println(customer);
        System.out.println("\n---- TICKET ----");
        System.out.println(ticket);
        System.out.println("\n---- FLIGHT ----");
        System.out.println(flight);
        System.out.println("\n---- HOTEL ----");
        System.out.println(hotel);
        System.out.println("Price per night: " + hotel.getPrice());
        System.out.println("Nights: " + hotel.getNights());
        System.out.println("Hotel cost: " + hotel.calculateCost());
        System.out.println("\n---- TOTAL PRICE ----");
        System.out.println("Total: " + bookingService.calculateTotal(services));
    }
}


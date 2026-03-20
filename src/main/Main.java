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
        agent.setExperienceYears(5);

        Ticket ticket = new Ticket("T1");
        Voucher voucher = new Voucher("V1", "Discount");
        voucher.setDiscountPercent(10);

        Flight flight = new Flight("Flight1", new BigDecimal("300"));
        flight.setAirline("Lufthansa");
        flight.setSeatCount(180);

        Hotel hotel = new Hotel("Hotel1", new BigDecimal("120"), 2);
        hotel.setStars(5);

        Taxibooking taxi = new Taxibooking("Taxi1", new BigDecimal("40"), LocalDateTime.now());
        taxi.setDriverName("Giorgi");
        taxi.setCarModel("Prius");

        Service[] services = {flight, hotel, taxi};

        Schedule schedule = new Schedule(LocalDate.now(), services);

        Trip trip = new Trip("Rome", schedule);

        Payment payment = new Payment(new BigDecimal("460"));
        Refund refund = new Refund(new BigDecimal("50"));
        refund.setReason("Cancel");

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
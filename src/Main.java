import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Giorgi", "giorgi@mail.com");

        Ticket ticket = new Ticket("12A", customer);
        Ticket[] tickets = {ticket};

        Flight flight = new Flight("Lufthansa", new BigDecimal("350.00"), tickets);

        Hotel hotel = new Hotel("Central Hotel", new BigDecimal("120.00"));

        Taxibooking taxi = new Taxibooking("Airport", LocalDateTime.of(2026,6,10,14,30));

        Trip trip = new Trip("Rome", LocalDate.of(2026,6,10), flight, hotel, taxi);

        Trip[] trips = {trip};

        Agency agency = new Agency("TravelAgency", trips);

        Payment payment = new Payment(Agency.calculatePrice(flight.getPrice()));

        Booking booking = new Booking(customer, trip, payment);

        System.out.println("Agency: " + agency.getName());
        System.out.println("Destination: " + trip.getDestination());
        System.out.println("Customer: " + booking.getCustomer().getName());
        System.out.println("Total payment: " + booking.getPayment().getAmount());
    }
}
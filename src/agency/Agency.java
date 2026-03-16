package agency;

import booking.Booking;
import booking.Payment;
import people.Customer;
import trip.Trip;

import java.math.BigDecimal;

public class Agency {

    private String name;
    private Trip[] trips;
    private Booking[] bookings;

    private static BigDecimal serviceFee;

    static {
        serviceFee = new BigDecimal("25.00");
    }

    public Agency(String name, Trip[] trips, Booking[] bookings) {
        this.name = name;
        this.trips = trips;
        this.bookings = bookings;
    }

    public String getName() {
        return name;
    }

    public Trip[] getTrips() {
        return trips;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    public Booking bookTrip(Customer customer, Trip trip, BigDecimal price) {

        BigDecimal total = price.add(serviceFee);

        Payment payment = new Payment(total);

        Booking booking = new Booking(customer, trip, payment);

        return booking;
    }
}

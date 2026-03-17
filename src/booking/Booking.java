package booking;

import people.Customer;
import trip.Trip;

public class Booking {

    private Customer customer;
    private Trip trip;
    private Payment payment;

    public Booking(Customer customer, Trip trip, Payment payment) {
        this.customer = customer;
        this.trip = trip;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Booking for " + customer.getName();
    }
}
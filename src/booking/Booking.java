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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
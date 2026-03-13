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

    public Trip getTrip() {
        return trip;
    }

    public Payment getPayment() {
        return payment;
    }
}
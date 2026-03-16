package booking;

import people.Customer;

public class Ticket extends TravelDocument {

    private Customer customer;

    public Ticket(String number, Customer customer) {
        super(number);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Ticket " + number + " for " + customer.getName();
    }
}
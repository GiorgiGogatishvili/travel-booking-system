public class Ticket {

    private String seat;
    private Customer customer;

    public Ticket(String seat, Customer customer) {
        this.seat = seat;
        this.customer = customer;
    }

    public String getSeat() {
        return seat;
    }

    public Customer getCustomer() {
        return customer;
    }
}
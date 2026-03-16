package trip;

import booking.Ticket;
import java.math.BigDecimal;

public class Flight extends Service {

    private Ticket[] tickets;

    public Flight(String name, BigDecimal price, Ticket[] tickets) {
        super(name, price);
        this.tickets = tickets;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    @Override
    public BigDecimal calculateCost() {
        return price;
    }

    @Override
    public String toString() {
        return "Flight " + name + " price=" + price;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Flight) {
            Flight f = (Flight) obj;
            return name.equals(f.name);
        }
        return false;
    }
}
import java.math.BigDecimal;

public class Flight {

    private String airline;
    private BigDecimal price;
    private Ticket[] tickets;

    public Flight(String airline, BigDecimal price, Ticket[] tickets) {
        this.airline = airline;
        this.price = price;
        this.tickets = tickets;
    }

    public String getAirline() {
        return airline;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Ticket[] getTickets() {
        return tickets;
    }
}
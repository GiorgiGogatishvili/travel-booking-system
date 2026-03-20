package trip;

import java.math.BigDecimal;

public class Flight extends Service {

    private String airline;
    private int seatCount;

    public Flight(String name, BigDecimal price) {
        super(name, price);
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public BigDecimal calculateCost() {
        return price;
    }

    @Override
    public String toString() {
        return "Flight: " + name + ", airline=" + airline + ", price=" + price;
    }
}
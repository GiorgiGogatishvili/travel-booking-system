package trip;

import java.math.BigDecimal;

public class Flight extends Service {

    public Flight(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public BigDecimal calculateCost() {
        return price;
    }

    @Override
    public String toString() {
        return "Flight: " + name + ", price=" + price;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
package trip;

import java.math.BigDecimal;

public class Flight extends Service {

    public Flight(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public BigDecimal calculateCost() {
        return price.add(new BigDecimal("10"));
    }

    @Override
    public String toString() {
        return "Flight: " + name + ", price=" + price + "Gel";
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
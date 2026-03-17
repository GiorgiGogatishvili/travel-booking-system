package trip;

import java.math.BigDecimal;

public class Hotel extends Service {

    private int nights;

    public Hotel(String name, BigDecimal price, int nights) {
        super(name, price);
        this.nights = nights;
    }

    @Override
    public BigDecimal calculateCost() {
        return price.multiply(new BigDecimal(nights));
    }
}
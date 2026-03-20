package trip;

import java.math.BigDecimal;

public class Hotel extends Service {

    private int nights;
    private int stars;

    public Hotel(String name, BigDecimal price, int nights) {
        super(name, price);
        this.nights = nights;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public BigDecimal calculateCost() {
        return price.multiply(new BigDecimal(nights));
    }
}
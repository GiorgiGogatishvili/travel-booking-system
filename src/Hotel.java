import java.math.BigDecimal;

public class Hotel {

    private String name;
    private BigDecimal pricePerNight;

    public Hotel(String name, BigDecimal pricePerNight) {
        this.name = name;
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }
}
import java.math.BigDecimal;

public class Agency {

    private String name;
    private Trip[] trips;

    private static BigDecimal serviceFee;

    static {
        serviceFee = new BigDecimal("20.00");
    }

    public Agency(String name, Trip[] trips) {
        this.name = name;
        this.trips = trips;
    }

    public String getName() {
        return name;
    }

    public Trip[] getTrips() {
        return trips;
    }

    public static BigDecimal calculatePrice(BigDecimal basePrice) {
        return basePrice.add(serviceFee);
    }
}
package trip;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Taxibooking extends Service {

    private LocalDateTime pickupTime;

    public Taxibooking(String name, BigDecimal price, LocalDateTime pickupTime) {
        super(name, price);
        this.pickupTime = pickupTime;
    }

    @Override
    public BigDecimal calculateCost() {
        return price;
    }
}
package trip;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Taxibooking extends Service {

    private LocalDateTime pickupTime;
    private String driverName;
    private String carModel;

    public Taxibooking(String name, BigDecimal price, LocalDateTime pickupTime) {
        super(name, price);
        this.pickupTime = pickupTime;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public BigDecimal calculateCost() {
        return price;
    }
}
import java.time.LocalDateTime;

public class Taxibooking {

    private String pickupLocation;
    private LocalDateTime pickupTime;

    public Taxibooking(String pickupLocation, LocalDateTime pickupTime) {
        this.pickupLocation = pickupLocation;
        this.pickupTime = pickupTime;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }
}
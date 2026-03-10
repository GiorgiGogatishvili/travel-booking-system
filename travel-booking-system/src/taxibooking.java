public class taxibooking extends trip{

    private String pickupLocation;

    public taxibooking(String destination, String pickupLocation) {
        super(destination);
        this.pickupLocation = pickupLocation;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
}
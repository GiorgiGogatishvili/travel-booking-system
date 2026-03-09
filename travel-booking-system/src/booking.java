public class booking {

    private static int totalBookings;

    static {
        totalBookings = 0;
        System.out.println("agency system started");
    }

    public static void bookFlight(customer customer, flight flight) {

        if (flight.getSeats() > 0) {

            flight.setSeats(flight.getSeats() - 1);
            totalBookings++;

            System.out.println("Flight booked for " + customer.getName()
                    + " to " + flight.getDestination());

        } else {
            System.out.println("No seats available");
        }
    }

    public static int getTotalBookings() {
        return totalBookings;
    }
}
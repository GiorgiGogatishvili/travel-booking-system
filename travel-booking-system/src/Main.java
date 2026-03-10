public class Main {

    public static void main(String[] args) {

        customer customer = new customer("Giorgi", "giorgi@mail.com");

        flight flight = new flight("Rome", 5);
        taxibooking taxi = new taxibooking("Airport", "Hotel");

       booking.bookFlight(customer, flight);

        System.out.println("Taxi booked from "
                + taxi.getPickupLocation()
                + " to "
                + taxi.getDestination());

        System.out.println("Total bookings: " +
                booking.getTotalBookings());
    }
}

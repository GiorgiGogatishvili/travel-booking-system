public class Main {

    public static void main(String[] args) {

        customer customer = new customer("Giorgi", "gogatishviligio@mail.com");

        flight flight = new flight("Rome", 5);

        booking.bookFlight(customer, flight);

        System.out.println("Total bookings: " +
                booking.getTotalBookings());
    }
}
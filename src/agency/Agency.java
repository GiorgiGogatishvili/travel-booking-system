package agency;

import booking.Booking;
import trip.Trip;

public class Agency {

    private String name;
    private Trip[] trips;
    private Booking[] bookings;

    static {
        System.out.println("Agency class loaded");
    }

    public Agency(String name, Trip[] trips, Booking[] bookings) {
        this.name = name;
        this.trips = trips;
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Agency: " + name;
    }
}
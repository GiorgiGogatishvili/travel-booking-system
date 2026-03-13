import java.time.LocalDate;

public class Trip {

    private String destination;
    private LocalDate date;
    private Flight flight;
    private Hotel hotel;
    private Taxibooking taxi;

    public Trip(String destination, LocalDate date, Flight flight, Hotel hotel, Taxibooking taxi) {
        this.destination = destination;
        this.date = date;
        this.flight = flight;
        this.hotel = hotel;
        this.taxi = taxi;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public Flight getFlight() {
        return flight;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Taxibooking getTaxi() {
        return taxi;
    }
}
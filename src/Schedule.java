import java.time.LocalDate;

public class Schedule {

    private LocalDate date;
    private Flight flight;
    private Hotel hotel;
    private Taxibooking taxi;

    public Schedule(LocalDate date, Flight flight, Hotel hotel, Taxibooking taxi) {
        this.date = date;
        this.flight = flight;
        this.hotel = hotel;
        this.taxi = taxi;
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
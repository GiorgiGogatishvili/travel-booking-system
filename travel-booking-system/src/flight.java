public class flight extends trip {

    private int seats;

    public flight(String destination, int seats) {
        super(destination);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
package trip;

public class Ticket extends TravelDocument {

    public Ticket(String number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Ticket: " + number;
    }
}
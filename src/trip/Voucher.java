package trip;

public class Voucher extends TravelDocument {

    private String description;

    public Voucher(String number, String description) {
        super(number);
        this.description = description;
    }
}
package trip;

public class Voucher extends TravelDocument {

    private String description;
    private int discountPercent;

    public Voucher(String number, String description) {
        super(number);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
}
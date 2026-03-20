package trip;

public abstract class TravelDocument {

    protected String number;

    public TravelDocument(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
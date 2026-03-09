public class agency {

    private customer tourist;
    private trip travel;

    public agency(customer tourist, trip travel) {
        this.tourist = tourist;
        this.travel = travel;
    }

    public customer getcustomer() {
        return tourist;
    }

    public void setcustomer(customer tourist) {
        this.tourist = tourist;
    }

    public trip gettripl() {
        return travel;
    }

    public void settrip(trip travel) {
        this.travel = travel;
    }
}
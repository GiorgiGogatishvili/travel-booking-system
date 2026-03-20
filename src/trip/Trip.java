package trip;

public class Trip {

    private String destination;
    private Schedule schedule;

    public Trip(String destination, Schedule schedule) {
        this.destination = destination;
        this.schedule = schedule;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
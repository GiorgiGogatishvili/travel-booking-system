package trip;

import java.time.LocalDate;

public class Schedule {

    private LocalDate date;
    private Service[] services;

    public Schedule(LocalDate date, Service[] services) {
        this.date = date;
        this.services = services;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }
}
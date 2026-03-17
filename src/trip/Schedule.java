package trip;

import java.time.LocalDate;

public class Schedule {

    private LocalDate date;
    private Service[] services;

    public Schedule(LocalDate date, Service[] services) {
        this.date = date;
        this.services = services;
    }

    public Service[] getServices() {
        return services;
    }
}
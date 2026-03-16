package agency;

import trip.Service;
import java.math.BigDecimal;

public class BookingService {

    public BigDecimal calculateTotal(Service[] services) {

        BigDecimal total = BigDecimal.ZERO;

        for (Service s : services) {
            total = total.add(s.calculateCost());
        }

        return total;
    }
}
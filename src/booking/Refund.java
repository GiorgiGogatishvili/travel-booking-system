package booking;

import java.math.BigDecimal;

public class Refund extends Transaction {

    private String reason;

    public Refund(BigDecimal amount) {
        super(amount);
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
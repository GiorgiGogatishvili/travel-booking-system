package booking;

import java.math.BigDecimal;

public class Transaction {

    protected BigDecimal amount;

    public Transaction(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
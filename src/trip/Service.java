package trip;

import java.math.BigDecimal;

public abstract class Service {

    protected String name;
    protected BigDecimal price;

    public Service(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public abstract BigDecimal calculateCost();
}
package lt.sdacademy.advanced_features.interfaces.findReachest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public abstract class World implements Richest {

    protected String name;
    protected BigDecimal amount;

    public World(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public boolean findRicher (BigDecimal amount) {
        return this.amount.compareTo(amount) < 0;
    }
}

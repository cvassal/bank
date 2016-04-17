package service;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_EVEN;

public class Balance {
    private Double amount;

    public Balance(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void add(Double amount) {
        this.amount += amount;
    }

    public void substract(Double amount) {
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return "Current balance : " + new BigDecimal(amount).setScale(2, ROUND_HALF_EVEN).toString();
    }
}

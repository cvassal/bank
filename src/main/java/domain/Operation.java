package domain;

import java.util.Date;

public class Operation {
    private Double amount;
    private OperationType type;
    private Date date;

    public Operation(Double amount, OperationType type, Date date) {
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public OperationType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "amount : " + amount + "| type : " + type + "| date : " + date;
    }
}

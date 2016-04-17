package domain;

public class Operation {
    private Double amount;
    private OperationType operationType;

    public Operation(Double amount, OperationType operationType) {
        this.amount = amount;
        this.operationType = operationType;
    }

    public Double getAmount() {
        return amount;
    }
}

package service;

import domain.Operation;

import java.util.List;

public class OperationCheck {
    private List<Operation> operations;
    private Balance balance;

    public OperationCheck(List<Operation> operations, Balance balance) {
        this.operations = operations;
        this.balance = balance;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public Balance getBalance() {
        return balance;
    }

    public void print() {
        System.out.println(balance.toString());
        operations.stream().forEach(operation -> System.out.println(operation.toString()));
    }
}

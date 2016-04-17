package service;

import domain.Operation;

import java.util.List;

import static domain.OperationType.DEPOSIT;

public class BalanceService {

    public Balance calculate(List<Operation> operations) {
        Balance balance = new Balance(0D);
        if (operations.isEmpty()) {
            return balance;
        }

        operations.stream().forEach(operation -> {
            if (operation.getType().equals(DEPOSIT)) {
                balance.add(operation.getAmount());
            } else {
                balance.substract(operation.getAmount());
            }
        });

        return balance;
    }
}

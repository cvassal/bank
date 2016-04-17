package repository;

import domain.Account;
import domain.Operation;

public class AccountRepository {
    private Account account;

    public AccountRepository(Account account) {
        this.account = account;
    }

    public void addOperation(Operation operation) {
        account.getOperations().add(operation);
    }
}

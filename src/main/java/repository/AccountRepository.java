package repository;

import domain.Account;
import domain.Operation;

import java.util.List;

public class AccountRepository {
    private Account account;

    public AccountRepository(Account account) {
        this.account = account;
    }

    public void addOperation(Operation operation) {
        account.getOperations().add(operation);
    }

    public List<Operation> getHistory() {
        return account.getOperations();
    }
}

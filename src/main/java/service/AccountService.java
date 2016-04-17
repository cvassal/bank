package service;

import domain.Account;
import domain.Operation;
import repository.AccountRepository;

import static domain.OperationType.DEPOSIT;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(Account account) {
        this.accountRepository = new AccountRepository(account);
    }

    public void deposit(Double amount) {
        accountRepository.addOperation(new Operation(amount, DEPOSIT));
    }
}

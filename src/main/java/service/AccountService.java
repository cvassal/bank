package service;

import domain.Account;
import domain.Operation;
import org.joda.time.DateTime;
import repository.AccountRepository;

import java.util.List;

import static domain.OperationType.DEPOSIT;
import static domain.OperationType.WITHDRAW;

public class AccountService {
    private AccountRepository accountRepository;
    private BalanceService balanceService;

    public AccountService(Account account) {
        this.accountRepository = new AccountRepository(account);
        this.balanceService = new BalanceService();
    }

    public void deposit(Double amount) {
        accountRepository.addOperation(new Operation(amount, DEPOSIT, DateTime.now().toDate()));
    }

    public void withdraw(Double amount) {
        accountRepository.addOperation(new Operation(amount, WITHDRAW, DateTime.now().toDate()));
    }

    public OperationCheck getOperationCheck() {
        List<Operation> history = accountRepository.getHistory();
        return new OperationCheck(history, balanceService.calculate(history));
    }
}
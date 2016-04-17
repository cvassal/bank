package service;

import domain.Account;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountServiceTest {

    @Test
    public void should_make_one_deposit() {
        Account account = new Account();
        AccountService accountService = new AccountService(account);

        accountService.deposit(5D);

        assertThat(account.getOperations()).hasSize(1);
    }

    @Test
    public void should_make_multiple_deposit() {
        Account account = new Account();
        AccountService accountService = new AccountService(account);

        accountService.deposit(5D);
        accountService.deposit(15D);

        assertThat(account.getOperations()).hasSize(2);
    }

    @Test
    public void should_make_one_withdraw() {
        Account account = new Account();
        AccountService accountService = new AccountService(account);

        accountService.withdraw(5D);

        assertThat(account.getOperations()).hasSize(1);
    }

    @Test
    public void should_make_multiple_withdraw() {
        Account account = new Account();
        AccountService accountService = new AccountService(account);

        accountService.withdraw(5D);
        accountService.withdraw(10D);

        assertThat(account.getOperations()).hasSize(2);
    }

    @Test
    public void should_print_history_of_one_deposit() {
        Account account = new Account();
        AccountService accountService = new AccountService(account);
        accountService.deposit(5D);

        OperationCheck operationCheck = accountService.getOperationCheck();

        assertThat(operationCheck.getOperations()).hasSize(1);
        assertThat(operationCheck.getBalance().getAmount()).isEqualTo(5D);
    }
}
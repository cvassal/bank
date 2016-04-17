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
}
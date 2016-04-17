package main;

import domain.Account;
import service.AccountService;

public class App {

    public static void main(String[] args) {
        Account account = new Account();
        AccountService accountService = new AccountService(account);

        accountService.deposit(15.05);
        accountService.withdraw(45.32);
        accountService.deposit(17.36);
        accountService.withdraw(12.8);
        accountService.deposit(200.57);
        accountService.withdraw(120.00);
        accountService.deposit(3467.05);
        accountService.withdraw(36.97);
        accountService.deposit(126.46);
        accountService.withdraw(57.3);
        accountService.deposit(39.3);
        accountService.withdraw(18.4);
        accountService.deposit(46.5);
        accountService.withdraw(90.2);

        accountService.getOperationCheck().print();
    }
}

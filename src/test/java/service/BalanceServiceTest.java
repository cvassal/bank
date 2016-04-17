package service;

import domain.Operation;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static domain.OperationType.DEPOSIT;
import static domain.OperationType.WITHDRAW;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.emptyList;

public class BalanceServiceTest {

    @Test
    public void should_return_empty_balance_when_no_operation() {
        BalanceService balanceService = new BalanceService();

        Balance calculate = balanceService.calculate(emptyList());

        assertThat(calculate.getAmount()).isEqualTo(0D);
    }

    @Test
    public void should_calculate_when_one_deposite() {
        BalanceService balanceService = new BalanceService();
        List<Operation> operations = new ArrayList<>();
        operations.add(new Operation(5D, DEPOSIT, DateTime.now().toDate()));

        Balance calculate = balanceService.calculate(operations);

        assertThat(calculate.getAmount()).isEqualTo(5D);
    }

    @Test
    public void should_calculate_when_multiple_deposite() {
        BalanceService balanceService = new BalanceService();
        List<Operation> operations = new ArrayList<>();
        operations.add(new Operation(5D, DEPOSIT, DateTime.now().toDate()));
        operations.add(new Operation(15D, DEPOSIT, DateTime.now().toDate()));
        operations.add(new Operation(30D, DEPOSIT, DateTime.now().toDate()));

        Balance calculate = balanceService.calculate(operations);

        assertThat(calculate.getAmount()).isEqualTo(50D);
    }

    @Test
    public void should_calculate_when_one_withdraw() {
        BalanceService balanceService = new BalanceService();
        List<Operation> operations = new ArrayList<>();
        operations.add(new Operation(5D, WITHDRAW, DateTime.now().toDate()));

        Balance calculate = balanceService.calculate(operations);

        assertThat(calculate.getAmount()).isEqualTo(-5D);
    }

    @Test
    public void should_calculate_when_withdraws_and_deposits() {
        BalanceService balanceService = new BalanceService();
        List<Operation> operations = new ArrayList<>();
        operations.add(new Operation(15D, DEPOSIT, DateTime.now().toDate()));
        operations.add(new Operation(5D, WITHDRAW, DateTime.now().toDate()));
        operations.add(new Operation(2.05D, WITHDRAW, DateTime.now().toDate()));

        Balance calculate = balanceService.calculate(operations);

        assertThat(calculate.getAmount()).isEqualTo(7.95D);
    }
}
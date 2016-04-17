package domain;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Operation> operations;

    public Account() {
        this.operations = new ArrayList<>();
    }

    public List<Operation> getOperations() {
        return operations;
    }
}

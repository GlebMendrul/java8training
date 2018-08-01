package training.functions;


import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;

import java.util.ArrayList;
import java.util.List;


public class Exercise3Test extends BaseTest {

    private List<Customer> customers = new ArrayList<>();

    @Test
    public void functionTest3() {

    }

    public boolean addCustomer(Customer customer) {
        try {
            beginTransaction();
            boolean success = customers.add(customer);
            commitTransaction();
            return success;
        } catch (Exception e) {
            rollbackTransaction();
        }
        return false;
    }

    public boolean deleteCustomer(Customer customer) {
        try {
            beginTransaction();
            boolean success = customers.remove(customer);
            commitTransaction();
            return success;
        } catch (Exception e) {
            rollbackTransaction();
        }
        return false;
    }

    private void beginTransaction() {
    }

    private void commitTransaction() {
    }

    private void rollbackTransaction() {
    }

}

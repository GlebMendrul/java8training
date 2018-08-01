package training.stream;


import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Exercise4Test extends BaseTest {

    @Test
    public void firstRegistrant() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Find the first customer who registered this online store
         * The customerList are ascending ordered by registered timing.
         */
        Optional<Customer> firstCustomer = null;

        assertThat(firstCustomer.get(), is(customerList.get(0)));
    }

    @Test
    public void isThereAnyoneOlderThan40() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Check whether any customer older than 40 exists or not
         */
        boolean olderThan40Exists = true;

        assertThat(olderThan40Exists, is(false));
    }

    @Test
    public void isEverybodyOlderThan20() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Check whether all customer are older than 20 or not
         */
        boolean allOlderThan20 = false;

        assertThat(allOlderThan20, is(true));
    }

    @Test
    public void everyoneWantsSomething() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Confirm that none of the customer has empty list for their {@link Customer.wantToBuy}
         */
        boolean everyoneWantsSomething = false;

        assertThat(everyoneWantsSomething, is(true));
    }
}

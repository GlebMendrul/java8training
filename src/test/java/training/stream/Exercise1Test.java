package training.stream;


import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class Exercise1Test extends BaseTest {

    @Test
    public void findRichCustomers() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create a {@link Stream} from customerList only including customer who has more budget than 10000.
         * Use lambda expression for Predicate and {@link Stream#filter} for filtering.
         */
        Predicate<Customer> richCustomerCondition = null;
        Stream<Customer> richCustomerStream = null;

        List<Customer> richCustomer = richCustomerStream.collect(Collectors.toList());
        assertThat(richCustomer, hasSize(2));
        assertThat(richCustomer, contains(customerList.get(3), customerList.get(7)));
    }

    @Test
    public void howOldAreTheCustomers() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create a {@link Stream} from customerList with age values.
         * Use method reference(best) or lambda expression(okay) for creating {@link Function} which will
         * convert {@link Customer} to {@link Integer}, and then apply it by using {@link Stream#map}.
         */
        Function<Customer, Integer> getAgeFunction = null;
        Stream<Integer> ageStream = null;

        List<Integer> richCustomer = ageStream.collect(Collectors.toList());
        assertThat(richCustomer, hasSize(10));
        assertThat(richCustomer, contains(22, 27, 28, 38, 26, 22, 32, 35, 21, 36));
    }
}

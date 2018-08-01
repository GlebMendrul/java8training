package training.stream;


import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class Exercise2Test extends BaseTest {

    @Test
    public void sortByAge() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create a stream with ascending ordered age values.
         */
        Stream<Integer> sortedAgeStream = null;

        List<Integer> sortedAgeList = sortedAgeStream.collect(Collectors.toList());
        assertThat(sortedAgeList, contains(21, 22, 22, 26, 27, 28, 32, 35, 36, 38));
    }

    @Test
    public void descSortByAge() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create a stream with descending ordered age values.
         */
        Comparator<Integer> descOrder = null;
        Stream<Integer> sortedAgeStream = null;

        List<Integer> sortedAgeList = sortedAgeStream.collect(Collectors.toList());
        assertThat(sortedAgeList, contains(38, 36, 35, 32, 28, 27, 26, 22, 22, 21));
    }

    @Test
    public void top3RichCustomer() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create a stream with top 3 rich customers
         */
        Stream<String> top3RichCustomerStream = null;

        List<String> top3RichCustomerList = top3RichCustomerStream.collect(Collectors.toList());
        assertThat(top3RichCustomerList, contains("Diana", "Andrew", "Chris"));
    }

    @Test
    public void distinctAge() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create a stream with distinct age values
         */
        Stream<Integer> distinctAgeStream = null;

        List<Integer> distinctAgeList = distinctAgeStream.collect(Collectors.toList());
        assertThat(distinctAgeList, contains(22, 27, 28, 38, 26, 32, 35, 21, 36));
    }

    @Test
    public void itemsCustomersWantToBuy() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create a list with items names stored in {@link Customer.wantToBuy}
         */

        List<String> itemList = null;
        assertThat(itemList,
                contains("small table", "plate", "fork", "ice cream", "screwdriver", "cable", "earphone", "onion",
                        "ice cream", "crisps", "chopsticks", "cable", "speaker", "headphone", "saw", "bond",
                        "plane", "bag", "cold medicine", "chair", "desk", "pants", "coat", "cup", "plate", "fork",
                        "spoon", "ointment", "poultice", "spinach", "ginseng", "onion"));
    }
}

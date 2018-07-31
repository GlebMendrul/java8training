package training.stream;


import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;
import training.util.domain.Shop;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Exercise7Test extends BaseTest {

    @Test
    public void averageAge() {
        List<Customer> customerList = MALL.getCustomerList();

        /**
         * Create {@link IntStream} with customer ages by using {@link Stream#mapToInt}
         * Then calculate the average of ages by using {@link IntStream#average}
         */
        IntStream ageStream = null;
        OptionalDouble average = null;

        assertThat(average.getAsDouble(), is(28.7));
    }

    @Test
    public void howMuchToBuyAllItems() {
        List<Shop> shopList = MALL.getShopList();

        /**
         * Create {@link LongStream} with all items' prices using {@link Stream#mapToLong}
         * Then calculate the sum of prices using {@link LongStream#sum}
         */
        LongStream priceStream = null;
        long priceSum = 0;

        assertThat(priceSum, is(60930L));
    }
}

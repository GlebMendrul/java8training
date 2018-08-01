package training.stream;


import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;
import training.util.domain.Shop;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class Exercise8Test extends BaseTest {

    @Test
    public void itemsNotOnSale() {
        Stream<Customer> customerStream = MALL.getCustomerList().stream();
        Stream<Shop> shopStream = MALL.getShopList().stream();

        /**
         * Create a set of item names that are in {@link Customer.wantToBuy} but not on sale in any shop.
         */
        List<String> itemListOnSale = null;
        Set<String> itemSetNotOnSale = null;

        assertThat(itemSetNotOnSale, hasSize(3));
        assertThat(itemSetNotOnSale, hasItems("bag", "pants", "coat"));
    }
}

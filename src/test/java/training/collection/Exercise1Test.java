package training.collection;

import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * removeIf
 * replaceAll
 * forEach
 * putIfAbsent
 * merge
 * computeIfPresent
 * computeIfAbsent
 */
public class Exercise1Test extends BaseTest {

    @Test
    public void iterateByForEach() {
        Iterable<Customer> customerIterable = MALL.getCustomerList();
        List<String> nameList = new ArrayList<>();

        /**
         * Populate nameList with Customer names
         */
        assertThat(nameList.toString(), is("[Joe, Steven, Patrick, Diana, Chris, Kathy, Alice, Andrew, Martin, Amy]"));
    }

    @Test
    public void whoHaveNoEInYourName() {
        Collection<String> nameCollection = new ArrayList<>(asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Remove elements from {@link nameCollection} which contains "e" .
         */
        assertThat(nameCollection.toString(), is("[Patrick, Chris]"));
    }

    @Test
    public void replaceTheElements() {
        List<String> nameList = new ArrayList<>(asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Replace the elements in {@link nameList} with string wrapped with "()" .
         */
        assertThat(nameList.toString(), is("[(Joe), (Steven), (Patrick), (Chris)]"));
    }

    @Test
    public void sortByName() {
        List<String> nameList =
                new ArrayList<>(asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Sort the name list by their name's length in ascending order.
         */
        assertThat(nameList.toString(), is("[Joe, Chris, Steven, Patrick]"));
    }

    @Test
    public void createStream() {
        Collection<String> nameList =
                new ArrayList<>(asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Create a serial {@link Stream} using
         */
        Stream<String> nameStream = null;

        assertThat(nameStream.count(), is(4L));
        assertThat(nameStream.isParallel(), is(false));
    }

    @Test
    public void createParallelStream() {
        Collection<String> nameList = new ArrayList<>(asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Create a parallel {@link Stream}
         */
        Stream<String> nameParallelStream = null;

        assertThat(nameParallelStream.count(), is(4L));
        assertThat(nameParallelStream.isParallel(), is(true));
    }
}

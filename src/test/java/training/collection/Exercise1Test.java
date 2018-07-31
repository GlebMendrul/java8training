package training.collection;

import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Exercise1Test extends BaseTest {

    @Test
    public void iterateByForEach() {
        Iterable<Customer> customerIterable = MALL.getCustomerList();
        List<String> nameList = new ArrayList<>();

        /**
         * Create a {@link Consumer} which represents an operation to add customer's name to {@link nameList} list.
         * Iterate {@link customerIterable} with {@link Iterable#forEach} and use the {@link Consumer}
         * to finish creating the name list.
         */
        Consumer<Object> consumer;
        // customerIterable.

        assertThat(nameList.toString(), is("[Joe, Steven, Patrick, Diana, Chris, Kathy, Alice, Andrew, Martin, Amy]"));
    }

    @Test
    public void whoHaveNoEInYourName() {
        Collection<String> nameCollection =
                new ArrayList<>(Arrays.asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Create a {@link Predicate} which predicates if the input string contains "e".
         * Remove elements from {@link nameCollection} which contains "e" using {@link Collection#removeIf}.
         */
        Predicate<Object> predicate = null;
        // nameCollection.

        assertThat(nameCollection.toString(), is("[Patrick, Chris]"));
    }

    @Test
    public void replaceTheElements() {
        List<String> nameList =
                new ArrayList<>(Arrays.asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Create a {@link UnaryOperator} which returns given string wrapped with "()".
         * Replace the elements in {@link nameList} with string wrapped with "()" using {@link List#replaceAll} .
         */
        UnaryOperator<Object> unaryOperator = null;
        // nameList.

        assertThat(nameList.toString(), is("[(Joe), (Steven), (Patrick), (Chris)]"));
    }

    @Test
    public void sortByName() {
        List<String> nameList =
                new ArrayList<>(Arrays.asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Create a {@link Comparator} to sort the name list by their name's length in ascending order.
         */
        Comparator<Object> comparator = null;
        // nameList.

        assertThat(nameList.toString(), is("[Joe, Chris, Steven, Patrick]"));
    }

    @Test
    public void createStream() {
        Collection<String> nameList =
                new ArrayList<>(Arrays.asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Create a serial {@link Stream} using {@link Collection#stream}
         * You can learn about {@link Stream} APIs at stream-api module.
         */
        Stream<Object> nameStream = null;

        assertThat(nameStream.count(), is(4L));
        assertThat(nameStream.isParallel(), is(false));
    }

    @Test
    public void createParallelStream() {
        Collection<String> nameList =
                new ArrayList<>(Arrays.asList("Joe", "Steven", "Patrick", "Chris"));

        /**
         * Create a parallel {@link Stream} using {@link Collection#parallelStream} or {@link Stream#parallel}
         */
        Stream<Object> nameParallelStream = null;

        assertThat(nameParallelStream.count(), is(4L));
        assertThat(nameParallelStream.isParallel(), is(true));
    }
}

package training.functions;


import org.junit.Test;
import training.util.domain.BaseTest;

import java.util.Arrays;
import java.util.List;


public class Exercise1Test extends BaseTest {


    private int total(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    private int totalEven(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        return result;
    }

    private int totalOdd(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result += number;
            }
        }
        return result;
    }

    @Test
    public void functionTest1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(total(list));
        System.out.println(totalEven(list));
        System.out.println(totalOdd(list));
    }
}

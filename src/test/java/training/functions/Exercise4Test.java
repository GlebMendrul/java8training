package training.functions;


import org.junit.Test;
import training.util.domain.BaseTest;


public class Exercise4Test extends BaseTest {

    @Test
    public void functionTest4() {

    }

    public int calculate(int a, int b, String operation) {
        if (operation.equals("+")) {
            return a + b;
        }
        if (operation.equals("-")) {
            return a - b;
        }
        if (operation.equals("*")) {
            return a * b;
        }
        if (operation.equals("/")) {
            return a / b;
        }
        return 0;
    }

}

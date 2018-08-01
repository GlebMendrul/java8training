package training.functions;


import org.junit.Test;
import training.util.domain.BaseTest;


public class Exercise2Test extends BaseTest {

    @Test
    public void functionTest2() {
        publishOnlyShortUpperCaseText("ERROR - something bad happened");
        publishOnlyLongUpperCaseText("DEBUG - I'm here");
        publishUpperCaseText("DEBUG - I WIL BE UPPER CASED");
        publishLowerCaseCaseText("DEBUG - I WILL BE LOWE CASED");
    }

    private void publishOnlyShortUpperCaseText(String text) {
        if (text.length() < 20) {
            System.out.println(text.toUpperCase());
        }
    }

    private void publishOnlyLongUpperCaseText(String text) {
        if (text.length() > 20) {
            System.out.println(text.toUpperCase());
        }
    }

    private void publishUpperCaseText(String text) {
        System.out.println(text.toUpperCase());
    }

    private void publishLowerCaseCaseText(String text) {
        System.out.println(text.toLowerCase());
    }
}

package training.util.domain;

import javax.xml.bind.JAXB;
import java.io.File;

public class BaseTest {
    protected static final OnlineShoppingMall MALL =
            JAXB.unmarshal(new File("./src/test/resources/data.xml"), OnlineShoppingMall.class);
}

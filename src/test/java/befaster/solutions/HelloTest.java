package befaster.solutions;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void test_hello_message() {
        Assert.assertEquals(Hello.hello("Mr. X"), "Hello, Mr. X!");
    }
}

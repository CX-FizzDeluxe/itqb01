package befaster.solutions;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test_multiple_of_3() {
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(3));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(21));
    }

    @Test
    public void test_multiple_of_5() {
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(5));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(25));
    }

    @Test
    public void test_multiple_of_3_and_5() {
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(0));
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(15));
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(225));
    }

    @Test
    public void test_not_multiple_of_3_and_5() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzz(1));
        Assert.assertEquals("4", FizzBuzz.fizzBuzz(4));
        Assert.assertEquals("31", FizzBuzz.fizzBuzz(31));
    }
}

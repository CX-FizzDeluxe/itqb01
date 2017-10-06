package befaster.solutions;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzR3Test {

    @Test
    public void test_is_fizz() {
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(3));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(21));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(31));
    }

    @Test
    public void test_is_buzz() {
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(5));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(25));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(52));
    }

    @Test
    public void test_fizz_and_buzz() {
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(0));
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(15));
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(53));
    }

    @Test
    public void test_neither_fizz_nor_buzz() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzz(1));
        Assert.assertEquals("4", FizzBuzz.fizzBuzz(4));
    }
}

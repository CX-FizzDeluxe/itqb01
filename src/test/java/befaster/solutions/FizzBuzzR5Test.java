package befaster.solutions;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzR5Test {

    @Test
    public void test_is_fizz() {
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(21));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(31));
    }

    @Test
    public void test_is_buzz() {
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(10));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(52));
    }

    @Test
    public void test_fizz_and_buzz() {
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(0));
        Assert.assertEquals("fizz buzz", FizzBuzz.fizzBuzz(53));
    }

    @Test
    public void test_is_fizz_and_deluxe() {
        Assert.assertEquals("fizz deluxe", FizzBuzz.fizzBuzz(36));
    }

    @Test
    public void test_is_fizz_and_fake_deluxe() {
        Assert.assertEquals("fizz fake deluxe", FizzBuzz.fizzBuzz(3));
        Assert.assertEquals("fizz fake deluxe", FizzBuzz.fizzBuzz(63));
    }

    @Test
    public void test_is_buzz_and_fake_deluxe() {
        Assert.assertEquals("buzz fake deluxe", FizzBuzz.fizzBuzz(25));
    }

    @Test
    public void test_is_fizz_buzz_and_deluxe() {
        Assert.assertEquals("fizz buzz deluxe", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void test_is_fizz_buzz_and_fake_deluxe() {
        Assert.assertEquals("fizz buzz fake deluxe", FizzBuzz.fizzBuzz(15));
        Assert.assertEquals("fizz buzz fake deluxe", FizzBuzz.fizzBuzz(555));
    }

    @Test
    public void test_neither_fizz_nor_buzz_nor_deluxe() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzz(1));
        Assert.assertEquals("4", FizzBuzz.fizzBuzz(4));
    }
}

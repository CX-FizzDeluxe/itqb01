package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        boolean multipleOf3 = (number % 3) == 0;
        boolean multipleOf5 = (number % 5) == 0;
        if (multipleOf3 && multipleOf5) {
            return "fizz buzz";
        } else if (multipleOf3) {
            return "fizz";
        } else if (multipleOf5) {
            return "buzz";
        } else {
            return number.toString();
        }
    }

}

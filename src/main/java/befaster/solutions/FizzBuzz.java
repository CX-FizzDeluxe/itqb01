package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numAsStr = number.toString();
        boolean isFizz = ((number % 3) == 0) || (numAsStr.indexOf('3') >= 0);
        boolean isBuzz = ((number % 5) == 0) || (numAsStr.indexOf('5') >= 0);
        if (isFizz && isBuzz) {
            return "fizz buzz";
        } else if (isFizz) {
            return "fizz";
        } else if (isBuzz) {
            return "buzz";
        } else {
            return numAsStr;
        }
    }
}

package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numAsStr = number.toString();
        boolean isFizz = ((number % 3) == 0) || (numAsStr.indexOf('3') >= 0);
        boolean isBuzz = ((number % 5) == 0) || (numAsStr.indexOf('5') >= 0);
        boolean isDeluxe = isDeluxe(numAsStr);
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

    private static boolean isDeluxe(String num) {
        if (num.length() < 2) {
            return false;
        }
        char firstDigit = num.charAt(0);
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) != firstDigit) {
                return false;
            }
        }
        return true;
    }
}

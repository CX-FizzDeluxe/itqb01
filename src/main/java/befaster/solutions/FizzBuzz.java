package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numAsStr = number.toString();
        boolean isFizz = ((number % 3) == 0) || (numAsStr.indexOf('3') >= 0);
        boolean isBuzz = ((number % 5) == 0) || (numAsStr.indexOf('5') >= 0);
        boolean isDeluxe = isDeluxe(numAsStr);
        if (!isFizz && !isBuzz && !isDeluxe) {
            return numAsStr;
        }
        String resp = isFizz ? "fizz" : "";
        if (isBuzz) {
            resp = append(resp, "buzz");
        }
        if (isDeluxe) {
            resp = append(resp, "deluxe");
        }
        return resp;
    }

    private static String append(String str, String text) {
        if (str.length() == 0) {
            return text;
        }
        return str + " " + text;
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

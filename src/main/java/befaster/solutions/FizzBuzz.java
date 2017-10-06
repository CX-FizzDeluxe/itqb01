package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numAsStr = number.toString();
        boolean isMultipleOf3 = (number % 3) == 0;
        boolean has3 = numAsStr.indexOf('3') >= 0;
        boolean isFizz;
        boolean isDeluxe = false;
        if (isMultipleOf3 || has3) {
            isFizz = true;
            if (isMultipleOf3 && has3) {
                isDeluxe = true;
            }
        } else {
            isFizz = false;
        }
        boolean isMultipleOf5 = (number % 5) == 0;
        boolean has5 = numAsStr.indexOf('5') >= 0;
        boolean isBuzz;
        if (isMultipleOf5 || has5) {
            isBuzz = true;
            if (isMultipleOf5 && has5) {
                isDeluxe = true;
            }
        } else {
            isBuzz = false;
        }
        boolean isOdd = (number & 1) == 1;
        if (!isFizz && !isBuzz) {
            return numAsStr;
        }
        String resp = isFizz ? "fizz" : "";
        if (isBuzz) {
            resp = append(resp, "buzz");
        }
        if (isDeluxe) {
            resp = append(resp, isOdd ? "fake deluxe" : "deluxe");
        }
        return resp;
    }

    private static String append(String str, String text) {
        if (str.length() == 0) {
            return text;
        }
        return str + " " + text;
    }
}

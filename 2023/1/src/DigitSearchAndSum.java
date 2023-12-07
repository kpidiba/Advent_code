import java.util.List;

public class DigitSearchAndSum {
    private int sumResult = 0; // variable to store the sum result
    // private String input;
    private List<String> stringList;

    // NOTE: Debug constructor help me
    // DigitSearchAndSum(String input) {
    //     this.input = input; // set the input string (String input) to the instance variable inpu
    // }

    DigitSearchAndSum(List<String> stringList) {
        this.stringList = stringList; // set the input string (String input) to the instance variable inpu
    }

    // NOTE: Debug calculate help me
    // public void calculate() {
    //     int digit = 0;
    //     if (checkOneDigit(input)) {
    //         int value = findFirstDigit(input);
    //         digit = Integer.parseInt(value + "" + value);
    //     } else {
    //         digit = Integer.parseInt(findFirstDigit(input) + "" + findLastDigit(input));
    //     }
    //     sumResult = digit;
    // }

    public void calculates() {
        this.stringList.forEach(this::calculateByLine);
    }

    public void calculateByLine(String str) {
        if (checkOneDigit(str)) {
            int value = findFirstDigit(str);
            sumResult += Integer.parseInt(value + "" + value);
        } else {
            sumResult += Integer.parseInt(findFirstDigit(str) + "" + findLastDigit(str));
        }
    }

    public boolean checkOneDigit(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return count == 1;
    }

    private int findFirstDigit(String input) {
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                return Character.getNumericValue(ch);
            }
        }
        return 0; // Return 0 if no digit is found
    }

    private int findLastDigit(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                return Character.getNumericValue(ch);
            }
        }
        return 0; // Return 0 if no digit is found
    }

    public int getSumResult() {
        return sumResult;
    }
}

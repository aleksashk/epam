import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberFirst = initValue();
        int numberFirstNumbers = calculateNumberSize(numberFirst);
        int numberSecond = initValue();
        int numberSecondNumbers = calculateNumberSize(numberSecond);
        boolean compare = comparingNumbers(numberFirstNumbers, numberSecondNumbers);
        boolean equals = isEquals(numberFirstNumbers, numberSecondNumbers);
        String msg = "number of digits in number ["
                + numberFirst + "]" + " < than number of digits in number "
                + "[" + numberSecond + "]";
        if (equals) {
            msg = "number of digits in number ["
                    + numberFirst + "]" + " = number of digits in number "
                    + "[" + numberSecond + "]";
        } else if (compare) {
            msg = "number of digits in number ["
                    + numberFirst + "]" + " > than number of digits in number "
                    + "[" + numberSecond + "]";
        }
        printMsg(msg);
    }

    public static final int MIN_VALUE = -999999;
    public static final int MAX_VALUE = 999999;

    public static int initValue() {
        Random random = new Random();
        return random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static int calculateNumberSize(int number) {
        if (number < 0) {
            number *= -1;
        }
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static boolean comparingNumbers(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }

    public static boolean isEquals(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber;
    }
}

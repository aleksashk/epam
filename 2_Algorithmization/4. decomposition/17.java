import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter number: ";
        printMsg(msg);
        int number = initValue();
        int[] array = initArrayNumbers(number);
        int sumArrayNumbers = calculateSum(array);
        int result = calculate(number, sumArrayNumbers);
        int counter = 1;

        boolean check = isZero(result);
        while (!check) {
            counter++;
            array = initArrayNumbers(result);
            sumArrayNumbers = calculateSum(array);
            result = calculate(result, sumArrayNumbers);
            check = isZero(result);
        }
        msg = "counter is " + counter;
        printMsg(msg);
    }

    static void printMsg(String msg) {
        System.out.print(msg);
    }

    static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int[] initArrayNumbers(int number) {
        int counter = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            counter++;
        }
        int[] array = new int[counter];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }

    static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int calculate(int number, int sum) {
        return number - sum;
    }

    static boolean isZero(int num) {
        return num == 0;
    }

}

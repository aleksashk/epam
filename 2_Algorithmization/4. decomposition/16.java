import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "set the order of numbers k (k > 0): ";
        printMsg(msg);
        int k = initValue();
        while (k <= 0) {
            msg = "you entered wrong value k!!!\nset the order of numbers k (k > 0): ";
            printMsg(msg);
            k = initValue();
        }
        int counter = 0;

        for (int i = (int) Math.pow(10, k - 1); i < (int) Math.pow(10, k); i++) {
            if (isEmpty(i) && isOdd(i)) {
                counter++;
            }
        }

        int[] array = new int[counter];
        for (int i = (int) Math.pow(10, k - 1), j = 0; i < (int) Math.pow(10, k); i++) {
            if (isEmpty(i) && isOdd(i)) {
                array[j] = i;
                j++;
            }
        }

        int x = getNumber(array);
        msg = "first random number in array is " + array[x];
        printMsg(msg);
        int y = getNumber(array);
        msg = "\nsecond random number in array is " + array[y];
        printMsg(msg);
        int sumXY = calculateSum(array, x, y);
        msg = "\nthe sum of two primes consisting only of odd digits is " + sumXY;
        printMsg(msg);
        msg = "\nnumber even numerics in sumXY is " + calculateEvenNumbers(sumXY) + "\n";
        printMsg(msg);

    }

    static void printMsg(String msg) {
        System.out.print(msg);
    }

    static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static boolean isEmpty(int x) {
        boolean result = true;
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    static boolean isOdd(int number) {
        while (number > 0) {
            if (number % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    static int calculateEvenNumbers(int number) {
        int counter = 0;
        while (number > 0) {
            if (number % 2 == 0 && number % 10 != 0) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }

    static int getNumber(int[] array) {
        Random random = new Random();
        return random.nextInt(array.length);
    }

    static int calculateSum(int[] array, int indexFirst, int indexSecond) {
        return array[indexFirst] + array[indexSecond];
    }

}

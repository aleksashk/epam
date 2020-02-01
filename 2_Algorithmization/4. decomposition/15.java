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
            if (isEmpty(i) && isIncreasingSequence(i)) {
                counter++;
            }
        }

        int[] array = new int[counter];
        for (int i = (int) Math.pow(10, k - 1), j = 0; i < (int) Math.pow(10, k); i++) {
            if (isEmpty(i) && isIncreasingSequence(i)) {
                array[j] = i;
                j++;
            }
        }

        printArray(array, k);

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

    static boolean isIncreasingSequence(int number) {
        int size = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            size++;
        }
        int[] array = new int[size];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                return false;
            }
        }
        return true;
    }

    static void printArray(int[] array, int k) {
        int counter = 0;
        printMsg("array empty numbers with oder = " + k + ":\n[");
        for (int e : array) {
            printMsg(e + ", ");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
        printMsg("\b\b]");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter first number: ";
        printMsg(msg);
        int n = initValue();
        int[] arrayEmptyNumbers = initArrayEmptyNumbers(n);
        printTwins(arrayEmptyNumbers, n);

    }

    static void printMsg(String msg) {
        System.out.print(msg);
    }

    static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static boolean isEmpty(int number) {
        boolean result = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    static int[] initArrayEmptyNumbers(int number) {
        int counter = 0;
        for (int i = number; i <= number * 2; i++) {
            if (isEmpty(i)) {
                counter++;
            }
        }
        int[] array = new int[counter];
        for (int i = number, j = 0; i <= number * 2; i++) {
            if (isEmpty(i)) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    static void printTwins(int[] array, int n) {
        String msg = "twins from " + n + " to " + n * 2 + ": ";
        printMsg(msg);
        for (int i = 0, j = i + 1, k = 0; i < array.length - 1; ) {
            if (array[j] - array[i] == 2) {
                msg = "[" + array[i] + ", " + array[j] + "], ";
                printMsg(msg);
                i = j;
                j++;
                k++;
            } else {
                i++;
                j++;
            }
            if (k == 5) {
                System.out.println();
                k = 0;
            }
        }
        msg = "\b\b;";
        printMsg(msg);
    }
}

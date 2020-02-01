import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter k: ";
        printMsg(msg);
        int k = initValue();
        int[] arrayArmstrongNumbers = initArrayArmstrongNumbers(k);
        printArray(arrayArmstrongNumbers);
    }

    static void printMsg(String msg) {
        System.out.print(msg);
    }

    static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int armstrongNumber(int number) {
        int size = 0;
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            size++;
        }
        while (number > 0) {
            sum += (int) Math.pow((number % 10), size);
            number /= 10;
        }
        return sum;
    }

    static boolean isArmstrongNumber(int x) {
        return x == armstrongNumber(x);
    }

    static int[] initArrayArmstrongNumbers(int k) {
        int counter = 0;
        for (int i = 1; i <= k; i++) {
            if (isArmstrongNumber(i)) {
                counter++;
            }
        }
        int[] array = new int[counter];
        for (int i = 1, j = 0; i <= k; i++) {
            if (isArmstrongNumber(i)) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    static void printArray(int[] array) {
        printMsg("[");
        for (int e : array) {
            printMsg(e + ", ");
        }
        printMsg("\b\b]");
    }
}

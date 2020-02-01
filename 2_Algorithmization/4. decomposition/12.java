import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter k: ";
        printMsg(msg);
        int k = initValue();
        msg = "enter n: ";
        printMsg(msg);
        int n = initValue();
        int sizeArray = initArraySize(k, n);
        int[] array = new int[sizeArray];
        fillArray(array, k, n);
        msg = "result array: ";
        printMsg(msg);
        printArray(array);
    }

    static void printMsg(String msg) {
        System.out.print(msg);
    }

    static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int sumNumeric(int number) {
        if (number < 0) {
            number *= -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    static int initArraySize(int k, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (sumNumeric(i) == k) {
                counter++;
            }
        }
        return counter;
    }

    static void fillArray(int[] array, int k, int n) {
        for (int i = 0, j = 0; i < n; i++) {
            if (sumNumeric(i) == k) {
                array[j] = i;
                j++;
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            System.out.print(array[i] + ", ");
            if (j == 10) {
                System.out.println();
                j = 0;
            }
        }
        System.out.print("\b\b];");
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter value size for array: ";
        printMsg(msg);
        int arraySize = initValue();
        int[] array = new int[arraySize];
        initArray(array);
        printArray(array);
        msg = "\n enter start index for sum three elements: ";
        printMsg(msg + '\n');
        int index = initValue();
        boolean validIndex = isValidIndex(array, index);
        if (validIndex) {
            printPartArray(index);
            sumThreeValues(array, index);
        } else {
            msg = "you entered wrong value index: ";
            printMsg(msg + index);
        }
    }

    public static final int MAX_NUMBER = 50;
    public static final int MIN_NUMBER = -50;

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        }
    }

    public static boolean isValidIndex(int[] a, int index) {
        return index < a.length - 3;
    }

    public static void sumThreeValues(int[] array, int index) {
        int sum = 0;
        for (int i = index; i < index + 3; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]");
    }

    public static void printPartArray(int index) {
        for (int i = index; i < index + 3; i++) {
            System.out.print("array[" + i + "] + ");
        }
        System.out.print("\b\b= ");
    }
}

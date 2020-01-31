import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter array size: ";
        printMsg(msg);
        int arraySize = initValue();
        int[] array = new int[arraySize];
        init(array);
        msg = "array: ";
        printMsg(msg);
        printArray(array);
        sortArray(array);
        msg = "\nsecond max element in array is: ";
        printMsg(msg + array[array.length - 2]);

    }

    public static final int MIN = -10;
    public static final int MAX = 10;

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static void printArray(int[] arrary) {
        System.out.print("[");
        for (int e : arrary) {
            System.out.print(e + ", ");
        }
        System.out.print("\b\b]");
    }

    public static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void init(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
    }

    public static void sortArray(int[] array) {
        for (int i = 0, j = i + 1; i < array.length - 1; ) {
            if (array[i] > array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == 0) {
                    i++;
                    j++;
                }
                i--;
                j--;
            } else {
                i++;
                j++;
            }
        }
    }
}

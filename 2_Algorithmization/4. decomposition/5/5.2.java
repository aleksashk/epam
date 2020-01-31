import java.util.Random;
import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {
        String msg = "enter array size: ";
        printMsg(msg);
        int arraySize = initValue();
        int[] array = new int[arraySize];
        init(array);
        msg = "array: ";
        printMsg(msg);
        printArray(array);
        int secondMaxValue = searchSecondMaxValue(array);
        msg = "\nsecond max element in array is: " + secondMaxValue;
        printMsg(msg);

    }

    public static final int MIN = -100;
    public static final int MAX = 100;

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

    public static int searchSecondMaxValue(int[] array) {
        int firstMax = array[0];
        int secondMax = array[1];
        if (firstMax < secondMax) {
            firstMax = array[1];
            secondMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > firstMax) {
                int temp = firstMax;
                firstMax = array[i];
                secondMax = temp;
            } else if (array[i] > secondMax && array[i] < firstMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }
}

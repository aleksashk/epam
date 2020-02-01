import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number = initValue();
        int sizeArray = calculateArraySize(number);
        int[] array = new int[sizeArray];
        fillArray(array, number);
        String msg = "number is " + number;
        printMsg(msg + "\n");
        msg = "array is ";
        printMsg(msg);
        printArray(array);
    }
    public static final int MIN_VALUE = 999;
    public static final int MAX_VALUE = 9999999;

    public static int initValue() {
        Random random = new Random();
        return random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static int calculateArraySize(int number) {
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static void fillArray(int[] array, int number) {
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]");
    }
}

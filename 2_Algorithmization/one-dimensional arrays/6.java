import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter size for array: ";
        printMsg(msg);
        int size = specifyValue();
        int[] array = new int[size];
        msg = "enter min value for array: ";
        printMsg(msg);
        int minValue = specifyValue();
        msg = "enter max value for array: ";
        printMsg(msg);
        int maxValue = specifyValue();
        init(array, minValue, maxValue);
        msg = "source array: ";
        printMsg(msg);
        printArray(array);

        shelSort(array);

        msg = "array after sort: ";
        printMsg(msg);
        printArray(array);

    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static void printArray(int[] m) {
        System.out.print("array is: [");
        for (int elem : m) {
            System.out.print(elem + ", ");
        }
        System.out.print("\b\b]\n");
    }

    public static int specifyValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void init(int[] m, int minValue, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
    }

    public static void shelSort(int[] m) {
        for (int i = 0, j = 1; i < m.length - 1; ) {
            if (m[i] > m[j]) {
                int temp = m[i];
                m[i] = m[j];
                m[j] = temp;
                if (i > 0) {
                    i--;
                    j--;
                } else {
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
    }
}

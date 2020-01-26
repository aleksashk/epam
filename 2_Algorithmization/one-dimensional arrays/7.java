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

        msg = "create second array. enter size for arrayX: ";
        printMsg(msg);
        size = specifyValue();
        int[] arrayX = new int[size];
        msg = "enter min value for arrayX: ";
        printMsg(msg);
        minValue = specifyValue();
        msg = "enter max value for arrayX: ";
        printMsg(msg);
        maxValue = specifyValue();
        init(arrayX, minValue, maxValue);
        msg = "source arrayX: ";
        printMsg(msg);
        printArray(arrayX);
        shelSort(arrayX);
        msg = "arrayX after sort: ";
        printMsg(msg);
        printArray(arrayX);

        size = array.length + arrayX.length;
        int[] arraySuper = new int[size];
        for (int i = 0; i < array.length; i++) {
            arraySuper[i] = array[i];
        }
        for (int i = 0, j = array.length; i < arrayX.length; i++, j++) {
            arraySuper[j] = arrayX[i];
        }

        msg = "source arraySuper: ";
        printMsg(msg);
        printArray(arraySuper);
        shelSort(arraySuper);

        msg = "arraySuper after sort: ";
        printMsg(msg);
        printArray(arraySuper);

        searchIndex(arraySuper, arrayX);

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

    public static void searchIndex(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("index for " + array2[j] + " is [" + i + "]");
                }
            }
        }
    }
}

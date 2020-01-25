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
        sortArray(array);
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
        sortArray(arrayX);
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
        for (int i = array.length; i < arraySuper.length; i++) {
            int x = arraySuper[i];
            int index = binarySortArray(arraySuper, 0, arraySuper.length, x);
            int temp = arraySuper[i];
            for (int j = i; j > index; j--) {
                arraySuper[j] = arraySuper[j - 1];
            }
            arraySuper[index] = temp;
        }
        msg = "arraySuper after sort: ";
        printMsg(msg);
        printArray(arraySuper);

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

    public static void sortArray(int[] m) {
        boolean flag;
        for (int k = 0; k < m.length; k++) {
            flag = true;
            for (int i = 0, j = 1; j < m.length - k; i++, j++) {
                if (m[i] > m[j]) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static int binarySortArray(int[] m, int start, int finish, int x) {

        if ((finish - start) <= 1) {
            if (x < m[start]) {
                return start;
            } else {
                return start + 1;
            }
        }
        if (x > m[start + (finish - start) / 2]) {
            start = start + (finish - start) / 2;
        } else {
            finish = finish - (finish - start) / 2;
        }
        return binarySortArray(m, start, finish, x);
    }
}

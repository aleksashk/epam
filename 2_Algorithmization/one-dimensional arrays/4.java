import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
        int size;
        System.out.print("enter value size for array: ");
        size = initSize();
        array = new int[size];
        init(array, -100, 100);
        printArray(array);
        sortArray(array);
        printArray(array);

    }

    public static void init(int[] m, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static int initSize() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printArray(int[] m) {
        System.out.print("array: [");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + ", ");
        }
        System.out.print("\b\b]\n");
    }

    public static void sortArray(int[] m) {
        int counter = 0;
        for (int k = 0; k < m.length; k++) {
            for (int i = 0, j = 1; i < m.length - 1; i++, j++) {
                if (m[i] > m[j]) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                    counter++;
                }
            }
        }
        System.out.println("counter = " + counter);
    }
}

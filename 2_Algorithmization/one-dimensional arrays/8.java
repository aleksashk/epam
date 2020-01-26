import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] p;
        int[] q;
        int denominator;
        String[] m;
        String msg = "enter size for array: ";
        printMsg(msg);
        int size = specifyValue();
        p = new int[size];
        q = new int[size];
        m = new String[size];
        msg = "enter min value for array: ";
        printMsg(msg);
        int minValue = specifyValue();

        msg = "enter max value for array: ";
        printMsg(msg);
        int maxValue = specifyValue();

        init(p, minValue, maxValue);
        init(q, minValue, maxValue);

        printStringArray(p, q, m);

        denominator = findingCommonDenominator(q);

        msg = "common denominator is: " + denominator;
        printMsg(msg);

        shelSort(p);

        printStringArray(p, denominator, m);

    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static void printStringArray(int[] p, int[] q, String[] m) {
        System.out.print("array is: [");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] = p[i] + "/" + q[i] + ", ");
        }
        System.out.print("\b\b]\n");
    }

    public static void printStringArray(int[] p, int denominator, String[] m) {
        System.out.print("array with common denominator and after sorting is: [");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] = p[i] + "/" + denominator + ", ");
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
            int p = random.nextInt(maxValue - minValue + 1) + minValue;
            while (p == 0) {
                p = random.nextInt(maxValue - minValue + 1) + minValue;
            }
            m[i] = p;
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

    public static int findingCommonDenominator(int[] q) {
        int denominator = 1;
        for (int i = 0; i < q.length; i++) {
            if (q[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < q.length; j++) {
                if (q[j] == 1) {
                    continue;
                }
                if (q[i] == q[j]) {
                    q[j] = 1;
                }
            }
            denominator *= q[i];
        }
        return denominator;
    }
}

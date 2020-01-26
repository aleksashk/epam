import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        String msg = "enter a: ";
        printMsg(msg);
        int a = enterValue();
        msg = "enter b: ";
        printMsg(msg);
        int b = enterValue();
        msg = "enter c: ";
        printMsg(msg);
        int c = enterValue();
        msg = "enter d: ";
        printMsg(msg);
        int d = enterValue();
        int nod;
        nod = searchNod(a, b, c, d);
        msg = "nod is: " + nod;
        printMsg(msg);

    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static int enterValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int searchNod(int a, int b, int c, int d) {
        int nod = 1;
        int[] m = {a, b, c, d};
        int min = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
            }
        }
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}

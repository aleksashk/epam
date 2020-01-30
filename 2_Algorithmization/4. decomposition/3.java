import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter the side value of the regular hexagon: ";
        printMsg(msg);
        int a = initValue();

        double area = calculationArea(a);
        msg = "the area of the regular hexagon with side a = " + a + " is: ";
        printfMsg(msg, area);
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static void printfMsg(String msg, double area) {
        System.out.printf("%s%.4f", msg, area);
    }

    public static int initValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double calculationArea(int a) {
        return Math.pow(a, 2) * 3 * Math.pow(3, 0.5) / 2;
    }
}

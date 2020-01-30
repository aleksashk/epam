import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter number points: ";
        printMsg(msg);
        int numberPoints = giveValue();
        int[][] array = new int[numberPoints][NUMBER_COORDINATES];
        init(array);
        printArray(array);
        printResult(array);

    }

    public static final int MIN = -100;
    public static final int MAX = 100;
    public static final int NUMBER_COORDINATES = 2;

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static void printfMsg(double distance) {
        System.out.printf("%.4f", distance);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("\b\b]");
        }
    }

    public static int giveValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void init(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(MAX - MIN + 1) + MIN;
            }
        }
    }

    public static double calculateDistance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static void printResult(int[][] array) {
        double maxDistance = 0.;
        double distance;
        int firstPoint = 0;
        int secondPoint = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                distance = calculateDistance(array[i][0], array[j][0], array[i][1], array[j][1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    firstPoint = i;
                    secondPoint = j;
                }
            }
        }
        String msg = "max distance: ";
        printMsg(msg);
        printfMsg(maxDistance);
        msg = " between point with coordinates ["
                + array[firstPoint][0] + ", " + array[firstPoint][1]
                + "] and point with coordinates ["
                + array[secondPoint][0] + ", " + array[secondPoint][1] + "];";
        printMsg(msg);
    }
}

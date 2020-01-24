import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] aray;
        int size;
        int max;
        int temp;
        System.out.println("enter number of members in array:");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        aray = new int[size];
        System.out.println("enter value for members if array:");
        for (int i = 0; i < aray.length; i++) {
            aray[i] = scanner.nextInt();
        }

        System.out.print("source sequence: ");

        for (int i = 0; i < aray.length; i++) {
            System.out.printf("%6d", aray[i]);
        }

        for (int i = 0; i < aray.length; i++) {
            for (int j = 0; j < aray.length; j++) {
                if (aray[j] < aray[i]) {
                    temp = aray[i];
                    aray[i] = aray[j];
                    aray[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("sequence after sorting by selection: ");
        for (int i = 0; i < aray.length; i++) {
            System.out.printf("%6d", aray[i]);
        }
    }
}

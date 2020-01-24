import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5, 6, 12};
        int[] ar2 = {7, 8, 9, 10, 11};
        int[] ar3 = new int[ar1.length + ar2.length];
        System.out.println("enter value k (k > 0 and k < ar1.length)");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        while (k < 0 || k >= ar1.length) {
            System.out.println("you entered wrong value for k!!!");
            System.out.println("enter value k (k > 0 and k < ar1.length)");
            k = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            ar3[i] = ar1[i];
        }

        for (int i = k, j = 0; i < k + ar2.length; i++, j++) {
            ar3[i] = ar2[j];
        }

        for (int i = k + ar2.length, j = k; j < ar1.length; i++, j++) {
            ar3[i] = ar1[j];
        }
        for (int i = 0; i < ar3.length; i++) {
            System.out.print(ar3[i] + " ");
        }
    }
}

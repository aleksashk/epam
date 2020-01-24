import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sequenceA;
        int[] sequenceB;
        int[] sequenceC;
        int m;
        int temp;
        int min;
        System.out.println("enter number m - number of members in a sequenceA:");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        while (m <= 0) {
            System.out.println("you entered wrong value m for sequenceA length!");
            System.out.println("enter number m - number of members in a sequenceA:");
            m = scanner.nextInt();
        }
        sequenceA = new int[m];
        System.out.println("enter ascending values for sequenceA members:");
        for (int i = 0; i < sequenceA.length; i++) {
            sequenceA[i] = scanner.nextInt();
        }

        System.out.println("enter number m - number of members in a sequenceB:");
        m = scanner.nextInt();
        while (m <= 0) {
            System.out.println("you entered wrong value m for sequenceA length!");
            System.out.println("enter number m - number of members in a sequenceA:");
            m = scanner.nextInt();
        }
        sequenceB = new int[m];
        System.out.println("enter ascending values for sequenceB members:");
        for (int i = 0; i < sequenceB.length; i++) {
            sequenceB[i] = scanner.nextInt();
        }

        sequenceC = new int[sequenceA.length + sequenceB.length];
        for (int i = 0; i < sequenceA.length; i++) {
            sequenceC[i] = sequenceA[i];
        }
        for (int i = 0, j = sequenceA.length; i < sequenceB.length; i++, j++) {
            sequenceC[j] = sequenceB[i];
        }
        for (int i = 0; i < sequenceC.length; i++) {
            for (int j = 0; j < sequenceC.length; j++) {
                temp = sequenceC[i];
                if (sequenceC[i] < sequenceC[j]) {
                    sequenceC[i] = sequenceC[j];
                    sequenceC[j] = temp;
                }
            }
        }

        for (int i = 0; i < sequenceC.length; i++) {
            System.out.printf("%6d", sequenceC[i]);
        }
    }
}

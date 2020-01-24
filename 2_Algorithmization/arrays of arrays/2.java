//Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {
    public static void main(String[] args) throws IOException {
        System.out.print("Задайте a: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[][]aray = new int[a][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                aray[i][j] = (int)(Math.random() * 100) - 50;
            }
        }
        for (int[] item : aray) {
            for (int items : item) {
                System.out.print(items + ", ");
            }
            System.out.println();
        }
        System.out.println("Вывод на экран элементов, стоящих по диагонали: ");
        System.out.print("\t[ ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i == j) {
                    System.out.print(aray[i][j] + ", ");
                }
            }
        }
        System.out.println("\b\b ]");
        System.out.println("Вывод на экран элементов, стоящих по второй диагонали: ");
        System.out.print("\t[ ");
        for (int i = a - 1; i >= 0; i--) {
            for (int j = 0; j < a; j++) {
                if(a - i - 1 == j) {
                    System.out.print(aray[i][j] + ", ");
                }
            }
        }
        System.out.println("\b\b ]");
    }
}

//Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше последнего.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) throws IOException {
        int numR, numC;
        System.out.print("Задайте количество строк матрицы: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numR = Integer.parseInt(reader.readLine());
        System.out.print("Задайте количество столбцов матрицы: ");
        numC = Integer.parseInt(reader.readLine());
        int[][]matrix = new int[numR][numC];
        //заполняем матрицу произвольными целыми числами
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                matrix[i][j] = (int)(Math.random() * 100) - 25;
            }
        }
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                System.out.print("\t" + matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Вывод на печать всех нечётных столбцов, у которых первый элемент больше последнего.");
        for (int i = 0; i < numR; i++) {
            for (int j = 1; j < numC; j+=2) {
                if(matrix[0][j] > matrix[numR - 1][j]) {
                    System.out.print("\t" + matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

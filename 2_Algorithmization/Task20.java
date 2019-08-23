//Найти положительные элементы главной диагонали квадратной матрицы

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task20 {
    public static void main(String[] args) throws IOException {
        System.out.print("Задайте a (размер квадратной матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[][]aray = new int[a][a];
//заполнение матрицы
        for (int i = 0, f = 0; i < a; i++) {
            for (int j = 0, num = 1; j < a; j++) {
                aray[i][j] = (int)(Math.random() * Math.pow(a,2)) - (int)(Math.pow(a,2) / 2);
            }
        }
        System.out.println("Матрица имеет вид: ");
        for (int[] item : aray) {
            for (int items : item) {
                System.out.print(items + ", ");
            }
            System.out.println("\b\b");
        }
        System.out.println("Положительные элементы главной диагонали квадратной матрицы: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i == j && aray[i][j] > 0){
                    System.out.println("aray[" + i + "][" + j + "] = " + aray[i][j] + ";");
                }
            }
        }
    }
}

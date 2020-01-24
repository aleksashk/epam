//Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task23 {
    public static void main(String[] args) throws IOException {
        int n, m;

        System.out.print("Задайте m (количество строк матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        System.out.print("Задайте n (количество столбцов матрицы): ");
        n = Integer.parseInt(reader.readLine());

        int[][]aray = new int[m][n];
        //заполнение матрицы произвольными числами

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                aray[i][j] = (int)((Math.random() * 10));
            }
        }
        //вывод исходной матрицы
        System.out.println("Исходная матрица имеет вид: ");
        for (int[] es : aray) {
            System.out.print("[");
            for (int e : es) {
                System.out.print(e + ", ");
            }
            System.out.println("\b\b]");
        }

        //сортировка строк по возрастанию
        
        //создаём временню переменную для сортировки
        int temp;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (aray[i][k] < aray[j][k]) {
                        temp = aray[i][k];
                        aray[i][k] = aray[j][k];
                        aray[j][k] = temp;
                    }
                }
            }
        }
        System.out.println("Матрица со столбцами, отсортированными по возрастанию имеет вид: ");
        for (int[] es : aray) {
            System.out.print("[");
            for (int e : es) {
                System.out.print(e + ", ");
            }
            System.out.println("\b\b]");
        }
        
        //сортировка строк по убыванию
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (aray[i][k] > aray[j][k]) {
                        temp = aray[i][k];
                        aray[i][k] = aray[j][k];
                        aray[j][k] = temp;
                    }
                }
            }
        }
        System.out.println("Матрица со столбцами, отсортированными по убыванию имеет вид: ");
        for (int[] es : aray) {
            System.out.print("[");
            for (int e : es) {
                System.out.print(e + ", ");
            }
            System.out.println("\b\b]");
        }
    }
}

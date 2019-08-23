//Найдите наибольший элемент матрицы и замените все нечётные элементы на него.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task25 {
    public static void main(String[] args) throws IOException {
        int n, m, maxNumber;

        System.out.print("Задайте m (количество строк матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        System.out.print("Задайте n (количество столбцов матрицы): ");
        n = Integer.parseInt(reader.readLine());

        int[][] aray = new int[m][n];

        //заполнение матрицы случайными числами
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                aray[i][j] = (int)(Math.random() * 100 - 50);
            }
        }
        //вывод результирующей матрицы
        System.out.println("Составленная матрица имеет вид: ");
        for (int[] es : aray) {
            System.out.print("[");
            for (int e : es) {
                System.out.print(e + ", ");
            }
            System.out.println("\b\b]");
        }
        //поиск максимального числа
        maxNumber = aray[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(aray[i][j] > maxNumber){
                    maxNumber = aray[i][j];
                }
            }
        }
        System.out.println("Максимальное значение в матрице: " + maxNumber);
        //замена всех нечетных элементов матрицы на значение максимального элемента
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(aray[i][j] % 2 != 0){
                    aray[i][j] = maxNumber;
                }
            }
        }
        //вывод результирующей матрицы
        System.out.println("Результирующая матрица имеет вид: ");
        for (int[] es : aray) {
            System.out.print("[");
            for (int e : es) {
                System.out.print(e + ", ");
            }
            System.out.println("\b\b]");
        }
    }
}

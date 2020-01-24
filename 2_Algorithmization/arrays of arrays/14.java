//Сформировать случайную матрицу mxn, состоящую из нулей и единиц, причём в каждом столбце число единиц равно номеру столбца
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task24 {
    public static void main(String[] args) throws IOException {
        int n, m, counter;

        System.out.print("Задайте m (количество строк матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        System.out.print("Задайте n (количество столбцов матрицы), n <= (m + 1): ");
        n = Integer.parseInt(reader.readLine());
        while(n > (m + 1)){
            System.out.println("Введено некорректное значение n!");
            System.out.print("Задайте n (количество столбцов матрицы), n <= m: ");
            n = Integer.parseInt(reader.readLine());
        }
        int[][] aray = new int[m][n];
        //заполнение матрицы в соответствии с условиями

        for (int j = 0; j < n; j++) {
            counter = 0;
            while(counter != j) {
                counter = 0;
                for (int i = 0; i < m; i++) {
                    aray[i][j] = (int) (Math.random() * 2);
                    if (aray[i][j] == 1) {
                        counter++;
                    }
                }
            }
        }
        //вывод результирующей матрицы
        System.out.println("результирующая матрица имеет вид: ");
        for (int[] es : aray) {
            System.out.print("[");
            for (int e : es) {
                System.out.print(e + ", ");
            }
            System.out.println("\b\b]");
        }
    }
}

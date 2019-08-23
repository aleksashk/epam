//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task19 {
    public static void main(String[] args) throws IOException {
        int n, m;
        System.out.print("Задайте m (количество строк матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        System.out.print("Задайте n (количество столбцов матрицы): ");
        n = Integer.parseInt(reader.readLine());
        //объявляем массив, в которых будут записываться значения сумм столбцов матрицы aray
        double[] sumAray =new double[n];
        double sum = 0;
        double[][] aray = new double[m][n];

        //заполняем матрицу произвольными числами
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                aray[i][j] = Math.random() * m * n;
            }
        }
        System.out.println("Исходная матрица: aray[" + m + "][" + n + "] = ");
        for (double[] es : aray) {
            for (double e : es) {
                System.out.print(e + "; ");
            }
            System.out.println();
        }
        //подсчет суммы элементов в каждом столбце исходной матрицы
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sumAray[i] += aray[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("сумма элементов " + i + " столбца матрицы aray составила: " + sumAray[i] + ";");
        }
    }
}

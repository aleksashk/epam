//Сформировать квадратную матрицу порядка n по правилу A[i,j]=sin((i2-j2)/n) и подсчитать количество положительных элементов в ней.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        System.out.print("Задайте n (размер квадратной матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double[][] aray = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aray[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2))/n);
                System.out.println("aray[" + i + "][" + j + "] = " + aray[i][j] + ";");
                if(aray[i][j] > 0){
                    counter++;
                }
            }
        }
        System.out.println("Количество положительных элементов в матрице составляет: " + counter);
    }
}

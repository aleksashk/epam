//Сформировать квадратную матрицн порядка n по заданному образцу (n - чётное)
//1 1 1 1...1 1
//2 2 2 2...2 0
//3 3 3 3...0 0
//n 0 0 0...0 0
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task15 {
    public static void main(String[] args) throws IOException {
        System.out.print("Задайте a (размер квадратной матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[][] aray = new int[a][a];
//заполнение матрицы всоответствии с условиями задачи
        for (int i = 0, f = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i > 0 && j >= a - i) {
                    f = 0;
                } else {
                    f = i + 1;
                }
                aray[i][j] = f;
            }
        }
        for (int[] item : aray) {
            for (int items : item) {
                System.out.print(items + ", ");
            }
            System.out.println("\b\b");
        }
    }
}

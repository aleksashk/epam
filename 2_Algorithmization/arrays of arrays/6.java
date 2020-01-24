//Сформировать квадратную матрицн порядка n по заданному образцу (n - чётное)
//1 1 1 1
//0 1 1 0
//0 1 1 0
//1 1 1 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task16 {
    public static void main(String[] args) throws IOException {
        System.out.print("Задайте чЁтное a (размер квадратной матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[][] aray = new int[a][a];
//заполнение матрицы всоответствии с условиями задачи
        for (int i = 0, f = 0; i < a; i++) {
            for (int j = 0; j < a / 2; j++) {
                if ((i > 0 && j <= i - 1)){
                    f = 0;
                } else {
                    f = 1;
                }
                aray[i][j] = f;
            }
        }
        for (int i = a / 2, f = 0; i < a; i++) {
            for (int j = 0; j < a / 2; j++) {
                if ((i >= a / 2 && j < a - i - 1)){
                    f = 0;
                } else {
                    f = 1;
                }
                aray[i][j] = f;
            }
        }
        for (int i = 0, f = 0; i < a; i++) {
            for (int j = a / 2; j < a; j++) {
                if ((i > 0 && j > a - i - 1)){
                    f = 0;
                } else {
                    f = 1;
                }
                aray[i][j] = f;
            }
        }
        for (int i = a / 2, f = 0; i < a; i++) {
            for (int j = a / 2; j < a; j++) {
                if ((i >= a / 2 && j > i)){
                    f = 0;
                } else {
                    f = 1;
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

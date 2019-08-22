//Сформировать квадратную матрицн порядка n, по образцу: 
//1,2,3,...,n
//n,n-1,n-2,...1
//1,2,3,...,n
//n,n-1,n-2,...1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task14 {
    public static void main(String[] args) throws IOException {
        System.out.print("Задайте a: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[][]aray = new int[a][a];
//заполнение матрицы всоответствии с условиями задачи
        for (int i = 0, f = 0; i < a; i++) {
            if(f == 0) {
                for (int j = 0, num = 1; j < a; j++) {
                    aray[i][j] = num++;
                }
                f += 1;
            }
            else{
                for (int j = 0, num = a; j < a; j++) {
                    aray[i][j] = num--;
                }
                f -= 1;
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

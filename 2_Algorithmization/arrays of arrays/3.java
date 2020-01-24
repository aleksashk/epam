import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        int numR, numC, someColumn, someRow;

        System.out.print("Задайте количество строк матрицы: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numR = Integer.parseInt(reader.readLine());
        System.out.print("Задайте количество столбцов матрицы: ");
        numC = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[numR][numC];
        //заполняем матрицу произвольными целыми числами
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                matrix[i][j] = (int) (Math.random() * 100) - 25;
            }

        }
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                System.out.print("\t" + matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Выберите номер строки, которую необходимо вывести на экран. Значение от 0 до " +  (numR - 1) + ": ");
        someRow = Integer.parseInt(reader.readLine());
        System.out.print("Строка №" + someRow + ": [ ");
        for (int i = someRow, j = 0; j < numC; j++) {
            System.out.print(matrix[i][j] + ", ");
        }
        System.out.println("\b\b ]");

        System.out.print("Выберите номер столбца, который необходимо вывести на экран. Значение от 0 до " + (numC - 1) + ": ");
        someColumn = Integer.parseInt(reader.readLine());
        System.out.print("Столбец №" + someColumn + ": [ ");
        for (int i = 0, j = someColumn; i < numR; i++) {
            System.out.print(matrix[i][j] + ", ");
        }
        System.out.println("\b\b ]");
    }
}

//В числовой матрице поменять местами два столбца, т.е. все элементы одного столбца поставить на соответствующие им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task18 {
    public static void main(String[] args) throws IOException {
        int n, m, firstNumber, secondNumber, flag;
        String war = "Номер неправильный!";
        System.out.print("Задайте m (количество строк матрицы): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        System.out.print("Задайте n (количество столбцов матрицы): ");
        n = Integer.parseInt(reader.readLine());
        String s1 = "Введите номер первого столбца от 0 до " + (n - 1) + " включительно, позицию которого нужно изменить: ";
        int[][] aray = new int[m][n];
        int[][]tempAray = new int[m][1];//создаём временную матрицу для хранения столбцов, которые необходимо поменять местами
        //заполняем матрицу произвольными числами
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                aray[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("Исходная матрица: aray[" + m + "][" + n + "] = ");
        for (int[] es : aray) {
            for (int e : es) {
                System.out.print(e + "; ");
            }
            System.out.println();
        }
        System.out.print(s1);
        firstNumber = Integer.parseInt(reader.readLine());
        flag = 0;
        //проверка на корректность введенного номера первого столбца
        while (flag == 0){
            if(firstNumber >= 0 && firstNumber < n){
                flag = 1;
            }
            else {
                System.out.println(war);
                System.out.print(s1);
                firstNumber = Integer.parseInt(reader.readLine());
            }
        }
        String s2 = "Введите номер второго столбца от 0 до " + (n - 1) + " включительно и неравный " + firstNumber + ", позицию которого нужно изменить: ";
        System.out.print(s2);
        secondNumber = Integer.parseInt(reader.readLine());
        flag = 0;
        //проверка на корректность введенного номера второго столбца
        while (flag == 0){
            if(secondNumber >= 0 && secondNumber < n && secondNumber != firstNumber){
                flag = 1;
            }
            else {
                System.out.println(war);
                System.out.print(s2);
                secondNumber = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Столбец №" + firstNumber + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= 0; j++) {
                System.out.println(aray[i][firstNumber] + ";");
            }
        }
        System.out.println(" поменять местами со столбцом №" + secondNumber + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= 0; j++) {
                System.out.println(aray[i][secondNumber] + ";");
            }
        }
        //изменение позиций выбранных столбцов
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= 0; j++) {
                tempAray[i][j] = aray[i][firstNumber];
                aray[i][firstNumber] = aray[i][secondNumber];
                aray[i][secondNumber] = tempAray[i][j];
            }
        }
        System.out.println("Итоговая матрица имеет вид aray[" + m + "][" + n + "] = ");
        for (int[] es : aray) {
            for (int e : es) {
                System.out.print(e + "; ");
            }
            System.out.println();
        }
    }
}

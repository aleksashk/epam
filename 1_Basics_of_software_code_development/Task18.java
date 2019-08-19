//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n  вводятся с клавиатуры

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task18 {
    public static void main(String[] args) throws IOException {
        int m, n;
        System.out.print("Введите целое положительное число m (число m должно быть меньше числа n): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        while (m <= 0){
            System.out.println("число m должно быть больше 0");
            System.out.print("Введите целое число m: ");
            m = Integer.parseInt(reader.readLine());
        }
        System.out.print("Введите целое число n: ");
        n = Integer.parseInt(reader.readLine());
        while (n <= m){
            System.out.println("число n должно быть больше m=" + m);
            System.out.print("Введите целое число n: ");
            n = Integer.parseInt(reader.readLine());
        }
        for (int i = m; i <= n; i++) {
            for (int j = m; j < n; j++) {
                if (i % j == 0 && j != 1 && j != i) {
                    System.out.println("для натурального числа i = " + i + " j = " + j + " является делителем;");
                }
            }
        }
    }
}

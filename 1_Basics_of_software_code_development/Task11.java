//Вычислить значение функции F(x)={(1)x*x - 3*x + 9, если x <= 3; (2) 1 / (x*x*x + 6), если x > 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) throws IOException {
        double x, y;
        System.out.print("Введите значение x: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x = Double.parseDouble(reader.readLine());

        if(x <= 3){
            y = Math.pow(x,2) - 3 * x + 9;
        }
        else
            y = 1 / (Math.pow(x,3) + 6);
        System.out.println("Результат системы уравнений: " + y);
    }
}

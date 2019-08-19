//Вычислить значения функции на отрезке [a,b] с шагом h, y = {x, при x > 2; -x, при x <=2;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        double y, x, h, a, b;
        System.out.print("Введите число a: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        System.out.print("Введите число b: ");
        b = Double.parseDouble(reader.readLine());
        System.out.print("Введите число x: ");
        x = Double.parseDouble(reader.readLine());
        System.out.print("Задайте шаг h изменения y: ");
        h = Double.parseDouble(reader.readLine());

        if(x > 2){
            for (y = x; y <= b; y += h) {
                System.out.println("y = " + y + ";");
            }
        }
        else{
            for (y = -x; y >= a; y += -h) {
                System.out.println("y = " + y + ";");
            }
        }
    }
}

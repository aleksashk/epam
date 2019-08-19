//Даны три точки A(x1, y1), B(x2, y2), C(x3, y3). Определить, будут ли они расположены на одной прямой.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        double x1, y1, x2, y2, x3, y3;
        System.out.print("Введите координату x1: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x1 = Double.parseDouble(reader.readLine());
        System.out.print("Введите координату y1: ");
        y1 = Double.parseDouble(reader.readLine());
        System.out.print("Введите координату x2: ");
        x2 = Double.parseDouble(reader.readLine());
        System.out.print("Введите координату y2: ");
        y2 = Double.parseDouble(reader.readLine());
        System.out.print("Введите координату x3: ");
        x3 = Double.parseDouble(reader.readLine());
        System.out.print("Введите координату y3: ");
        y3 = Double.parseDouble(reader.readLine());

        if((x1 - x3)/(x2 - x3) == (y1 - y3)/(y2 - y3)){
            System.out.println("Точки A(x1, y1), B(x2, y2), C(x3, y3) лежат на одной прямой.");
        }
        else
            System.out.println("Точки A(x1, y1), B(x2, y2), C(x3, y3) не лежат на одной прямой.");
    }
}

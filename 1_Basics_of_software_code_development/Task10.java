//Заданы размеры a, b прямоугольного отверстия и размеры x, y, z кирприча. Определить, пройдёт ли кирпич через отверстие?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        double a, b, x, y, z;
        boolean flag = false;
        System.out.print("Задайте размер a отверстия: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        System.out.print("Задайте размер b отверстия: ");
        b = Double.parseDouble(reader.readLine());
        System.out.print("Задайте размер x для кирпича: ");
        x = Double.parseDouble(reader.readLine());
        System.out.print("Задайте размер y для кирпича: ");
        y = Double.parseDouble(reader.readLine());
        System.out.print("Задайте размер z для кирпича: ");
        z = Double.parseDouble(reader.readLine());

        if ((a * b >= x * y) && (a >= x && b >= y)) {
            System.out.println("Кирпич пройдёт через отверстие с размером a =" + a + " и b = " + b + " плоскостью с размерами x = " + x + " и y = " + y);
            flag = true;
        }
        if ((a * b >= x * z) && (a >= x && b >= z)) {
            System.out.println("Кирпич пройдёт через отверстие с размером a =" + a + " и b = " + b + " плоскостью с размерами x = " + x + " и z = " + z);
            flag = true;
        }
        if ((a * b >= z * y) && (a >= z && b >= y)) {
            System.out.println("Кирпич пройдёт через отверстие с размером a =" + a + " и b = " + b + " плоскостью с размерами x = " + x + " и z = " + z);
            flag = true;
        }
        if(flag == false)
            System.out.println("Кирпич не пройдёт через отверстие.");
    }
}

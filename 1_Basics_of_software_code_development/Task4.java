//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        double num, x, y;

        System.out.println("введите число типа double в формате xxx.yyy");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Double.parseDouble(reader.readLine());

        x = (int) num;
        y = Math.round((num - x) * 1000);
        System.out.println(y + x / 1000);
    }
}

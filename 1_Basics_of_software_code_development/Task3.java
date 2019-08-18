//Вычислите значение выражения по формуле(все переменные принимают действительные значения):
//(sin(x) + cos(y))/(cos(x) - sin(y)) * tg(x*y)


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        int x, y;
        System.out.print("Введите значения x и y: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(reader.readLine());
        System.out.println("x = " + x);
        y = Integer.parseInt(reader.readLine());
        System.out.println("y = " + y);
        System.out.print("результат уравнения: ((sinx + cosy)/(cosx - siny))*tanxy: ");
        System.out.println(((sin(x) + cos(y))/(cos(x) - sin(y)))*tan(x*y));
    }
}

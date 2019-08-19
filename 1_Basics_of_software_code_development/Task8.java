//Найти max{min(a,b), min(c,d)}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        double a, b, c, d, minFirst, minSecond, max;

        System.out.print("Введите число а: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        System.out.print("Введите число b: ");
        b = Double.parseDouble(reader.readLine());
        System.out.print("Введите число c: ");
        c = Double.parseDouble(reader.readLine());
        System.out.print("Введите число b: ");
        d = Double.parseDouble(reader.readLine());
        System.out.print("Введите число d: ");

        if(a <= b){
            minFirst = a;
        }
        else
            minFirst = b;
        if(c <= d){
            minSecond = c;
        }
        else
            minSecond = d;
        if(minFirst >= minSecond){
            max = minFirst;
        }
        else
            max = minSecond;
        System.out.println("max{min(a,b), min(c,d): " + max);
    }
}

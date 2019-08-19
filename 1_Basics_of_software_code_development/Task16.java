//Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен заданному e. Общий член имеет вид: an = 1/2n + 1/3n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task16 {
    public static void main(String[] args) throws IOException {
        int n;
        double  e, a, sum;
        sum = 0.0;

        System.out.print("Введите значение e: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        e = Double.parseDouble(reader.readLine());
        System.out.print("Введите значение n: ");
        n = Integer.parseInt(reader.readLine());

        for (int i = 1; i < n; i++) {
            a = 1/(Math.pow(2,i)) + 1/(Math.pow(3,i));
            if(a >= e){
                sum += a;
            }
        }
        System.out.println("Сумма тех членов ряда, модуль которых больше или равен заданному e составила: " + sum);
    }
}

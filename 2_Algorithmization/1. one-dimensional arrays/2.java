//Дана последовательность действительных чисел a1, a2, a3,..., an. Заменить все члены, больлшие данного z, этим числом. Подсчитать количество замен.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int size;
        double z;
        int counter = 0;
        System.out.print("Введите размерность числовой последовательности (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        double[]aray = new double[size];
        System.out.print("Задайте число z: ");
        z = Double.parseDouble(reader.readLine());
        //заполнение последовательности произвольными числами
        for (int i = 0; i < aray.length; i++) {
            aray[i] = (Math.random() * 100) - 50;
        }
        //перебор массива и замена с подсчётом элементов, больше z
        for (int i = 0; i < aray.length; i++) {
            if(aray[i] > z){
                aray[i] = z;
                counter ++;
            }
        }
        System.out.println("Количество замен составило: " + counter);
        //вывод итогового массива
        System.out.println("Вид итогового массива: ");
        System.out.print("aray = [\n");
        for (double item : aray) {
            System.out.println("\t\t" + item + ", ");
        }
        System.out.print("\b\b]");
    }
}

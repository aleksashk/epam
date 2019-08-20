//Дана последовательность действительных чисел a1, a2, a3,..., an. Заменить все члены, больлшие данного z, этим числом. Подсчитать количество замен.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int size, z;
        int counter = 0;
        System.out.print("Введите размерность числовой последовательности (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        int[]aray = new int[size];
        System.out.print("Задайте число z (целое положительное): ");
        z = Integer.parseInt(reader.readLine());
        //заполнение последовательности произвольными числами
        for (int i = 0; i < aray.length; i++) {
            aray[i] = (int)(Math.random() * 100) + 1;
        }
        //перебор массива и замена с подсчётом элементов, больше z
        for (int i = 0; i < aray.length; i++) {
            if(aray[i] > z){
                aray[i] = z;
                counter ++;
            }
        }
        //вывод итогового массива
        System.out.print("aray = [");
        for (int item : aray) {
            System.out.print(item + ", ");
        }
        System.out.print("\b\b]");
    }
}

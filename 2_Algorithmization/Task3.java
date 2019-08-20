//Дан массив действительных чисел, размерность которого n. Подсчитать, сколько в нём отрицательных, положительных и нулевых элементов

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        int size, minNumber, maxNumber;
        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero = 0;
        System.out.print("Введите размерность числовой массива (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        int[]aray = new int[size];
        //Для формирования массива произвольными в том числе отрицательными и нулевыми элементами, необходимо задать minNumber. minNumber - это число позволит сместить диапазон с максимальным числом maxNumber в отрицательную плоскость
        System.out.print("Введите число, от которого будет начинаться выборка произвольных чисел для заполнения массива (положительное): ");
        minNumber = Integer.parseInt(reader.readLine());
        System.out.print("Введите число (верхний предел), до которого будет производиться выборка произвольных чисел для заполнения массива (положительное): ");
        maxNumber = Integer.parseInt(reader.readLine());

        //заполнение массива произвольными числами
        for (int i = 0; i < aray.length; i++) {
            aray[i] = (int)(Math.random() * maxNumber) - minNumber;
        }
        for (int item: aray) {
            if (item > 0){
                counterPositive ++;
            }
            else if (item < 0){
                counterNegative ++;
            }
            else {
                counterZero ++;
            }
        }
        //вывод итогового массива
        System.out.print("aray = [");
        for (int item : aray) {
            System.out.print(item + ", ");
        }
        System.out.println("\b\b]");
        System.out.print("В данном массиве: " + counterPositive + " положительных элементов " + counterNegative + " отрицательных элементов " + counterZero + " нулевых элементов");
    }
}

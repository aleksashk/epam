//Дан массив действительных чисел, размерность которого n. Подсчитать, сколько в нём отрицательных, положительных и нулевых элементов

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        int size;
        double minNumber, maxNumber;
        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero = 0;
        System.out.print("Введите размерность числовой массива (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        double[]aray = new double[size];
        //Для формирования массива произвольными в том числе отрицательными и нулевыми элементами, необходимо задать minNumber. minNumber - это число позволит сместить диапазон с максимальным числом maxNumber в отрицательную плоскость
        System.out.print("Введите число, от которого будет начинаться выборка произвольных чисел для заполнения массива (положительное): ");
        minNumber = Double.parseDouble(reader.readLine());
        System.out.print("Введите число (верхний предел), до которого будет производиться выборка произвольных чисел для заполнения массива (положительное): ");
        maxNumber = Double.parseDouble(reader.readLine());

        //заполнение массива произвольными числами
        for (int i = 0; i < aray.length; i++) {
            aray[i] = (Math.random() * maxNumber) - minNumber;
        }
        for (double item: aray) {
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
        System.out.println("aray = [");
        for (double item : aray) {
            System.out.println("\t\t" + item + ", ");
        }
        System.out.println("\b\b]");
        System.out.print("В данном массиве: " + counterPositive + " положительных элементов " + counterNegative + " отрицательных элементов " + counterZero + " нулевых элементов");
    }
}

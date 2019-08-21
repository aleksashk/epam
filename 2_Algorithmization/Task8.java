//Дана последовательность чисел a1,a2,...,an. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,...,an)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        int n, min, minNum, maxNum;
        int[]aray;
        int countOfMin = 0;
        System.out.print("Задайте n - размер массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        System.out.print("Задайте положительное minNum - число (его отрицательный эквивалент), от которого начнётся формирование произвольных чисел: ");
        minNum = Integer.parseInt(reader.readLine());
        System.out.print("Задайте положительное maxNum - число, до которого будет производиться формирование произвольных чисел: ");
        maxNum = Integer.parseInt(reader.readLine());

        aray = new int[n];
        //заполнение массива целыми числами

        for (int i = 0; i < aray.length; i++) {
            aray[i] = (int)(Math.random() * maxNum) - minNum;
        }
        System.out.println("Сформированный массив: ");
        System.out.print("[");
        for (int i = 0; i < aray.length; i++) {
            System.out.print(aray[i] + ", ");
        }
        System.out.println("\b\b]");
        //находим минимальное значение в массиве
        min = aray[0];
        for (int i = 0; i < aray.length; i++) {
            if(min > aray[i]){
                min = aray[i];
            }
        }
        System.out.print("Минимальное значение в массиве: " + min + " содержат элементы с №");
        for (int i = 0; i < aray.length; i++) {
            if(aray[i] == min){
                System.out.print(i + "; №");
            }
        }
        System.out.println("\b\b");
        //находим количество одинаковых минимальных значений в массиве
        for (int i = 0; i < aray.length; i++) {
            if(min == aray[i]){
                countOfMin ++;
            }
        }
        System.out.println("Количество повторений минимального значения в массиве: " + countOfMin);
        int[] newAray = new int[aray.length - countOfMin];
        //заполняем новый массив
        for (int i = 0, j = 0; i < newAray.length; i++, j ++) {
           if(aray[j] == min){
               newAray[i] = aray[++j];
           }
           else {
               newAray[i] = aray[j];
           }
        }
        System.out.println("Новый массив: ");
        System.out.print("[");
        for (int i = 0; i < newAray.length; i++) {
            System.out.print(newAray[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}

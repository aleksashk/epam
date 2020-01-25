//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        int size;
        System.out.print("Задайте n - размер массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        int[] a1 = new int[size];
        //заполняем массив произвольными целыми числами

        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 8) - 4;
        }
        System.out.print("Массив a1={");
        for (int item : a1) {
            System.out.print(item + ", ");
        }
        System.out.println("\b\b}");

        //формируем массив в 2 раза больше исходного.Элементы будут записываться парами, каждый нечётный элемент соответствует элементу исходного массива, каждый чётный - количество повторений предыдущего нечётного элементаю Причём, если нечетный элемент записывается повторно, то количество его повторений приравнивается к 0.
        int[] a2 = new int[a1.length * 2];
        int counter;
        int max, min;
        int indexMax, index;
        for (int i = 0, k = 0; i < a1.length; i++, k++) {
            counter = 1;
            for (int j = 0; j < a1.length; j++) {
                if (a1[i] == a1[j] && i != j) {
                    counter++;
                }
            }
            a2[k] = a1[i];
            k++;
            int flag = 0;
            for (int m = 0; m < k - 1; m += 2) {
                if (a2[k - 1] == a2[m]) {
                    flag++;
                    break;
                }
            }
            if (flag == 0 || k == 1) {
                a2[k] = counter;
            } else {
                a2[k] = 0;
            }
        }
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i] + " - " + a2[++i] + "\t");
        }
        //Поиск максимального количества повторений
        max = a2[1];
        index = 0;
        for (int i = 1; i < a2.length; i += 2) {
            if (a2[i] > max) {
                max = a2[i];
                index = i;
            }
        }
        System.out.println("Максимальное количество повторений: " + max);

        //Поиск наименьшего результата:
        min = a2[index];
        indexMax = 0;
        for (int i = 1; i < a2.length - 1; i += 2) {
            if (a2[i] == max && a2[i - 1] < min) {
                min = a2[i - 1];
            }
        }
        System.out.println("Минимальное число " + min + ", которое повторяется наибольшее число раз: " + max);
    }
}

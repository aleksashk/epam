//В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int size, temp, k;
        int sum = 0;
        System.out.print("Введите размерность массива (положительное целое число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        System.out.print("Введите величину k (положительное целое число): ");
        k = Integer.parseInt(reader.readLine());
        int[] aray = new int[size];
        //заполнение массива натуральными числами
        for (int i = 0; i < aray.length; i++) {
            temp = (int) (Math.random() * size) + 1;//размер диапазона значений, из когорого происходит заполнение массива равер размеру массива, для изменения диапазона необходимо во всех формулах рассчета величины temp изменить переменную size на необходимое значение
            for (int j = 0; j <= i; ) {//проверка на заполнение массива уникальными элементами
                if (aray[j] == temp) {
                    while (aray[j] == temp) {
                        temp = (int) (Math.random() * size) + 1;
                        j = 0;
                    }
                }
                j++;
            }
            aray[i] = temp;
        }
        for (int i = 0; i < aray.length; i++) {
            if (aray[i] % k == 0)
                sum += aray[i];
        }
        System.out.println("Сумма элементов исходного массива, которые кратны данному k, составила: " + sum);
    }
}

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введённого пользователем числа.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {
    public static void main(String[] args) throws IOException {
        int someNumber;
        int j = 1;
        System.out.print("Введите целое положительное число: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        someNumber = Integer.parseInt(reader.readLine());
        for (int i = 0; i <= someNumber; i++) {
            j += i;
        }
        System.out.println("Сумма чисел от 1 до " + someNumber + " составила: " + j);
    }
}

//Задана последовательность n вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        int size, temp;
        int summa = 0;
        System.out.print("Введите размерность числовой массива (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        int[]aray = new int[size];

        //заполнение массива произвольными числами
        for (int i = 0; i < aray.length; i++) {
            temp = (int)(Math.random() * 1000);
            while (temp == 0) {//в случае, если элемент массива равен 0, изменяем его значение
                temp = (int) (Math.random() * 5000);
            }
            aray[i] = temp;
        }

        //вычислиение суммы чисел, порядковые номера которых являются простыми числами
        for (int i = 0, j = 0; i < aray.length; i++) {
            if(aray[i] % aray[i] == 0 && aray[i] % 1 == 0){
                summa += aray[i];
            }
        }
        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами: " + summa);
    }
}

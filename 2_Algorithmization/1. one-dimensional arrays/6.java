//Задана последовательность n вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        int size;
        double summa = 0;
        int flag;
        System.out.print("Введите размерность числовой массива (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        double[]aray = new double[size];

        //заполнение массива произвольными числами
        for (int i = 0; i < aray.length; i++) {
            aray[i] = Math.random() * 100 - 50;
        }

        //вычислиение суммы чисел, порядковые номера которых являются простыми числами
        for (int i = 2; i < aray.length; i++) {
            flag = 0;//создаём флаг, для нахождения простых чисел, если число делится на что-либо, кроме себя, то флаг изменяется и выходим из цикла
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0){
                    flag ++;
                    break;
                }
            }
            if(flag ==0 && i >= 2){//если флаг не в цикле не изменился, то число простое!
                System.out.println("Индекс " + i + " является простым числом;");
                summa += aray[i];
            }
        }
        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами: " + summa);
    }
}

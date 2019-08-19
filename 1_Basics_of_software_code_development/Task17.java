//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) throws IOException {
        char symbol;
        System.out.print("Введите число, от которого необходимо отобразить соответствия \nмежду символами и их численными обозначениями в памяти компьютера: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minNumber = Integer.parseInt(reader.readLine());
        System.out.print("Введите число, до которого необходимо отобразить соответствия \nмежду символами и их численными обозначениями в памяти компьютера: ");
        int maxNumber = Integer.parseInt(reader.readLine());

        for (int i = minNumber, j = 0; i < maxNumber; i++, j++) {
            symbol = (char) i;
            System.out.print("символу (char) symbol: " + symbol + " соответствует номер " + i + "; ");
            if (j == 2) {
                j = 0;
                System.out.println();
            }
        }

        //альтернативный вариатн, закоментировать код выше и раскометнировать код ниже

//        for (;;) {
//            System.out.print("для выхода из цикла введите ноль (0), для продолжения введите символ, номер которого необходимо определить: ");
//            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//            char num = rd.readLine().charAt(0);
//            System.out.println("Символу num: " + num + " соответствует № " + (int) num);
//            if (num == '0')
//                break;
//        }
    }
}

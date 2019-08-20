//Даны целые числа a1, a2, a3,..., an. Вывести на печать только те числа, для которых ai > i.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        int size;
        System.out.print("Введите размерность числовой массива (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        int[]aray = new int[size];

        //заполнение массива произвольными числами
        for (int i = 0; i < aray.length; i++) {
            aray[i] = (int)(Math.random() * 101);
        }

        //вывод элементов массива, для которых справедливо условие ai > i
        for (int i = 0, j = 0; i < aray.length; i++) {
            if(aray[i] > i){
                System.out.print("aray[" + i + "] = " + aray[i] + " > i = " + i + "; ");
                j++;
                if(j == 5) {
                    System.out.println("\b");
                    j = 0;
                }
            }
        }
    }
}

//Даны действительные числа a1, a2, a3,..., an. Поменять местами наибольший и наименьший элементы
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        int size, tempMax, tempMin, temp;
        System.out.print("Введите размерность числовой массива (целое положительное число): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        int[]aray = new int[size];

        //заполнение массива произвольными числами
        for (int i = 0; i < aray.length; i++) {
            aray[i] = (int)(Math.random() * 101);
        }

        //нахождение минимального и максимального элементов в массиве
        tempMax = tempMin = 0;
        for (int i = 0; i < aray.length; i++) {
            if(aray[i] < aray[tempMin]){
                tempMin = i;
            }
            if(aray[i] > aray[tempMax]){
                tempMax = i;
            }
        }
        System.out.println("Вывод массива");
        System.out.print("aray = [");
        for (int item : aray) {
            System.out.print( item + ", ");
        }
        System.out.println("\b\b]");
        System.out.println("минимальный элемент массива: " + aray[tempMin] + ", его индекс в массиве: " + tempMin);
        System.out.println("максимальный элемент массива: " + aray[tempMax] + ", его индекс в массиве: " + tempMax);

        //Изменение позиций минимального и максимального элементов
        temp = aray[tempMax];
        aray[tempMax] = aray[tempMin];
        aray[tempMin] = temp;

        System.out.println("Вывод результирующего массива");
        System.out.print("aray = [");
        for (int item : aray) {
            System.out.print( item + ", ");
        }
        System.out.print("\b\b]");
    }
}

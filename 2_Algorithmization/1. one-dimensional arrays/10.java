//Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Дополнительный массив не использовать.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
    public static void main(String[] args) throws IOException {
        int size;
        System.out.print("Задайте n - размер массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        int[]a1 = new int[size];
        
        //заполняем массив произвольными целыми числами
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int)(Math.random()*100) - 50;
        }
        System.out.print("Массив a1={");
        for (int item : a1) {
            System.out.print(item + ", ");
        }
        System.out.println("\b\b}");
        
        //удаляем все чётные элементы массива, а свободное место заполняем нулями
        for (int i = 0; i < a1.length;++i) {
            if(i >= (a1.length + 1)/ 2){
                a1[i] = 0;
            }
            else {
                a1[i] = a1[i * 2];
            }
        }
        
        System.out.print("Сжатый массив a1={");
        for (int i:a1) {
            System.out.print(i + ", ");
        }
        System.out.print("\b\b}");
    }
}

//Даты действительные числа a1, a2,..., an. Найти max(a1+a2n, a2+a2n-1, an+an+1)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        int n;
        double max;
        System.out.print("задайте размерность n последовательности (положительное четное число: )");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        double[] aray = new double[n];
        //заполнение массива действительными числами

        for (int i = 0; i < aray.length; i++) {
            aray[i] = Math.random() * 200 - 100;
        }
        System.out.println("\b\b]");
        System.out.println("Найте максимальную сумму из пар значений: ");
        for (int i = 0, j = aray.length - 1; i < aray.length / 2; i++, j--) {
            System.out.println("aray[" + i + "] = " + aray[i] + " и aray[" + j + "] = " + aray[j] + ";");
        }

        max = aray[0] + aray[aray.length - 1];
        for (int i = 0, j = aray.length - 1; i < aray.length / 2; i++, j--) {
            if((aray[i] + aray[j]) > max){
                max = aray[i] + aray[j];
            }
        }
        System.out.println("max = " + max);
    }
}

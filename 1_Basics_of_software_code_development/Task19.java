//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task19 {
    public static void main(String[] args) throws IOException {
        int m, n, tempM,tempN;
        System.out.print("Введите целое положительное число m: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        System.out.print("Введите целое положительное число n: ");
        n = Integer.parseInt(reader.readLine());

        if(m < 10){
            System.out.print("число m состоит из цифры: " + m);
        }
        else{
            System.out.println("в запись числа m входят цифры: ");
            while (m > 0){
                tempM = m % 10;
                System.out.print(tempM + ", ");
                m = (m - tempM) /10;
            }
            System.out.println("\b\b");
        }
        if(n < 10){
            System.out.println("число n состоит из цифры: " + n);
        }
        else{
            System.out.println("в запись числа n входят цифры: ");
            while (n > 0){
                tempN = n % 10;
                System.out.print(tempN + ", ");
                n = (n - tempN) /10;
            }
            System.out.println("\b\b");
        }
    }
}

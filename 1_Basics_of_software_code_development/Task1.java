import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter number a, b, c");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Integer.parseInt(reader.readLine());
        double b = Integer.parseInt(reader.readLine());
        double c = Integer.parseInt(reader.readLine());
        System.out.println(((a - 3)*b/2) + c);
    }
}

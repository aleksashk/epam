import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number a, c, b");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Integer.parseInt(reader.readLine());
        double b = Integer.parseInt(reader.readLine());
        double c = Integer.parseInt(reader.readLine());
        double x1 = Math.pow((Math.pow(b,2) + 4*a*c),0.5);
        //System.out.println(x1);
        double x2 = (b+x1)/(2*a);
        //System.out.println(x2);
        double x3 = x2 - Math.pow(a,3)*c;
        //System.out.println(x3);
        double x4 = x3 + Math.pow(b,-2);
        System.out.println(x4);
    }
}

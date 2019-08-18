//Для данной области составить линейную программу, которая печатает true, если точка с координатами (x,y) принадлежит закрашенной области, и false - в противном случае
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        int x, y;

        System.out.print("введите координату X искомой точки: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(reader.readLine());
        System.out.print("введите координату Y искомой точки: ");
        y = Integer.parseInt(reader.readLine());

        if (x >= -4 && x <= 4) {
            if (y >= -3 && y <= 2) {
                System.out.println("true");
            } else if (x >= -2 && x <= 2) {
                if (y >= -3 && y <= 4) {
                    System.out.println("true");
                } else
                    System.out.println("false");
            } else
                System.out.println("false");
        } else
            System.out.println("false");
    }
}

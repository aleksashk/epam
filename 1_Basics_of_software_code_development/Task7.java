//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, если да, то будет ли он прямоугольным?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        double angleFirst, angleSecond;

        System.out.println("введите значение первого угла: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        angleFirst = Double.parseDouble(reader.readLine());
        System.out.println("введите значение второго угла: ");
        angleSecond = Double.parseDouble(reader.readLine());

        if((angleFirst + angleSecond) < 180 ){
            System.out.print("Треугольник с такими углами существует!");
            if((angleFirst + angleSecond) == 90){
                System.out.println("\b и он является прямоугольным!");
            }
        }
        else
            System.out.println("Треугольника с такими углами не существует!");
    }
}

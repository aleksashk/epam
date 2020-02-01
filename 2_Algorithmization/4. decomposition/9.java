import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int x = initValue();
        int y = initValue();
        int z = initValue();
        int w = initValue();
        double areaRightTriangle = calculateAreaRightTriangle(x, y);
        double halfPerimeterRectangle = calculateHalfPerimeterRectangle(x, y, z, w);
        double areaRectangle = calculateAreaRectangle(halfPerimeterRectangle, x, y, z, w);
        double area = calculateArea(areaRectangle, areaRightTriangle);
        String msg = "Rectangle with size:" +
                "\nvalue side x: " + x
                + "\nvalue side y: " + y
                + "\nvalue side z: " + z
                + "\nvalue side w: " + w
                + "\nand right angle between x and y"
                + "\nhas area: " + area;
        printMsg(msg);

    }

    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 3;

    public static int initValue() {
        Random random = new Random();
        return random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static double calculateArea(double areaRectangle, double areaTriangle) {
        return areaRectangle + areaTriangle;
    }

    public static int calculateAreaRightTriangle(int firstSide, int secondSide) {
        return firstSide * secondSide / 2;
    }

    public static double calculateHalfPerimeterRectangle(int firstSide, int secondSide, int thirdSide, int fourthSide) {
        return (firstSide + secondSide + thirdSide + fourthSide) / 2.;
    }

    public static double calculateAreaRectangle(double halfPerimeter, int firstSide, int secondSide, int thirdSide, int fourthSide) {
        return Math.sqrt((halfPerimeter - firstSide)
                * (halfPerimeter - secondSide)
                * (halfPerimeter - thirdSide)
                * (halfPerimeter - fourthSide));
    }
}

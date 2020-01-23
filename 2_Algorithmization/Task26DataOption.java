import java.util.Scanner;

public class DataOption {
    public static final String MAIN_MSG = "set number for matrix: n >= 3 and n % 2 == 1;";
    public static final String MAIN_MSG_SECOND = "set number for matrix: n >= 4 and n % 4 == 0;";
    public static final String MAIN_WRONG_MSG = "invalid value for matrix!!! ";
    public static final String MSG = "press 1 if you want to create odd order matrix " +
            "or press 2 if you want to create matrix multiple of 4";


    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static int setNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getXUp(int x) {
        return x - 1;
    }

    public static int getYDiagonal(int y) {
        return y + 1;
    }

    public static int getYLeftDiagonal() {
        return 1;
    }

    public static int getXDown(int x) {
        return x + 1;
    }

    public static int getXDownDiagonal(int number) {
        return number - 2;
    }
}

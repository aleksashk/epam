import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input string with letter a: ";
        print(msg);

        msg = initMsg();
        char[] array = msg.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        char symbolFirstS = 'a';
        char symbolFirstL = 'A';
        char symbolSecond = 'b';

        for (char c : array) {
            stringBuilder.append(c);
            if (c == symbolFirstS || c == symbolFirstL) {
                stringBuilder.append(symbolSecond);
            }
        }
        printSb(stringBuilder);
    }

    public static String initMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static void printSb(StringBuilder msg) {
        System.out.print(msg);
    }

}

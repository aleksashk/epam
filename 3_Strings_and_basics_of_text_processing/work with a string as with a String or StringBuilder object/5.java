import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String msg = "Input some string: ";
        print(msg);
        String str = initMsg();

        msg = "Input some letter for search in the string: ";
        print(msg);
        char letter = initSymbol();

        char[] array = str.toCharArray();
        int counter = 0;
        for (char element : array) {
            if (element == letter) {
                counter++;
            }
        }
        msg = "number letter \'" + letter + "\' in the string: " + counter;
        print(msg);
    }

    public static String initMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static char initSymbol() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str.charAt(0);
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

}

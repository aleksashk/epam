import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input strings with \'.\' or \'!\' or \'?\': ";
        print(msg);

        String str = initStr();

        msg = "String has " + findNumberStrings(str) + " little strings;";
        print(msg);
    }

    public static String initStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static int findNumberStrings(String str) {
        int counter = 0;
        char firstSymbol = '.';
        char secondSymbol = '!';
        char thirdSymbol = '?';
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == firstSymbol
                    || str.charAt(i) == secondSymbol
                    || str.charAt(i) == thirdSymbol)
                counter++;
        }
        return counter;
    }
}


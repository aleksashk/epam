import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input some camelcase string: ";
        printMsg(msg);
        msg = inputMsg();

        char[] array = msg.toCharArray();
        int counter = 0;

        for (char c : array) {
            if (Character.isUpperCase(c)) {
                counter++;
            }
        }

        char[] newArray = new char[array.length + counter];

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            char symbol = '_';
            if (Character.isUpperCase(array[i]) && i > 0 && !Character.isSpaceChar(array[i - 1])) {
                newArray[j] = symbol;
                ++j;
                newArray[j] = Character.toLowerCase(array[i]);
            } else {
                newArray[j] = array[i];
            }
        }

        for (char symbol : newArray) {
            System.out.print(symbol);
        }

    }

    static void printMsg(String msg) {
        System.out.print(msg);
    }

    static String inputMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

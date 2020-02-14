import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input some letter with digits: ";
        printMsg(msg);
        msg = showMsg();

        char[] array = msg.toCharArray();
        int counter = 0;

        for (int i = 0; i < array.length; ) {
            if (Character.isDigit(array[i])) {
                while (Character.isDigit(array[i])) {
                    i++;
                    if (i >= array.length) {
                        break;
                    }
                }
                counter++;
            } else {
                i++;
            }
        }

        msg = "Number digits in the string: " + "\"" + msg + "\"" + " is " + counter;
        printMsg(msg);

    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static String showMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}

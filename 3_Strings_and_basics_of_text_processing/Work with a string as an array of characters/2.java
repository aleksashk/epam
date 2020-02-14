import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String msg = "Input some string with words \"word\": ";
        printMsg(msg);

        msg = showMsg();
        char[] array = msg.toCharArray();

        String firstWord = "word";
        String secondWord = "letter";

        int counter = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == firstWord.charAt(0)
                    && array[++i] == firstWord.charAt(1)
                    && array[++i] == firstWord.charAt(2)
                    && array[++i] == firstWord.charAt(3)) {
                counter++;
            }
        }

        char[] newArray = new char[array.length + counter * 2];

        for (int i = 0, j = 0; i < array.length; ++i, ++j) {

            if (array[i] == firstWord.charAt(0)
                    && array[++i] == firstWord.charAt(1)
                    && array[++i] == firstWord.charAt(2)
                    && array[++i] == firstWord.charAt(3)) {
                newArray[j] = secondWord.charAt(0);
                newArray[++j] = secondWord.charAt(1);
                newArray[++j] = secondWord.charAt(2);
                newArray[++j] = secondWord.charAt(3);
                newArray[++j] = secondWord.charAt(4);
                newArray[++j] = secondWord.charAt(5);
            } else {
                newArray[j] = array[i];
            }
        }

        for (char c : newArray) {
            printSymbol(c);
        }
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static void printSymbol(char s) {
        System.out.print(s);
    }

    public static String showMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input some string: ";
        printMsg(msg);
        msg = showMsg();

        char[] array = msg.toCharArray();
        int counter = 0;

        int i = 0;
        while (Character.isSpaceChar(array[i])) {
            i++;
            if (i == array.length) {
                break;
            }
        }

        int j = array.length - 1;

        while (Character.isSpaceChar(array[j])) {
            j--;
            if (j == 0) {
                break;
            }
        }

        int x = i;

        for (; i <= j; i++) {
            if (Character.isSpaceChar(array[i]) && Character.isSpaceChar(array[i + 1])) {
                counter++;
                while (Character.isSpaceChar(array[i])) {
                    i++;
                    if (i == j) {
                        break;
                    }
                }
            }
            counter++;
        }

        char[] newArray = new char[counter];
        for (int k = 0; k < newArray.length; ) {
            newArray[k] = array[x];
            if (Character.isSpaceChar(array[x]) && Character.isSpaceChar(array[x + 1])) {
                newArray[k] = array[x];
                k++;
                while (Character.isSpaceChar(array[x])) {
                    x++;
                    if (!Character.isSpaceChar(array[x])) {
                        break;
                    }
                }
            } else {
                k++;
                x++;
            }
        }

        printMsg("\n");

        for (char ch : newArray) {
            System.out.print(ch);
        }
    }

    public static String showMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }
    
}

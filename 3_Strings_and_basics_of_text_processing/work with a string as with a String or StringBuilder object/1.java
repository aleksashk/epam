import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input string with a lot of spaces: ";
        print(msg);

        msg = initMsg();
        char[] array = msg.toCharArray();

        int newLength = findSize(array);
        int[] newArray = new int[newLength];

        findNumberSpaces(array, newArray);

        int max = findMax(newArray);

        msg = "Max number of spaces in the string is: " + max + ";";
        print(msg);
    }

    public static String initMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static int findSize(char[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; ) {
            if (Character.isSpaceChar(array[i])) {
                counter++;
                {
                    while (Character.isSpaceChar(array[i])) {
                        if (++i == array.length) {
                            break;
                        }
                    }
                }
            } else {
                i++;
            }
        }
        return counter;
    }

    public static void findNumberSpaces(char[] array, int[] newArray) {
        for (int i = 0, j = 0; i < array.length; ) {
            if (Character.isSpaceChar(array[i])) {
                while (Character.isSpaceChar(array[i])) {
                    newArray[j]++;
                    if (++i == array.length) {
                        break;
                    }
                }
                j++;
            } else {
                i++;
            }
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}

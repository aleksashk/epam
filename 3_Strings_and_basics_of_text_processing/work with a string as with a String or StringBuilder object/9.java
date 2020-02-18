import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input string: ";
        print(msg);

        String str = initStr();

        int[] numberLetters = findNumberLetters(str);
        msg = "String has " + numberLetters[0] + " small letters and " +
                numberLetters[1] + " big letters;";
        print(msg);
    }

    public static String initStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static int[] findNumberLetters(String str) {
        int[] array = new int[2];
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (Character.isLowerCase(s)) {
                array[0]++;
            } else if (Character.isUpperCase(s)) {
                array[1]++;
            }
        }
        return array;
    }
}

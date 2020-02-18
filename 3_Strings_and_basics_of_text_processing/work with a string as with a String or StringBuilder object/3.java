import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String msg = "Input word (palindrome): ";
        print(msg);

        msg = initMsg();
        char[] array = msg.toCharArray();
        String answer = isPalindrome(array);

        print(answer);
    }

    public static String initMsg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static String isPalindrome(char[] array) {
        int centerIndex = (array.length % 2 == 0) ? (array.length / 2 - 1) : array.length / 2;
        String result = "This is word isn't palindrome!";
        if (array.length % 2 == 0) {
            for (int i = 0, j = array.length - 1; i <= centerIndex; ) {
                if (array[i] == array[j]) {
                    i++;
                    j--;
                } else {
                    return result;
                }
            }
        } else {
            for (int i = 0, j = array.length - 1; i < centerIndex; ) {
                if (array[i] == array[j]) {
                    i++;
                    j--;
                } else {
                    return result;
                }
            }
        }
        result = "This is word is palindrome!";
        return result;
    }

}

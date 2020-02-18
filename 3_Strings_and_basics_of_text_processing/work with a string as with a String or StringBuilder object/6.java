import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input string: ";
        print(msg);

        String str = initStr();
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.substring(i, 1 + i)).append(str.substring(i, 1 + i));
        }

        System.out.println(stringBuilder);
    }

    public static String initStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

}

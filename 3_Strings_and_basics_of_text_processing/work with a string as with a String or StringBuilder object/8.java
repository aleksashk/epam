import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Input string: ";
        print(msg);

        String str = initStr();
        System.out.println(findWordMaxLength(str));
    }

    public static String initStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static StringBuilder findWordMaxLength(String str) {
        StringBuilder stringBuilderFinish = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                StringBuilder stringBuilder = new StringBuilder();
                while (str.charAt(i) != ' ') {
                    stringBuilder.append(str, i, i + 1);
                    if(i == str.length() - 1){
                        break;
                    }
                    i++;
                }
                if(stringBuilderFinish.length() < stringBuilder.length()){
                    stringBuilderFinish = stringBuilder;
                }
            }
        }
        return stringBuilderFinish;
    }

}

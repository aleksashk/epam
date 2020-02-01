import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int firstNumber = initValue();
        int secondNumber = initValue();
        int thirdNumber = initValue();
        isEmpty(firstNumber);
        isEmpty(secondNumber);
        isEmpty(thirdNumber);
    }

    public static final int MAX_NUMBER = 100;

    public static int initValue() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER);
    }

    public static void isEmpty(int a) {
        String msg = "number " + a + " is empty;";
        String msgWrong = "number " + a + " isn't empty;";
        String result = "";
        if (a <= 2) {
            result = msg;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                result = msgWrong;
                break;
            }
            result = msg;
        }
        System.out.println(result);
    }
}

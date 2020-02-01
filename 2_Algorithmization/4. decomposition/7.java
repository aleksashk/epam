public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            boolean oddValue = isOddNumber(i);
            int factorial = factorial(i);
            if (oddValue) {
                String msg = "factorial " + i + " is " + factorial + ";\n";
                printMsg(msg);
            }
        }
    }

    public static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static int factorial(int number) {
        int factorial = 1;
        if (number == 1) {
            return factorial;
        }
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

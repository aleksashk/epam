import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter first number: ";
        printMsg(msg);
        int a = enterValue();
        msg = "enter second number: ";
        printMsg(msg);
        int b = enterValue();

        int nod = calculateNod(a,b);
        int nok = calculateNok(a,b);

        msg = "nod for " + a + " and " + b + " is " + nod;
        printMsg(msg);
        msg = "\nnok for " + a + " and " + b + " is " + nok;
        printMsg(msg);
    }

    public static int calculateNod(int x, int y) {
        if(x == y) return x;
        int min, max, divider = 1;
        min = Math.min(x, y);
        max = Math.max(x, y);
        for(int i = 1; i <= min; i++) {
            if(min % i == 0 && max % i == 0) divider = i;
        }
        return divider;
    }
    public static int calculateNok(int x, int y) {
        if(x == y) return x;
        int min, max;
        min = Math.min(x, y);
        max = Math.max(x, y);
        int multiple = max;
        while(multiple % min != 0 || multiple % max != 0) {
            multiple += max;
        }
        return multiple;
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }

    public static int enterValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

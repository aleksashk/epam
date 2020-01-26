import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter first number: ";
        printMsg(msg);
        int a = enterValue();
        msg = "enter second number: ";
        printMsg(msg);
        int b = enterValue();
        int nod;
        int nok;
        boolean isPrimeA = isPrimeNumber(a);
        boolean isPrimeB = isPrimeNumber(b);

        if (isPrimeA && isPrimeB) {
            nod = 1;
            nok = a * b;
        } else {
            int sizeA = searchArraySize(a);
            int[] arrayANod = new int[sizeA];
            int[] arrayANok = new int[sizeA];
            fillArray(arrayANod, a);
            fillArray(arrayANok, a);

            int sizeB = searchArraySize(b);
            int[] arrayBNod = new int[sizeB];
            int[] arrayBNok = new int[sizeB];
            fillArray(arrayBNod, b);
            fillArray(arrayBNok, b);

            nod = searchNod(arrayANod, arrayBNod);
            nok = searchNok(arrayANok, arrayBNok, a, b);
        }
        msg = "nod for " + a + " and " + b + " is " + nod;
        printMsg(msg);
        msg = "nok for " + a + " and " + b + " is " + nok;
        printMsg(msg);
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static int enterValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean isPrimeNumber(int number) {
        boolean result = true;
        if (number > 2) {
            for (int i = 2; i < number - 1; i++) {
                result = number % i != 0;
                break;
            }
        }
        return result;
    }

    public static int searchArraySize(int number) {
        int size = 1;
        for (int i = 2; i < number - 1; ) {
            if (number % i == 0) {
                size++;
                number /= i;
            } else {
                i++;
            }
        }
        return size;
    }

    public static void fillArray(int[] array, int number) {
        for (int i = 2, j = 0; i <= number; ) {
            if (number % i == 0) {
                array[j++] = i;
                number /= i;
            } else {
                i++;
            }
        }
    }

    public static int searchNod(int[] m1, int[] m2) {
        int nod = 1;
        mark:
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; ) {
                if (m1[i] == m2[j]) {
                    nod *= m2[j];
                    m1[i] = 1;
                    m2[j] = 1;
                    i++;
                    if (i == m1.length) {
                        break mark;
                    }
                    j++;
                } else {
                    j++;
                }
            }
        }
        return nod;
    }

    public static int searchNok(int[] m1, int[] m2, int a, int b) {
        mark:
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; ) {
                if (m1[i] == m2[j]) {
                    m1[i] = 1;
                    m2[j] = 1;
                    i++;
                    if (i == m1.length) {
                        break mark;
                    }
                    j++;
                } else {
                    j++;
                }
            }
        }
        int result;
        if (a > b) {
            result = a;
            for (int i = 0; i < m2.length; i++) {
                if (m2[i] != 1) {
                    result *= m2[i];
                }
            }
        } else {
            result = b;
            for (int i = 0; i < m1.length; i++) {
                if (m1[i] != 1) {
                    result *= m1[i];
                }
            }
        }
        return result;
    }
}

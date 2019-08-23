//Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Task21 {
    public static void main(String[] args) {
        int[][]aray = new int[10][20];
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                aray[i][j] = (int)(Math.random() * 16);
            }
        }
        for (int[] es : aray) {
            for (int e : es) {
                System.out.print(e + ", ");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if(aray[i][j] == 5){
                    counter++;
                }
            }
            if(counter >= 3){
                System.out.println("В строке №" + i + " число 5 встречается " + counter + " раз;");
            }
            counter = 0;
        }
    }
}

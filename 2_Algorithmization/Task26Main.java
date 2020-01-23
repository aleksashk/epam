import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int a;
        int b;
        int x;
        int y;
        int xUp;
        int xDown;
        int yDiagonal;
        int xDownDiagonal;
        int yLeftDiagonal;
        int d = 1;
        int chose;
        int value1;
        int value2;
        String msg = DataOption.MSG;
        DataOption.printMsg(msg);
        chose = DataOption.setNumber();
        while (chose < 1 || chose > 2) {
            msg = DataOption.MSG;
            DataOption.printMsg(msg);
            chose = DataOption.setNumber();
        }
        if (chose == 1) {
            msg = DataOption.MAIN_MSG;
            DataOption.printMsg(msg);
            num = DataOption.setNumber();
            while (num < 3 || num % 2 == 0) {
                msg = DataOption.MAIN_WRONG_MSG
                        + DataOption.MAIN_MSG;
                DataOption.printMsg(msg);
                num = DataOption.setNumber();
            }
            num += 2;
            int[][] aray = new int[num][num];
            for (int i = 1; i < num - 1; i++) {
                for (int j = 1; j < num - 1; j++) {
                    aray[i][j] = 0;
                }
            }

            for (int i = 0, j = 0; j < num; j++) {
                aray[i][j] = -1;
            }
            for (int i = 0, j = num - 1; i < num; i++) {
                aray[i][j] = -1;
            }
            for (int i = num - 1, j = 0; j < num; j++) {
                aray[i][j] = -1;
            }
            for (int i = 0, j = 0; i < num; i++) {
                aray[i][j] = -1;
            }

            x = 1;
            y = num / 2;
            a = x;
            b = y;
            aray[a][b] = d;

            while (d < Math.pow(num - 2, 2)) {//str 26
                ++d;
                xUp = DataOption.getXUp(a);//xDiagonal and xLeftDiagonal and yUP and yDown is SAME
                yDiagonal = DataOption.getYDiagonal(b);// yDownDiagonal is SAME
                xDown = DataOption.getXDown(a);
                xDownDiagonal = DataOption.getXDownDiagonal(num);
                yLeftDiagonal = DataOption.getYLeftDiagonal();
                if (aray[xDown][y] == 0) {
                    a = xDown;
                    b = y;
                }
                if (aray[xUp][yDiagonal] == 0) {
                    a = xUp;
                    b = yDiagonal;
                }
                if (aray[xUp][yDiagonal] == -1) {
                    if (aray[xUp][y] == -1 && aray[xDownDiagonal][yDiagonal] == 0) {
                        a = xDownDiagonal;
                        b = yDiagonal;
                    } else if (aray[xUp][y] != -1) {
                        a = xUp;
                        b = yLeftDiagonal;
                    }
                }

                aray[a][b] = d;
                y = b;
            }
            for (int i = 1; i < num - 1; i++) {
                for (int j = 1; j < num - 1; j++) {
                    System.out.printf("%6d", aray[i][j]);
                }
                System.out.println();

            }
            for (int i = 1; i < num - 1; i++) {
                int sum = 0;
                for (int j = 1; j < num - 1; j++) {
                    sum += aray[i][j];
                }
                System.out.println("sum items of aray in " + i + " row is " + sum + ";");
            }
            for (int j = 1; j < num - 1; j++) {
                int sum = 0;
                for (int i = 1; i < num - 1; i++) {
                    sum += aray[i][j];
                }
                System.out.println("sum items of aray in " + j + " column is " + sum + ";");
            }
            int s1 = 0;
            for (int i = num - 2, j = 1; i >= 1; i--, j++) {
                s1 += aray[i][j];
            }
            System.out.println("sum items of aray in first diagonal is " + s1 + ";");
            int s2 = 0;
            for (int i = 1, j = i; i < num - 1; i++) {
                s2 += aray[i][j];
            }
            System.out.println("sum items of aray in second diagonal is " + s2 + ";");

        }
        if (chose == 2) {
            msg = DataOption.MAIN_MSG_SECOND;
            DataOption.printMsg(msg);
            num = DataOption.setNumber();
            while (num < 4 || num % 4 != 0) {
                msg = DataOption.MAIN_WRONG_MSG + DataOption.MAIN_MSG_SECOND;
                DataOption.printMsg(msg);
                num = DataOption.setNumber();
            }
            int[][] aray = new int[num][num];
            int t = 4 / 2 - 1;
            int flag = -1;
            for (int i = 0; i < t; i++) {
                for (int j = 0; j <= t; j++) {
                    aray[i][j] = flag;
                    flag *= flag;
                }
            }
            for (int i = 0; i < t; i++) {
                for (int j = 2; j < num; ++j) {
                    int temp = j - 1;
                    aray[i][j] = aray[i][temp];
                    --temp;
                    aray[i][++j] = aray[i][temp];
                }
            }
            for (int i = 0, k = 1; i < num / 2 - 1; i++, k++) {
                for (int j = 0; j < num; j++) {
                    aray[k][j] = aray[i][j] * (-1);
                }
            }

            for (int i = num / 2, k = num / 2 - 1; i < num; i++, k--) {
                for (int j = 0; j < num; j++) {
                    aray[i][j] = aray[k][j];
                }
            }

            for (int i = 0; i < num / 2; i++) {
                for (int j = 0; j < num; j++, d++) {
                    value1 = (int) Math.pow(num, 2) + 1 - d;
                    value2 = d;
                    if (aray[i][j] == 1) {
                        value1 = d;
                        value2 = (int) Math.pow(num, 2) + 1 - d;
                    }
                    aray[i][j] = value1;
                    aray[num - 1 - i][num - 1 - j] = value2;
                }
            }
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.printf("%6d", aray[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < num; i++) {
                int sum = 0;
                for (int j = 0; j < num; j++) {
                    sum += aray[i][j];
                }
                System.out.println("sum items of aray in " + i + " row is " + sum + ";");
            }
            for (int j = 0; j < num; j++) {
                int sum = 0;
                for (int i = 0; i < num; i++) {
                    sum += aray[i][j];
                }
                System.out.println("sum items of aray in " + j + " column is " + sum + ";");
            }
            int s1 = 0;
            for (int i = num - 1, j = 0; i >= 0; i--, j++) {
                s1 += aray[i][j];
            }
            System.out.println("sum items of aray in first diagonal is " + s1 + ";");
            int s2 = 0;
            for (int i = 0, j = i; i < num; i++) {
                s2 += aray[i][j];
            }
            System.out.println("sum items of aray in second diagonal is " + s2 + ";");
        }
    }
}

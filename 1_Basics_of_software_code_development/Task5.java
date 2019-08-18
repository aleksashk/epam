//Дано натуральное число T, которое представляет длительность прошедшего времени в секундахю Вывести данное значение длительности в часах, минутах и секундах в следующем формате ННч ММмин SSс.
public class Task5 {
    public static void main(String[] args) {
        int time, h, m, s;
        String strH, strM, strS;
        time = 18720;
        h = Math.round(time / 3600);
        if(h >= 24)
            h %= 24;
        m = Math.round(time % 3600 / 60);
        s = Math.round(time % 3600 - m * 60);
        switch (h){
            default:
                strH = h + "ч";
                break;
            case 0:
                strH = "00ч";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                strH = "0" + h + "ч";
                break;
        }
        switch (m){
            default:
                strM = m + "мин";
                break;
            case 0:
                strM = "00мин";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                strM = "0" + m + "мин";
                break;
        }
        switch (s){
            default:
                strS = s + "с";
                break;
            case 0:
                strS = "00с";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                strS = "0" + s + "с";
                break;
        }
        System.out.println(strH + " " + strM + " " + strS);
    }
}

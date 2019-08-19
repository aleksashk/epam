//Составить программу нахождения произведения квадратов первых двухсот чисел
import java.math.BigDecimal;
import java.math.BigInteger;

public class Task15 {
    public static void main(String[] args) {

        BigInteger result = new BigInteger("1");//начальное значение для вычисления произведения квадратов чисел
        BigInteger maxValue = new BigInteger("200");//максимальное значение, возводимое в квадрат
        BigInteger i = new BigInteger("1");//начальное значение, возводимое в квадрат
        BigInteger step = new BigInteger("1");//шаг, на который изменяются числа, возводимые в квадрат

        while(i.compareTo(maxValue) == -1 || i.compareTo(maxValue) == 0){//сравниваем значение чисел, возводимые в квадрат с максимальновозможным значением( -1 - число меньше максимума, 0 - число равно максимуму)
            result = result.multiply(i.multiply(i));//находим произведение квадратов текущих чисел и предыдущих чисел
            i = i.add(step);//изменяем шаг на 1 (переходим к следующему числу)
        }
        System.out.println("Произведение квадратов первых двухсот чисел составило: \n" + result);
    }
}

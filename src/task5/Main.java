package task5;

/**
 * 1. Создать матрицу состоящую из строк 10х10.
 * 1.1 Все значения рандом  (число - 1.89345, строка - JkldTha)
 * 1.2 Каждое значение имеет по 7 символов
 * 1.3 Каждый третий элемент Double
 * 2. Взять её прямую и побочную диагональ сравнить их, являются ли они одинаковыми.
 * 2.1 Положить диагонали в новый массив.
 * (Про преобразования почитать. String.valueOf(), Double.parseDouble())
 * 3. Из нового массива:
 * 3.1 Если элемент является строкой то взять из нее со 2 по 4 элемент и положить в SB и
 * просто вывести их на экран через запятую.
 * 3.2 Если же числом то нужно округлить каждое число.
 * Если число ( 1,7 и больше то в большую сторону, если меньше то в меньшую сторону).
 * после сложить эти числа в массив. И этот массив вывести на экран, через знак подчеркивания.
 * 4 . также вывести на экран первоначальную матрицу.
 */
public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.start();
    }
}
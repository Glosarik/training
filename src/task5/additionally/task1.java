package task5.additionally;

/**
 * ●	Найти максимальное значение из массива
 * ●	Найти минимальное значение из массива
 * ●	Найти сумму цифр массива
 */
public class task1 {
    public static void main(String[] args) {
        int[] intArray = {14, 12, 5, 612, 724, 41412, 512};
        int maxNum = intArray[0];
        int minNum = intArray[0];
        int sum = 0;
        for (int j : intArray) {
            if (j > maxNum) {
                maxNum = j;
            } else if (j < minNum) {
                minNum = j;
            }
            sum += j;
        }
        System.out.println("Максимальное значение: " + maxNum);
        System.out.println("Минимальное значение: " + minNum);
        System.out.println("Сумма: " + sum);
    }
}

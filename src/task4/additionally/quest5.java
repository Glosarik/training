package task4.additionally;

import java.util.Scanner;

/**
 * ●	Найдите сумму и произведение цифр числа, введенного с клавиатуры
 */
public class quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1е число :");
        int num1 = scanner.nextInt();
        System.out.println("Введите 2е число :");
        int num2 = scanner.nextInt();
        sumAndProduct(num1, num2);
    }

    public static void sumAndProduct(int num1, int num2){
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Сумма чисел: " + sum + "\nПроизведение чисел: " + product);
    }
}

package task3.additionally;

import java.util.Scanner;

/**
 * 2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        print(scanner.nextInt());
    }

    public static void print(int num) {
        if (num % 10 == 3) {
            System.out.println("Да, последняя цифра данного значения - 3");
        } else {
            System.out.println("Нет, последняя цифра не является значением - 3");
        }
    }
}

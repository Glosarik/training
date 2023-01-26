package task3.additionally;

import java.util.Scanner;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * -Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class Money {
    private static final String VALUTE = "Рубль";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        money(scanner.nextInt());
    }

    public static void money(int num) {
        int i = num % 100 / 10;
        if (i == 1) {
            print(num, VALUTE.replace("ь", "ей"));
        } else {
            switch (num % 10) {
                case 1:
                    print(num, VALUTE);
                    break;
                case 2, 3, 4:
                    print(num, VALUTE.replace("ь", "я"));
                    break;
                default:
                    print(num, VALUTE.replace("ь", "ей"));
            }
        }
    }

    public static void print(int money, String ruble) {
        System.out.println("Вы ввели " + money + " " + ruble);
    }
}


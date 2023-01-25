package task3.additionally;

import java.util.Scanner;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * -Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class Money {
    private static final String[] VALUTE = new String[]{"Рубль", "Рублей", "Рубля"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        money(scanner.nextInt());
    }

    public static void money(int num) {
        if (num == 11) {
            print(num, VALUTE[1]);
        } else {
            switch (num % 10) {
                case 1:
                    print(num, VALUTE[0]);
                    break;
                case 2, 3, 4:
                    print(num, VALUTE[2]);
                    break;
                default:
                    print(num, VALUTE[1]);
            }
        }
    }

    public static void print(int money, String ruble) {
        System.out.println("Вы ввели " + money + " " + ruble);
    }
}


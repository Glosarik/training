package task3.additionally;

import java.util.Scanner;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем, и определяет,
 * является ли этот год високосным.
 * Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
 * то этот год не високосный, за исключением годов, делящихся на 400.
 */
public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            print(year, true);
        } else if (year % 100 == 0) {
            print(year, false);
        } else if (year % 400 == 0) {
            print(year, true);
        } else {
            print(year, false);
        }
    }

    public static void print(int year, boolean isHighGrade) {
        if (isHighGrade) {
            System.out.println(year + " год высокостный");
        } else {
            System.out.println(year + " год не высокостный");
        }
    }
}

package task3.main;

import task3.rainbow.Rainbow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rainbow rainbow = new Rainbow();
        System.out.println("Введите число от 0 до 13");
        int num = scanner.nextInt();
        if (num > 6) {
            rainbow.colorMix(num);
        } else {
            rainbow.color(num);
        }
    }
}

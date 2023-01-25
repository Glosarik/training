package task3.additionally;

import java.util.Scanner;

/**
 * 1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */
public class Month {
    private static final String[] MONTH_0 = new String[]{"Сентябрь", "Октябрь", "Ноябрь", "Декабрь", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца от 1 до 12: ");
        month(scanner.nextInt());
    }

    public static void month(int num) {
        switch (num) {
            case 1, 2, 3: {
                print(num, "Осень");
                break;
            }
            case 4, 5, 6: {
                print(num, "Зима");
                break;
            }
            case 7, 8, 9: {
                print(num, "Весна");
                break;
            }
            case 10, 11, 12: {
                print(num, "Лето");
                break;
            }
            default:
                System.out.println("Такого значения нет :c");
        }
    }

    public static void print(int num, String timeOfYear) {
        System.out.println("Вы выбрали: " + timeOfYear + ", Месяц: " + MONTH_0[num - 1]);
    }
}

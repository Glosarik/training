package task5;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {

    private static final Random RANDOM = new Random();
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final Pattern PATTERN = Pattern.compile("[a-zA-Z]+");
    private static final String[][] MATRIX = new String[10][10];
    private static final String[] DIAGONAL = new String[20];
    private static int j = 0;

    public static void start() {
        createAndDrawMatrix();
        createDiagonal();
        printElement();
        roundNumber();
    }

    private static void createAndDrawMatrix() {
        int num = 0;
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX.length; j++) {
                if (num % 3 == 2) {
                    MATRIX[i][j] = randomNumber();
                } else {
                    MATRIX[i][j] = randomString();
                }
                ++num;
            }
        }
        printMatrix();
    }

    private static void printMatrix() {
        System.out.println("Матрица 10x10:");
        for (String[] array : MATRIX) {
            for (String anInt : array) {
                System.out.printf(" " + anInt);
            }
            System.out.println();
        }
    }

    private static void createDiagonal() {
        String print = "";
        for (int i = 0; i < (Math.min(MATRIX[0].length, MATRIX.length)); i++) {
            DIAGONAL[i] = MATRIX[i][i] + " ";
            DIAGONAL[i + 10] = MATRIX[i][MATRIX[0].length - i - 1] + " ";
            if (!DIAGONAL[i].equals(DIAGONAL[i + 10])) {
                print = "\nНеа, как они могут быть равны, если тут чистый рандом то?, шанс 0.0000009%\n";
            } else {
                print = "\nНу нифига себе, мы попали в шанс 0.0000009%";
            }
        }
        System.out.println("\nПрямая и побочка в 1м массиве:");
        for (String i : DIAGONAL) {
            System.out.print(i);
        }
        System.out.println("\n\nСравниваем прямую и побочку:" + print);
    }

    private static void printElement() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : DIAGONAL) {
            Matcher matcher = PATTERN.matcher(s);
            if (matcher.find()) {
                if (j != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(s, 1, 4);
                ++j;
            }
        }
        System.out.print("Выводим 2-4й элемент со строк:\n" + stringBuilder + "\n\n");
    }

    private static void roundNumber() {
        String[] num = new String[DIAGONAL.length - j];
        int k = 0;
        for (String s : DIAGONAL) {
            Matcher matcher = PATTERN.matcher(s);
            if (!matcher.find()) {
                num[k] = String.valueOf(Math.round(Float.parseFloat(s)));
                ++k;
            }
        }
        System.out.print("Выводим округленные числа:\n" + String.join("_", num));
    }

    private static String randomString() {
        StringBuilder sb = new StringBuilder(7);
        for (int i = 0; i < 7; i++)
            sb.append(LETTERS.charAt(RANDOM.nextInt(LETTERS.length())));
        return sb.toString();
    }

    private static String randomNumber() {
        return String.valueOf(RANDOM.nextDouble(1, 9)).substring(0, 7);
    }
}

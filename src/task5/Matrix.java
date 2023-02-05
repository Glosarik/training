package task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {
    private static final Pattern PATTERN = Pattern.compile("[a-zA-Z]+");
    private static final String[][] MATRIX = new String[10][10];
    private static final String[] DIAGONAL = new String[20];
    private static int counter = 0;

    public static void start() {
        createMatrix();
        createDiagonal();
        printElement();
        roundNumber();
    }

    private static void createMatrix() {
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX.length; j++) {
                if (counter % 3 == 2) {
                    MATRIX[i][j] = Random.randomNumber();
                } else {
                    MATRIX[i][j] = Random.randomString();
                }
                ++counter;
            }
        }
        printMatrix();
        counter = 0;
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
            DIAGONAL[i + 10] = MATRIX[i][MATRIX.length - i - 1] + " ";
            if (!DIAGONAL[i].equals(DIAGONAL[i + 10])) {
                print = "\nНеа, как они могут быть равны, если тут чистый рандом то?, шанс 0.0000009%\n";
            } else {
                print = "\nНу нифига себе, мы попали в шанс 0.0000009%";
            }
        }
        System.out.println("\nПрямая и побочка в 1м массиве:");
        for (String str : DIAGONAL) {
            System.out.print(str);
        }
        System.out.println("\n\nСравниваем прямую и побочку:" + print);
    }

    private static void printElement() {
        StringBuilder sb = new StringBuilder();
        for (String s : DIAGONAL) {
            Matcher matcher = PATTERN.matcher(s);
            if (matcher.find()) {
                if (counter != 0) {
                    sb.append(", ");
                }
                sb.append(s, 1, 4);
                ++counter;
            }
        }
        System.out.print("Выводим 2-4й элемент со строк:\n" + sb + "\n\n");
    }

    private static void roundNumber() {
        String[] num = new String[DIAGONAL.length - counter];
        counter = 0;
        for (String s : DIAGONAL) {
            Matcher matcher = PATTERN.matcher(s);
            if (!matcher.find()) {
                num[counter] = String.valueOf(Math.round(Double.parseDouble(s)));
                ++counter;
            }
        }
        System.out.print("Выводим округленные числа:\n" + String.join("_", num));
    }
}

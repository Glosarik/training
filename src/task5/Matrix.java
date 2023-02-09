package task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static task5.Constants.*;

public class Matrix {
    private final Pattern PATTERN = Pattern.compile("[a-zA-Z]+");
    private final String[][] MATRIX = new String[10][10];
    private final String[] DIAGONAL = new String[20];
    private int counter = 0;

    private void createMatrix() {
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX.length; j++) {
                if (counter % 3 == 2) {
                    MATRIX[i][j] = RandomValue.randomNumber();
                } else {
                    MATRIX[i][j] = RandomValue.randomString();
                }
                ++counter;
            }
        }
        printMatrix();
        counter = 0;
    }

    private void printMatrix() {
        System.out.println(TASK_1);
        for (String[] array : MATRIX) {
            for (String anInt : array) {
                System.out.printf(" " + anInt);
            }
            System.out.println();
        }
    }

    private void createDiagonal() {
        String print = "";
        for (int i = 0; i < (Math.min(MATRIX[0].length, MATRIX.length)); i++) {
            DIAGONAL[i] = MATRIX[i][i] + " ";
            DIAGONAL[i + 10] = MATRIX[i][MATRIX.length - i - 1] + " ";
            print = DIAGONAL[i].equals(DIAGONAL[i + 10]) ? DIAGONAL_TRUE : DIAGONAL_FALSE;
        }
        System.out.println(TASK_2);
        for (String str : DIAGONAL) {
            System.out.print(str);
        }
        System.out.println(TASK_3 + print);
    }

    private void printElement() {
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
        System.out.print(TASK_4 + sb + "\n");
    }

    private void roundNumber() {
        String[] num = new String[DIAGONAL.length - counter];
        counter = 0;
        for (String s : DIAGONAL) {
            Matcher matcher = PATTERN.matcher(s);
            if (!matcher.find()) {
                num[counter] = String.valueOf(Math.round(Double.parseDouble(s)));
                ++counter;
            }
        }
        System.out.print(TASK_5 + String.join("_", num));
    }

    public void start() {
        createMatrix();
        createDiagonal();
        printElement();
        roundNumber();
    }
}

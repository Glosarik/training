package task5;

import java.util.Random;

import static task5.Constants.LETTERS;

public class RandomValue {
    private static final Random random = new Random();

    public static String randomString() {
        StringBuilder sb = new StringBuilder(7);
        for (int i = 0; i < 7; i++)
            sb.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        return sb.toString();
    }

    public static String randomNumber() {
        return String.valueOf(random.nextDouble(1, 9)).substring(0, 7);
    }
}

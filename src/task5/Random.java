package task5;

public class Random {

    private static final java.util.Random random = new java.util.Random();
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

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

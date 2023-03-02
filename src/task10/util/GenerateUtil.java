package task10.util;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static task10.util.Constants.*;

public class GenerateUtil {
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    public static final String[] COLUMN_NAMES = new String[]{NUMBER, NAME_PRODUCT, DATE_PRODUCT, ID, PRICE, QUANTITY};

    public static ArrayList<String> getList(File file) {
        ArrayList<String> products = new ArrayList<>();
        String line;
        try (var reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                Matcher matcher = PATTERN.matcher(line);
                if (matcher.find()) {
                    products.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(ERROR_THREE + e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return products;
    }

    public static int getCount(File file) {
        int getCount = ZERO;
        try (var reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = PATTERN.matcher(line);
                if (matcher.find()) {
                    getCount++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(ERROR_THREE + e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return getCount;
    }

    public static ArrayList<String> remove(File file, String index) {
        ArrayList<String> strings = new ArrayList<>();
        for (String s : GenerateUtil.getList(file)) {
            Matcher matcher = PATTERN.matcher(s);
            if (matcher.find()) {
                strings.add(s.replaceAll(REGEX, ""));
            }
        }
        if (index.matches("[0-9]") && Integer.parseInt(index) - ONE <= strings.size()) {
            System.out.println(index);
            strings.remove(Integer.parseInt(index) - ONE);
            System.out.println(REMOVE + NEW_LINE);
        } else {
            System.out.println(REMOVE_ORDER_ERROR);
        }
        return strings;
    }

    public static String tableHeader() {
        int size;
        StringBuilder sb = new StringBuilder();
        for (String s : COLUMN_NAMES) {
            size = s.equals(COLUMN_NAMES[ZERO]) || s.equals(COLUMN_NAMES[FIVE]) ? s.length() : SEPARATOR.concat(s).
                    length() + TEN;
            sb.append(String.format("%-" + size + "s", SEPARATOR.concat(s)));
        }
        return sb.toString();
    }

    public static int formatException(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return -ONE;
        }
    }

    public static String printLine(String string, String symbol) {
        return string + NEW_LINE + symbol.repeat(string.length());
    }

    public static void printLine(BufferedWriter bw, String str) throws IOException {
        bw.write(NEW_LINE + "—".repeat(str.length()) + NEW_LINE);
    }
}

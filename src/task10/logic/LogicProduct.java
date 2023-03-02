package task10.logic;

import task10.items.Product;
import task10.util.GenerateUtil;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

import static task10.util.Constants.*;

public class LogicProduct {
    protected static final File FILE = Path.of(RESOURCES, "product.txt").toFile();
    private int count = ONE;

    public void create(ArrayList<String> list) {
        String tableHeader = GenerateUtil.tableHeader();
        try (var writer = new BufferedWriter(new FileWriter(FILE))) {
            writer.write(tableHeader + NEW_LINE);
            writer.write(".".repeat(tableHeader.length()) + NEW_LINE);
            for (String s : list) {
                writer.write(SEPARATOR + count++ + s);
                GenerateUtil.printLine(writer, SEPARATOR + count + s);
            }
        } catch (IOException e) {
            System.out.println(ERROR_FOUR + e.getMessage());
        }
        count = ONE;
    }

    public void add(String product) {
        try (var writer = new BufferedWriter(new FileWriter(FILE, true))) {
            String str = (SEPARATOR + (GenerateUtil.getCount(FILE) + ONE)) + new Product(product);
            writer.write(str);
            GenerateUtil.printLine(writer, str);
            System.out.println(ADD_PRODUCT + NEW_LINE);
        } catch (FileNotFoundException e) {
            System.err.println(ERROR_THREE + e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void remove(String index) {
        create(GenerateUtil.remove(FILE, index));
    }

    public ArrayList<String> listProduct() {
        ArrayList<String> list = new ArrayList<>();
        list.add(new Product(COLUMN).toString());
        list.add(new Product(HEADPHONES).toString());
        list.add(new Product(GAMING_MOUSE).toString());
        list.add(new Product(GAMING_KEYBOARD).toString());
        list.add(new Product(SCREEN).toString());
        return list;
    }
}

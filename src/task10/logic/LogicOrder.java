package task10.logic;

import task10.util.GenerateUtil;
import task10.items.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static task10.util.Constants.*;

public class LogicOrder {
    protected static final File FILE = Path.of(RESOURCES, "order.txt").toFile();
    private int count = ONE;

    public void create(ArrayList<String> list) {
        String tableHeader = GenerateUtil.tableHeader().replace(DATE_PRODUCT, DATE_ORDER);
        try (var writer = new BufferedWriter(new FileWriter(FILE))) {
            writer.write(tableHeader + NEW_LINE);
            writer.write(".".repeat(tableHeader.length()) + NEW_LINE);
            if (list != null) {
                for (String s : list) {
                    writer.write(SEPARATOR + count++ + s);
                    GenerateUtil.printLine(writer, SEPARATOR + count + s);
                }
            }
        } catch (IOException e) {
            System.out.println(ERROR_FOUR + e.getMessage());
        }
        count = ONE;
    }

    public void add(int id) {
        if (!FILE.isFile()) {
            create(null);
        }
        List<Order> orders = new ArrayList<>();
        for (String s : GenerateUtil.getList(LogicProduct.FILE)) {
            String[] parts = s.split("\\s\\|\\s");
            orders.add(new Order(parts[TWO], parts[FOUR], parts[FIVE]));
        }
        try (var writer = new BufferedWriter(new FileWriter(FILE, true))) {
            writer.write(SEPARATOR + (GenerateUtil.getCount(FILE) + ONE) + orders.get(id - ONE));
            GenerateUtil.printLine(writer, (SEPARATOR + count + orders.get(id - ONE).toString()));
        } catch (IOException e) {
            System.out.println(ERROR_THREE + e.getMessage());
        }
    }

    public void remove(String index) {
        create(GenerateUtil.remove(FILE, index));
    }
}

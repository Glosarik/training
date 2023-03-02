package task10.items;

import java.time.LocalDate;

import static task10.util.Constants.*;
import static task10.util.GenerateUtil.COLUMN_NAMES;
import static task10.util.RandomUtil.*;

public class Product {

    private final String name;
    private final LocalDate date;
    private final String uuid;
    private final float price;
    private final int quantity;

    public Product(String name) {
        this.name = name;
        this.date = randomDate();
        this.uuid = randomUuid();
        this.price = randomPrice();
        this.quantity = randomQuantity();
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        int size;
        StringBuilder s = new StringBuilder();
        String[] data = new String[]{getName(), String.valueOf(getDate()), getUuid(), String.valueOf(getPrice()).
                substring(ZERO, FOUR) + DOLLAR, getQuantity() + COUNT};
        for (int i = ONE; i < COLUMN_NAMES.length; i++) {
            size = COLUMN_NAMES[i].equals(COLUMN_NAMES[FIVE]) ? COLUMN_NAMES[i].length() + SEPARATOR.length() :
                    SEPARATOR.concat(COLUMN_NAMES[i]).length() + TEN;
            s.append(String.format("%-" + size + "s", SEPARATOR.concat(data[i - ONE])));
        }
        return s.toString();
    }
}
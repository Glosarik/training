package task10.items;

import java.time.LocalDate;

import static task10.util.Constants.*;
import static task10.util.GenerateUtil.COLUMN_NAMES;
import static task10.util.RandomUtil.randomQuantity;

public class Order {

    private final String name;
    private final LocalDate date;
    private final String uuid;
    private final String price;
    private final int quantity;

    public Order(String name, String uuid, String price) {
        this.name = name;
        this.date = LocalDate.now();
        this.uuid = uuid;
        this.price = price;
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

    public String getPrice() {
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
                    SEPARATOR.concat(COLUMN_NAMES[i].replace(DATE_PRODUCT, DATE_ORDER)).length() + TEN;
            s.append(String.format("%-" + size + "s", SEPARATOR.concat(data[i - ONE])));
        }
        return s.toString();
    }
}
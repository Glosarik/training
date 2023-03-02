package task10.items;

import java.time.LocalDate;

import static task10.util.Constants.*;
import static task10.util.GenerateUtil.COLUMN_NAMES;

public abstract class BaseItem {

    public String name;
    protected LocalDate date;
    protected String uuid;
    protected String price;
    protected int quantity;

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
                    SEPARATOR.concat(COLUMN_NAMES[i]).length() + TEN;
            s.append(String.format("%-" + size + "s", SEPARATOR.concat(data[i - ONE])));
        }
        return s.toString();
    }
}

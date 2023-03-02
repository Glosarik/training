package task10.items;

import java.time.LocalDate;

import static task10.util.RandomUtil.randomQuantity;

public class Order extends BaseItem {

    public Order(String name, String uuid, String price) {
        this.name = name;
        this.date = LocalDate.now();
        this.uuid = uuid;
        this.price = price;
        this.quantity = randomQuantity();
    }
}
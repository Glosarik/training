package task10.items;

import static task10.util.RandomUtil.*;

public class Product extends BaseItem {

    public Product(String name) {
        this.name = name;
        this.date = randomDate();
        this.uuid = randomUuid();
        this.price = randomPrice();
        this.quantity = randomQuantity();
    }
}
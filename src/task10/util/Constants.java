package task10.util;

public final class Constants {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int NINETY_NINE = 99;
    public static final int THIRTY_TWO = 32;
    public static final int THIRTEEN = 13;

    public static final String NEW_LINE = System.lineSeparator();
    public static final String SEPARATOR = " | ";
    public static final String NUMBER = "№";
    public static final String DOLLAR = "$";
    public static final String REGEX = "^ \\|\\s\\d";
    public static final String RESOURCES = "resources";
    public static final String COUNT = "шт.";
    public static final String NAME_PRODUCT = "Название товара";
    public static final String DATE_PRODUCT = "Дата";
    public static final String ID = "Идентификатор";
    public static final String PRICE = "Цена";
    public static final String QUANTITY = "Количество";
    public static final String COLUMN = "Колонка";
    public static final String HEADPHONES = "Наушники";
    public static final String GAMING_MOUSE = "Игровая мышка";
    public static final String GAMING_KEYBOARD = "Игровая клавиатура";
    public static final String SCREEN = "Монитор";
    public static final String CLOSE_PROGRAM = "Выход из программы";
    public static final String ERROR_ONE = "Ошибка: введите число от 1 до 2, или 9 для выхода";
    public static final String ERROR_TWO = "Ошибка: введите число от 1 до 3, или 9 для выхода";
    public static final String ERROR_THREE = "Файл не найден: ";
    public static final String ERROR_FOUR = "Ошибка при создании файла: ";
    public static final String ADD_PRODUCT = "Продукт был успешно добавлен!";
    public static final String REMOVE = "Удаление произошло успешно!";
    public static final String REMOVE_ORDER_ERROR = "Такого № не существует, повторите попытку.";
    public static final String PRINT_TWO_MENU_ONE = "Введите название товара для добавления.";
    public static final String PRINT_TWO_MENU_TWO = "Введите № товара для удаления.";
    public static final String PRINT_THREE_MENU_ONE = "Корзинка пуста, добавьте для начала в неё товар.";
    public static final String PRINT_THREE_MENU_TWO = "Введите № товара для добавления.";
    public static final String PRINT_THREE_MENU_THREE = "Введите № товара для удаления.";
    public static final String PRINT_ONE_MENU = """
            Выберите действие:
            1 - Вывести список товаров
            2 - Вывести список заказов
            9 - Выход из программы
            """;
    public static final String PRINT_TWO_MENU = """
            Выберите действие:
            1 - Добавить товар
            2 - Удалить товар
            3 - Вернуться в главное меню
            9 - Выход из программы
            """;
    public static final String PRINT_THREE_MENU = """
            Выберите действие:
            1 - Добавить товар в корзину
            2 - Удалить товар из корзины
            3 - Вернуться в главное меню
            9 - Выход из программы
            """;

    private Constants() {
    }
}

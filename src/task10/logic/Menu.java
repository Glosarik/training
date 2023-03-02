package task10.logic;

import task10.util.GenerateUtil;

import java.util.Scanner;

import static task10.util.Constants.*;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private int option;
    private final LogicProduct logicProduct = new LogicProduct();
    private final LogicOrder logicOrder = new LogicOrder();
    private final String tableHeader = GenerateUtil.tableHeader();

    public void start() {
        if (!LogicProduct.FILE.isFile()) {
            logicProduct.create(logicProduct.listProduct());
        }
        printOneMenu();
    }

    public void printOneMenu() {
        do {
            System.out.println(PRINT_ONE_MENU);
            option = GenerateUtil.formatException(scanner.nextLine());
            switch (option) {
                case ONE -> printTwoMenu();
                case TWO -> printThreeMenu();
                case NINE -> System.out.println(CLOSE_PROGRAM);
                default -> System.out.println(ERROR_ONE);
            }

        } while (option != NINE);
        scanner.close();
    }

    public void printTwoMenu() {
        do {
            System.out.println(GenerateUtil.printLine(tableHeader, "."));
            for (String s : GenerateUtil.getList(LogicProduct.FILE)) {
                System.out.println(GenerateUtil.printLine(s, "—"));
            }
            System.out.println(PRINT_TWO_MENU);
            option = GenerateUtil.formatException(scanner.nextLine());
            switch (option) {
                case ONE -> {
                    System.out.println(PRINT_TWO_MENU_ONE);
                    logicProduct.add(scanner.nextLine());
                }
                case TWO -> {
                    System.out.println(PRINT_TWO_MENU_TWO);
                    logicProduct.remove(scanner.nextLine());
                }
                case THREE -> printOneMenu();
                case NINE -> System.out.println(CLOSE_PROGRAM);
                default -> System.out.println(ERROR_TWO);
            }

        } while (option != NINE);
        scanner.close();
    }

    public void printThreeMenu() {
        do {
            if (!LogicOrder.FILE.isFile()) {
                System.out.println(PRINT_THREE_MENU_ONE);
            } else {
                System.out.println(GenerateUtil.printLine(tableHeader.replace(DATE_PRODUCT, DATE_ORDER), "."));
                for (String s : GenerateUtil.getList(LogicOrder.FILE)) {
                    System.out.println(GenerateUtil.printLine(s, "—"));
                }
            }
            System.out.println(PRINT_THREE_MENU);
            option = GenerateUtil.formatException(scanner.nextLine());
            switch (option) {
                case ONE -> {
                    System.out.println(GenerateUtil.printLine(tableHeader, "."));
                    for (String s : GenerateUtil.getList(LogicProduct.FILE)) {
                        System.out.println(GenerateUtil.printLine(s, "—"));
                    }
                    System.out.println(PRINT_THREE_MENU_TWO);
                    logicOrder.add(Integer.parseInt(scanner.nextLine()));
                }
                case TWO -> {
                    if (LogicOrder.FILE.isFile()) {
                        System.out.println(PRINT_THREE_MENU_THREE);
                        logicOrder.remove(scanner.nextLine());
                    }
                }
                case THREE -> printOneMenu();
                case NINE -> System.out.println(CLOSE_PROGRAM);
                default -> System.out.println(ERROR_TWO);
            }

        } while (option != NINE);
        scanner.close();
    }
}

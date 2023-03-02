package task9;

import java.util.Scanner;

import static task9.Constants.*;

public class Test {
    private final Scanner scanner = new Scanner(System.in);

    public void test() {
        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            switch (option) {
                case ONE -> optionOne();
                case TWO -> optionTwo();
                case THREE -> optionThree();
            }
        } while (option != FOUR);
    }

    private static void printMenu() {
        System.out.println(OPTION);
        System.out.println(OPTION_ONE);
        System.out.println(OPTION_TWO);
        System.out.println(OPTION_THREE);
        System.out.println(OPTION_FOUR);
    }

    public void optionOne() {
        System.out.println(OPTION_ONE_ONE);
        String username = scanner.next();
        try {
            if (!username.matches("[a-zA-Z]+")) {
                throw new InvalidUsernameException(username);
            } else {
                System.out.println(OPTION_ONE_TWO + username);
            }
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(FINALLY);
        }
    }

    public void optionTwo() {
        System.out.println(OPTION_TWO_ONE);
        float a = scanner.nextInt();
        System.out.println(OPTION_TWO_TWO);
        float b = scanner.nextInt();
        try {
            if (b == 0) {
                throw new DivisionByZeroException();
            } else {
                float c = a / b;
                System.out.println(OPTION_TWO_RES + c);
            }
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(FINALLY);
        }
    }

    public void optionThree() {
        System.out.println(OPTION_THREE_ONE);
        int num = scanner.nextInt();
        try {
            throwNegativeNumberException(num);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println(FINALLY);
        }
    }

    public static void throwNegativeNumberException(int number) throws NegativeNumberException {
        if (number < ZERO) {
            throw new NegativeNumberException(EXCEPTION_THREE_ONE);
        } else {
            System.out.println(EXCEPTION_THREE_TWO);
        }
    }

    static class InvalidUsernameException extends RuntimeException {
        public InvalidUsernameException(String username) {
            super(EXCEPTION_ONE + username);
        }
    }

    static class DivisionByZeroException extends RuntimeException {
        public DivisionByZeroException() {
            super(EXCEPTION_TWO);
        }
    }

    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
}

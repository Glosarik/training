package task9;

/**
 * 1. Написать 3 своих исключения.
 * 2. Каждое должно логически срабатывать при определенных условиях.
 * 3. Конструкции с исключениями должны включать try, catch, finally.
 * 4. Два из трех могут быть объединены.
 * 5. Третье в отдельном методе и пробрасывается, т.е. ловится выше.
 * Самим придумать почему исключение срабатывает.
 * Ничего не мудрить все должно быть просто.
 */
public class Main {

    public static void main(String[] args) {
        Test teste = new Test();
        teste.test();
    }
}

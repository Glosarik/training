package task4;

import java.util.Random;

/**
 * 1.  Создаем два класса. Класс Cat и класс для запуска приложения (Main, Runner).
 * 2.  У кота есть имя и возраст. Есть дефолтное значение имени и возраста.
 * 3.  При запуске приложения используем четыре цикла.
 * 4.  Первый while создает 10 котиков и выводит на консоль дефолтное имя и возраст.
 * 5.  Во втором цикле for создаем 10 котиков, вводим их возраст и имя через сеттер, и   выводим в консоль через геттер.
 * 6. Третий цикл do while создает 10 котиков вводит имя и возраст через конструктор.	    Выводим в консоль.
 * 7.  В четвертом цикле foreach выводим  массив из пяти котиков, у них выводим имя и возраст.
 * <p>
 * Способ инициализации возраста и имени - на ваше усмотрение.
 * Имена котиков создавать как набор символов, через рандом класс Random.
 * Возраст котиков рандомное значение от 1 до 28.
 * <p>
 * Сгенерировать метод equals и toString для класса Cat.
 */
public class Cat {

    private static String nameDefault = "Степашка";
    private static int ageDefault = 1;
    private static int catCount = 0;

    private static final String VOWEL_LETTERS = "аоуеёиюя";
    private static final String CONSOSANT_LETTERS = "бвгджзклмнпрстфхцчшщ";
    private static final Random random = new Random();

    public static void start() {
        firstCycle();
        secondCycle();
        thirdCycle();
        fourthCycle();
    }

    private static void firstCycle() {
        print("while");
        while (++catCount < 10) {
            Cat cat = new Cat();
            System.out.println(cat);
        }
        catCount = 0;
    }

    private static void secondCycle() {
        print("for");
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            setAge(randomAge());
            setName(randomName());
            System.out.println(cat);
        }
    }

    private static void thirdCycle() {
        print("while");
        do {
            Cat cat = new Cat(randomName(), randomAge());
            System.out.println(cat);
        } while (++catCount < 10);
    }

    private static void fourthCycle() {
        print("foreach");
        Cat[] cats = new Cat[5];
        for (Cat cat : cats) {
            cat = new Cat(randomName(), randomAge());
            System.out.println(cat);
        }
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        nameDefault = name;
        ageDefault = age;
    }

    private static String randomName() {
        char[] name = new char[random.nextInt(3, 7)];
        for (int i = 0; i < name.length; i = i + 2) {
            name[i] = CONSOSANT_LETTERS.charAt(random.nextInt(CONSOSANT_LETTERS.length()));
        }
        for (int i = 1; i < name.length; i = i + 2) {
            name[i] = VOWEL_LETTERS.charAt(random.nextInt(VOWEL_LETTERS.length()));
        }
        name[0] = Character.toUpperCase(name[0]);
        return String.valueOf(name);
    }

    private static int randomAge() {
        return random.nextInt(1, 28);
    }

    private String getName() {
        return nameDefault;
    }

    private static void setName(String name) {
        nameDefault = name;
    }

    private int getAge() {
        return ageDefault;
    }

    private static void setAge(int age) {
        ageDefault = age;
    }

    private static void print(String str) {
        System.out.println("\nКотики с циклом " + str + ":");
    }

    @Override
    public String toString() {
        String nameAge = "Котика зовут - " + getName() + ", ему: " + getAge() + " год";
        if (ageDefault == 1) {
            return nameAge;
        } else if (ageDefault < 5) {
            return nameAge.concat("а");
        } else {
            return nameAge.replace("год", "лет");
        }
    }
}

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

    private String name = "Степашка";
    private int age = 1;
    private static int catCount = 0;

    private static final String VOWELLETTERS = "аоуеёиюя";
    private static final String CONSOSANTLETTERS = "бвгджзклмнпрстфхцчшщ";
    private final Random random = new Random();

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void start() {
        Cat cat = new Cat();
        cat.firstCycle();
        cat.secondCycle();
        cat.thirdCycle();
        cat.fourthCycle();
    }

    public void firstCycle() {
        print("while");
        while (++catCount < 10) {
            System.out.println(this);
        }
        catCount = 0;
    }

    public void secondCycle() {
        print("for");
        for (int i = 0; i < 10; i++) {
            setAge(randomAge());
            setName(randomName());
            System.out.println(this);
        }
    }

    public void thirdCycle() {
        print("while");
        do {
            Cat cat = new Cat(randomName(), randomAge());
            System.out.println(cat);
        } while (++catCount < 10);
    }

    public void fourthCycle() {
        print("foreach");
        Cat[] cats = new Cat[5];
        for (Cat cat : cats) {
            cat = new Cat(randomName(), randomAge());
            System.out.println(cat);
        }
    }

    public String randomName() {
        char[] name = new char[random.nextInt(3, 7)];
        for (int i = 0; i < name.length; i = i + 2) {
            name[i] = CONSOSANTLETTERS.charAt(random.nextInt(CONSOSANTLETTERS.length()));
        }
        for (int i = 1; i < name.length; i = i + 2) {
            name[i] = VOWELLETTERS.charAt(random.nextInt(VOWELLETTERS.length()));
        }
        name[0] = Character.toUpperCase(name[0]);
        return String.valueOf(name);
    }

    public int randomAge() {
        return random.nextInt(1, 28);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(String str) {
        System.out.println("\nКотики с циклом " + str + ":");
    }

    @Override
    public String toString() {
        String nameAge = "Котика зовут - " + getName() + ", ему: " + getAge() + " год";
        if (age == 1) {
            return nameAge;
        } else if (age < 5) {
            return nameAge.concat("а");
        } else {
            return nameAge.replace("год", "лет");
        }
    }
}

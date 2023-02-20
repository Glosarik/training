package task8;

/**
 * ЗАДАНИЕ 8
 * Собственная реализация ArrayList
 * Интерфейс: MyList<T>
 * Реализация MyArrayList<T>
 * <p>
 * Методы:
 * int size(); -  количество элементов в коллекции.
 * boolean isEmpty(); – проверяет на наличие элементов
 * boolean contains(Object value); – проверяет содержится ли элемент.
 * boolean add(E value); – добавляет элемент в конец списка.
 * boolean add(int index, E value); – добавляет в список по индексу index объект value.
 * boolean remove(Object value); – удаляет элемент по элементу.
 * boolean addAll(MyList<? extends T> value); – добавляет элементы одной коллекции в конец другой.
 * E get (int index) – возвращает объект из списка по индексу index
 * E remove (int index) –удаляет элемент по индексу index, возвращает при этом удалённый объект.
 * E set (int index, E value) – присваивает значение объекта value элементу, который находиться по индексу index.
 * int indexOf (Object value) – возвращает индекс первого вхождения объекта value в список. Если объект не найден вернуть -1;
 * <p>
 * КОНСТРУКТОРЫ
 * MyArrayList() – создаёт пустой список.
 * MyArrayList(int capacity) – создаёт список, который имеет начальную ёмкость capacity.
 * MyArrayList(MyList<? extends T> col) – создаёт список, в который добавляются все элементы коллекции col
 */

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }
}

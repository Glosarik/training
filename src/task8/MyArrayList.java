package task8;

import java.util.*;
import java.util.function.Consumer;

import static task8.Constants.*;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = TEN;
    private int size;
    private T[] elements;

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity * THREE) / TWO + ONE;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == ZERO;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) >= ZERO;
    }

    @Override
    public boolean add(T value) {
        ensureCapacity(size + ONE);
        elements[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        if (index < ZERO || index > size) {
            throw new IndexOutOfBoundsException(INDEX + index + SIZE + size);
        }
        ensureCapacity(size + ONE);
        System.arraycopy(elements, index, elements, index + ONE, size - index);
        elements[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object value) {
        for (int i = ZERO; i < size; i++) {
            if (Objects.equals(value, elements[i])) {
                System.arraycopy(elements, i + ONE, elements, i, size - i - ONE);
                size--;
                elements[size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        ensureCapacity(size + value.size());
        for (T item : value) {
            add(item);
        }
        return true;
    }

    @Override
    public T get(int index) {
        if (index < ZERO || index >= size) {
            throw new IndexOutOfBoundsException(INDEX + index + SIZE + size);
        }
        return elements[index];
    }

    @Override
    public T remove(int index) {
        if (index < ZERO || index >= size) {
            throw new IndexOutOfBoundsException(INDEX + index + SIZE + size);
        }
        T value = elements[index];
        System.arraycopy(elements, index + ONE, elements, index, size - index - ONE);
        size--;
        elements[size] = null;
        return value;
    }

    @Override
    public T set(int index, T value) {
        if (index < ZERO || index >= size) {
            throw new IndexOutOfBoundsException(INVALID_INDEX + index);
        }
        T old = elements[index];
        elements[index] = value;
        return old;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = ZERO; i < size; i++) {
            if (elements[i].equals(value)) {
                return i;
            }
        }
        return -ONE;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        MyList.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return MyList.super.spliterator();
    }

    public int getLength() {
        return this.elements.length;
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = ZERO;
    }

    public MyArrayList(MyList<? extends T> col) {
        this(col.size());
        for (T element : col) {
            add(element);
        }
    }

    private class MyArrayListIterator implements Iterator<T> {
        private int index = ZERO;

        public boolean hasNext() {
            return index < size;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException(EXCEPTION_ONE);
            }
            return elements[index++];
        }

        public void remove() {
            throw new UnsupportedOperationException(EXCEPTION_TWO);
        }
    }
}

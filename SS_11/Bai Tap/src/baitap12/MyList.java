package baitap12;

import java.util.Arrays;

public class MyList<E> { // Kiểu khai báo Generic
    private int size = 0; // Trường thuộc tính size
    private static final int DEFAULT_CAPACITY = 10; // Khai báo 'Hằng'
    Object[] elements; // Mảng với kiểu dữ liệu là Object - Nghĩa là 1 Mảng các đối
    // Object: là 1 kiểu dữ liệu tham chiếu, nó có thể chứa bất kỳ giá trị nào.
    // []: Toán tử Mảng, được sử dụng để khai báo 1 mảng

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity]; // capacity: Sức chứa
    }

    public void add(int index, E element) {
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;

        return removedElement;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> cloneList = new MyList<>(size);
        cloneList.elements = Arrays.copyOf(elements, size);
        cloneList.size = size;
        return cloneList;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int currentCapacity = elements.length;
        if (minCapacity > currentCapacity) {
            int newCapacity = Math.max(currentCapacity * 2, minCapacity);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}


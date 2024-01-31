package rikkei.academy;

import java.util.Arrays;

// Tạo lớp Mylist với các thuộc tính như mô tả
// 'E' là một tham số kiểu(generic type parameter).Tham số kiểu này được sử dụng để tạo 1 lớp
// có thể chứa các phần tử của bất kỳ kiểu dữ liệu nào.
public class MyList<E> { // 'E' là tên của tham số kiểu, khi tạo 1 đối tượng của lớp 'MyList'
                        // ta có thể cung cấp kiểu cụ thể cho 'E'
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Cài đặt phương thức ensureCapa()
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Cài đặt phương thức add()
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    // Cài đặt phương thức get()
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}

























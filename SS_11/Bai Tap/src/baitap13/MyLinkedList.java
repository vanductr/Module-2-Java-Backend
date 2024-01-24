package baitap13;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private Node<E> head; // Khai báo 1 biến head kiểu Node<E>
                        // Node<E>: Lớp generic - Có thể chứa các phần tử của
                        // bất kỳ kiểu dữ liệu nào.
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    // Phương thức thêm phần tử mới vào 1 danh sách tại vị trí chỉ định
    public void add(int index, E element) {
        if (index < 0 || index > numNodes) { // Nếu chỉ số Index không hợp lệ
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> newNode = new Node<>(element);// Tạo đối tượng mới của lớp Node<E>
                        // Gán giá trị element cho thuộc tính data của nút mới
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        numNodes++;
    }

    // Thêm phần tử mới vào đầu danh sách
    public void addFirst(E e) {
        add(0, e);
    }

    // Thêm phần tử mới vào cuối danh sách
    public void addLast(E e) {
        add(numNodes, e);
    }

    // Xoá 1 phần tử tại vị trí chỉ định
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> current = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        numNodes--;
        return current.getData();
    }

    // Xoá 1 phần tử khỏi danh sách dựa trên giá trị của phần tử đó
    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }

        if (head.getData().equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null) {
            if (current.next.getData().equals(e)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // Tính size của Danh sách
    public int size() {
        return numNodes;
    }

    // Tạo 1 bản sao của Danh sách liên kết hiện tại
    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node<E> current = head;
        while (current != null) {
            cloneList.addLast(current.getData());
            current = current.next;
        }
        return cloneList;
    }

    // Kiểm tra tồn tại
    public boolean contains(E o) {
        Node<E> current = head;
        while (current != null) {
            if (current.getData().equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Tìm kiếm vị trí index của phần tử trong Danh sách
    public int indexOf(E o) {
        Node<E> current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.getData().equals(o)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    // Thêm 1 phần tử mới vào cuối Danh sách
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    //
    public void ensureCapacity(int minCapacity) {
        // Not needed for a linked list implementation
    }

    // Truy xuất phần tử tại vị trí thứ i
    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + numNodes);
        }

        Node<E> current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        return current.getData();
    }

    // Truy xuất phần tử đầu tiên
    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        return head.getData();
    }

    // Truy xuất phần tử cuối cùng
    public E getLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.getData();
    }

    // Xoá sạch mọi thứ trong Mảng
    public void clear() {
        head = null;
        numNodes = 0;
    }
}

























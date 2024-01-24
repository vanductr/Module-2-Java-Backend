package baitap13;

import java.util.NoSuchElementException;

public class MyLinkedListTest {
    public static void main(String[] args) {
        // Khai báo biến có kiểu dữ liệu là: MyLinkedList<Integer>
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        myList.add(0, 10);
        myList.add(1, 20);
        myList.add(2, 30);

        System.out.println("Size of myList: " + myList.size());
        System.out.println("First element in myList: " + myList.getFirst());
        System.out.println("Last element in myList: " + myList.getLast());

        myList.addFirst(5);
        myList.addLast(40);

        System.out.println("Size of myList after adding first and last elements: " + myList.size());
        System.out.println("First element in myList: " + myList.getFirst());
        System.out.println("Last element in myList: " + myList.getLast());

        myList.remove(1);

        System.out.println("Size of myList after removal: " + myList.size());
        System.out.println("First element in myList: " + myList.getFirst());
        System.out.println("Last element in myList: " + myList.getLast());

        System.out.println("Clone of myList:");
        MyLinkedList<Integer> cloneList = myList.clone();
        System.out.println("Size of cloneList: " + cloneList.size());
        System.out.println("First element in cloneList: " + cloneList.getFirst());
        System.out.println("Last element in cloneList: " + cloneList.getLast());

        System.out.println("Does myList contain 30? " + myList.contains(30));
        System.out.println("Index of 30 in myList: " + myList.indexOf(30));
        System.out.println("Does myList contain 25? " + myList.contains(25));
        System.out.println("Index of 25 in myList: " + myList.indexOf(25));

        myList.remove(Integer.valueOf(10));

        System.out.println("Size of myList after removal by value: " + myList.size());
        System.out.println("First element in myList: " + myList.getFirst());
        System.out.println("Last element in myList: " + myList.getLast());

        myList.clear();

        try {
            System.out.println("Size of myList after clear: " + myList.size());
            System.out.println("First element in myList: " + myList.getFirst());
            System.out.println("Last element in myList: " + myList.getLast());
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


package baitap12;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println("Size of myList: " + myList.size());
        System.out.println("Elements in myList: " + Arrays.toString(((MyList<Integer>) myList).elements));

        int removedElement = myList.remove(1);
        System.out.println("Removed element: " + removedElement);

        System.out.println("Size of myList after removal: " + myList.size());
        System.out.println("Elements in myList after removal: " + Arrays.toString(myList.elements));

        System.out.println("Clone of myList:");
        MyList<Integer> cloneList = myList.clone();
        System.out.println("Size of cloneList: " + cloneList.size());
        System.out.println("Elements in cloneList: " + Arrays.toString(cloneList.elements));
    }
}


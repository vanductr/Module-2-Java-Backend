package rikkei.academy;

import java.util.Stack;

public class ReverseArrayUsingStack<T> {
    public static <T> void reverseArray(T[] array) {
        // Khởi tạo một Stack rỗng
        Stack<T> stack = new Stack<>();

        // Đưa từng phần tử của mảng vào Stack
        for (T element : array) {
            stack.push(element);
        }

        // Lấy từng phần tử từ Stack và đưa vào lại mảng ban đầu
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        // Khởi tạo mảng số nguyên Integer
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Khởi tạo mảng String
        String[] stringArray = {"rikkei", "academy", "nong", "dan"};

        // Sử dụng ReverseArrayUsingStack để đảo ngược mảng
        ReverseArrayUsingStack<Integer> intReverser = new ReverseArrayUsingStack<>();
        intReverser.reverseArray(intArray);

        ReverseArrayUsingStack<String> stringReverser = new ReverseArrayUsingStack<>();
        stringReverser.reverseArray(stringArray);

        // Hiển thị mảng sau khi đảo ngược
        System.out.println("Mảng số nguyên sau khi đảo ngược:");
        for (Integer value : intArray) {
            System.out.print(value + " ");
        }

        System.out.println("\nMảng chuỗi sau khi đảo ngược:");
        for (String value : stringArray) {
            System.out.print(value + " ");
        }
    }
}


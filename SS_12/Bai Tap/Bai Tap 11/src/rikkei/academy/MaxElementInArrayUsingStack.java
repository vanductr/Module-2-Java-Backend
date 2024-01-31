package rikkei.academy;

import java.util.Stack;

public class MaxElementInArrayUsingStack {
    public static int findMaxElement(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int maxElement = Integer.MIN_VALUE; // Giả sử phần tử lớn nhất là giá trị nhỏ nhất của Integer

        for (int element : array) {
            // Đưa phần tử vào stack
            stack.push(element);

            // Cập nhật phần tử lớn nhất nếu cần
            if (element > maxElement) {
                maxElement = element;
            }
        }

        // Phần tử lớn nhất nằm trong maxElement
        return maxElement;
    }

    public static void main(String[] args) {
        // Mảng đầu vào
        int[] inputArray = {5, 3, 9, 7, 1, 8, 6};

        // Tìm và in ra phần tử lớn nhất trong mảng
        int maxElement = findMaxElement(inputArray);
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }
}



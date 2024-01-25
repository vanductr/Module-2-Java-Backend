package rikkei.academy;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Tạo một danh sách đầu vào
        int[] inputList = {10, 20, 30, 40, 50};

        // Tạo một hàng đợi
        Queue<Integer> myQueue = new LinkedList<>();

        // Thêm các phần tử của danh sách vào hàng đợi
        for (int element : inputList) {
            myQueue.add(element);
        }

        // In ra các phần tử của danh sách từ hàng đợi
        System.out.println("Các phần tử trong hàng đợi:");

        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll() + " "); // poll(): Lấy và xoá phần tử đầu tiên trong
            // danh sách liên kết.
        }
    }
}


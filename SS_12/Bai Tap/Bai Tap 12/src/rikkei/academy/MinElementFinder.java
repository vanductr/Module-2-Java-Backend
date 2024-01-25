package rikkei.academy;

import java.util.LinkedList;
import java.util.Queue;

public class MinElementFinder {
    // Tìm phần tử nhỏ nhất trong mảng sử dụng Queue
    public static int findMinElement(int[] array) {
        Queue<Integer> elementQueue = new LinkedList<>();

        // Duyệt qua từng phần tử trong mảng và đưa vào queue
        for (int element : array) {
            elementQueue.add(element);
        }

        // Lấy phần tử đầu tiên ra khỏi queue
        int minElement = elementQueue.poll();

        // So sánh với các phần tử khác trong queue để tìm phần tử nhỏ nhất
        while (!elementQueue.isEmpty()) {
            int currentElement = elementQueue.poll();
            if (currentElement < minElement) {
                // Đưa phần tử nhỏ hơn vào cuối queue
                elementQueue.add(minElement);
                // Cập nhật phần tử nhỏ nhất
                minElement = currentElement;
            } else {
                // Đưa phần tử vào cuối queue
                elementQueue.add(currentElement);
            }
        }

        return minElement;
    }

    public static void main(String[] args) {
        // Mảng đầu vào
        int[] inputArray = {5, 2, 8, 1, 3, 7};

        // Tìm và in phần tử nhỏ nhất
        int minElement = findMinElement(inputArray);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minElement);
    }
}


package rikkei.academy;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue(); // Khởi tạo đối tượng
        queue.enqueue(10); // Xếp 10 vào trong List
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Mục được xếp hàng đợi là " + queue);
    }
}

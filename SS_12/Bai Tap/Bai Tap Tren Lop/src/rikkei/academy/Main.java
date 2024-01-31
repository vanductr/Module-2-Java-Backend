package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng MyQueue
        MyQueue myQueue = new MyQueue();

        // Thêm phần tử vào hàng đợi
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);

        // Hiển thị hàng đợi
        System.out.println("Hàng đợi(queue) ban đầu:");
        myQueue.displayQueue();

        // Loại bỏ phần tử từ hàng đợi
        myQueue.deQueue();
        System.out.println("Hàng đợi(queue) sau thao tác dequeue:");
        myQueue.displayQueue();
    }
}


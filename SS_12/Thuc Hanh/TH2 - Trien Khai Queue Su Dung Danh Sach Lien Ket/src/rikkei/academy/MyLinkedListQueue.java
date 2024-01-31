package rikkei.academy;

public class MyLinkedListQueue {
    private Node head; // Đặt trường thuộc tính với kiểu dữ liệu
    private Node tail; // Đặt trường thuộc tính với kiểu dữ liệu

    public MyLinkedListQueue() { // Khởi tạo Constructor
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key) { // Khai báo phương thức
        Node temp = new Node(key); // Khởi tạo đối tượng
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() { // Khai báo phương thức trả về Node
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }

    @Override
    public String toString() {
        return "MyLinkedListQueue: " + "\n" +
                "head: " + head + "\n" +
                "tail: " + tail;
    }
}
















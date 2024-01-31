package rikkei.academy;

// Lớp MyQueue đại diện cho hàng đợi sử dụng danh sách liên kết
public class MyQueue implements Solution{
    Node front;
    Node rear;
    public MyQueue() {
        this.front = this.rear = null;
    }

    // Phương thức thêm phần tử vào cuối hàng đợi
    @Override
    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.link = newNode;
        rear = newNode;
    }

    // Phương thức loại bỏ phần tử khỏi hàng đợi
    @Override
    public void deQueue() {
        if (front == null) {
            System.out.println("Hàng đợi trống");
            return;
        }

        Node temp = front;
        front = front.link;

        if (front == null) {
            rear = null;
        }
    }

    // Phương thức hiển thị các phần tử trong hàng đợi
    @Override
    public void displayQueue() {
        Node temp = front;

        if (temp == null) {
            System.out.println("Hàng đợi trống");
            return;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println();
    }
}

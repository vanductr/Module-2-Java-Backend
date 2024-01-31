package rikkei.academy;

public class MyQueue {
    private int capacity; // dung tích
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0; // Kích cỡ hiện tại

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    // Cài đặt phương thức isQueueFull()
    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    // Cài đặt phương thức isQueueEmpty()
    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    // Cài đặt phương thức enqueue()
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Tràn ra ! Không thể thêm phần tử: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phần tử " + item + " được đẩy vào Hàng đợi !");
        }
    }

    // Cài đặt phương thức dequeue()
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Tràn ngập ! Không thể xóa phần tử khỏi Hàng đợi");
        } else {
            head++;
            if (head == capacity -1) {
                System.out.println("Thao tác bật lên đã hoàn tất! LOẠI BỎ: " + queueArr[head -1]);
                head = 0;
            } else {
                System.out.println("Thao tác bật lên đã hoàn tất! LOẠI BỎ: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
















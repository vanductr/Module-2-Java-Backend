package rikkei.academy;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Đang tạo " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Đang chạy " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Luồng " + threadName + ", " + i);
                // Dừng vòng lặp trong 50ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Luồng " + threadName + " bị gián đoạn.");
        }
        System.out.println("Luồng " + threadName + " đang thoát.");
    }

    public void start() {
        System.out.println("Đang bắt đầu " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

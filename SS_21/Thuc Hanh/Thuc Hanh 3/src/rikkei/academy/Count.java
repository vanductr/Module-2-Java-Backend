package rikkei.academy;

public class Count implements Runnable{
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "chủ đề có thể chạy được của tôi");
        System.out.println("chủ đề của tôi đã được tạo " + myThread);
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("In số đếm " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("chủ đề của tôi bị gián đoạn");
        }
        System.out.println("chủ đề của tôi đã kết thúc");
    }
}

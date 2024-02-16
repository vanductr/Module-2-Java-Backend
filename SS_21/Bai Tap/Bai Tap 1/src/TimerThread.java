public class TimerThread extends Thread {
    public void run() {
        System.out.println("Bắt đầu đếm thời gian.");
        try {
            // Đếm thời gian trong 10 giây
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thời gian: " + i + " giây");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Kết thúc đếm thời gian.");
    }

    public static void main(String[] args) {
        TimerThread timerThread = new TimerThread();
        timerThread.start();
    }
}

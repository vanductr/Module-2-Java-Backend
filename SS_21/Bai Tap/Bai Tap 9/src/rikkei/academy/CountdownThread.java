package rikkei.academy;

public class CountdownThread extends Thread{
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Ngủ 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Countdown finished!");
    }

    public static void main(String[] args) {
        CountdownThread countdownThread = new CountdownThread();
        Thread thread = new Thread(countdownThread);
        thread.start();
    }
}

package rikkei.academy;

import java.util.Scanner;

public class SleepThread extends Thread {

    private int sleepTime;

    public SleepThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void run() {
        System.out.println("Luồng sẽ bắt đầu ngủ trong " + sleepTime + " giây.");
        try {
            Thread.sleep(sleepTime * 1000); // Chuyển giây thành mili giây và ngủ
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Luồng đã ngủ xong và thực thi chương trình.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giây ngủ của thread: ");
        int sleepTime = scanner.nextInt();

        SleepThread sleepThread = new SleepThread(sleepTime);
        sleepThread.start();
    }
}


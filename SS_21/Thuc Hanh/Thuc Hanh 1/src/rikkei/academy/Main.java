package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Luồng Main đang chạy ...");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Luồng Main đã dừng lại!");
    }
}

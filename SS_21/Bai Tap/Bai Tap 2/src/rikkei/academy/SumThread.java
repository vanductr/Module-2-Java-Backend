package rikkei.academy;

public class SumThread extends Thread{
    private int start;
    private int end;
    private int sum;
    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    public int getSum() {
        return sum;
    }
    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += i;
        }
    }

    public static void main(String[] args) {
        int totalNumbers = 1000;
        int numberOfThreads = 5;
        int numbersPerThread = totalNumbers / numberOfThreads;

        SumThread[] threads = new SumThread[numberOfThreads];

        // Tạo và bắt đầu các thread
        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * numbersPerThread + 1;
            int end = (i + 1) * numbersPerThread;
            threads[i] = new SumThread(start, end);
            threads[i].start();
        }

        // Chờ tất cả các thread hoàn thành
        try {
            for (int i = 0; i < numberOfThreads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Tính tổng từ tất cả các thread
        int totalSum = 0;
        for (int i = 0; i < numberOfThreads; i++) {
            totalSum += threads[i].getSum();
        }

        System.out.println("Tổng các số từ 1 đến 1000 là: " + totalSum);
    }
}



















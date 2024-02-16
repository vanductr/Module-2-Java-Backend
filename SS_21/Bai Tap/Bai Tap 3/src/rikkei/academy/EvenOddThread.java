package rikkei.academy;

public class EvenOddThread extends Thread {

    private final int start;
    private final int end;

    public EvenOddThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        if (start % 2 == 0) {
            printEvenNumbers();
        } else {
            printOddNumbers();
        }
    }

    private void printEvenNumbers() {
        for (int i = start; i <= end; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    private void printOddNumbers() {
        for (int i = start; i <= end; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        EvenOddThread evenThread = new EvenOddThread((start + 1), end);
        evenThread.setName("Số chẵn");

        EvenOddThread oddThread = new EvenOddThread(start, end);
        oddThread.setName("Số lẻ");

        evenThread.start();
        oddThread.start();
    }
}


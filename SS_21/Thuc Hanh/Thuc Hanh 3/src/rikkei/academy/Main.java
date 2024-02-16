package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Chủ đề chính sẽ tồn tại cho đến khi chủ đề con tồn tại");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Chủ đề chính bị gián đoạn");
        }
        System.out.println("Chạy chủ đề chính đã kết thúc");
    }
}

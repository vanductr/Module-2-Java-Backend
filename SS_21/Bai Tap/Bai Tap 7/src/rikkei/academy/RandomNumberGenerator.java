package rikkei.academy;

import java.util.Random;

public class RandomNumberGenerator implements Runnable{
    @Override
    public void run() {
        // Tạo một số ngẫu nhiên từ 1 đến 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // In số ngẫu nhiên ra màn hình
        System.out.println("Random Number: " + randomNumber);
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp RandomNumberGenerator
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // Tạo thread và bắt đầu thực thi
        Thread thread = new Thread(randomNumberGenerator);
        thread.start();
    }
}

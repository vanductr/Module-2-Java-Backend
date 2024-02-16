package rikkei.academy;

class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization đang tìm số nguyên tố...");
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                System.out.println("LazyPrimeFactorization: Đã tìm thấy số nguyên tố - " + i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization đang tìm số nguyên tố...");
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                System.out.println("OptimizedPrimeFactorization: Đã tìm thấy sô nguyên tố - " + i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class TestPrimeFactorization {

    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrimeFactorization);
        Thread optimizedThread = new Thread(optimizedPrimeFactorization);

        lazyThread.start();
        optimizedThread.start();
    }
}


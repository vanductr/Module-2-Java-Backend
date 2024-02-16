package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder extends Thread {

    private List<Integer> primeNumbers;

    public PrimeNumberFinder() {
        this.primeNumbers = new ArrayList<>();
    }

    public void run() {
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
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

    public List<Integer> getPrimeNumbers() {
        return primeNumbers;
    }

    public static void main(String[] args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();

        Thread thread = new Thread(primeNumberFinder);
        thread.start();

        try {
            thread.join(); // Chờ thread hoàn thành
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> primeNumbers = primeNumberFinder.getPrimeNumbers();

        System.out.println("Prime numbers from 1 to 10000:");
        for (Integer primeNumber : primeNumbers) {
            System.out.print(primeNumber + " ");
        }
    }
}


package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        int N = 1;

        while (N > 0) {
            if (N % 5 == 0 && N % 7 == 0 && N % 11 == 0) {
                System.out.println("Số nguyên dương chia hết cho 5, 7 và 11 là: " + N);
                break;
            }
            N++;
        }
    }
}

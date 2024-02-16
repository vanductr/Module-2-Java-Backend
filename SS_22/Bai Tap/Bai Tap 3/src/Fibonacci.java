public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}

package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // Chú thích: Đây là số nguyên tố
        System.out.println("Đây là những số nguyên tố nhỏ hơn 100: ");

        // Vòng lặp for để duyệt qua các số từ 2 đến 100
        for (int i = 2; i < 100; i++) {

            // Đặt giá trị có phải là số nguyên tố hay không?
            boolean soNguyenTo = true;

            // Kiểm tra xem số i có phải là số nguyên tố hay không?
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    soNguyenTo = false;
                    break;
                }
            }
            if (soNguyenTo) {
                System.out.print(i + " ");
            }
        }
    }
}

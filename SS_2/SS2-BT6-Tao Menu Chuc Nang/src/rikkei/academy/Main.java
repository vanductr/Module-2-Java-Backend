package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner: Lấy dữ liệu người dùng nhập vào
        Scanner input = new Scanner(System.in);

        // Biến choice để ghi nhớ lựa chọn của người dùng.
        int choice;

        while (true) {
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra 1 số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int number = input.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn.");
                    } else {
                        System.out.println(number + " là số lẻ.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int primeNumber = input.nextInt();

                    // Kiểm tra xem 1 số có là số nguyên tố hay không.
                    // Đặt 1 biến có giá trị boolean
                    boolean soNguyenTo = true;

                    // So sánh điều kiện để chuyển soNguyenTo thành flase khi không phải là số nguyên tố
                    if (primeNumber <= 1) {
                        soNguyenTo = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
                            if (primeNumber % i == 0) {
                                soNguyenTo = false;
                                break;
                            }
                        }
                    }

                    // Kiểm tra điều kiện có là số nguyên tố hay không.
                    if (soNguyenTo) {
                        System.out.println(primeNumber + " là số Nguyên tố");
                    } else {
                        System.out.println(primeNumber + " không phải là số Nguyên tố");
                    }

                    break;

                case 3:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int divisibleBy3Number = input.nextInt();
                    if (divisibleBy3Number % 3 == 0) {
                        System.out.println(divisibleBy3Number + " là số chia hết cho 3.");
                    } else {
                        System.out.println(divisibleBy3Number + " là số không chia hết cho 3.");
                    }
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

            System.out.println("Mời bắt đầu lại");
        }
    }
}

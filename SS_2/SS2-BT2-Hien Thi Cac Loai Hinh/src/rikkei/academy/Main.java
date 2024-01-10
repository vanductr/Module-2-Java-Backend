package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Hướng dẫn người dùng chọn menu
        System.out.println("Hãy chọn hình để in: ");
        System.out.println("1. In hình chữ nhật(Rectangle)");
        System.out.println("2. In hình tam giác vuông ở 4 góc khác nhau: ");
        System.out.println("3. In hình tam giác cân");
        System.out.println("0. Thoát");

        System.out.print("Chọn ở đây: ");
        int menuNumber = input.nextInt();

        switch (menuNumber) {
            case 1:
                System.out.println("1. In hình chữ nhật(Rectangle)");
                System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật: ");
                System.out.print("Chiều dài: ");
                int chieuDai = input.nextInt();
                System.out.print("Chiều rộng: ");
                int chieuRong = input.nextInt();

                for (int i = 1; i <= chieuRong; i++) {
                    for (int j = 1; j < chieuDai; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 2:
                System.out.println("2. In hình tam giác vuông ở 4 góc khác nhau: ");
                System.out.println("21. Trên cùng bên trái(Top-left)");
                System.out.println("22. Trên cùng bên phải(Top-right)");
                System.out.println("23. Dưới cùng bên trái(Bottom-left)");
                System.out.println("24. Dưới cùng bên phải(Bottom-right)");
                System.out.print("Nhập 21 22 23 hoặc 24 để chọn hình in: ");
                int tgvInput = input.nextInt();
                switch (tgvInput) {
                    case 21:
                        System.out.println("21. Trên cùng bên trái(Top-left)");
                        // Vòng lặp ngoài hiển thị số dòng
                        for (int i = 5; i >= 1; i--) {
                            // Vòng lặp trong hiển thị số lượng sao có trong mỗi dòng
                            for (int j = 1; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("*");
                        }
                        break;
                    case 22:
                        System.out.println("22. Trên cùng bên phải(Top-right)");

                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = i; k <= 5; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 23:
                        System.out.println("23. Dưới cùng bên trái(Bottom-left)");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("*");
                        }
                        break;
                    case 24:
                        System.out.println("24. Dưới cùng bên phải(Bottom-right)");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 4; j >= i; j--) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= i; k++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                }

                break;
            case 3:
                System.out.println("3. In hình tam giác cân");

                // Vòng lặp for để duyệt qua từng hàng
                for (int i = 1; i <= 5; i++) {

                    // Vòng lặp for để in khoảng trắng
                    for (int j = i; j < 5; j++) {
                        System.out.print(" ");
                    }

                    // Vòng lặp for để in '*' (đối với hàng cuối cùng hoặc hàng đầu tiên và cuối cùng)
                    for(int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }

                    // Xuống dòng sau khi in mỗi hàng
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có menu nào được chọn.");
        }
    }
}

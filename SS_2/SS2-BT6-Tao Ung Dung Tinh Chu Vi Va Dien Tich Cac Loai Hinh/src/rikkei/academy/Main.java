package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật.");
            System.out.println("2. Tính chu vi và diện tích hình tam giác.");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều dài hình chữ nhật: ");
                    double length = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng hình chữ nhật: ");
                    double width = scanner.nextDouble();

                    double perimeter = 2 * (length + width);
                    double area = length * width;

                    System.out.println("Chu vi hình chữ nhật là: " + perimeter);
                    System.out.println("Diện tích hình chữ nhật là: " + area);
                    break;
                case 2:
                    System.out.print("Nhập cạnh a của tam giác: ");
                    double sideA = scanner.nextDouble();
                    System.out.print("Nhập cạnh b của tam giác: ");
                    double sideB = scanner.nextDouble();
                    System.out.print("Nhập cạnh c của tam giác: ");
                    double sideC = scanner.nextDouble();

                    double perimeterT = sideA + sideB + sideC;
                    double halfPerimeter = perimeterT / 2;
                    double areaT = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));

                    System.out.println("Chu vi tam giác là: " + perimeterT);
                    System.out.println("Diện tích tam giác là: " + areaT);
                    break;
                case 3:
                    System.out.print("Nhập bán kính hình tròn: ");
                    double radius = scanner.nextDouble();

                    double perimeterC = 2 * Math.PI * radius;
                    double areaC = Math.PI * Math.pow(radius, 2);

                    System.out.println("Chu vi hình tròn là: " + perimeterC);
                    System.out.println("Diện tích hình tròn là: " + areaC);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

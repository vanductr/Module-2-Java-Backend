package rikkei.acdemy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1, side2, side3;
        boolean validTriangle = false;

        while (true) {
            System.out.print("Nhập cạnh thứ nhất của tam giác: ");
            side1 = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ hai của tam giác: ");
            side2 = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ ba của tam giác: ");
            side3 = scanner.nextDouble();

            if ((side1 > 0 && side2 > 0 && side3 > 0) &&
                    (side1 + side2 > side3) &&
                    (side1 + side3 > side2) &&
                    (side2 + side3 > side1)) {
                validTriangle = true;
                break;
            } else {
                System.out.println("Không phải là tam giác. Vui lòng nhập lại.");
            }
        }

        if (validTriangle) {
            double perimeter = side1 + side2 + side3;
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

            System.out.println("Chu vi tam giác là: " + perimeter);
            System.out.println("Diện tích tam giác là: " + area);
        }
    }
}

package baitap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhập cạnh thứ 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhập cạnh thứ 3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Nhập màu sắc: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3, color);

        System.out.println("Thông tin của tam giác:");
        System.out.println(triangle);
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());

        scanner.close();
    }
}

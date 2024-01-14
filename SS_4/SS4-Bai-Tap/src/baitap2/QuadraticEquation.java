package baitap2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // Constructor có tham số
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter cho a
    public double getA() {
        return a;
    }

    // Getter cho b
    public double getB() {
        return b;
    }

    // Getter cho c
    public double getC() {
        return c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phương thức tính nghiệm 1 (x1)
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN; // Không có nghiệm thực
        }
    }

    // Phương thức tính nghiệm 2 (x2)
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN; // Không có nghiệm thực
        }
    }

    public static void main(String[] args) {
        // Bước 4: Thực hiện chương trình
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cho a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập giá trị cho b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập giá trị cho c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        System.out.println("Delta = " + delta);

        if (delta >= 0) {
            System.out.println("Nghiệm 1 (x1): " + equation.getRoot1());
            System.out.println("Nghiệm 2 (x2): " + equation.getRoot2());
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }

        scanner.close();
    }
}


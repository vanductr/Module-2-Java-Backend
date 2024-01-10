package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Câu lệnh scanner để lấy dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);

        // Khai báo các biến Chiều dài, chiều rộng, chu vi và diện tích
        // Kiểu khai báo: double để lưu trữ các giá trị số thực. Kích thước của kiểu double là 8 byte
        // tương đương với 64 bit.
        // Giá trị mặc định của biến kiểu double là 0.0d
        // Kiểu double có thể được ép kiểu sang kiểu float, int, long, hoặc char.
        // Tuy nhiên ép kiểu sang boolean sẽ gây ra lỗi.
        double length, width, perimeter, area;

        // Nhập chiều dài từ người dùng.
        // Các kiểu print trong Java:
        // print: In ra màn hình 1 chuỗi kí tự và không xuống dòng.
        // println: In ra màn hình 1 chuỗi kí tự và xuống dòng.
        // printf: In ra màn hình 1 chuỗi kí tự theo định dạng được chỉ định.
        System.out.print("Nhập chiều dài của hình chữ nhật: ");

        // Gán giá trị số thực được nhập từ bàn phím cho biến length.
        // scanner là 1 đối tượng của lớp Scanner.Lớp Scanner cung cấp các phương thức để đọc
        // dữ liệu từ bàn phím.
        // Phương thức nextDouble() của lớp Scanner được sử dụng để đọc 1 số thực từ bàn phím.
        // Phương thức này trả về 1 kiểu double.
        // Câu lệnh này sẽ thực hiện các bước sau:
        // b1: Phương thức nextDouble() của đối tượng scanner sẽ đọc 1 số thực từ bàn phím.
        // b2: Giá trị số thực được đọc sẽ gán cho biến length
        length = scanner.nextDouble();

        // lấy chiều rộng từ người dùng
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        width = scanner.nextDouble();

        // Tính toán chu vi của hình chữ nhật.
        perimeter = (length + width) * 2;

        // Tính toán diện tích của hình chữ nhật.
        area = length * width;

        // In ra kết quả tính tóan được
        System.out.println("Hình chữ nhật có chu vi là: "+perimeter+" và Diện tích là: "+area);
    }
}
























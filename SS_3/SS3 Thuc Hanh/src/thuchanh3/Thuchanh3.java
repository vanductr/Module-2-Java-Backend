package thuchanh3; // Tìm giá trị lớn nhất trong Mảng.

import java.util.Scanner;

public class Thuchanh3 {
    public static void main(String[] args) {
        // Khai báo biến size với kiểu dữ liệu int(interger) - kiểu dữ liệu số Nguyên.
        int size;

        // Khai báo 1 mảng rỗng với tên là array.
        int[] array;

        // Scanner để lấy giá trị từ người dùng nhập vào.
        Scanner scanner = new Scanner(System.in);

        // Vòng lặp do-while để đảm bảo được lặp 1 lần trước khi kiểm tra điều kiện
        // Vòng lặp này có chức năng tránh để người dùng nhập độ dài mảng lớn hơn 20
        do {
            System.out.print("Nhập số size: ");
            size = scanner.nextInt();
            if(size > 20) {
                System.out.println("Vui lòng không nhập quá 20.");
            }
        } while (size > 20);

        // Lấy được size nhỏ hơn 20 từ người dùng thì cho nó là độ dài mảng.
        array = new int[size];

        // Đặt giá trị khởi đầu của i là 0, phục vụ cho vòng lặp while
        int i = 0;

        // Vòng lặp while để người dùng có thể nhập các phần tử và push vào trong mảng
        // length: chiều dài của mảng chính bằng biến size được người dùng truyền vào.
        while (i < array.length) {
            System.out.print("Thêm phần tử số " + (i + 1) + " : ");
            array[i] = scanner.nextInt();

            // Sau mỗi lần lấy được phần tử của mảng thì tăng giá trị của i
            // để người dùng có thể nhập vào phần tử tiếp theo trong mảng.
            i++;
        }

        // Hướng dẫn in ra các phần tử trong mảng
        System.out.print("Danh sách các phần tử: ");

        // Vòng lặp để in ra các phần tử trong mảng
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        // Đặt gía trị lớn nhất trong mảng, mặc định là phần tử vị trí đầu tiên.
        int max = array[0];

        // Vị trí của phần tử đặt đầu tiên là 1: Các đếm thông thường bằng mắt là từ 1
        // => vị trí đầu tiên array[0] theo mắt thường hiển thị cho người dùng là 1
        int index = 1;

        // Vòng lặp, lặp qua các phần tử trong mảng, lấy nó so sánh với gía trị của phần
        // tử đầu tiên đã được đặt là lớn nhất trong mảng.
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1; // Vị trí theo người dùng nhìn thất là j + 1
            }
        }
        System.out.println("Số lớn nhất trong các số bạn đã nhập là: " + max + " , tại vị trí " + index + " trong danh sách.");
    }
}


















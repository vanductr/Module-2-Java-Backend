package baitaptonghop;

import java.util.Scanner;

public class QuanLiCongViec {
    // Khai báo 1 Mảng ban đầu:
    public static String[] task = new String[]{"Học Java", "Thực hành Java"};
    public static void main(String[] args) {
        do {
            // Gọi phương thức để hiển thị Lựa chọn cho người dùng.
            hienThiCongViec();

            // Gọi phương thức để lấy lựa chọn của người dùng.
            int luaChon = nhapLuaChon();

            // Gọi hàm xử lí lựa chọn.
            xuLiLuaChon(luaChon);
        } while (true);


    }

    // Phương thức hiển thị công việc.
    public static void hienThiCongViec() {
        System.out.println(" ------------- Menu lựa chọn:");
        System.out.println("1. Hiển thị danh sách tất cả công việc.");
        System.out.println("2. Thêm công việc mới vào danh sách.");
        System.out.println("3. Sửa một công việc trong danh sách.");
        System.out.println("4. Xoá một công việc đã hoàn thành.");
        System.out.println("0. Thoát chương trình.");
        System.out.println();
    }

    // Phương thức lấy dữ liệu được nhập từ người dùng.
    public static int nhapLuaChon() {
        // Scanner để lấy dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);

        // Hướng dẫn người dùng nhập lựa chọn của mình
        System.out.print("Nhập lựa chọn của bạn: ");
        System.out.println();

        // Trả về giá trị mà người dùng nhập.
        return scanner.nextInt();
    }

    // Phương thức xử lí lựa chọn từ người dùng.
    public static void xuLiLuaChon(int luaChon) {
        switch (luaChon) {
            case 1:
                System.out.println("------------ Danh sách tất cả công việc là: ");

                // Gọi phương thức hiển thị task.
                hienThiDanhSachTatCaCongViec();

                break;
            case 2:
                System.out.println("------------ Hãy thêm một công việc mới.");

                // Gọi phương thức Thêm 1 công việc mới.
                themCongViec();
                break;
            case 3:
                System.out.println("------------ Bạn muốn sửa công việc.");
                suaCongViec();

                break;
            case 4:
                System.out.println("------------ Bạn muốn xoá 1 công việc.");

                // Gọi phương thức để xoá công việc.
                xoaMotCongViec();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    // Phương thức hiển thị danh sách tất cả công việc.
    public static void hienThiDanhSachTatCaCongViec() {
        for (int i = 0; i < task.length; i++) {
            System.out.printf("%s . %s%n", i + 1, task[i]);
        }
        System.out.println();
    }

    // Phương thức thêm công việc
    public static void themCongViec() {
        // Khai báo 1 mảng mới có chiều dài lớn hơn mảng ban đầu là 1
        String[] newTask = new String[task.length + 1];

        // Dùng vòng lặp for để sao chép tất cả danh sách công việc của task sang newtask
        for (int i = 0; i < task.length; i++) {
            // Gán tất cả các phần tử của task sang newTask
            newTask[i] = task[i];
        }

        // Công việc mới sẽ được thêm vào cuối danh sách
        Scanner scanner = new Scanner(System.in);
        newTask[task.length] = scanner.nextLine();

        // Gán lại task sẽ bằng newTask
        task = newTask;

        // Thông báo cho người dùng là: Công việc đã được thêm.
        System.out.println("Công việc đã được thêm vào danh sách, đây là danh sách công việc mới.");

        // Hiển thị công việc.
        hienThiDanhSachTatCaCongViec();
    }

    // Phương thức Sửa 1 công việc trong danh sách.
    public static void suaCongViec() {
        System.out.print("Hãy chọn vị trí công việc cần sửa trong danh sách: ");

        // Lấy vị trí cần sửa của người dùng.
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt() - 1; // Vị trí của phần tử trong mảng(Bắt đầu từ 0)
        scanner.nextLine(); // Đọc kí tự mới dòng

        // Lấy dữ liệu mà người dùng nhập vào
        System.out.println("Hãy nhập nội dung mới của công việc: ");
        String editTask = scanner.nextLine();

        // Dùng vòng for để tìm index của phần tử đó trong mảng
        for (int i = 0; i < task.length; i++) {
            if (task[i] == task[index]) {
                task[index] = editTask;
            }
        }

        // Hiển thị danh sách công việc sau khi đã được sửa.
        System.out.println("Công việc đã được sửa thành công.");
        System.out.println("Danh sách công việc sau khi được sửa là:");
        hienThiDanhSachTatCaCongViec();
    }

    // Phương thức xoá 1 công việc trong danh sách.
    public static void xoaMotCongViec() {
        // Khởi tạo 1 mảng mới có chiều dài ngắn hơn 1 đơn vị của mảng hiện tại
        String[] newArray = new String[task.length - 1];

        System.out.print("Hãy chọn vị trí công việc cần Xoá trong danh sách: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt() - 1;

        if(index < 0 || index > task.length - 1) {
            System.err.println("Không tồn tại trong danh sách, vui lòng xem lại.");
            System.out.println();
            System.out.println();
            return;
        } else {
            // Dùng vòng for để lặp qua các phần tử trong mảng và sắp xếp lại vị trí của mảng mới
            for (int i = 0; i < task.length; i++) {
                // Nếu phần tử của task ở vị trí thứ i nhỏ hơn index của người dùng nhập vào,
                // Thì giữ nguyên các phần tử đó trong danh sách
                if (i < index) {
                    newArray[i] = task[i];
                }
                // Còn nếu phần tử thứ i mà lớn hơn index của người dùng nhập vào thì vị trí của các phần tử
                // trong mảng mới sẽ bằng với các phần tử trong mảng cũ trừ đi 1
                else if(i > index) {
                    newArray[i] = task[i + 1];
                }

            }
            task = newArray;

            // Thông báo đã xoá và hiển thị danh sách công việc mới cho người dùng
            System.out.println("Công việc đã được xoá thành công");
            System.out.println("Đây là danh sách công việc mới: ");
            hienThiDanhSachTatCaCongViec();
        }


    }
}










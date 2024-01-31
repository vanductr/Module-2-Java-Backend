package baitaptonghop;

import java.util.Scanner;
public class TaskManager {

    private static String[] danhSachCongViec = new String[100];
    private static int soLuongCongViec = 0;
    public static void main(String[] args) {

        //
        int luaChon;
        do {
            hienThiMenu();
            luaChon = nhapLuaChon();
            xuLyLuaChon(luaChon);
        } while (luaChon != 5);
    }

    // modifier: Là từ khoá Xác định mức độ truy cập của phương thức.
    // Các từ khoá có thể được sử dụng ở đây: public, private, protected và static
    // public: Phương thức có thể truy cập từ bất cứ nơi nào trong chương trình.
    // private: Phương thức chỉ có thể truy cập từ bên trong lớp mà nó được khai báo.
    // protected: Phương thức chỉ có thể truy cập từ bên trong lớp mà nó khai báo hoặc từ các lớp con của lớp đó.
    // default: Phương thức có thể truy cập từ bên trong gói mà nó được khai báo.

    // Phương thức hiển thị Menu cho người dùng chọn.
    private static void hienThiMenu() {
        System.out.println("Menu:");
        System.out.println("1. Danh sách tất cả công việc");
        System.out.println("2. Thêm mới việc cần làm");
        System.out.println("3. Sửa nội dung công việc");
        System.out.println("4. Xoá việc đã hoàn thành");
        System.out.println("5. Thoát chương trình");
    }

    // Phương thức lấy lựa chọn của người dùng.
    private static int nhapLuaChon() {
        // Tạo đối tượng Scanner để lấy dữ liệu nhập vào từ người dùng.
        Scanner scanner = new Scanner(System.in);

        // Hướng dẫn người dùng nhập vào lựa chọn của họ.
        System.out.print("Nhập lựa chọn của bạn: ");

        // Trả về kết quả mà người dùng nhập vào
        return scanner.nextInt();
    }

    private static void xuLyLuaChon(int luaChon) {
        switch (luaChon) {
            case 1:
                hienThiDanhSachCongViec();
                break;
            case 2:
                themMoiCongViec();
                break;
            case 3:
                suaNoiDungCongViec();
                break;
            case 4:
                xoaCongViecDaHoanThanh();
                break;
            case 5:
                System.out.println("Chương trình kết thúc.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
        }
    }

    private static void hienThiDanhSachCongViec() {
        if (soLuongCongViec == 0) {
            System.out.println("Danh sách công việc trống.");
        } else {
            System.out.println("Danh sách công việc:");
            for (int i = 0; i < soLuongCongViec; i++) {
                System.out.println((i + 1) + ". " + danhSachCongViec[i]);
            }
        }
    }

    private static void themMoiCongViec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập công việc mới: ");
        String congViecMoi = scanner.nextLine();
        danhSachCongViec[soLuongCongViec++] = congViecMoi;
        System.out.println("Công việc đã được thêm mới.");
    }

    private static void suaNoiDungCongViec() {
        Scanner scanner = new Scanner(System.in);
        hienThiDanhSachCongViec();
        System.out.print("Nhập số thứ tự công việc cần sửa: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Đọc kí tự xuống dòng sau khi đọc số
        if (index > 0 && index <= soLuongCongViec) {
            System.out.print("Nhập nội dung công việc mới: ");
            String noiDungMoi = scanner.nextLine();
            danhSachCongViec[index - 1] = noiDungMoi;
            System.out.println("Công việc đã được sửa.");
        } else {
            System.out.println("Số thứ tự không hợp lệ.");
        }
    }

    private static void xoaCongViecDaHoanThanh() {
        hienThiDanhSachCongViec();
        System.out.print("Nhập số thứ tự công việc đã hoàn thành cần xoá: ");
        int index = nhapLuaChon();
        if (index > 0 && index <= soLuongCongViec) {
            for (int i = index; i < soLuongCongViec; i++) {
                danhSachCongViec[i - 1] = danhSachCongViec[i];
            }
            soLuongCongViec--;
            System.out.println("Công việc đã được xoá.");
        } else {
            System.out.println("Số thứ tự không hợp lệ.");
        }
    }

}

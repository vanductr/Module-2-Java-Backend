import java.util.Scanner;

public class TimUocChungLonNhat {
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập số b: ");
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                throw new Exception("Cả 2 số a và b không thể bằng 0! Hãy chạy lại chương trình.");
            }

            int c = timUCLN(a, b);
            System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + c);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    // Phương thức tìm ước chung lớn nhất
    private static int timUCLN(int a, int b) {
        if (b == 0) {
            return Math.abs(a); // Trả về giá trị tuyệt đối nếu b = 0
        }
        return timUCLN(b, a % b);
    }
}

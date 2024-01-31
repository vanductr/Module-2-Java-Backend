package thuchanh2;

// Tạo lớp kiểm thử AccountExampleTest
public class AccountExampleTest {
    // Khai báo biến tĩnh: accountExample với kiểu dữ liệu là AccountExample.
    private static AccountExample accountExample;

    // Khai báo 1 Mảng hằng số (final) chứa các chuỗi ví dụ về các tên tài khoản hợp lệ.
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456", "abcdefgh" };

    // Khai báo 1 Mảng hằng số (final) chứa các chuỗi ví dụ về các tên tài khoản không hợp lệ.
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}

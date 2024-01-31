package baitap13;

// Gói java.util.regex cung cấp các lớp và phương thức để thực hiện so khớp chuỗi sử dụng biểu thức chính quy.
import java.util.regex.Matcher; // import Class Matcher từ hệ thống mặc định của Java
import java.util.regex.Pattern; // import Class Pattern từ hệ thống mặc định của Java

public class EmailValidation {
    public static void main(String[] args) {
        // Chuỗi cần kiểm tra
        String email = "rikeiacademy@rikkeisoft.com";

        // Gọi phương thức kiểm tra email
        boolean isValidEmail = isValidEmail(email);

        // In ra kết quả
        if (isValidEmail) {
            System.out.println(email + " là một địa chỉ email hợp lệ.");
        } else {
            System.out.println(email + " không phải là một địa chỉ email hợp lệ.");
        }
    }

    public static boolean isValidEmail(String email) {
        // Biểu thức chính quy kiểm tra địa chỉ email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Tạo 1 đối tượng của lớp 'Pattern' từ biểu thức chính quy(regex) được đưa vào thông qua biến 'emailRegex'
        Pattern pattern = Pattern.compile(emailRegex);

        // Tạo Matcher object
        Matcher matcher = pattern.matcher(email);

        // Kiểm tra xem chuỗi khớp với biểu thức chính quy hay không
        return matcher.matches();
    }
}


package thuchanh1; // Khai báo gói. Xác định rằng lớp EmailExample nằm trong gói thuchanh1

import java.util.regex.Matcher; // Nhập lớp Matcher từ gói java.util.regex để sử dụng cho việc so khớp biểu thức chính quy
import java.util.regex.Pattern; // Nhập lớp Pattern từ gói java.util.regex để biểu diễn các biểu thức chính quy

public class EmailExample { // Tạo 1 lớp công khai tên là EmailExample dùng để kiểm tra tính hợp lệ của địa chỉ email
    private static Pattern pattern; // Khai báo 1 biến tĩnh tên là pattern có kiểu Pattern để lưu trữ biểu thức chính quy dùng để so khớp email
    private Matcher matcher; // Khai boá 1 biến tên là matcher có kiểu Matcher để thực hiện việc so khớp với 1 chuỗi email cụ thể.

    // Định nghĩa 1 biểu thức chính quy để kiểm tra định dạng email hợp lệ.
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    // Phương thức khởi tạo của lớp được sử dụng khi tạo đối tượng mới
    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    // Phương thức validate: dùng để kiểm tra tính hợp lệ của 1 địa chỉ email.
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

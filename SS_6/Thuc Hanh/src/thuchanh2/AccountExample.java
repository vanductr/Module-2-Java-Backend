package thuchanh2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    /*Không chứa các ký tự đặc biệt
    * Phải dài hơn 6 ký tự
    * Không chứa các ký tự viết hoa
    * Cho phép dấu gạch dưới (_)*/

    // Tạo 1 biến static String ACCOUNT_REGEX chứa định dạng regularExpression của tài khoản.
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    // Phương thức khởi tạo không tham số.
    public AccountExample() {

    }

    // Phương thức khởi tạo có tham số
    public boolean validate(String regex) {
        // Tạo 1 đối tượng Pattern từ biểu thức chính quy ACCOUNT_REGEX đã được định nghĩa ở trên.
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);

        // Tạo 1 đối tượng Matcher từ đối tượng Pattern đã biên dịch dịch và chuỗi cần kiểm tra (regex)
        Matcher matcher = pattern.matcher(regex);

        // Sử dụng phương thức matches() của đối tượng Matcher để kiểm tra xem toàn bộ chuỗi regex có khớp hoàn toàn
        // với biểu thức chính quy hay không
        // Trả về true nếu khớp hoàn toàn, false nếu không khớp.
        return matcher.matches();
    }
}

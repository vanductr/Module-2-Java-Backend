package rikkei.academy;

public class Product {
    // Khởi tạo 4 biến gồm: productId, productName, productPrice, categoryName

    // Khởi tạo biến productId với kiểu dữ liệu là số Nguyên: int
    int productId;

    // Khởi tạo biến productName với kiểu dữ liệu tham chiếu: String
    String productName;

    // Khởi tạo biến productPrice với kiểu dữ liệu số nguyên: int
    int productPrice;

    // Khởi tạo biến categoryName; biến này được lấy trực tiếp ở bên class Category đã tạo trước đó.
    Category category;

    // Khai báo phương thức không tham số.
    public Product() {

    }

    // Khai báo phương thức với 4 tham số.
    public Product(int productId, String productName, int productPrice, Category categoryName) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = categoryName;
    }

    // Khai báo 1 phương thức để hiển thị sản phẩm.
    public void display() {
        System.out.println("Mã sản phẩm: " + productId + "\n"
                        +  "Tên sản phẩm: " + productName + "\n"
                        +  "Gía sản phẩm: " + productPrice + "\n"
                        +  "Thuộc danh mục: " + category.categoryName);
    }
}



















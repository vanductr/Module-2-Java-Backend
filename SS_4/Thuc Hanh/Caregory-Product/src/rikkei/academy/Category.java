package rikkei.academy;

public class Category {
    // Khai báo categoryId với kiểu dữ liệu int
    int categoryId;

    // Khai báo categoryName với kiểu dữ liệu là String
    String categoryName;

    // Khai báo 1 phương thức không tham số
    public Category() {

    }

    // Khai báo 1 phương thức có 2 tham số
    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    // Khai báo phương thức display().
    public void display() {
        System.out.println("Mã danh mục: " + categoryId + "\n"
                         + "Tên danh mục: " + categoryName);
    }
}

package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // Khai báo để lấy thông tin ở bên class Category và hiển thị ra
        Category category = new Category(1, "Áo Mùa Đông");

        // Gọi phương thức display của lớp Category.
        System.out.println("Đây là mã và tên của danh mục 1:");
        category.display();


        // Khai báo để lấy thông tin của Sản phẩm
        Product product = new Product(11, "Quần Âu Nam", 200, category);
        System.out.println("Đây là thông tin chi tiết của sản phẩm: ");
        product.display();
    }
}

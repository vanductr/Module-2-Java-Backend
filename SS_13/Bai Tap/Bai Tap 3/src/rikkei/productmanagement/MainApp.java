package rikkei.productmanagement;


import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU Quản lí sản phẩm =====");
            System.out.println("1. Thêm Sản phẩm");
            System.out.println("2. Sửa Sản phẩm");
            System.out.println("3. Xoá Sản phẩm");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá (Tăng dần)");
            System.out.println("7. Sắp xếp sản phẩm theo giá (Giảm dần)");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sản phẩm:");
                    System.out.print("ID Sản phẩm: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Tên Sản phẩm: ");
                    String productName = scanner.nextLine();
                    System.out.print("Giá Sản phẩm: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Số lượng sản phẩm: ");
                    int productQuantity = scanner.nextInt();

                    Product newProduct = new Product(productId, productName, productPrice, productQuantity);
                    productManager.addProduct(newProduct);
                    System.out.println("Đã thêm sản phẩm thành công!");
                    break;

                case 2:
                    System.out.print("Nhập ID sản phẩm để cập nhật: ");
                    int updateProductId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    Product updatedProduct = new Product(0, "", 0.0, 0);

                    System.out.print("Enter updated product name: ");
                    updatedProduct.setName(scanner.nextLine());
                    System.out.print("Enter updated product price: ");
                    updatedProduct.setPrice(scanner.nextDouble());
                    System.out.print("Enter updated product quantity: ");
                    updatedProduct.setQuantity(scanner.nextInt());

                    productManager.updateProduct(updateProductId, updatedProduct);
                    System.out.println("Sản phẩm được cập nhật thành công!");
                    break;

                case 3:
                    System.out.print("Nhập ID sản phẩm để xóa: ");
                    int removeProductId = scanner.nextInt();
                    productManager.removeProduct(removeProductId);
                    System.out.println("Đã xóa sản phẩm thành công!");
                    break;

                case 4:
                    System.out.println("Danh sách sản phẩm:");
                    productManager.displayProducts();
                    break;

                case 5:
                    System.out.print("Nhập tên sản phẩm để tìm kiếm: ");
                    String searchProductName = scanner.nextLine();
                    Product foundProduct = productManager.searchProductByName(searchProductName);
                    if (foundProduct != null) {
                        System.out.println("Đã tìm thấy sản phẩm: " + foundProduct);
                    } else {
                        System.out.println("Sản phẩm không có.");
                    }
                    break;

                case 6:
                    productManager.sortProductsByPriceAscending();
                    System.out.println("Sản phẩm được sắp xếp theo giá (tăng dần).");
                    break;

                case 7:
                    productManager.sortProductsByPriceDescending();
                    System.out.println("Sản phẩm được sắp xếp theo giá (giảm dần).");
                    break;

                case 0:
                    System.out.println("Thoát khỏi chương trình. Tạm biệt!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một tùy chọn hợp lệ.");
                    break;
            }
        }
    }
}


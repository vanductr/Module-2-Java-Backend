package rikkei.academy;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Quản lý sản phẩm ======");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Thêm sản phẩm
                    Product newProduct = inputProductInfo(scanner);
                    productManager.addProduct(newProduct);
                    break;

                case 2:
                    // Hiển thị thông tin sản phẩm
                    productManager.displayProducts();
                    break;

                case 3:
                    productManager.loadFromFile();
                    // Tìm kiếm sản phẩm
                    System.out.print("Nhập mã sản phẩm cần tìm: ");
                    int searchCode = scanner.nextInt();
                    Product foundProduct = productManager.searchProduct(searchCode);

                    if (foundProduct != null) {
                        System.out.println("Sản phẩm được tìm thấy: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với mã: " + searchCode);
                    }
                    break;

                case 0:
                    // Thoát chương trình
                    System.out.println("Chương trình kết thúc.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    private static Product inputProductInfo(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm: ");
        int code = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự Enter còn lại trong buffer

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();

        scanner.nextLine(); // Đọc ký tự Enter còn lại trong buffer

        System.out.print("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();

        return new Product(code, name, manufacturer, price, description);
    }
}


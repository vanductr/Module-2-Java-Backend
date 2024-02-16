package rikkei.academy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public static List<Product> productList = new ArrayList<>();
    private final String filePath = "/Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 8/src/rikkei/academy/product.txt";

    public ProductManager() {
    }

    public void addProduct(Product product) {
        // Thêm sản phẩm mới vào danh sách
        productList.add(product);
        saveToFile(); // Lưu lại danh sách sản phẩm vào file sau khi thêm mới
    }

    public void displayProducts() {
        loadFromFile(); // Đọc dữ liệu từ file khi tạo đối tượng ProductManager
        // Hiển thị thông tin về tất cả sản phẩm
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product searchProduct(int productCode) {
        // Tìm kiếm sản phẩm theo mã sản phẩm
        for (Product product : productList) {
            if (product.getProductCode() == productCode) {
                return product;
            }
        }
        return null; // Trả về null nếu không tìm thấy sản phẩm
    }

    // Các phương thức khác như lưu và đọc dữ liệu từ tệp
    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(productList);
            System.out.println("Dữ liệu đã được lưu vào file thành công.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Đã xảy ra lỗi khi lưu dữ liệu vào file: " + e.getMessage());
        }
    }
    public void loadFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            productList = (List<Product>) objectInputStream.readObject();
            System.out.println("Dữ liệu đã được đọc từ file thành công.");
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file. Tạo file mới.");
            saveToFile(); // Tạo file mới nếu không tìm thấy file
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Đã xảy ra lỗi khi đọc dữ liệu từ file: " + e.getMessage());
        }
    }
}

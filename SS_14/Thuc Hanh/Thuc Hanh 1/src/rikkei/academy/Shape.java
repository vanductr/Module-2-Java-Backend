package rikkei.academy;

public interface Shape {
    default double area() {
        return 0.0; // Giá trị mặc định
    }
}

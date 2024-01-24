package baitap13;

public class Node<E> { // Lớp Node: Lớp generic
    // Thuộc tính:
    Node<E> next;// Lưu trữ tham chiếu đến nút tiếp theo trong danh sách liên kết
    E data;// Lưu trữ dữ liệu của lớp hiện tại

    // Phương thức khởi tạo:
    // Phương thức này khởi tạo 1 nút mới với dữ liệu được cung cấp
    // Thiết lập giá trị được truyền vào và đặt thuộc tính next thành null
    // Nghĩa là nút mới chưa liên kết với nút nào khác.
    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    // Phương thức truy cập dữ liệu
    // Phương thức này trả về dữ liệu được lưu trữ trong nút hiện tại
    public E getData() {
        return data;
    }
}

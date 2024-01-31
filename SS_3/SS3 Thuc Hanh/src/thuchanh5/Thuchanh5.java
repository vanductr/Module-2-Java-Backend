package thuchanh5; // Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức

public class Thuchanh5 {
    // Phương thức main.
    public static void main(String[] args) {
        // Khởi tạo 1 Mảng.
        int[] arr = {15, 6, 35, 46, 43, 67, 89, 33};

        // Lấy giá trị index từ phương thức minValue, Truyền vào đối số là 1 mảng.
        int index = minValue(arr);

        // In ra gía trị nhỏ nhất trong mảng.
        System.out.println("Gía trị nhỏ nhất trong Mảng là: " + arr[index]);

    }

    // Xây dựng phương thức tìm giá trị nhỏ nhất trong Mảng.
    // public: có thể truy cập từ mọi nơi (Xác định phạm vi truy cập của phương thức)
    // static: Có thể gọi mà không cần tạo 1 đối tượng của lớp đó.
    // int: Kiểu dữ liệu trả về của phương thức.(số Nguyên)
    // minValue: Tên phương thức
    // int[] array: Tham chiếu của phương thức, Đối số sẽ là 1 mảng các số Nguyên.
    // Truyển vào 1 mảng để phương thức thao tác với mảng đó.
    public static int minValue(int[] array) {
        // Tạo 1 biến index, với giá trị là 0, biến này sẽ được gán giá trị của phần từ trong mảng
        // sau khi vòng for kết thúc.
        int index = 0;

        // Vòng lặp for để lặp qua các phần tử trong mảng và đem đi so sánh
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]){
                index = i;
            }
        }

        // Nhận kết quả trả về là vị trí của phần tử có giá trị nhỏ nhất trong Mảng.
        return index;
    }
}

package bai_tap_9;

import method.Calculator;

import java.util.Arrays;
import java.util.Date;

public class Baitap9 {
    public static void main(String[] args) {
        // Mảng 2 chiều
        int[][] array2Chieu = {{1,2},{1,3},{2,4}};
        //System.out.println("array2Chieu[0]" + Arrays.toString(array2Chieu[0]));

//        for (int i = 0; i < array2Chieu.length; i++) {
//            int[] arr = array2Chieu[i];
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println(arr[j]);
//            }
//        }

        // Truy xuất phần tử đâu tiên của mảng bên ngoài
        //array2Chieu[0][0] // Phần tử đầu tiên của mảng

        // array2Chieu[i][j]: i là vị trí của phần tử của mảng vên ngoài, j là phần tử của mảng bên trong
        // Duyệt Mảng
        // Cách 1: Dùng for
        // Cách 2: Dùng forEach
        // Cách 3: Dùng stream
        // Arrays.stream(arrayString).forEach((element)->{
        //    System.out.println(element.length());
        // }); // Trả về 1 dòng chảy các phần tử


//        int[] array = {1, 4, 6, 8, 4, 9, 3};
//        System.out.println(Arrays.stream(array).sum());
//        System.out.println(Arrays.stream(array).sorted());

        // Lưu ý về mảng
        // Mảng không thể thay đổi số lượng phần tử
        // Mảng không có các phương thức Thêm - Sửa - Xoá
        // Khi khởi tạo mảng ban đầu mà chưa gán giá trị, thì các phần tử trong mảng sẽ mang giá trị mặc định.


        // =================================================================================
        // Phương thức(Method) - Là tập hợp 1 nhóm các câu lệnh xử lí 1 chức năng nhất định.
        // Đại diện cho các chức năng C R U D
        // public static Kiểu dữ liệu trả về - tên phương thức -

        System.out.println("2 - 5 = " + Calculator.minusInt(2, 5));

//         Bài tập tổng hợp
//         Ứng dụng quản lí công việc
//         Menu:
//          1. Danh sách tất cả công việc
//          2. Thêm mới việc cần làm
//          3. Sửa nội dung công việc
//          4. Xoá việc đã hoàn thành (
//          5. Thoát chương trình
//
//         - Hướng dẫn
//          + Có 1 mảng lưu trữ công việc cần làm
//          + Các phương thức xử lí chức năng
    }


























//    // Phương thức tìm phần tử lớn thứ hai trong mảng
//    public static int timPhanTuLonThuHai(int[] array) {
//        // Kiểm tra nếu mảng có ít hơn 2 phần tử
//        if (array.length < 2) {
//            System.out.println("Mảng không có phần tử đủ để tìm phần tử lớn thứ hai.");
//            return -1; // Trả về giá trị -1 nếu không có phần tử đủ
//        }
//
//        // Sắp xếp mảng theo thứ tự giảm dần
//        Arrays.sort(array);
//
//        // Tìm phần tử lớn thứ hai
//        int max = array[array.length - 1];
//        int secondLargest = array[array.length - 2];
//
//        // Kiểm tra nếu phần tử lớn thứ hai trùng với phần tử lớn nhất
//        for (int i = array.length - 3; i >= 0; i--) {
//            if (array[i] < max) {
//                secondLargest = array[i];
//                break;
//            }
//        }
//
//        return secondLargest;
//    }
}


package rikkei.academy;

public class BubbleSort { // Sắp xếp nổi bọt
    // Tạo 1 mảng số nguyên cho trước
    static int[] list = {1, 13, 25, 78, 95, 43, 24, 46, 29, 40, 33, 76};

    //  Phương thức sắp xếp sủi bọt
    private static void bubbleSort(int[] list) {
        // Biến check xem có cần duyệt mảng nữa hay không
        // (Vì mảng đã được sắp xếp rồi, thì không cần duyệt nữa)
        boolean checkDuyetMang = true;
        for (int i = 1; i < list.length && checkDuyetMang; i++) {
            // Đổi biến check thành false
            checkDuyetMang = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    // Vẫn cần lặp lại
                    checkDuyetMang = true;
                }
            }
        }
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        // Gọi phương thức bubbleSort
        bubbleSort(list);
        System.out.println("Mảng sau khi được sắp xếp theo cách sắp xếp nổi bọt là:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}

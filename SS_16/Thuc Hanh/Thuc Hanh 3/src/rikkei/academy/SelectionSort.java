package rikkei.academy;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    
    // Phương thức sắp xếp chọn(Selection Sort)
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Tìm phần tử nhỏ nhất trong danh sách [i..list.length-1] */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Hoán đổi list[i] với list[currentMinIndex] nếu cần thiết */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    // Phương thức main để thực thi ứng dụng
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}

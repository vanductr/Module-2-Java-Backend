package baitap3;

import java.util.Arrays;

public class SelectionSortTiming {
    public static void main(String[] args) {
        // Khởi tạo một mảng ngẫu nhiên có 100,000 số
        int[] array = new int[100000];
        // Thêm các con số ngẫu nhiên vào mảng array.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }

        // Tạo một đối tượng StopWatch
        StopWatch stopwatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopwatch.start(); // Gọi phương thức start() bên class StopWatch

        // Sắp xếp mảng bằng thuật toán sắp xếp chọn
        selectionSort(array); // Gọi phương thức và truyền vào đối số là mảng array.

        // Dừng đo thời gian
        stopwatch.stop(); // Gọi phương thức stop() bên class StopWatch

        // In ra thời gian thực thi // Lấy thời gian đã trôi qua bằng phương thức getElapsedTime.
        System.out.println("Thời gian đã trôi qua để sắp xếp lựa chọn: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // Thuật toán sắp xếp chọn
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử tìm thấy nhỏ nhất với phần tử đầu tiên chưa được sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}


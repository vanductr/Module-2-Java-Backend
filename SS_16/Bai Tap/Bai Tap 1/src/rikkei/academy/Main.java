package rikkei.academy;

import java.util.Arrays;

public class Main {
    // Phương thức tạo 1 mảng ngẫu nhiên
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // Phương thức sắp xếp mảng theo kiểu: Nổi bọt
    private static void sortKieuNoiBot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

//    // Phương thức sắp xếp mảng theo kiểu: Sắp xếp chọn
//    private static void sortKieuSapXepChon(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            int phanTuNhoNhat = arr[i];
//            int indexPhanTuNhoNhat = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (phanTuNhoNhat > arr[j]) {
//                    phanTuNhoNhat = arr[j];
//                    indexPhanTuNhoNhat = j;
//                }
//            }
//
//            // Gán lại vị trí của các phần tử trong mảng
//            if (indexPhanTuNhoNhat != i) {
//                arr[indexPhanTuNhoNhat] = arr[i];
//                arr[i] = phanTuNhoNhat;
//            }
//        }
//    }

    // Phương thức sắp xếp theo kiểu: chèn
//    public static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i -1;
//
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//
//            arr[j + 1] = key;
//        }
//    }

    // phương thức main để chạy chương trình
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr));
        sortKieuNoiBot(arr);
        System.out.println("Mảng đã được sắp xếp theo kiểu sủi bọt:");
        System.out.println(Arrays.toString(arr));

//        sortKieuSapXepChon(arr);
//        System.out.println("Mảng đã được sắp xếp theo kiểu Sắp xếp chọn:");
//        System.out.println(Arrays.toString(arr));

//        insertionSort(arr);
//        System.out.println("Mảng đã được sắp xếp theo kiểu Sắp xếp chọn:");
//        System.out.println(Arrays.toString(arr));
    }
}

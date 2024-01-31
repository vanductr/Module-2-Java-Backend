package rikkei.academy;

import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Mảng sau khi được sắp xếp:");
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Thuật toán: Sắp xếp nổi bọt
    private static void bubbleSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Thuật toán: Sắp xếp chọn
    private static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String phanTuNhoNhat = arr[i];
            int indexPhanTuNhoNhat = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(phanTuNhoNhat) < 0) {
                    phanTuNhoNhat = arr[j];
                    indexPhanTuNhoNhat = j;
                }
            }

            if (indexPhanTuNhoNhat != i) {
                arr[indexPhanTuNhoNhat] = arr[i];
                arr[i] = phanTuNhoNhat;
            }
        }
    }

    // Thuật toán: Sắp xếp kiểu chèn
    private static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String pos = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(pos) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = pos;
        }
    }
}

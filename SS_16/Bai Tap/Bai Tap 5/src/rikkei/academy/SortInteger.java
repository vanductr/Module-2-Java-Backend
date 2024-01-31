package rikkei.academy;

import java.util.Arrays;

public class SortInteger {
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Mảng đã được sắp xếp:");
//        bubbleSort(arr);
//        selectionSort(arr);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Thuật toán: Sắp xếp Sủi bọt
    private static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // Thuật toán: Sắp xếp Chọn
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxElement = arr[i];
            int indexMaxElement = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxElement) {
                    maxElement = arr[j];
                    indexMaxElement = j;
                }
            }

            if (indexMaxElement != i) {
                arr[indexMaxElement] = arr[i];
                arr[i] = maxElement;
            }
        }
    }
    // Thuật toán: Sắp xếp Chèn
    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

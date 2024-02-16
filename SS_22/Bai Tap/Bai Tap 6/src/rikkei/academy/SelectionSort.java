package rikkei.academy;

public class SelectionSort {
    public static void doSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int phanTuNhoNhat = arr[i];
            int indexPhanTuNhoNhat = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < phanTuNhoNhat) {
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
}

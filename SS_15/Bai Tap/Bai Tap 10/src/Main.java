import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] integers = getArr();
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(integers));

        System.out.println("Nhập vào giá trị min và max để tìm các số trong khoảng giữa đó.");
        System.out.print("Nhâp min: ");
        int min = input.nextInt();
        System.out.print("Nhâp max: ");
        int max = input.nextInt();

        int startIndex = timIndexCuaPhanTu(integers, max, true);
        int endIndex = timIndexCuaPhanTu(integers, min, false);

        int count = endIndex - startIndex;
        if (count > 0) {
            System.out.println("Các số trong khoảng " + min + " đến " + max + " có: " + (count + 1) +" số.");
            System.out.println("Đây là chi tiết các số trong khoảng " + min + " đến " + max);
            for (int i = startIndex; i <= endIndex ; i++) {
                System.out.print(integers[i] + "\t");
            }
        } else {
            System.out.println("Không có số nào trong khoảng " + min + " đến " + max);
        }
    }

    // Phương thức để tìm kiếm index của số được nhập vào (min hoặc max)
    private static int timIndexCuaPhanTu(Integer[] integers, int target, boolean isMin) {
        int left = 0;
        int right = integers.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (integers[mid] == target) {
                return mid;
            } else if (integers[mid] > target) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
                result = mid;
            }
        }

        return isMin ? result + 1 : result;
    }
}

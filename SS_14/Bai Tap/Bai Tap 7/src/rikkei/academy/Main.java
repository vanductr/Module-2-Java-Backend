package rikkei.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập giá trị bắt đầu và kết thúc để tạo danh sách số nguyên.");
        System.out.print("Nhập giá trị bắt đầu: ");
        int start = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giá trị kết thúc: ");
        int end = scanner.nextInt();
        scanner.nextLine();

        List<Integer> integerList;
        integerList = IntStream.range(start, end).boxed().collect(Collectors.toList());
        System.out.println("Danh sách số nguyên từ " + start + " đến " + end + " là: ");
        System.out.println(integerList);

    }
}

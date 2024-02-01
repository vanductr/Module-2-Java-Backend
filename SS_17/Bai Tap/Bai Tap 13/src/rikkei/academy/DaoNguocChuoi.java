package rikkei.academy;

import java.util.Scanner;

public class DaoNguocChuoi {
    // Phương thức đảo ngược chuỗi
    private static String daoNguocChuoi(String string) {
        char[] charArray = string.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Hoán đổi ký tự ở vị trí left và right
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Di chuyển vị trí left về phải và vị trí right về trái
            left++;
            right--;
        }

        return new String(charArray);
    }
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập 1 chuỗi bất kì: ");
            String string = scanner.nextLine().trim();
            if (string.isEmpty()) {
                throw new Exception("Chuỗi không được để rỗng!");
            }
            String newString = daoNguocChuoi(string);
            System.out.println(newString);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

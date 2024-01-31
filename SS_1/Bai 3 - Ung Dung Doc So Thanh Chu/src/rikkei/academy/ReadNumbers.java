package rikkei.academy;

import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        // Bước 1: Lấy được số người dùng nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số cần đọc: ");
        int number = scanner.nextInt();

        // Bước 2: Đọc các số có 1 chữ số.
        if(number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Số bạn vừa nhập là Zero");
                    break;
                case 1:
                    System.out.println("Số bạn vừa nhập là One");
                    break;
                case 2:
                    System.out.println("Số bạn vừa nhập là Two");
                    break;
                case 3:
                    System.out.println("Số bạn vừa nhập là Three");
                    break;
                case 4:
                    System.out.println("Số bạn vừa nhập là Four");
                    break;
                case 5:
                    System.out.println("Số bạn vừa nhập là Five");
                    break;
                case 6:
                    System.out.println("Số bạn vừa nhập là Six");
                    break;
                case 7:
                    System.out.println("Số bạn vừa nhập là Seven");
                    break;
                case 8:
                    System.out.println("Số bạn vừa nhập là Eight");
                    break;
                case 9:
                    System.out.println("Số bạn vừa nhập là Nine");
                    break;
                default:
                    System.out.println("Out of ability");
            }
        }
        // Bước 3: Đọc các số có 2 chữ số nhỏ hơn 20.
        else if (number >= 10 && number < 20) {
            // Lấy 1 tham số trong switch để đối chiếu
            int ones = number % 10; // Chia lấy số dư.
            switch (ones) {
                case 0:
                    System.out.println("Số bạn vừa nhập là Ten");
                    break;
                case 1:
                    System.out.println("Số bạn vừa nhập là Eleven");
                    break;
                case 2:
                    System.out.println("Số bạn vừa nhập là Twelve");
                    break;
                case 3:
                    System.out.println("Số bạn vừa nhập là Thirteen");
                    break;
                case 4:
                    System.out.println("Số bạn vừa nhập là Fourteen");
                    break;
                case 5:
                    System.out.println("Số bạn vừa nhập là Fifteen");
                    break;
                case 6:
                    System.out.println("Số bạn vừa nhập là Sixteen");
                    break;
                case 7:
                    System.out.println("Số bạn vừa nhập là Seventeen");
                    break;
                case 8:
                    System.out.println("Số bạn vừa nhập là Eighteen");
                    break;
                case 9:
                    System.out.println("Số bạn vừa nhập là Nineteen");
                    break;
            }
        }
        // Bước 4: Đọc các số có 2 chữ số lớn hơn hoặc bằng 20.
        else if(number >= 20 && number < 100) {
            int tens = number / 10; // Lấy hàng chục;
            int ones = number % 10; // Lấy hàng đơn vị;

            String tenString = ""; // Tạo 1 chuỗi rỗng, sẽ hiển thị hàng chục
            String onesString = ""; // Tạo 1 chuỗi rỗng, sẽ hiển thị hàng đơn vị

            switch (tens) {
                case 2:
                    tenString = "Twenty";
                    break;
                case 3:
                    tenString = "Thirty";
                    break;
                case 4:
                    tenString = "Forty";
                    break;
                case 5:
                    tenString = "Fifty";
                    break;
                case 6:
                    tenString = "Sixty";
                    break;
                case 7:
                    tenString = "Seventy";
                    break;
                case 8:
                    tenString = "Eighty";
                    break;
                case 9:
                    tenString = "Ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    onesString = "One";
                    break;
                case 2:
                    onesString = "Two";
                    break;
                case 3:
                    onesString = "Three";
                    break;
                case 4:
                    onesString = "Four";
                    break;
                case 5:
                    onesString = "Five";
                    break;
                case 6:
                    onesString = "Six";
                    break;
                case 7:
                    onesString = "Seven";
                    break;
                case 8:
                    onesString = "Eight";
                    break;
                case 9:
                    onesString = "Nine";
                    break;
            }

            System.out.println("Số bạn vừa nhập là:" + tenString + " " + onesString);
        }
        // Bước 5: Đọc các số có 3 chữ số
        else if (number >= 100 && number < 1000) {
            int hundreds = number / 100; // Lấy thông tin hàng nghìn
            int remainingTwoDigits = number % 100; // Lấy số dư

            String hundredsString = "";
            String remainingTwoDigitsString = "";

            switch (hundreds) {
                case 1:
                    hundredsString = "One Hundred";
                    break;
                case 2:
                    hundredsString = "Two Hundred";
                    break;
                case 3:
                    hundredsString = "Three Hundred";
                    break;
                case 4:
                    hundredsString = "Four Hundred";
                    break;
                case 5:
                    hundredsString = "Five Hundred";
                    break;
                case 6:
                    hundredsString = "Six Hundred";
                    break;
                case 7:
                    hundredsString = "Seven Hundred";
                    break;
                case 8:
                    hundredsString = "Eight Hundred";
                    break;
                case 9:
                    hundredsString = "Nine Hundred";
                    break;
            }

            // Sử dụng đệ quy để đọc phần còn lại của số
            remainingTwoDigitsString = readTwoDigits(remainingTwoDigits);

            System.out.println("Số bạn vừa nhập là: " + hundredsString + " " + remainingTwoDigitsString);
        }
        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }

    // Phương thức đệ quy để đọc 2 chữ số
    private static String readTwoDigits(int number) {
        if(number < 10) {
            return readSingleDigit(number);
        } else if (number >= 10 && number < 20) {
            return readTeen(number);
        } else {
            int tens = number / 10;
            int ones = number % 10;

            String tensString = "";
            String onesString = "";

            switch (tens) {
                case 2:
                    tensString = "Twenty";
                    break;
                case 3:
                    tensString = "Thirty";
                    break;
                case 4:
                    tensString = "Forty";
                    break;
                case 5:
                    tensString = "Fifty";
                    break;
                case 6:
                    tensString = "Sixty";
                    break;
                case 7:
                    tensString = "Seventy";
                    break;
                case 8:
                    tensString = "Eighty";
                    break;
                case 9:
                    tensString = "Ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    onesString = "One";
                    break;
                case 2:
                    onesString = "Two";
                    break;
                case 3:
                    onesString = "Three";
                    break;
                case 4:
                    onesString = "Four";
                    break;
                case 5:
                    onesString = "Five";
                    break;
                case 6:
                    onesString = "Six";
                    break;
                case 7:
                    onesString = "Seven";
                    break;
                case 8:
                    onesString = "Eight";
                    break;
                case 9:
                    onesString = "Nine";
                    break;
            }

            return  tensString + " " + onesString;
        }
    }

    // Phương thức để đọc các số có 1 chữ số
    private static String readSingleDigit(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Out of ability";
        }
    }

    // Phương thức để đọc các số có 2 chữ số từ 10 đến 19
    private static String readTeen(int number) {
        int ones = number % 10;

        switch (ones) {
            case 0:
                return "Ten";
            case 1:
                return "Eleven";
            case 2:
                return "Twelve";
            case 3:
                return "Thirteen";
            case 4:
                return "Fourteen";
            case 5:
                return "Fifteen";
            case 6:
                return "Sixteen";
            case 7:
                return "Seventeen";
            case 8:
                return "Eighteen";
            case 9:
                return "Nineteen";
            default:
                return "";
        }
    }
}







































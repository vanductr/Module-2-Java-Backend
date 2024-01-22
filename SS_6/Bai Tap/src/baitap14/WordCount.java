package baitap14;

public class WordCount {
    public static void main(String[] args) {
        // Chuỗi cần kiểm tra
        String text = "VĐV tiếp tục tố \"vùng tối\" ở nơi rèn luyện tuyển thủ quốc gia";

        // Số lượng từ có độ dài lớn hơn hoặc bằng giá trị cho trước
        int minLength = 4;
        int wordCount = countWords(text, minLength);

        // In ra kết quả
        System.out.println("Số lượng từ có độ dài lớn hơn hoặc bằng " + minLength + " là: " + wordCount);
    }

    public static int countWords(String text, int minLength) {
        // Chia chuỗi thành các từ
        String[] words = text.split("\\s+"); // \\s+ là biểu thức chính quy của khoảng trắng(space)

        // Đếm số lượng từ có độ dài lớn hơn hoặc bằng giá trị cho trước
        int count = 0;
        for (String word : words) {
            if (word.length() >= minLength) {
                count++;
            }
        }

        return count;
    }
}


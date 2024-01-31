package rikkei.academy;

public class GenericStackClient {
    private static void stackOfIStrings() {
        // Khởi tạo đối tượng có kiểu dữ liệu là MyGenericStack<String>
        // Dựa vào Constructor: Đối tượng này là Mảng LinkedList(có sẵn trong Java)
        MyGenericStack<String> stack = new MyGenericStack<>();

        // Thêm các phần tử vào Đối tượng Mảng
        stack.push("Năm");
        stack.push("Bốn");
        stack.push("Ba");
        stack.push("Hai");
        stack.push("Một");
        System.out.println("1.1 Kích thước của stack sau khi thêm: " + stack.size());
        System.out.println("1.2 Phần tử bật lên từ stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println();
        System.out.println("1.3 Kích thước của stack sau khi pop(): " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Kích thước của stack sau khi push: " + stack.size());
        System.out.println("2.2 Sử dụng phương thức pop cho stack:");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println();
        System.out.println("2.3 Kích thước của stack sau khi pop: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack: Danh sách các số nguyên");
        stackOfIntegers();
        System.out.println("1. Stack: Danh sách các chuỗi");
        stackOfIStrings();
    }
}


















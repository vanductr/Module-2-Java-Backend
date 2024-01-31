package rikkei.academy;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.print("1. Kích thước của ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.println("\n2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3. Kích thước của stack sau khi pop: " + stack.size());
    }
}

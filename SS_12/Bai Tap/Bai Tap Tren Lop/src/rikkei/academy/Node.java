package rikkei.academy;

public class Node { // Lớp Node đại diện cho 1 nút trong danh sách liên kết
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

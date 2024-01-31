package rikkei.academy;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Phương thức tìm kiếm
    boolean search(int key) {
        return searchRec(root, key);
    }

    // Hàm đệ quy để thực hiện tìm kiếm
    boolean searchRec(Node root, int key) {
        // Trường hợp cây hoặc subtree là null, phần tử không tồn tại
        if (root == null)
            return false;

        // Nếu phần tử tìm kiếm khớp với phần tử tại nút hiện tại, trả về true
        if (root.key == key)
            return true;

        // Nếu phần tử tìm kiếm nhỏ hơn, tìm kiếm ở cây con trái
        if (key < root.key)
            return searchRec(root.left, key);

        // Nếu phần tử tìm kiếm lớn hơn, tìm kiếm ở cây con phải
        return searchRec(root.right, key);
    }

    // Hàm thêm một phần tử vào BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Hàm đệ quy để thực hiện việc thêm phần tử
    Node insertRec(Node root, int key) {
        // Nếu cây hoặc subtree là null, tạo một nút mới
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Nếu phần tử cần thêm nhỏ hơn phần tử ở nút hiện tại, thêm vào cây con trái
        if (key < root.key)
            root.left = insertRec(root.left, key);
            // Nếu phần tử cần thêm lớn hơn phần tử ở nút hiện tại, thêm vào cây con phải
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Trả về nút hiện tại sau khi thêm phần tử
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Thêm các phần tử vào BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Tìm kiếm phần tử trong BST
        int keyToSearch = 40;
        if (tree.search(keyToSearch))
            System.out.println(keyToSearch + " tồn tại trong BST");
        else
            System.out.println(keyToSearch + " không tồn tại trong BST");
    }
}


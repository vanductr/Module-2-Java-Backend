package rikkei.academy;

class TreeNode {
    int element;
    TreeNode left, right;

    public TreeNode(int element) {
        this.element = element;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Hàm tìm kiếm trong BST
    public boolean search(int element) {
        return searchRecursive(root, element);
    }

    // Hàm tìm kiếm đệ quy trong BST
    private boolean searchRecursive(TreeNode root, int element) {
        // Nếu cây con là null hoặc phần tử khớp với root.element
        if (root == null || root.element == element) {
            return root != null;
        }

        // Nếu element nhỏ hơn root.element, tìm kiếm ở cây con bên trái
        if (element < root.element) {
            return searchRecursive(root.left, element);
        }

        // Nếu element lớn hơn root.element, tìm kiếm ở cây con bên phải
        return searchRecursive(root.right, element);
    }

    public static void main(String[] args) {
        // Tạo một BST
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Kiểm tra tìm kiếm trong BST
        System.out.println("Tìm kiếm 20: " + bst.search(20)); // true
        System.out.println("Tìm kiếm 45: " + bst.search(45)); // false
    }

    // Hàm chèn phần tử vào BST
    public void insert(int element) {
        root = insertRecursive(root, element);
    }

    // Hàm chèn đệ quy vào BST
    private TreeNode insertRecursive(TreeNode root, int element) {
        // Nếu cây con là null, tạo một node mới
        if (root == null) {
            root = new TreeNode(element);
            return root;
        }

        // Nếu element nhỏ hơn root.element, chèn vào cây con bên trái
        if (element < root.element) {
            root.left = insertRecursive(root.left, element);
        } else if (element > root.element) {
            // Nếu element lớn hơn root.element, chèn vào cây con bên phải
            root.right = insertRecursive(root.right, element);
        }

        // Trả về root
        return root;
    }
}


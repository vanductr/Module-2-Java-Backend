package rikkei.academy;

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Phương thức xóa một phần tử từ BST
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private TreeNode deleteNode(TreeNode root, int key) {
        // Trường hợp cơ bản: nút null hoặc phần tử cần xóa
        if (root == null) {
            return root;
        }

        // Nếu key nhỏ hơn giá trị của root, điều hướng sang cây con trái
        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        }
        // Nếu key lớn hơn giá trị của root, điều hướng sang cây con phải
        else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        }
        // Nếu key bằng giá trị của root, đây là nút cần xóa
        else {
            // Trường hợp có một hoặc không có con
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Trường hợp có cả hai con
            root.key = minValue(root.right); // Lấy giá trị nhỏ nhất từ cây con phải
            root.right = deleteNode(root.right, root.key); // Xóa giá trị nhỏ nhất từ cây con phải
        }

        return root;
    }

    // Phương thức hỗ trợ để tìm giá trị nhỏ nhất trong BST
    private int minValue(TreeNode root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    // Phương thức để thực hiện duyệt in-order
    public void inOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.key + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Xây dựng cây như sau:
                    50
                   /  \
                 30   70
                / \   / \
               20 40 60 80
         */
        tree.root = new TreeNode(50);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(70);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(40);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(80);

        System.out.println("Duyệt theo thứ tự BST trước khi xóa:");
        tree.inOrder();

        // Xóa phần tử có giá trị 30
        tree.delete(30);

        System.out.println("\nTruyền tải BST theo thứ tự sau khi xóa:");
        tree.inOrder();
    }
}


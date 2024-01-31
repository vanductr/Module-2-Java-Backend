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

    // Hàm chính để thực hiện duyệt post-order
    public void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        // Duyệt cây con bên trái
        postOrderTraversal(node.left);

        // Duyệt cây con bên phải
        postOrderTraversal(node.right);

        // Truy cập nút gốc
        System.out.print(node.key + " ");
    }

    // Phương thức bổ trợ để thực hiện duyệt post-order từ gốc
    public void postOrder() {
        postOrderTraversal(root);
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

        System.out.println("Post-order đi qua BST:");
        tree.postOrder();
    }
}


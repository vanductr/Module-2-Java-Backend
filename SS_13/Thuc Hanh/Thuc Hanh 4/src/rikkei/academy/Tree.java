package rikkei.academy;

public interface Tree<E> {
    /**
     * Insert element e into the binary search tree.
     * (Chèn phần tử e vào cây tìm kiếm nhị phân.)
     * Return true if the element is inserted successfully.
     * (Trả về true nếu phần tử được chèn thành công.)
     */
    public boolean insert(E e);

    // Inorder traversal from the root
    // (Tùy chỉnh thanh công cụ...)
    public void inorder();

    // Get the number of nodes in the tree
    // (Lấy số nút trong cây)
    public int getSize();
}

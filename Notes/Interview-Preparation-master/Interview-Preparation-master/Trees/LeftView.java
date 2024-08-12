public class LeftView {
    static int max_level = 0;

    /* Input : 1 2 4 -1 -1 5 -1 8 -1 -1 3 6 -1 -1 7 -1 9 -1 10 -1 -1  (DFS order)
     * 
     *                 1
     *               /   \
     *              2      3   
     *             / \    / \  
     *            4   5  6   7
     *                 \      \
     *                  8      9
     *                          \
     *                           10
     *
     * Output : 1 2 3 8 10
     */                         
     
    
    static <T> void leftView(Node<T> root, int level) {
        if (root == null)
            return;

        if (level > max_level) {
            System.out.print(root.data + " ");
            max_level = level;
        }

        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }

    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree();

        leftView(root, 1);
    }
}

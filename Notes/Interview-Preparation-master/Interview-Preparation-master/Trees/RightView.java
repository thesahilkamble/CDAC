public class RightView {
    static int max_level = 0;

    /* Input : 1 2 4 -1 -1 5 -1 8 -1 9 -1 -1 3 6 -1 -1 7 -1 -1  (DFS order)
     * 
     *                 1
     *               /   \
     *              2      3   
     *             / \    / \  
     *            4   5  6   7
     *                 \      
     *                  8      
     *                   \       
     *                    9       
     *
     * Output : 1 3 7 8 9
     */                         
     
    
    static <T> void rightView(Node<T> root, int level) {
        if (root == null)
            return;

        if (level > max_level) {
            System.out.print(root.data + " ");
            max_level = level;
        }

        rightView(root.right, level + 1);
        rightView(root.left, level + 1);
    }

    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree();

        rightView(root, 1);
    }
}

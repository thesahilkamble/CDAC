/* Input : 1 2 4 8 -1 -1 9 -1 -1 5 -1 -1 3 6 10 -1 -1 12 -1 -1 7 -1 13 -1 -1  (DFS order)
 * 
 *                 1
 *               /   \
 *              2      3   
 *             / \    / \  
 *            4   5  6   7
 *           / \    / \   \
 *          8   9  10  12  13
 *          
 * Output : 
 *  1 
 *  3 2
 *  4 5 6 7
 *  13 12 10 9 8
 */

public class SpiralOrderTraversal {
    
    public static void spiralOrderTraversal(Node<Integer> root) {
        if(root == null)
            return;
        
        int height = BinaryTreeUtil.height(root);
        boolean b = true;
        
        for(int i = 1; i<=height; i++) {
            printLevel(root, i, b);
            b = !b;
            System.out.println();
        }
    }
    
    public static void printLevel(Node<Integer> root, int level, boolean b) {
        if(root == null)
            return;
        
        if(level == 1) {
            System.out.print(root.data+" ");
            return;
        }
        
        if(b) {
            printLevel(root.left, level - 1, b);
            printLevel(root.right, level - 1, b);
        }
        else {
            printLevel(root.right, level - 1, b);
            printLevel(root.left, level - 1, b);
        }
    }
    
    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree(); // Take input dfs wise
        spiralOrderTraversal(root);
        
    }
}

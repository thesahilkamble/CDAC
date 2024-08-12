import java.util.LinkedList;

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

public class PrintAllPath {
    
    static LinkedList<Integer> al = new LinkedList<>();
    
    public static void printAllPath(Node<Integer> root){
        if(root == null)
            return;
        
        if(root.left == null && root.right == null) {
            al.add(root.data);
            System.out.println(al);
            al.removeLast();
        }
        
        al.add(root.data);
        
        printAllPath(root.left);
        printAllPath(root.right);
        
        al.removeLast();   
    }
    
    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree(); // Taking input in dfs Order
        printAllPath(root);
    }

}

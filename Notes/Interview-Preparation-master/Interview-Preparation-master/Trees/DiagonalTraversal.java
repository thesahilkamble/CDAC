import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

/* Input : 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1  (DFS order)
 * 
 *                 1
 *               /   \
 *              2      3   
 *             / \    / \  
 *            4   5  6   7
 *            
 * Output : 
 * 1 3 7
 * 2 5 6
 * 4
 */
 

public class DiagonalTraversal {

    static HashMap<Integer, LinkedList<Integer>> h = new HashMap<>();
    
    public static void diagonalTraversal(Node<Integer> root, int d){
         if(root == null) {
             return;
         }
         
         if(!h.containsKey(d)) {
             LinkedList<Integer> temp = new LinkedList<>();
             temp.add(root.data);
             h.put(d, temp);
         }
         else {
             LinkedList<Integer> temp = h.get(d);
             temp.add(root.data);
         }
         
         diagonalTraversal(root.right, d);
         diagonalTraversal(root.left, d - 1);
    }
    
    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree();
        diagonalTraversal(root, 0);
        
        for (Entry<Integer, LinkedList<Integer>> entry : h.entrySet()) {
            System.out.println(entry.getValue() + " ");
        } 
    }
}

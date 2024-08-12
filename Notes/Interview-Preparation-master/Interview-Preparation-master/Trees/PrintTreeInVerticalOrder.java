import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;

/* Input : 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1  (DFS order)
 * 
 *                 1
 *               /   \
 *              2      3   
 *             / \    / \  
 *            4   5  6   7
 *            
 * Output : 
 * 4
 * 2
 * 1 5 6
 * 3
 * 7
 */

public class PrintTreeInVerticalOrder {
    
    static TreeMap<Integer, LinkedList<Integer>> h = new TreeMap<>();
    
    public static void printTreeInVerticalOrder(Node<Integer> root, int hd){
         if(root == null) {
             return;
         }
         
         if(!h.containsKey(hd)) {
             LinkedList<Integer> temp = new LinkedList<>();
             temp.add(root.data);
             h.put(hd, temp);
         }
         else {
             LinkedList<Integer> temp = h.get(hd);
             temp.add(root.data);
         }
         
         printTreeInVerticalOrder(root.left, hd - 1);
         printTreeInVerticalOrder(root.right, hd + 1);
    }
    
    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree(); // Input in dfs order
        printTreeInVerticalOrder(root, 0);
        
        for (Entry<Integer, LinkedList<Integer>> entry : h.entrySet()) {
            System.out.println(entry.getValue() + " ");
        }
    }
}

package com.grv.binaryTree;

/* Input : 1 2 -1 5 8 -1 -1 -1 3 6 -1 -1 7 9 -1 -1 -1  (DFS order)
 * 
 *                 1
 *               /   \
 *              2      3   
 *               \    / \  
 *                5  6   7
 *               /      / 
 *              8      9
 * Output : false
 */
/* Input : 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1  (DFS order)
 * 
 *                 1
 *               /   \
 *              2      3   
 *             / \    / \  
 *            4   5  6   7
 *
 * Output : True
 */

/* Time Complexity : O(n)
 */
public class CheckBalanced {
    
    static class Height {
        int height;
    }
    
    public static boolean isBalanced(Node<Integer> root, Height height) {
        if(root == null) {
            height.height = 0;
            return true;
        }
        
        Height lh = new Height();
        Height rh = new Height();
        
        boolean left = isBalanced(root.left, lh);
        boolean right = isBalanced(root.right, rh);
        
        height.height = (lh.height > rh.height ? lh.height : rh.height) + 1;  
        
        if(Math.abs(lh.height - rh.height) <= 1 && left && right) {
            return true;
        }
        return false;
    }
    
    public static boolean isBalanced(Node<Integer> root) {
        Height height = new Height();
        return isBalanced(root, height);
    }
    
    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree();
        
        System.out.println(isBalanced(root));
    }
}

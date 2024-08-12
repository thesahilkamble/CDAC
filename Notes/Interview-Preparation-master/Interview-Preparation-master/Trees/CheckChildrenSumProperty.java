package com.grv.binaryTree;


/* Input : 50 20 16 -1 -1 4 -1 4 -1 4 -1 -1 30 12 -1 -1 18 -1 -1  (DFS order)
 * 
 *                50
 *               /  \
 *              20   30   
 *             / \   / \  
 *           16   4 12  18
 *                 \      
 *                  4      
 *                   \       
 *                    4       
 *
 * Output : 4 2 1 3 7
 */

public class CheckChildrenSumProperty {

    public static boolean isChildSumProperty(Node<Integer> root){
        int l_data = 0;
        int r_data = 0;
        
        if(root==null || (root.left==null && root.right==null ))
           return true;
           
        if(root.left!=null)
            l_data = root.left.data;    
           
        if(root.right!=null)
           r_data = root.right.data;
           
        boolean left = isChildSumProperty(root.left);
        boolean right = isChildSumProperty(root.right);
           
        if(left == right)
            return  (root.data==l_data+r_data);
        
        return false;
    }
    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree();
        System.out.println(isChildSumProperty(root));
    }

}

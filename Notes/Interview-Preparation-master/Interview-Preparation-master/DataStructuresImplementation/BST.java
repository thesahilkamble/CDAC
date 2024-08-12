class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}
public class BST {
    private TreeNode root;
    
    private TreeNode insert(TreeNode root, int data){
        if(root == null){
            return new TreeNode(data);
        }
        
        if(root.data > data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        
        return root;
    }
    
    public void insert(int data){
        root = insert(root, data);
    }
    
    private TreeNode delete(TreeNode root, int key){
        if(root == null)
            return root;
        
        if(key < root.data)
            root.left = delete(root.left, key);
        else if(key > root.data) 
            root.right = delete(root.right, key);
        else{
            // Node with only one or no child
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
           /* If node has both children then find inorder successor
            * swap the node data with inorder successor 
            * delete the inorder successor
            */
            else{
                root.data = minValue(root.right); 
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }
    
    private int minValue(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        
        int left = minValue(root.left);
        int right = minValue(root.right);
       
        return Math.min(left, Math.min(right, root.data));
    }
    
    public void delete(int key){
        root = delete(root, key);
    }
    
    public boolean search(int key){
        return search(root, key);
    }
    
    private boolean search(TreeNode root, int key){
        if(root == null)
          return false;
          
        if(root.data == key)
            return true;
        
        if(root.data < key)
            return search(root.right, key);
        else
            return search(root.left, key);
    }
    
    public void inorder(){
        inorder(root);
    }
    
    private void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    public int height(){
        return height(root);
    }
    
    private int height(TreeNode root){
        if(root == null)
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        return Math.max(left, right) + 1;
    }
    
    public static void main(String[] args){
        BST b = new BST();
        b.insert(15);
        b.insert(25);
        b.insert(5);
        b.insert(8);
        b.insert(2);
        b.insert(35);
        b.insert(28);
        
        b.inorder();
        
        System.out.println("\nHeight "+ b.height());
        
        b.delete(35);
        b.inorder();
        System.out.println("\nHeight "+ b.height());
        
        b.delete(15);
        b.inorder();
        System.out.println("\nHeight "+ b.height());
        
        b.delete(25);
        b.inorder();
        System.out.println("\nHeight "+ b.height());
        
    }
}

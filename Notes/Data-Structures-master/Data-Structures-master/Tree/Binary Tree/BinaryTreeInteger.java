import java.util.*;
/**
 * @author Gaurav Rajput - grv0908@gmail.com
 * 
 * Class to create Custom Binary Tree of Integer Node Type
 */
class BinaryTreeInteger {
    private int totalNodes;
    private Node<Integer> root;
    private static Scanner sc = new Scanner(System.in);

    BinaryTreeInteger() {
        this.totalNodes = 0;
        this.root = null;
    }

    /**
     * this function creates a binary tree using user input
     * given in order of dfs, where -1 represents termination of node
     * e.g. 
     * 
     *                 1
     *               /   \
     *              2      3   
     *             / \    / \  
     *            4   5  6   7
     * 
     * For above tree input will be : 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1  (DFS order)
     */
    public void createBinaryTreeDFS() {
        this.totalNodes = 0;
        this.root = createBTDFS();
    }

    private Node<Integer> createBTDFS() {
        int data = sc.nextInt(); 
        if(data != -1) {
            this.totalNodes++;
            Node<Integer> currentNode = new Node<>(data);
            currentNode.left = createBTDFS();
            currentNode.right = createBTDFS();
            return currentNode;
        }
        return null;
    } 

     /**
     * this function creates a binary tree using user input
     * given in order of bfs (level wise), where -1 represents termination of node
     * e.g. 
     * 
     *                 1
     *               /   \
     *              2      3   
     *             / \    / \  
     *            4   5  6   7
     * 
     * For above tree input will be : 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1  (DFS order)
     */
    public void createBinaryTreeBFS() {
        this.totalNodes = 0;
        this.root = createBTBFS();
    }

    private Node<Integer> createBTBFS() {
        int data = sc.nextInt();

        if(data != -1) {
            this.totalNodes++;
            Queue<Node<Integer>> q = new LinkedList<>();
            Node<Integer> root = new Node<>(data);
            q.add(root);
            while(!q.isEmpty()) {
                Node<Integer> currentNode = q.remove();
                data = sc.nextInt();
                if(data != -1) {
                    this.totalNodes++;
                    currentNode.left = new Node<Integer>(data);
                    q.add(currentNode.left);
                }
                data = sc.nextInt();
                if(data != -1) {
                    this.totalNodes++;
                    currentNode.right = new Node<Integer>(data);
                    q.add(currentNode.right);
                }
            }
            return root;
        }
        return null;
    }

    public void printPreorder() {
        printPreorder(this.root);
        System.out.println();
    }

    private void printPreorder(Node<Integer> root) {
        if(root != null){
            System.out.print(root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public void printPostorder() {
        printPostorder(this.root);
        System.out.println();
    }

    private void printPostorder(Node<Integer> root) {
        if(root != null){
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void printInorder() {
        printInorder(this.root);
        System.out.println();
    }

    private void printInorder(Node<Integer> root) {
        if(root != null){
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public int totalNodes() {
        return this.totalNodes;
    }
}
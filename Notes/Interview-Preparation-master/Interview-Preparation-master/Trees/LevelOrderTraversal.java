import java.util.LinkedList;
import java.util.Queue;

/* Input : 1 2 4 8 -1 -1 9 -1 -1 5 -1 -1 3 6 10 -1 -1 12 -1 -1 7 -1 13 -1 -1  (DFS order)
 * 
 *                 1
 *               /   \
 *              2      3   
 *             / \    / \  
 *            4   5  6   7
 *           / \    / \   \
 *          8   9  10  12  13
 */

public class LevelOrderTraversal {

    public static void levelOrderTraversal(Node<Integer> root) {

        if (root == null)
            return;

        Queue<Node<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node<Integer> currNode = q.remove();
            System.out.print(currNode.data + " ");

            if (currNode.left != null)
                q.add(currNode.left);

            if (currNode.right != null)
                q.add(currNode.right);
        }
    }
    
    // Method to print Each level on a new Line
    public static void levelOrderLineByLine(Node<Integer> root) {

        if (root == null)
            return;

        Node<Integer> markerNode = new Node<>(-1);
        Queue<Node<Integer>> q = new LinkedList<>();
        q.add(root);
        q.add(markerNode);

        while (!(q.size() == 1)) {
            Node<Integer> currNode = q.remove();
            if (currNode == markerNode) {
                System.out.println();
                q.add(markerNode);
            } else {
                System.out.print(currNode.data + " ");
            }

            if (currNode.left != null)
                q.add(currNode.left);

            if (currNode.right != null)
                q.add(currNode.right);
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree(); // Taking Input dfs wise
        System.out.println("Simple Level Order Traversal : ");
        levelOrderTraversal(root);
        System.out.println("\nLevel Order with new Line");
        levelOrderLineByLine(root);
    }
}

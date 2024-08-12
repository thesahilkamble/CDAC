import java.util.Queue;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Map.Entry;

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
 * Output : 4 2 1 3 7
 */

public class TopView {

    static class QueueItem {
        Node<Integer> node;
        int horizontalDistance;

        QueueItem(Node<Integer> node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }

    static TreeMap<Integer, Integer> t = new TreeMap<>();

    public static void topView(Node<Integer> root) {
        if (root == null)
            return;

        Queue<QueueItem> q = new LinkedList<>();
        q.add(new QueueItem(root, 0));

        while (!q.isEmpty()) {
            QueueItem currQNode = q.remove();
            Node<Integer> currNode = currQNode.node;
            int hd = currQNode.horizontalDistance;

            if (!t.containsKey(hd)) {
                t.put(hd, currNode.data);
            }

            if (currNode.left != null) {
                q.add(new QueueItem(currNode.left, hd - 1));
            }
            if (currNode.right != null) {
                q.add(new QueueItem(currNode.right, hd + 1));
            }
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = BinaryTreeUtil.createBinaryTree();
        topView(root);

        for (Entry<Integer, Integer> entry : t.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

}

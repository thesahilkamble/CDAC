package binarytree;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}

public class BinaryTree {

	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public Node insertRec(Node root, int data) {

		if (root == null)
			root = new Node(data);
		else if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
	}

	public void inorder() {
		inorderRec(root);
	}

	public void preorder() {
		preorderRec(root);
	}

	public void postorder() {
		postorderRec(root);
	}

	public int height() {
		return heightRec(root);
	}

	private int heightRec(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;

		return 1 + Math.max(heightRec(root.left), heightRec(root.right));
	}

	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + "<=>");
			inorderRec(root.right);
		}
	}

	private void preorderRec(Node root) {

		if (root != null) {
			System.out.print(root.data + "<=>");
			preorderRec(root.left);
			preorderRec(root.right);
		}

	}

	public void postorderRec(Node root) {
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.data + "<=>");
		}
	}

}
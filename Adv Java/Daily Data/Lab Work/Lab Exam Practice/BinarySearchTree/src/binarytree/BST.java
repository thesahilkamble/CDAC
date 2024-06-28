package binarytree;

public class BST {
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.insert(45);
		tree.insert(15);
		tree.insert(10);
		tree.insert(12);
		tree.insert(20);
		tree.insert(79);
		tree.insert(55);
		tree.insert(50);
		tree.insert(90);

		System.out.println("InOrder Tree");
		tree.inorder();
		System.out.println("\nPreOrder Tree");
		tree.preorder();
		System.out.println("\nPostOrder Tree");
		tree.postorder();

		System.out.println(" ");
		System.out.println("Height of tree: " + tree.height());
	}
}

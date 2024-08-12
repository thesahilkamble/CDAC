/**
 * @author Gaurav Rajput - grv0908@gmail.com
 */

 class BinarySearchTree<T extends Comparable <T>> {
    private Node<T> root;
    private int totalNodes;

    BinarySearchTree() {
        this.root = null;
        this.totalNodes = 0;
    }

    /**
     * insert each small node to in left subtree,
     * greater and equal node in right subtree
     */
    public void insertNode(T data) {
        Node<T> newNode = new Node<>(data);
        this.root = insertNode(this.root, newNode);
    }

    private Node<T> insertNode(Node<T> currentNode, Node<T> newNode) {
        if(currentNode == null) {
            return newNode;
        }

        if(currentNode.data.compareTo(newNode.data) > 0) {
            currentNode.left = insertNode(currentNode.left, newNode);
            return currentNode;
        }
        else {
            currentNode.right = insertNode(currentNode.right, newNode);
            return currentNode;
        }
    }

    public boolean search(T data) {
       return search(this.root, data);
    }

    private boolean search(Node<T> currentNode, T data) {
        if(currentNode == null) {
            return false;
        }

        if(currentNode.data.equals(data))
            return true;

        if(currentNode.data.compareTo(data) > 0) {
            boolean leftRes = search(currentNode.left, data);
            if(leftRes)
                return true;
        }
        return search (currentNode.right, data);
    }

    public void removeNode (T data) {
        this.root = removeNode(this.root, data);
    }

    private Node<T> removeNode(Node<T> currentNode, T data) {
        if (root == null) {
            return null;
        }

        if (currentNode.data.compareTo(data) > 0) {
            root.left = removeNode(currentNode.left, data);
        }
        else if (currentNode.data.compareTo(data) < 0) {
            root.right = removeNode(currentNode.right, data);
        }
        else {
            if (currentNode.left == null)
                return currentNode.right;
            else if (currentNode.right == null)
                return currentNode.left;
            else {
                /**
                 * Getting inorder successor 
                 * Swapping it with root and recursively remove the inorder successor
                 */
                currentNode.data = findMin(currentNode.right);
                currentNode.right = removeNode(currentNode.right, currentNode.data);
            }
        }
        return root;
    }

    public T findMin() throws EmptyTreeException {
        if (this.root == null) {
            throw new EmptyTreeException();
        }
        return findMin(this.root);
    }

    private T findMin(Node<T> currentNode) {
        if (currentNode.left == null) {
            return currentNode.data;
        }
        return findMin (currentNode.left);
    }

    public T findMax() throws EmptyTreeException {
        if (this.root == null) {
            throw new EmptyTreeException();
        }
        return findMax(this.root);
    }

    private T findMax(Node<T> currentNode) throws EmptyTreeException {
        if (currentNode.right == null) {
            return currentNode.data;
        }
        return findMax(currentNode.right);
    }

    public void printInorder() {
        printInorder(this.root);   
    }

    private void printInorder(Node<T> root) {
        if(root != null) {
            printInorder(root.left);
            System.out.println(root.data +" ");
            printInorder(root.right);
        }
    }

    public int totalNodes() {
        return this.totalNodes;
    }
 }
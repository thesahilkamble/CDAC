/**
 * @author Gaurav Rajput - grv0908@gmail.com
 * represents basic structure of binary tree node
 */

class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
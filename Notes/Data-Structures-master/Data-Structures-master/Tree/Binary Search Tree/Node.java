/**
 * @author Gaurav Rajput - grv0908@gmail.com
 * represents basic structure of binary search tree node
 */

class Node<T extends Comparable<T>> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
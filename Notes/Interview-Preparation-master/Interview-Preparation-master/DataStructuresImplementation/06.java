package com.grv.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;
    
    Node(T data){
        this.data = data;
    }
}

class BinaryTreeUtil {
    
    static Scanner sc = new Scanner(System.in);
    
    /* Creating tree when input is given depth
     * Input : 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1  (DFS order)
     * 
     *                 1
     *               /   \
     *              2      3   
     *             / \    / \  
     *            4   5  6   7
     */
    
    public static Node<Integer> createBinaryTree(){       
        int data = sc.nextInt();
        if(data != -1) {
            Node<Integer> currNode = new Node<>(data);
            
            currNode.left = createBinaryTree();
            currNode.right = createBinaryTree();
            return currNode;
        }
        return null;
    }
    
     
    /* Creating tree when input is given level wise
     * Input : 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1  (BFS order)
     * 
     *                 1
     *               /   \
     *              2      3   
     *             / \    / \  
     *            4   5  6   7
     */
    
    public static Node<Integer> createBinaryTreeLevelWise(){
        int data = sc.nextInt();
        if(data != -1) {
            Queue<Node<Integer>> q = new LinkedList<>();
            Node<Integer> root = new Node<>(data);
            q.add(root);
            while(!q.isEmpty()) {
                Node<Integer> currNode = q.remove();
                
                data = sc.nextInt();
                if(data != -1) {
                    currNode.left = new Node<Integer>(data);
                    q.add(currNode.left);
                }
                data = sc.nextInt();
                if(data != -1) {
                    currNode.right = new Node<Integer>(data);
                    q.add(currNode.right);
                }
            }
            return root;
        }
        return null;
    }
    
    public static void preOrder(Node<Integer> root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public static void inOrder(Node<Integer> root) {
        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    
    public static void postOrder(Node<Integer> root) {
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public static void main(String[] args) {
       //Node<Integer> root =  createBinaryTree();
        Node<Integer> root = createBinaryTreeLevelWise();
        
       System.out.print("Preorder : ");
       preOrder(root);
       System.out.print("Preorder : ");
       inOrder(root);
       System.out.print("Preorder : ");
       postOrder(root);
    }
}

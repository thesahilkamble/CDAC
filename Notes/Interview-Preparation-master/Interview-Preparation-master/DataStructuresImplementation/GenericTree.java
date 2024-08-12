package com.grv.genericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node<T>{
    T data;
    ArrayList<Node<T>> children;
    
    Node(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class GenericTreeUtil {
    
    static Scanner sc = new Scanner(System.in);
    
    /* Taking input depth wise
     * 10 3 20 2 50 0 60 0 30 0 40 3 70 0 80 0 90 0
     * 
     *              10
     *            /  |  \
     *          20  30   40
     *         / \     /  |  \
     *        50  60  70  80  90
     */
    
    public static Node<Integer> createGenericTree() {
        int data = sc.nextInt();
        Node<Integer> root = new Node<>(data);
        
        int noOfChildren = sc.nextInt();
        for(int i = 0; i<noOfChildren; i++) {
            root.children.add(createGenericTree());
        }
        return root;
    }
    
    /* Taking input level wise
     * 10 3 20 30 40 2 50 60 0 3 70 80 90 0 0 0 0 0
     * 
     *              10
     *            /  |  \
     *          20  30   40
     *         / \     /  |  \
     *        50  60  70  80  90
     */
    
    public static Node<Integer> createGenericTreeLevelWise() {
        int data = sc.nextInt();
        Queue<Node<Integer>> q = new LinkedList<>();
        Node<Integer> root = new Node<>(data);
        q.add(root);
        
        while(!q.isEmpty()) {
            Node<Integer> currNode = q.remove();
            
            int noOfChildren = sc.nextInt();
            for(int i = 0; i<noOfChildren; i++) {
                Node<Integer> temp = new Node<>(sc.nextInt());
                currNode.children.add(temp);
                q.add(temp);
            }
        }
        return root;
    }
    
    // method to print Tree in depth wise (preOrder)
    public static void printTree(Node<Integer> root) {
        System.out.print(root.data+" ");
        for(int i = 0; i<root.children.size(); i++) {
            printTree(root.children.get(i));
        }
    }
    
    // method to print Tree in level wise order
    public static void printTreeLevelWise(Node<Integer> root) {
        Queue<Node<Integer>> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            Node<Integer> currNode = q.remove();
            System.out.print(currNode.data+" ");
            
            for(int i = 0; i<currNode.children.size(); i++) {
                q.add(currNode.children.get(i));
            }
        }
    }
    
    // method to return height of a tree
    public static int findHeight(Node<Integer> root) {
        
        if(root == null)
            return 0;
        
        int max = 0;
        for(int i = 0; i<root.children.size(); i++) {
            int temp = findHeight(root.children.get(i));
            if(temp > max)
                max = temp;
        }
        return max + 1;
    }
    
    // method to return number of nodes in tree
    public static int noOfNodes(Node<Integer> root) {
        if(root == null) {
            return 0;
        }
        
        int nodes = 0;
        for(int i= 0; i<root.children.size(); i++) {
            nodes += noOfNodes(root.children.get(i));
        }
        return nodes + 1;
    }
    public static void main(String[] args) {
        //Node<Integer> root = createGenericTree();
        Node<Integer> root = createGenericTreeLevelWise();
        System.out.print("Print Tree Depth wise : ");
        printTree(root);
        System.out.println();
        
        System.out.print("Print Tree Level Wise : ");
        printTreeLevelWise(root);
        System.out.println();
        
        System.out.println("Height of Tree is : "+ findHeight(root));
        System.out.println("Number of Nodes in Tree are : "+ noOfNodes(root));
    }
}

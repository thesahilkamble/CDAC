class Test {
    public static void main(String[] args) throws EmptyTreeException {
        BinarySearchTree<String> bst = new BinarySearchTree<>();
        bst.insertNode("Gaurav");
        bst.insertNode("Madhu");
        bst.insertNode("Saurav");
        bst.insertNode("Brij");
        bst.insertNode("Deepak");
        bst.insertNode("Neeraj");

        bst.printInorder();

        System.out.println(bst.search("Deepak"));
        System.out.println(bst.search("Abc"));
        System.out.println(bst.search("Brij"));

        bst.removeNode("Brij");
        System.out.println(bst.search("Brij"));

        System.out.println(bst.findMin());
        System.out.println(bst.findMax());
    }
}
class Test {
    public static void main(String[] args) {
        BinaryTreeInteger bt = new BinaryTreeInteger();

        bt.createBinaryTreeDFS();
        // input : 1 2 3 -1 -1 4 -1 -1 5 6 7 -1 -1 -1 -1
        bt.printPreorder();
        bt.printPostorder();

        bt.createBinaryTreeBFS();
        // input : 1 2 5 3 4 6 -1 -1 -1 -1 -1 7 -1 -1 -1
        bt.printPreorder();
        bt.printPostorder();
    }
}
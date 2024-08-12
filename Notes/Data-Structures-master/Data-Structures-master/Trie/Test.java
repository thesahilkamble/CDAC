class Test {
    public static void main(String[] args) throws ElementNotFoundException {
        Trie t = new Trie();
        t.insert("abcdef");
        t.insert("abcpqr");
        t.insert("abcpqrs");
        t.insert("abcpqr");

        System.out.println("totalNodes : " + t.getTotalNodes());
        System.out.println(t.containsWord("abcd"));
        System.out.println(t.containsWord("abcdpqr"));
        System.out.println(t.containsWord("abcddf"));
        System.out.println(t.containsWord("abcdef"));

        t.remove("abcdef");
        System.out.println("totalNodes : " + t.getTotalNodes());
        System.out.println(t.containsWord("abcdef"));
        System.out.println(t.containsWord("abcpqr"));
        t.remove("abcpqr");
        System.out.println("totalNodes : " + t.getTotalNodes());
        System.out.println(t.containsWord("abcpqr"));
        t.remove("abcpqr");
        System.out.println("totalNodes : " + t.getTotalNodes());
        System.out.println(t.containsWord("abcpqrs"));
        t.remove("abcpqrs");
        System.out.println("totalNodes : " + t.getTotalNodes());
        System.out.println(t.containsWord("abcpqrs"));
    }
}
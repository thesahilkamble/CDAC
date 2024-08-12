class Test {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> h = new HashMap<>();

        h.put(1, "Gaurav");
        h.put(2, "Brij");
        h.put(3, "Madhu");
        h.put(4, "Vijay");
        h.put(2, "Arpit");

        System.out.println(h.get(2));
    }
}
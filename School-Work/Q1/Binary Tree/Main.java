class Main{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        // Print the binary tree in-order

        Test test = new Test();
        test.sort();
        System.out.println(test.sort());
    }
}
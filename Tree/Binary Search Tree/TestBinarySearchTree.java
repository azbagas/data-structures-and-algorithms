public class TestBinarySearchTree {
    public static void main(String[] args) {
        // Create a BST
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.prettyPrint();
        bst.insert(3);
        bst.prettyPrint();
        bst.insert(8);
        bst.prettyPrint();
        bst.insert(2);
        bst.prettyPrint();
        bst.insert(4);
        bst.prettyPrint();
        bst.insert(6);
        bst.prettyPrint();
        bst.insert(7);
        bst.prettyPrint();
        // System.out.println(bst);

        // Search data from the BST
        bst.search(2);
        bst.search(9);

        // Delete data from the BST
        bst.delete(8);
        bst.prettyPrint();
        bst.delete(6);
        bst.prettyPrint();
        bst.delete(7);
        bst.prettyPrint();
        bst.delete(2);
        bst.prettyPrint();
    }
}

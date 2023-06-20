public class BinaryTreeNode {
    String label;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(String label, BinaryTreeNode left, BinaryTreeNode right) {
        this.label = label;
        this.left = left;
        this.right = right;
    }

    // public String toString() {
    //     return "[" + label + ", " + left + ", " + right + "]";
    // }

    public void printTree() {
        if (right != null) {
            right.printTree(true, "");
        }
        printNodeValue();
        if (left != null) {
            left.printTree(false, "");
        }
    }
    
    private void printTree(boolean isRight, String indent) {
        if (right != null) {
            right.printTree(true, indent + (isRight ? "        " : " |      "));
        }
        System.out.print(indent);
        if (isRight) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.print("----- ");
        printNodeValue();
        if (left != null) {
            left.printTree(false, indent + (isRight ? " |      " : "        "));
        }
    }
    
    private void printNodeValue() {
        if (label == null) {
            System.out.print("<null>");
        } else {
            System.out.print(label);
        }
        System.out.println();
    }
}
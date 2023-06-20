public class BinarySearchTree {
    private BinarySearchNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // prettyPrint
    public void prettyPrint() {
        if (root.right != null) {
            prettyPrint(root.right, true, "");
        }
        printNodeValue(root);
        if (root.left != null) {
            prettyPrint(root.left, false, "");
        }
        System.out.println();
    }

    private void prettyPrint(BinarySearchNode node, boolean isRight, String indent) {
        if (node.right != null) {
            prettyPrint(node.right, true, indent + (isRight ? "        " : " |      "));
        }
        System.out.print(indent);
        if (isRight) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.print("----- ");
        printNodeValue(node);
        if (node.left != null) {
            prettyPrint(node.left, false, indent + (isRight ? " |      " : "        "));
        }
    }

    private void printNodeValue(BinarySearchNode node) {
        if (node.data == null) {
            System.out.print("<null>");
        } else {
            System.out.print(node.data);
        }
        System.out.println();
    }

    public void insert(Integer data) {
        BinarySearchNode p = root;
        BinarySearchNode parent = null;
        boolean isLeftChild = false;
        while (p != null) {
            int result = data.compareTo(p.data);
            if (result == 0) {
                System.out.println(data + " already exists");
                return;
            } else if (result < 0) {
                parent = p;
                isLeftChild = true;
                p = p.left;
            } else {
                parent = p;
                isLeftChild = false;
                p = p.right;
            }
        }

        BinarySearchNode newNode = new BinarySearchNode(data);
        if (parent == null) {
            root = newNode;
        } else if (isLeftChild) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public void search(Integer data) {
        BinarySearchNode p = root;
        while (p != null) {
            int result = data.compareTo(p.data);
            if (result == 0) {
                System.out.println(data + " is found");
                return;
            } else if (result < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        System.out.println(data + " is not found");
    }

    public void delete(Integer data) {
        BinarySearchNode p = root;
        BinarySearchNode parent = null;
        boolean isLeftChild = false;
        while (p != null) {
            int result = data.compareTo(p.data);
            if (result == 0) {
                if (p.left == null && p.right == null) {
                    if (parent == null) root = null;
                    else if (isLeftChild) parent.left = null;
                    else parent.right = null;
                } else if (p.left == null) {
                    if (parent == null) root = p.right;
                    else if (isLeftChild) parent.left = p.right;
                    else parent.right = p.right;
                } else if (p.right == null) {
                    if (parent == null) root = p.left;
                    else if (isLeftChild) parent.left = p.left;
                    else parent.right = p.left;
                } else {
                    BinarySearchNode x = findMin(p);
                    if (parent == null) root = x;
                    else if (isLeftChild) parent.left = x;
                    else parent.right = x;
                    x.right = p.right;
                    x.left = p.left;
                    p.right = null;
                    p.left = null;
                }
                System.out.println(data + " has been deleted");
                return;
            } else if (result < 0) {
                parent = p;
                isLeftChild = true;
                p = p.left;
            } else {
                parent = p;
                isLeftChild = false;
                p = p.right;
            }
        }
        System.out.println(data + " is not found");
    }

    private BinarySearchNode findMin(BinarySearchNode parent) {
        BinarySearchNode p = parent.right;
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }

    public String toString() { return inorder(root); }

    private String inorder(BinarySearchNode p) {
        if (p == null) return "";
        return inorder(p.left) + " " + p.data + " " + inorder(p.right);
    }
}

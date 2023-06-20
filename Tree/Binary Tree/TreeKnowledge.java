import java.util.*;

public class TreeKnowledge {
    Scanner sc;
    BinaryTreeNode root;

    TreeKnowledge(Scanner sc) {
        this.sc = sc;
        root = new BinaryTreeNode("Komputer", null, null);
    }

    public boolean YorN() {
        while (true) {
            String s = sc.nextLine();
            if (s.startsWith("y")) return true;
            else if (s.startsWith("n")) return false;
        }
    }

    public void run() {
        while (true) {
            BinaryTreeNode x = root;
            System.out.println("Pikirkan sebuah benda! ");
            while (true) {
                if (x.left == null && x.right == null) {
                    // ---
                    System.out.print("Apakah benda tersebut " + x.label + " (y/n)? ");
                    if (YorN()) {
                        System.out.println("Yeay! Aku menang!");
                    } else {
                        System.out.println("Beritahu jawabannya!");
                        String jawaban = sc.nextLine();
                        System.out.println("Masukkan pertanyaan yang jika dijawab YES adalah " + jawaban + " dan jika dijawab NO adalah " + x.label);
                        String pertanyaan = sc.nextLine();

                        // Update tree
                        x.left = new BinaryTreeNode(jawaban, null, null);
                        x.right = new BinaryTreeNode(x.label, null, null);
                        x.label = pertanyaan;
                    }
                    // ---
                    break;
                } 
                // Jika x internal node
                System.out.print(x.label + " (y/n)? ");
                if (YorN()) x = x.left;
                else x = x.right;                                   
            }
            System.out.print("Lanjut (y/n)? ");
            if (!YorN()) {
                System.out.println("Diagram tree:");
                root.printTree();
                break;
            } 
        }
    }

    public static void main(String[] args) {
        TreeKnowledge tk = new TreeKnowledge(new Scanner(System.in));
        tk.run();
    }
}

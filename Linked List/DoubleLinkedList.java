import java.util.Scanner;

public class DoubleLinkedList {
    public static void main(String[] args) {
        DoubleList L = new DoubleList();
        L.head = null;
        L.tail = null;
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Template - Double Linked List");
            
            for (int i = 0; i < 5; i++) {
                Node node = new Node();
                node.data = scan.nextInt();
                node.prev = null;
                node.next = null;
                L.addFirst(node);
            }
        }
        
        L.printNode();
    }
}

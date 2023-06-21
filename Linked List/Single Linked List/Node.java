public class Node {
    int data;
    Node next;

    // constructor for initialization
    public Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    // print data
    public void displayLink() {
        System.out.print("{" + this.data + "} ");
    }
}
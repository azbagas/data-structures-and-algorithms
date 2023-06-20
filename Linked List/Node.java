public class Node {
    int data;
    Node next;

    // constructor for initialization
    Node(int data) {
        this.data = data;
    }

    // print data
    public void displayLink() {
        System.out.print("{" + this.data + "} ");
    }
}

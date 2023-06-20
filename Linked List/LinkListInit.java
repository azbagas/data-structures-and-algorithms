public class LinkListInit {
    Node first;

    // constructor
    LinkListInit() {
        first = null;
    }

    // check whether list is empty or not
    public boolean isEmpty() {
        return (first == null);
    }

    // insert data from the front of the list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    // insert data from the back of the list
    public void insertLast(int data) {
        if (first == null)
            insertFirst(data);
        else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    // delete the first data
    public void deleteFirst() {
        // Node temp = first;
        first = first.next;
    }

    // delete the last data
    public void deleteLast() {
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // print the list
    public void displayList() {
        System.out.print("List (first-->last): ");
        Node current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

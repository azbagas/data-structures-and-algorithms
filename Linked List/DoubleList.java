class Node {
	int data;
	Node next, prev;
}

public class DoubleList {
	Node head;
	Node tail;

	boolean isEmpty() {
		return (head == null);
	}

	void addFirst(Node input) {
		if (isEmpty()) {
			head = input;
			tail = input;
		} else {
			input.next = head;
			head.prev = input;
			head = input;
		}
	}

	void addLast(Node input) {
		if (isEmpty()) {
			head = input;
			tail = input;
		} else {
			tail.next = input;
			input.prev = tail;
			tail = input;
		}
	}

	void printNode() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	int getLength() {
		int length = 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	void deleteFirst() {
		if (!isEmpty()) {
			if (head == tail) {
				head = tail = null;
			} else {
				head = head.next;
				head.prev = null;
			}
		} else {
			System.out.println("Data is empty!");
		}
	}

	void deleteLast() {
		if (!isEmpty()) {
			if (head == tail) {
				head = tail = null;
			} else {
				tail = tail.prev;
				tail.next = null;
			}
		} else {
			System.out.println("Data is empty!");
		}
	}

	void deleteNode(Node del) {
		// Base case
		if (head == null || del == null) {
			return;
		}

		// If node to be deleted is head node
		if (head == del) {
			head = del.next;
		}

		// Change next only if node to be deleted
		// is NOT the last node
		if (del.next != null) {
			del.next.prev = del.prev;
		}

		// Change prev only if node to be deleted
		// is NOT the first node
		if (del.prev != null) {
			del.prev.next = del.next;
		}

		// Finally, free the memory occupied by del
		return;
	}

}
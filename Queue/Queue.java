import java.io.IOException;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) throws IOException {
        int queueSize;
        int numTemp;
        int numChoice = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        queueSize = in.nextInt();

        System.out.println();

        QueueInit theQueue = new QueueInit(queueSize);

        while (numChoice != 4) {
            theQueue.printQueue();
            System.out.println("\n 1: Enqueue \t 2: Dequeue Front \t 3: Dequeue Rear \t 4: End");
            System.out.print("Enter command: ");
            numChoice = in.nextInt();
            if (numChoice == 1) {
                if (theQueue.isFull()) {
                    System.out.println("Queue is full");
                } else {
                    System.out.print("Enter number: ");
                    numTemp = in.nextInt();
                    theQueue.enqueue(numTemp);
                }
            }
            else if (numChoice == 2) {
                if (theQueue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    numTemp = theQueue.dequeueFront();
                    System.out.println("Dequeue number: " + numTemp);
                }
            }
            else if (numChoice == 3) {
                if (theQueue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    numTemp = theQueue.dequeueRear();
                    System.out.println("Dequeue number: " + numTemp);
                }
            }
            else if (numChoice != 4) {
                System.out.println("Wrong command");
            }
            System.out.println();
        }

        in.close();
    }
}

import java.util.Arrays;

public class QueueInit {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueInit(int s) {
        maxSize = s;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int j) {
        if (rear == maxSize - 1)
            rear = -1;
        queueArray[++rear] = j;
        nItems++;
    }

    public int dequeueFront() {
        int temp = queueArray[front++];
        queueArray[front - 1] = 0;
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public int dequeueRear() {
        int temp = queueArray[rear--];
        queueArray[rear + 1] = 0;
        if (rear == -1)
            rear = maxSize - 1;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void printQueue() {
        System.out.print(Arrays.toString(queueArray));
    }
}

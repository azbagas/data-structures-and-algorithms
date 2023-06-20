import java.util.Scanner;

public class TestLinkList {
    public static void main(String[] args) {
        LinkListInit theList1 = new LinkListInit();
        LinkListInit theList2 = new LinkListInit();

        // defining the size of the lists
        Scanner in = new Scanner(System.in);
        int nodeNum1;
        int nodeNum2;
        int tempNum;

        System.out.print("First list size? ");
        nodeNum1 = in.nextInt();

        // initializing and displaying the lists
        for (int i = 0; i < nodeNum1; i++) {
            System.out.print("Insert number: ");
            tempNum = in.nextInt();
            theList1.insertLast(tempNum);
        }
        theList1.displayList();

        System.out.print("Second list size? ");
        nodeNum2 = in.nextInt();

        for (int i = 0; i < nodeNum2; i++) {
            System.out.print("Insert number: ");
            tempNum = in.nextInt();
            theList2.insertFirst(tempNum);
        }
        theList2.displayList();

        // deleting elements of the lists
        System.out.print("\nDeleting the first node of the first list\n");
        theList1.deleteFirst();
        theList1.displayList();

        System.out.print("\nDeleting the last node of the second list\n");
        theList2.deleteLast();
        theList2.displayList();

        // close Scanner 'in'
        in.close();
    }
}
package assesment.linkedlist;


import java.util.HashSet;

public class LinkedList {


    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static int detectAndRemoveLoop(Node head) {

        Node slowpointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {

            slowpointer = slowpointer.next;

            fastPointer = fastPointer.next.next;
            if (slowpointer == fastPointer) {
                System.out.println("loop present");
                System.out.println("removing loop.....");
                fastPointer.next = null;
                printList(head);
                return 1;

            }
        }

        return 0;

    }


    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(5);
        Node seventh = new Node(5);


        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
//        uncommenting the code line below creates the loop
//        seventh.next = third;


        if (detectAndRemoveLoop(head) == 1) {

        } else {
            System.out.println("No loop");
        }


    }
}


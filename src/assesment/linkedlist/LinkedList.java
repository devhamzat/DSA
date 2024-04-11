package assesment.linkedlist;


import java.util.HashSet;

public class LinkedList {
    static boolean removeLoop(Node head) {
        HashSet<Node> address = new HashSet<>();
        Node prev = null;
        while (head != null) {
            if (address.contains(head)) {
                prev.next = null;
                return true;
            } else address.add(head);
            {
                prev = head;
                head = head.next;
            }

        }
        return false;
    }


    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " " + node.next);
            node = node.next;
        }
    }


    public static boolean detectCycle(Node head) {

        Node slowpointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {

            slowpointer = slowpointer.next;

            fastPointer = fastPointer.next.next;
            if (slowpointer == fastPointer) {
                return true;
            }
        }

        return false;
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
        seventh.next = third;

        if (detectCycle(head)) {
            System.out.println("loop present");
            //found out uncommenting the below code is trouble.
//            System.out.println("loop before");
//            printList(head);
            removeLoop(head);
            printList(head);

        } else {
            System.out.println("No loop");
        }


    }
}


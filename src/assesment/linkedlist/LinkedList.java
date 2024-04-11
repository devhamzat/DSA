package assesment.linkedlist;


public class LinkedList {


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
        } else {
            System.out.println("No loop");
        }


    }
}


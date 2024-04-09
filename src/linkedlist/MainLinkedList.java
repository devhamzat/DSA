package linkedlist;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(22);
        Node node2 = new Node(10);
        Node node3 = new Node(4);

        linkedList.createLinkedList();
        linkedList.append(node1);
        linkedList.insert(node2, 0);
        linkedList.insert(node3, 2);
        linkedList.delete(2);
        linkedList.displayLinkedList();
    }
}

package leetcode;

import java.util.Stack;


public class AddTwoNumbers {
    /*
    problem case:
     You are given two non-empty linked lists representing two non-negative integers.
     The digits are stored in reverse order, and each of their nodes contains a single digit.
     Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    */
    /*
  Example:
    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
   Example 2 :
   Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
   Output: [8,9,9,9,0,0,0,1]
 */


    static NodeImpl addTwoNumbers(NodeImpl l1, NodeImpl l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push all nodes of first list into stack
        while (l1 != null) {
            s1.push(l1.data);
            l1 = l1.next;
        }

        // Push all nodes of second list into stack
        while (l2 != null) {
            s2.push(l2.data);
            l2 = l2.next;
        }

        NodeImpl result = null;
        int carry = 0;

        // Pop from stacks and add
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            carry = sum / 10;
            System.out.println(carry);
            NodeImpl newNode = new NodeImpl(sum % 10);
            System.out.println(newNode.data);

            // Insert at head (since we're adding from LSB to MSB)
            newNode.next = result;
            System.out.println(newNode.next);
            result = newNode;
            System.out.println(result);
        }

        return result;
    }

    // Helper to print list
    static void printList(NodeImpl head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        NodeImpl l1 = new NodeImpl(2);
        l1.next = new NodeImpl(4);
        l1.next.next = new NodeImpl(3);
        printList(l1);
        // Second list: 4 -> 6 -> 7 (467)
        NodeImpl l2 = new NodeImpl(5);
        l2.next = new NodeImpl(6);
        l2.next.next = new NodeImpl(4);
        printList(l2);
        System.out.println("*************************************");

        NodeImpl result = addTwoNumbers(l1, l2);

        printList(result);
    }
}

class NodeImpl {
    int data;
    NodeImpl next;

    public NodeImpl(int data) {
        this.data = data;
        this.next = null;
    }


}

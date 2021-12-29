package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class FlattenaMultilevelDoublyLinkedList1 {
    public static void main(String[] args) {
        Node head = new Node();
        head.val = 1;

        Node n1 = new Node();
        n1.val = 2;
        n1.prev = head;

        Node n2 = new Node();
        n2.val = 3;
        n2.prev = n1;
        n1.next = n2;

        Node n3 = new Node();
        n3.val = 4;
        n3.prev = n2;
        n2.next = n3;

        Node n4 = new Node();
        n4.val = 5;
        n4.prev = n3;
        n3.next = n4;

        Node n5 = new Node();
        n5.val = 6;
        n5.prev = n4;
        n4.next = n5;

        Node n6 = new Node();
        n6.val = 7;
        n2.child = n6;

        Node n7 = new Node();
        n7.val = 8;
        n7.prev = n6;
        n6.next = n7;

        Node n8 = new Node();
        n8.val = 9;
        n8.prev = n7;
        n7.next = n8;

        Node n9 = new Node();
        n9.val = 10;
        n9.prev = n8;
        n8.next = n9;

        Node n10 = new Node();
        n10.val = 11;
        n10.prev = n9;
        n9.next = n10;
        n7.child = n10;

        Node n11 = new Node();
        n11.val = 12;
        n11.prev = n10;
        n10.next = n11;

        Node result = flatten(head);
        while (result != null) {
            System.out.println(result.val + " ");
            result = result.next;
        }
    }

    private static Node flatten(Node head) {
        if (head == null) return head;

        Node dummyHead = new Node(0, null, head, null);
        Node curr, prev = dummyHead;

        Deque<Node> deque = new ArrayDeque<>();
        deque.push(head);

        while (!deque.isEmpty()) {
            curr = deque.pop();
            prev.next = curr;
            curr.prev = prev;

            if (curr.next != null) deque.push(curr.next);
            if (curr.child != null) {
                deque.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        dummyHead.next.prev = null;
        return dummyHead.next;
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int i, Node p, Node n, Node c) {
            val = i;
            prev = p;
            next = n;
            child = c;
        }

        public Node() {

        }
    }

}

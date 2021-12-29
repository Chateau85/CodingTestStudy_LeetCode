package LinkedList;

public class CopyListwithRandomPointer1 {
    public static void main(String[] args) {
        Node head = new Node(7);
        head.random = null;

        Node n1 = new Node(13);
        head.next = n1;
        n1.random = head;

        Node n2 = new Node(11);
        n1.next = n2;

        Node n3 = new Node(10);
        n2.next = n3;
        n3.random = n2;

        Node n4 = new Node(1);
        n3.next = n4;
        n2.random = n4;
        n4.random = head;
        n4.next = null;

        Node result = copyRandomList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node pointer = head;
        while (pointer != null) {
            Node n = new Node(pointer.val);
            n.next = pointer.next;
            pointer.next = n;
            pointer = n.next;
        }

        pointer = head;
        while (pointer != null) {
            pointer.next.random = pointer.random != null ? pointer.random.next : null;
            pointer = pointer.next.next;
        }
        Node pointerOld = head;
        Node pointerNew = head.next;
        Node headOld = head.next;
        while (pointerOld != null) {
            pointerOld.next = pointerOld.next.next;
            pointerNew.next = pointerNew.next != null ? pointerNew.next.next : null;
            pointerOld = pointerOld.next;
            pointerNew = pointerNew.next;
        }
        return headOld;
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

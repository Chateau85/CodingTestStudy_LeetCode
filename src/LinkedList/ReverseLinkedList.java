package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode result = reverseList(n1);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode currentHead = head;
        while (head.next != null) {
            ListNode p = head.next;
            head.next = p.next;
            p.next = currentHead;
            currentHead = p;
        }
        return currentHead;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
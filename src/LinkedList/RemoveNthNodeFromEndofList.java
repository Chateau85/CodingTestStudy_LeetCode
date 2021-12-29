package LinkedList;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        int n = 2;
        ListNode node1 = new ListNode(1);
        int n = 1;
        System.out.println(removeNthFromEnd(node1, n));
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

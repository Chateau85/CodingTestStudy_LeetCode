package LinkedList;

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(detectCycle(node1).val);
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = intersect;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    private static ListNode getIntersect(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

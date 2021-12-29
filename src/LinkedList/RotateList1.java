package LinkedList;

public class RotateList1 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode result = rotateRight(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode fast = head, slow = head;

        int length = 1;
        while (fast.next != null) {
            fast = fast.next;
            length++;
        }

        for (int i = length - k % length; i > 1; i--) {
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
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

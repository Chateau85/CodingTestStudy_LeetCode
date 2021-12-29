package LinkedList;

public class InsertintoaCyclicSortedList1 {
    public static void main(String[] args) {
        Node head = new Node(3, new Node(4, new Node(1)));
        int insertVal = 2;
        Node result = insert(head, insertVal);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static Node insert(Node head, int insertVal) {
        if (head == null) {
            Node result = new Node(insertVal, null);
            result.next = result;
            return result;
        }
        Node max = head;
        while (max.val <= max.next.val && max.next != head) {
            max = max.next;
        }

        Node min = max.next, cur = min;
        if (insertVal <= min.val || insertVal >= max.val) {
            max.next = new Node(insertVal, min);
        } else {
            while (cur.next != null && cur.next.val < insertVal){
                cur = cur.next;
            }
            cur.next = new Node(insertVal, cur.next);
        }
        return head;
    }

    static class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
}

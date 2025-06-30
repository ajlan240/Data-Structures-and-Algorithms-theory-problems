public class Leetcode328 {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;

        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode head = null;

    public static void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        ListNode n1, n2, n3, n4, n5, n6, n0;
//        n0 = new ListNode(7, null );
//        n1 = new ListNode(6, n0);
//        n2 = new ListNode(5, n1);
//        n3 = new ListNode(4, n2);
        n4 = new ListNode(3, null);
        n5 = new ListNode(2, n4);
        n6 = new ListNode(1, n5);
        head = n6;
        oddEvenList(head);
        display();


    }

    public static ListNode oddEvenList(ListNode head) {

        if(head == null) return head;
        ListNode node1 = head;
        ListNode node2 = head.next;
        ListNode node3 = node2;
        ListNode node4 = node3;
        
        while (node1.next != null && node2.next != null) {
            node1.next = node2.next;
            node1 = node2.next;
            node3.next = node1.next;
            node2 = node1.next;
            node3 = node3.next;
        }
        node1.next = node4;
//        while(node4 != null) {
//            node1.next = node4;
//            node1 = node1.next;
//            node4 = node4.next;
//        }

        return head;
    }

}

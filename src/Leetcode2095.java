public class Leetcode2095 {
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
//        n0 = new ListNode(6, null );
//        n1 = new ListNode(2, n0);
//        n2 = new ListNode(1, n1);
//        n3 = new ListNode(4, null);
//        n4 = new ListNode(3, n3);
//        n5 = new ListNode(1, null);
        n6 = new ListNode(1, null);
        head = n6;
         head = deleteMiddle(head);
        display();


    }

    public static ListNode deleteMiddle(ListNode head){
        if(head == null) return null;
        ListNode node1 = head;
        int i = 0;
        while (node1.next != null) {
            node1 = node1.next;
            i++;
        }
        double mid = Math.ceil((double) i / 2);
        node1 = head;
        ListNode node2 = null;
        for (int j = 0; j < mid; j++) {
            node2 = node1;
            node1 = node1.next;
        }
        if(node2 != null) node2.next = node1.next;
        else head = null;
        return head;

    }



}
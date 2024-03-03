class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class ReverseLL206 {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        ListNode res =  reverseList(h);
        while(res!=null){
            System.out.print(res.val+"->");
            res = res.next;
        }
    }    

    
public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode next = null;
    ListNode curr= head;
    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

}

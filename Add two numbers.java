public class Main {


        public static void main(String[] args) {
    int carry = 0;
    int temp = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    temp = l1.val + l2.val + carry;
    carry = temp / 10;
    if(l1.next == null && l2.next == null){
    if(carry != 0){
    return new ListNode(temp % 10, new ListNode(carry));
    }
    else{
    return new ListNode(temp % 10);
    }
    }
    else if(l1.next == null){
    return new ListNode(temp % 10,addTwoNumbers(new ListNode(0), l2.next));
    }
    else if(l2.next == null){
    return new ListNode(temp % 10,addTwoNumbers(l1.next, new ListNode(0)));
    }
    else{
    return new ListNode(temp % 10, addTwoNumbers(l1.next, l2.next));
    }
    
    }
}
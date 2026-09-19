/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        ListNode temp = l1;

        while(temp != null){
            list1.add(temp.val);
            temp = temp.next;
        }

        temp = l2;

        while(temp != null){
            list2.add(temp.val);
            temp = temp.next;
        }

        ArrayList<Integer> res = new ArrayList<>();

        int sum = 0;
        int carry = 0;

        int index = 0;

        while(index < list1.size() && index < list2.size()){

            sum = list1.get(index) + list2.get(index) + carry;
            
            res.add(sum%10);
            
            carry = sum/10;

            index += 1;
        }

        while(index < list1.size()){
            int val = carry + list1.get(index);
            int num = val%10;
            carry = val/10;
            res.add(num);
            index += 1;
        }

        while(index < list2.size()){
            int val = carry + list2.get(index);
            int num = val%10;
            carry = val/10;
            res.add(num);
            index += 1;
        }

        if(carry != 0){
            res.add(carry);
        }

        ListNode curr = new ListNode();
        temp = curr;

        index = 0;

        while(index < res.size()){
            curr.next = new ListNode(res.get(index));
            curr = curr.next;
            index += 1;
        }

        return temp.next;



    }
}

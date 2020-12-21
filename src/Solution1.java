import java.util.ArrayList;

//单链表的排序
   class ListNode {
       int val;
       ListNode next = null;
   }
public class Solution1 {

    public ListNode sortInList (ListNode head) {
        // write code here
        if(head==null||head.next==null)
            return head;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp =head;
        while(tmp!=null){
            list.add(tmp.val);
            tmp = tmp.next;
        }
        list.sort((a,b)->{return a-b;});
        ListNode temp = head;
        int i=0;
        while(temp!=null){
            temp.val = list.get(i++);
            temp = temp.next;
        }
        return head;
    }
}

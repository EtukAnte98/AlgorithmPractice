package org.example;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode modifyLinkedList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next.next = new ListNode(7);

        Solution solution = new Solution();
        ListNode modifiedHead = solution.modifyLinkedList(head);

        ListNode current = modifiedHead;
        while (current != null){
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

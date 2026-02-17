/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newHead=reverse(slow.next);
        Node first=head;
        Node second=newHead;
        while(second!=null)
        {
            if(first.data!=second.data)
            {
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;
    }
    Node reverse(Node head)
    {
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
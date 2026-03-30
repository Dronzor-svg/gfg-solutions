/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here\\
        if (head == null) return null;
        Node temp=head;
        int n=0 ;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        k=k%n;
        if(k==0) return head;
        temp=head;
        int cnt=0;
        while(cnt<k-1)
        {
            temp=temp.next;
            cnt++;
        }
        Node newHead=temp.next;
        temp.next=null;
        Node tail=newHead;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=head;
        
        return newHead;
        
    }
}
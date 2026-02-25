/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        head1=reverse(head1);
        head2=reverse(head2);
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        Node temp1=head1;
        Node temp2=head2;
        int carry=0;
        while(temp1!=null || temp2!=null)
        {
            int sum=carry;
            
            if(temp1!=null) sum+=temp1.data;
            if(temp2!=null) sum+=temp2.data;
            
            Node newNode=new Node(sum%10);
            carry=sum/10;
            curr.next=newNode;
            curr=curr.next;
            
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        if(carry>0)
        {
            Node newNode=new Node(carry);
            curr.next=newNode;
        }
        dummyNode.next=reverse(dummyNode.next);
        while(dummyNode.next.data==0)
        {
            dummyNode=dummyNode.next;
        }
        return dummyNode.next;
        
    }
    Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            
        }
        return prev;
    }
}
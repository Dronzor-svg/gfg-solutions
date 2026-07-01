/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        Node temp=head;
        
        while(temp!=null)
        {
            if(temp.data==0) 
            {
                zeros++;
            }
            else if(temp.data==1) ones++;
            else twos++;
            
            temp=temp.next;
        }
        
        
        Node dummy=new Node(-1);
        Node curr=dummy;
        
        while(zeros>0)
        {
            Node zero=new Node(0);
            curr.next=zero;
            curr=curr.next;
            
            zeros--;
        }
        
        while(ones>0)
        {
            Node one=new Node(1);
            curr.next=one;
            curr=curr.next;
            
            ones--;
        }
        
        while(twos>0)
        {
            Node two=new Node(2);
            curr.next=two;
            curr=curr.next;
            
            twos--;
        }
        return dummy.next;
    }
}
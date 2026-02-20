/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del_node) {
        // code here
        Node ptr = del_node;
        Node prev = null;
        while(ptr.next != null){
            prev = ptr;
            ptr.data = ptr.next.data;
            ptr = ptr.next;
        }
        prev.next = null;
        ptr = null;
    }
}
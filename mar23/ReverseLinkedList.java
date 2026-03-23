class ReverseLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int v){ val=v; }
    }

    public static Node reverse(Node head){
        Node prev=null, curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=new Node(3);
        Node rev=reverse(a);
        while(rev!=null){
            System.out.print(rev.val+" ");
            rev=rev.next;
        }
    }
}
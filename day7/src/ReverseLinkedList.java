
public class ReverseLinkedList {
    Node head;
    int size;
    ReverseLinkedList(){
        head =null;
        size = 0;
    }
    public void InsertAtTail(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
        size++;
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void Display(){
        System.out.println("Elements are: ");
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}

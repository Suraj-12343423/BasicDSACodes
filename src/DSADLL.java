class DLL{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data=d;
        }
    }
    public void insertFront(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head==null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    public void printlist(Node node){
        Node last = null;
        while(node!=null){
            System.out.print(node.data+"<=>");
            last=node;
            node=node.next;
        }
        System.out.println("null");
    }
    public void deletefirst(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        } else if (head!=tail) {
            head=head.next;
            head.prev=null;
        }
        else{
            head=tail=null;
        }

    }

}
public class DSADLL {
    public static void main(String[] args) {
        DLL list1 = new DLL();
        list1.insertFront(2);
        list1.insertFront(6);
        list1.insertFront(7);
        list1.insertLast(8);
        list1.printlist(list1.head);
        list1.deletefirst();
        list1.printlist(list1.head);

    }
}

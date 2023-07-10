class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head =newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        Node newnode = new Node(data);
        if (head == null) {
            head=newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;

    }
    public void printlist(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
    }

    public void deletefirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }

}
public class DSALL {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("my");
        list.addFirst("Hello");
        list.addlast("Sai");



        list.deletefirst();
        list.deletelast();
        list.printlist();

    }
}

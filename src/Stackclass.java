
public class Stackclass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public static int pop(){
            if(head==null){
                System.out.println("The stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if (head==null){
                System.out.println("The Stack is empty");
                return -1;
            }
            return head.data;

        }
        public static void print() {
            if(head==null) {
                System.out.println("null");;
            }
            else {
                Node currNode = head;
                while(currNode != null) {
                    System.out.print(currNode.data+" ");
                    currNode = currNode.next;
                }
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        Stack stack1=new Stack();
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.print();
        stack1.pop();
        stack1.print();
        stack1.peek();
        stack1.print();
    }

}

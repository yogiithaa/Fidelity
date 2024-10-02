package prog2_insert_head;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
        }
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
package prog3_insert_specific;

class LinkedList {
    Node head; //
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertSpecific(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; current != null && i < position; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("The position is out of range");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


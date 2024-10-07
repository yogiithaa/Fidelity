public class Main {
    public static Node addNode(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static Node removeNode(Node head, int index) {
        if (head == null || index < 0) {
            System.out.println("invalid index ");
            return head;
        }
        if (index == 0) {
            return head.next;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("invalid index entered");
                return head;
            }
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("invalid index entered");
        }

        return head;
    }
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

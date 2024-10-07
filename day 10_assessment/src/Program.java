import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.println("Enter 4 elements of the list ");
        for (int i = 0; i < 4; i++) {
            int element = sc.nextInt();
            head = Main.addNode(head, element);
        }
        System.out.println("Linked List:");
        Main.display(head);
        System.out.print("Enter the index for the element to be removed ");
        int index = sc.nextInt();

        head = Main.removeNode(head, index);

        System.out.println("Updated Linked List:");
        Main.display(head);
    }
}

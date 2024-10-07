import java.util.LinkedList;
import java.util.Scanner;

public class day10_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1.Adam");
        list.add("2.Thomas");
        list.add("3.Mary");
        list.add("4.Uma");
        System.out.println("Linked list: " + list);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the element to be removed");
        int index = scanner.nextInt();
        list.remove(index);

        System.out.println("Linked list: " + list);

    }
}
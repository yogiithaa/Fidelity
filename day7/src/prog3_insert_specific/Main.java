package prog3_insert_specific;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("No. of elements in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of ist:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.append(value);
        }
        System.out.println("Initial linked list:");
        list.display();
        System.out.println("Enter value to be inserted:");
        int value = scanner.nextInt();

        System.out.println("Enter the position for value to be inserted:");
        int position = scanner.nextInt();
        list.insertSpecific(value, position);

        System.out.println("Linked list after insertion:");
        list.display();
    }
}





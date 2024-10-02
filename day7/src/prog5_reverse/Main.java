package prog5_reverse;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Scanner scanner=new Scanner(System.in);

        System.out.print("No. of elements in the LinkedList: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element=scanner.nextInt();
            list.insert(element);
        }
        System.out.println("Initial list:");
        list.display();
        list.reverseList();
        System.out.println("After reversing the list:");
        list.display();
    }
}


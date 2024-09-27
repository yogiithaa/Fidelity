package Prog6_concat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName=scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName=scanner.nextLine();
        String fullName=firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
    }
}

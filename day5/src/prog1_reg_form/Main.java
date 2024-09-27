package prog1_reg_form;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name=scanner.nextLine();
        System.out.print("Enter your age: ");
        int Age=scanner.nextInt();

    scanner.nextLine();

        System.out.print("Enter your country: ");
        String Country=scanner.nextLine();
        System.out.println("Welcome "+Name+"! Your age is "+Age+" and you are from "+Country);
    }
}
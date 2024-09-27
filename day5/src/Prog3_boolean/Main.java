package Prog3_boolean;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter x value: ");
        x=scanner.nextInt();
        System.out.println("Enter y value: ");
        y=scanner.nextInt();

        boolean result=(x<y);
        System.out.println("The result of whether x is less than y is "+result+".");
    }
}

package Prog7_reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String input=scanner.nextLine();
        String[] words=input.split(" ");
        StringBuilder reversedString=new StringBuilder();
        for(int i=words.length - 1; i>=0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        System.out.println(reversedString.toString().trim());
    }
}

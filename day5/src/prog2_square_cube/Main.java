package prog2_square_cube;

import java.util.Scanner;

public class Main {
    public static double Square(double num){
        return (num*num);
    }
    public static double Cube(double num){
        return (num*num*num);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the number: ");
        double num=scanner.nextDouble();
        double square=Square(num);
        System.out.println("The square of "+num+" is "+square);
        double cube=Cube(num);
        System.out.println("The cube of "+num+" is "+cube);
    }
}

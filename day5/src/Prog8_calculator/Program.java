package Prog8_calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Calculator calculator=new Calculator();
        System.out.print("Enter the operator [+, -, *, /]: ");
        String operator=scanner.nextLine();
        System.out.print("Enter the operands: ");
        int operand1=scanner.nextInt();
        int operand2=scanner.nextInt();
        double result;
        double[] remainder=new double[1];

        switch (operator){
            case "+":
                result=calculator.Addition(operand1, operand2);
                System.out.println("Result of " + operand1 + " + " + operand2 + " is " + (int) result);
                break;

            case "-":
                result=calculator.Subtraction(operand1, operand2);
                System.out.println("Result of " + operand1 + " - " + operand2 + " is " + (int) result);
                break;

            case "*":
                result = calculator.Multiplication(operand1, operand2);
                System.out.println("Result of " + operand1 + " * " + operand2 + " is " + (int) result);
                break;

            case "/":
                if(operand2==0) {
                    System.out.println("Division by zero is not allowed.");
                }
                else {
                    result=calculator.Division(operand1, operand2, remainder);
                    System.out.println("Result of " + operand1 + " / " + operand2 + " is " + (int) result);
                    System.out.println("Remainder = " + (int) remainder[0]);
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}

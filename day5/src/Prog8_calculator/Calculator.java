package Prog8_calculator;

public class Calculator {
    public int Addition(int a, int b) {
        return a+b;
    }

    public int Subtraction(int a,int b) {
        return a-b;
    }

    public int Multiplication(int a,int b) {
        return a*b;
    }

    public double Division(int a,int b,double[] remainder) {
        remainder[0] = a%b;
        return a / b;
    }
}

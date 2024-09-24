package Prog2;

import java.util.Scanner;

// Account class
class Account {
    // Data members
    private String acco; // Account number
    private String name; // Account holder's name
    private double balance; // Account balance

    // Constructor to initialize account details
    public Account(String acco, String name, double initialBalance) {
        this.acco = acco;
        this.name = name;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + acco);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Current Balance: Rs. " + balance);
    }
}

// Main class to demonstrate the Account class
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Account
        Account myAccount = new Account("ACC12345", "John Doe", 1000.0);

        // Display initial account details
        myAccount.displayAccountDetails();

        // Menu for user interaction
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: Rs. ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: Rs. " + myAccount.checkBalance());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            // Display account details after each operation
            myAccount.displayAccountDetails();
        }
    }
}

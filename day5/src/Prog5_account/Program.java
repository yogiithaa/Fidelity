package Prog5_account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter account ID: ");
        int accId=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter account type: ");
        String accType=scanner.nextLine();
        System.out.print("Enter account balance: ");
        double accBalance=scanner.nextDouble();

        Account account=new Account(accId, accType, accBalance);
        System.out.println(account.GetDetails());
        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw=scanner.nextDouble();
        if (account.Withdraw(amountToWithdraw)) {
            System.out.println("New Balance: " + account.getBalance());
        }
        else {
            System.out.println("Insufficient Balance");
        }

    }
}

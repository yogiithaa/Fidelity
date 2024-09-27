package Prog5_account;

public class Account {
    private int accId;
    private String accType;
    private double accBalance;

    public int getId() {
        return accId;
    }
    public void setId(int id) {
        this.accId=accId;
    }
    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) {
        this.accType=accType;
    }
    public double getBalance() {
        return accBalance;
    }
    public void setBalance(double balance) {
        this.accBalance=accBalance;
    }
    public Account() {
    }

    public Account(int accId, String accType, double accBalance) {
        this.accId=accId;
        this.accType=accType;
        this.accBalance=accBalance;
    }


    public boolean Withdraw(double amount) {
        if (amount<=accBalance) {
            accBalance-=amount;
            return true;
        }
        else {
            return false;
        }
    }

    public String GetDetails() {
        return "Account Id: " + accId + "\nAccount Type: " + accType + "\nBalance: " + accBalance;
    }
}
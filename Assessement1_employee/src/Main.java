import java.util.Scanner;

class Employee { //base class
    public int id; //
    public String name; //
    public float BasicSalary;
    public float Bonus;
    public float NetSalary;

    public void display() {  //method fot displaying
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        if (this instanceof TempEmployee) {
        }
        else{
        System.out.println("Basic Salary: " + BasicSalary);}
        System.out.println("Bonus: " + Bonus);
        System.out.println("Net Salary: " + NetSalary);
    }
}

class PermEmployee extends Employee {  // permanent employee class
    public int pf;

    public void calcSalary() { //salary method
        NetSalary=BasicSalary-pf;
        calcBonus();
    }

    // Method to calculate bonus based on PF
    private void calcBonus() {  //bonus method
        if (pf<1000) {
            Bonus=0.10f*BasicSalary;
        } else if (pf>=1000 && pf<1500) {
            Bonus=0.115f*BasicSalary;
        } else if (pf>=1500&&pf<1800) {
            Bonus=0.12f*BasicSalary;
        } else {
            Bonus=0.15f*BasicSalary;
        }
    }
    @Override
    public void display(){
        super.display();
        System.out.println("PF: "+pf);
    }
}

class TempEmployee extends Employee {  //temporary employee class
    public int DailyWages;
    public int NoOfDays;

    public void calcSalary() {  //salary method
        NetSalary=DailyWages*NoOfDays;
        calcBonus();
    }

    private void calcBonus() {   //bonus method
        if (DailyWages<1000) {
            Bonus=0.15f*NetSalary;
        } else if (DailyWages>=1000&&DailyWages<1500) {
            Bonus=0.12f*NetSalary;
        } else if (DailyWages>=1500&&DailyWages<1750) {
            Bonus=0.11f*NetSalary;
        } else {
            Bonus=0.08f*NetSalary;
        }
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Daily Wages: "+ DailyWages);
        System.out.println("No. of Days Worked: " + NoOfDays);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please mention the employee type(Permanent/Temporary): ");
        String employeeType = scanner.nextLine();

        if (employeeType.equals("Permanent")) {

            PermEmployee permEmployee = new PermEmployee();//instance of perm class
            System.out.printf("Enter employee ID: ");
            permEmployee.id = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Enter employee name: ");
            permEmployee.name = scanner.nextLine();
            System.out.printf("Enter employee salary: ");
            permEmployee.BasicSalary = scanner.nextFloat();
            System.out.printf("Enter employee PF: ");
            permEmployee.pf = scanner.nextInt();
            permEmployee.calcSalary();

            System.out.println("Permanent Employee Details:");
            permEmployee.display();
        } else if (employeeType.equals("Temporary")) {

            TempEmployee tempEmployee = new TempEmployee();//instance of temp class
            System.out.printf("Enter employee ID: ");
            tempEmployee.id = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Enter employee name: ");
            tempEmployee.name = scanner.nextLine();
            System.out.printf("Enter employee daily wages: ");
            tempEmployee.DailyWages = scanner.nextInt();
            System.out.printf("Enter No. of days worked: ");
            tempEmployee.NoOfDays = scanner.nextInt();
            tempEmployee.calcSalary();


            System.out.println("Temporary Employee Details:");
            tempEmployee.display();
        }
    }
}

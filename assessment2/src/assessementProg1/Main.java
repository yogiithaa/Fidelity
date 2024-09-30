package assessementProg1;
import java.util.Scanner;

abstract class Insurance{
    private String insuranceNo;
    private String insuranceName;
    private Double amountCovered;

    public Insurance(String insuranceNo, String insuranceName, Double amountCovered) {//constructor
        this.insuranceNo=insuranceNo;
        this.insuranceName=insuranceName;
        this.amountCovered=amountCovered;
    }
    public String getInsuranceNo(){
        return insuranceNo;
    }
    public String getInsuranceName(){
        return insuranceName;
    }
    public Double getAmountCovered(){
        return amountCovered;
    }

    public abstract double calculatePremium();
}

class MotorInsurance extends Insurance{
    private Double idv;
    private Float depPercent;

    public MotorInsurance(String insuranceNo,String insuranceName,Double amountCovered,Float depPercent){
        super(insuranceNo,insuranceName,amountCovered);
        this.depPercent=depPercent;
        this.idv=calculateIdv(amountCovered,depPercent);
    }
    private Double calculateIdv(Double amountCovered,Float depPercent) {
        return amountCovered-(amountCovered*depPercent/100);
    }
    @Override
    public double calculatePremium(){
        return 0.03*idv;
    }
}
class LifeInsurance extends Insurance{
    private int policyTerm;
    private Float benefitPercent;

    // Constructor
    public LifeInsurance(String insuranceNo,String insuranceName,Double amountCovered,int policyTerm,Float benefitPercent){
        super(insuranceNo,insuranceName,amountCovered);
        this.policyTerm=policyTerm;
        this.benefitPercent=benefitPercent;
    }
    @Override
    public double calculatePremium(){
        return (getAmountCovered()-((getAmountCovered()*benefitPercent)/100))/policyTerm;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Insurance Number: ");
        String insuranceNo = scanner.nextLine();
        System.out.print("Insurance Name: ");
        String insuranceName=scanner.nextLine();
        System.out.print("Amount Covered: ");
        Double amountCovered=scanner.nextDouble();

        double premium = addPolicy(new Insurance[]{
                new LifeInsurance(insuranceNo, insuranceName, amountCovered, 0, 0.0f),
                new MotorInsurance(insuranceNo, insuranceName, amountCovered, 0.0f)
        }, insuranceNo, insuranceName, amountCovered);
        System.out.printf("Calculated Premium: ", premium);
        scanner.close();
    }
    public static double addPolicy(Insurance[] ins,String insuranceNo,String insuranceName,Double amountCovered){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Select");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int option = scanner.nextInt();

        double premium=0.0;

        if (option==1){
            System.out.print("Policy Term: ");
            int policyTerm=scanner.nextInt();
            System.out.print("Benefit Percent: ");
            Float benefitPercent=scanner.nextFloat();

            LifeInsurance lifeInsurance=new LifeInsurance(insuranceNo,insuranceName,amountCovered,policyTerm,benefitPercent);
            premium=lifeInsurance.calculatePremium();
        }
        else if(option==2){
            System.out.print("Depreciation Percent: ");
            Float depPercent=scanner.nextFloat();

            MotorInsurance motorInsurance=new MotorInsurance(insuranceNo,insuranceName,amountCovered,depPercent);
            premium=motorInsurance.calculatePremium();
        }
        else {
            System.out.println("Invalid option.");
        }
        return premium;
    }
}

import java.util.Scanner;

public class Prog5_VoterEligiblity {
    public static void Eligible(int age){
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age=scanner.nextInt();
        Eligible(age);
    }
}

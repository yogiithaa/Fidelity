import java.util.Scanner;

public class Prog1_calcAvg {
    public static double calcAvg(int[] numbers) {
        int sum=0;

        for(int num:numbers){
            sum+=num;
        }
        double avg=(double) sum/numbers.length;
        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n =scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter array numbers: ");
        for(int i=0;i<n;i++){
            numbers[i]=scanner.nextInt();
        }

        double avg=calcAvg(numbers);
        System.out.println("Average is "+avg);
    }


}

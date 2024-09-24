public class Prog6_sumEven {
    public static int sumEven(int[] arr){
        int sum = 0;
        for(int num: arr){
            if(num%2==0){
                sum+=num;

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,80};
        int sumEvenINT=sumEven(arr);
        System.out.println("The sum of even integers is: "+sumEvenINT);

    }
}

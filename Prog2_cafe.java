import java.util.Scanner;

public class Prog2_cafe {
    public static void main(String[] args) {
        int pizzaPrice=200;
        int puffPrice=40;
        int pepsiPrice=120;

        Scanner scanner=new Scanner(System.in);

        System.out.printf("Enter the quantity of pizzas bought: ");
        int pizzaQuantity=scanner.nextInt();
        System.out.printf("Enter the quantity of puff bought: ");
        int puffQuantity=scanner.nextInt();
        System.out.printf("Enter the quantity of pepsi bought: ");
        int pepsiQuantity=scanner.nextInt();

        int totalPizza=pizzaQuantity*pizzaPrice;
        int totalPepsi=pepsiQuantity*pepsiPrice;
        int totalPuff=puffQuantity*puffPrice;

        int grandTotal=totalPizza+totalPepsi+totalPuff;

        System.out.println("\n****Bill Details****");
        System.out.println("Total cost of "+pizzaQuantity+" Pizza(s) : "+totalPizza);
        System.out.println("Total cost of "+pepsiQuantity+" Pepsi(s) : "+totalPepsi);
        System.out.println("Total cost of "+puffQuantity+" Puff(s) : "+totalPuff);
        System.out.println("Grand Total : "+grandTotal);

    }
}

import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double price = 2.5;
        System.out.println("What flavor ice cream would you like?");
        String flavor = input.nextLine();
        System.out.println("How many scoops would you like?");
        int scoops = input.nextInt();
        double totalPrice = price * scoops;
        System.out.println("Order Summary:\nFlavor: "+flavor+"\nNumber of Scoops: "+scoops+"\nTotal: "+totalPrice);
    }
}
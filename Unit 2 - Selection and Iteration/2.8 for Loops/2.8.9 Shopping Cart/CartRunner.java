import java.util.Scanner;

public class CartRunner 
{
    public static void main(String[] args) 
    {
        // Write your code here!
        Scanner input = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int numItems = input.nextInt();
        ShoppingCart cart = new ShoppingCart();
        for (int i = 1; i < numItems+1; i++){
            System.out.print("Price of item "+i+"? ");
            cart.addItem(input.nextDouble());
        }
        System.out.print(cart);
    }
}
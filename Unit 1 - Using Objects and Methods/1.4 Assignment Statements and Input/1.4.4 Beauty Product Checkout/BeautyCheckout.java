public class BeautyCheckout
{
    public static void main(String[] args)
    {
        double bathSoap = 20.99;
        double lotion = 15.99;
        double chapstick = 5.99;
        double discount = 0.25;

        // Create a variable to store the total before the discount
        double x = bathSoap+lotion+chapstick;
        // Create a variable to store the total amount saved with the discount
        double y = x*discount;
        // Create a variable to store the total with the discount applied
        double z = x*(1-discount);
        System.out.println("Thanks for supporting Vivid Beauty!");
        System.out.println("Here is a summary of your purchase:\n");
        System.out.println("Total before discount is applied: "+x);
        System.out.println("Amount saved with discount: "+y);
        System.out.println("Total: "+z);
        // Print out a summary
    }
}
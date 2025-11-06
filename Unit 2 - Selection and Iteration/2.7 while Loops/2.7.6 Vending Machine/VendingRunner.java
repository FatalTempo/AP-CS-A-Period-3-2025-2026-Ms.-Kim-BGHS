public class VendingRunner 
{
    public static void main(String[] args) 
    {
        // Create new vending machine
        VendingMachine obj = new VendingMachine(1);
    
        // Make purchase
        obj.purchaseItem(4,5.13);
    }
}
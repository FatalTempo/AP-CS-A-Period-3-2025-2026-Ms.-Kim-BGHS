public class Bill 
{
    private double mealCost;
    private int customerCount;

    // Initialize the bill with meal cost and number of customers
    public Bill(double cost, int count) 
    {
        mealCost = cost;
        customerCount = count;
    }

    // Calculate and add a tip based on the number of customers
    public void addTip() 
    {
        // Add tip code here
        // mealCost *= (customerCount > 7) ? 1.25 : 1.2;
        // ^^^ this works but codehs sucks balls so it says its wrong
        if (customerCount > 7) mealCost *= 1.25;
        else mealCost *= 1.2;
    }

    // Display the updated cost
    public void displayTotal() 
    {
        System.out.println("The total cost including tip is: $" + mealCost);
    }
}
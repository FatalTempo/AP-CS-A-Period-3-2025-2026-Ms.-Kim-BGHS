import java.util.Scanner;
public class Salmon 
{
    public static void main(String[] args) 
    {
        // Create Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for month and capture input
        System.out.println("Enter month of year as a number: ");
        int month = input.nextInt();
        
        // Check each month individually using separate conditional statements
        // Months 1-7: Not spawning season
        if (0 < month && month < 8 || month == 12) 
            System.out.println("Not spawning season");
        else if (7 < month && month < 12) 
            System.out.println("Spawning season");
        else
            System.out.println("Invalid month.");
    }
}
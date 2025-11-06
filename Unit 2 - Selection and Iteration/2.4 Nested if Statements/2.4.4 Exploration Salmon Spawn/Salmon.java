import java.util.Scanner;

public class Salmon 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter month of year as a number: ");
        int month = input.nextInt();
        
        if (month == 0) 
        {
            System.out.println("Invalid month.");
        }
        else if (month < 8) 
        {
            System.out.println("Not spawning season");
        }
        else if (month < 12) 
        {
            System.out.println("Spawning season");
        }
        else if (month == 12) 
        {
            System.out.println("Not spawning season");
        } 
        else 
        {
            System.out.println("Invalid month.");
        }
    }
}
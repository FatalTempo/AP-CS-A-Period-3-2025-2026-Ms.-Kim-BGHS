import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);     
        
        // Get user inputs
        int height = input.nextInt();
        int age = input.nextInt();
        // Use if statements to check if user is eligible to ride
        System.out.print(height > 41 ? age < 9 ? "You need to be accompanied by an adult to ride." : "Welcome aboard!" : "Sorry, you are not eligible to ride");
    }
}
import java.util.Scanner;
public class TaffyRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting Taffy Timer...");
        System.out.print("Enter the temperature: ");
        while (input.nextInt()<270) {
            System.out.println("\nThe mixture isn't ready yet.");
            System.out.print("Enter the temperature: ");
        }
        System.out.print("Your taffy is ready for the next step!");
    }
}
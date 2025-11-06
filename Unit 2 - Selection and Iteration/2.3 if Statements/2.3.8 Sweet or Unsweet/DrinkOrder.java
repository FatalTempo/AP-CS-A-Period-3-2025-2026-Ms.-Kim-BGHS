import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want?");
        int sugars = input.nextInt();
        System.out.println("\nGreat! Here is one "+drink);
        if (sugars > 0) System.out.print(" with sugar");
        else System.out.print(" without sugar");
    }
}
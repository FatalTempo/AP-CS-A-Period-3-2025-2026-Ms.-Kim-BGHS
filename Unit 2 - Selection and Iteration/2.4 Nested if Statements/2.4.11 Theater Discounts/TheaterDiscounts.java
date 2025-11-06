import java.util.Scanner;

public class TheaterDiscounts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int dayOfWeek = scanner.nextInt();

        System.out.print("Enter the customer's age: ");
        int age = scanner.nextInt();

        getDiscount(dayOfWeek, age);
    }

    public static void getDiscount(int dayOfWeek, int age)
    {
        // Write your code here
        if (1 > dayOfWeek || dayOfWeek > 7) System.out.print("Invalid day.");
        else {
            if (dayOfWeek < 3) System.out.print("Theater is closed.");
            else {
                if (64 < age) System.out.print("Senior discount: 20% off");
                else if (age < 12) System.out.print("Child discount: 50% off");
                else if (11 < age && age < 18) System.out.print("Student discount: 15% off");
                else System.out.print("No discount.");
            }
        }
    }
}
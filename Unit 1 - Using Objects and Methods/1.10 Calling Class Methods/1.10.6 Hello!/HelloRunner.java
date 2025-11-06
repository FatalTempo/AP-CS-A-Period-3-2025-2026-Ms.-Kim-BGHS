import java.util.Scanner;

public class HelloRunner
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Write your code here:
        String name = input.next();
        Hello.english(name);
        Hello.spanish(name);
        Hello.french(name);
    }
}
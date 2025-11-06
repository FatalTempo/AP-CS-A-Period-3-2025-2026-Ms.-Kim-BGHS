import java.util.Scanner;

public class TemperatureClassifier 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        int temp = input.nextInt();

        // Write your code here
        if (temp > 30) System.out.print("Hot");
        else if (temp > 20) System.out.print("Warm");
        else if (temp > 10) System.out.print("Mild");
        else if (temp > 0) System.out.print("Cold");
        else System.out.print("Freezing");
    }
}
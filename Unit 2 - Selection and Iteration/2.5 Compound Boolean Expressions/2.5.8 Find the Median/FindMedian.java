import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask the user for three integers
        System.out.println("Enter the first integer:");
        int first = input.nextInt();
        
        System.out.println("Enter the second integer:");
        int second = input.nextInt();
        
        System.out.println("Enter the third integer:");
        int third = input.nextInt();
        
        // Call the findMedian method and print the result
        int median = findMedian(first, second, third);
        System.out.println("\nThe median is " + median);
    }

    // Method to find the median of three numbers
    public static int findMedian(int a, int b, int c)
    {
        // Implement logic to find and return the median value
        if (b < a && a < c) return a;
        if (c < a && a < b) return a;
        if (a < b && b < c) return b;
        if (c < b && b < a) return b;
        if (a < c && c < b) return c;
        if (b < c && c < a) return c;
        return a;
    }
}
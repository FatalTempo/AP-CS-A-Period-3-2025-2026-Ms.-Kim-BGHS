import java.util.Scanner;

public class TrafficEngineer
{
    public static void main(String[] args)
    {
        // Enter the onramp distance (m): 600
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the onramp distance (m): ");
        double dist = input.nextDouble();
        // Calculate the time to accelerate down onramp
        
        // Print out results
        System.out.print("With a distance of "+dist+"m, the time to accelerate down it is: "+calculateTime(3,dist)+"s");
        
    }

    // Calculates and returns the time it takes for an object to accelerate
    // a distance, given the initial velocity of the object is 0
    public static double calculateTime(double acceleration, double distance)
    {
        return Math.sqrt(2*distance/acceleration);
    }
}
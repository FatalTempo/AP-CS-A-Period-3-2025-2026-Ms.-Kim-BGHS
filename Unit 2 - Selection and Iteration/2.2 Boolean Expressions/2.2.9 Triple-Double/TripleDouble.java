import java.util.Scanner;

public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Write your code here
        System.out.println("How many points did you score?");
        int points = input.nextInt();
        System.out.println("How many rebounds did you get?");
        int rebounds = input.nextInt();
        System.out.println("How many assists did you have?");
        int assists = input.nextInt();
        System.out.println("You got 10 or more points: "+hasPoints(points));
        System.out.println("You got 10 or more rebounds: "+hasRebounds(rebounds));
        System.out.println("You got 10 or more assists: "+hasAssists(assists));
    }
    
    public static boolean hasPoints(int points) 
    {
        // Fill in the logic
        return 9 < points;
    }
    
    public static boolean hasRebounds(int rebounds) 
    {
        // Fill in the logic
        return 9 < rebounds;
    }
    
    public static boolean hasAssists(int assists) 
    {
        // Fill in the logic
        return 9 < assists;
    }
}
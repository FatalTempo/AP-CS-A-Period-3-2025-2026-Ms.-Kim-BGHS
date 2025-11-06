import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       Scanner x = new Scanner(System.in);
       System.out.println("Enter movie rating (as a decimal)");
       var y = x.nextDouble();
       x.close();
       System.out.print("Rating rounded: "+(int)(y+.5));
    }
}
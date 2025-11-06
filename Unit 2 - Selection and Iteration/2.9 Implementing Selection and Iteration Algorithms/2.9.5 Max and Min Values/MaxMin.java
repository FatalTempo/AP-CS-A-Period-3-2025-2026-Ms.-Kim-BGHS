import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        Scanner input = new Scanner(System.in);
        int n,min=Integer.MAX_VALUE,max=0;
        while (true){
            System.out.println("Enter a number or 0 to quit:");
            if ((n=input.nextInt())==0) break;
            System.out.println("Results so far:");
            System.out.println("Largest number: "+(max=Math.max(max,n)));
            System.out.println("Smallest number: "+(min=Math.min(min,n)));
        }
    }
}
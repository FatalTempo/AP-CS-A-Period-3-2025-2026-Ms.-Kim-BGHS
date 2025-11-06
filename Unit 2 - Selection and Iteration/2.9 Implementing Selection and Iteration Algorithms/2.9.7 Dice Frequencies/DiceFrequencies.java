import java.util.Scanner;

public class DiceFrequencies
{
    public static void main(String[] args)
    {
        // Get user input and call your custom method
        Scanner input = new Scanner(System.in);
        rollDice(input.nextInt());
    }
    
    public static void rollDice(int rolls)
    {
        // Complete this method
        int[] n = {0,0,0,0,0,0};
        String[] N = {"six","five","four","three","two","one"};

        while (rolls-->0) n[(int)(Math.random()*6)]++;

        for (int i = 0; i < n.length;) 
            System.out.println("Number of "+N[i]+"s: "+n[i++]);
    }
}
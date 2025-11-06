import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        System.out.println("Enter your actual amount: ");
        int amt = input.nextInt();
        boolean wentOver = amt > goal;
        boolean fellShort = amt < goal;
        boolean metGoal = amt == goal;
        System.out.println("Went over goal? "+wentOver);
        System.out.println("Fell short of goal? "+fellShort);
        System.out.println("Met goal exactly? "+metGoal);
    }
}
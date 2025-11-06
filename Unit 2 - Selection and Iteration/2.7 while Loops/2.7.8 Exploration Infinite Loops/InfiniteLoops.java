import java.util.Scanner;
public class InfiniteLoops
{
    public static void main(String[] args)
    {
        // Once you fix the infinite loop in each method,
        // call it here to test it out:
        countdownTimer();
        findNumber();
        checkPassword();
    }

    // Print out the seconds in a timer, stopping at 0 seconds
    public static void countdownTimer() 
    {
        int timeLeft = 10;

        // Fix this infinite loop by altering the code related
        // to its loop condition
        while (timeLeft >= 0) 
        {
            System.out.println("Time remaining: " + timeLeft);
            timeLeft--;
        }

        System.out.println("Countdown complete!");
    }

    public static void findNumber() 
    {
        int target = 7;
        
        // Fix this infinite loop by breaking out of it when 
        // num equals the target
        while (true) 
        {   
            // Generates a random number between 0 and 9
            int num = (int) (Math.random() * 10);
            System.out.println("Generated: " + num);
            
            // This should print when target number is found
            if (num == 7){
                System.out.println("Target number found!");
                break;
            }
        }
        
        // OTHER CODE HERE SHOULD RUN AFTER LOOP
    }

    // Ask the user for their password, exiting when correct
    public static void checkPassword() 
    {
        Scanner input = new Scanner(System.in);
        String correctPassword = "JavaRocks";
        
        // Fix this infinite loop by returning out of the method 
        // when the entered password is correct
        while (true) 
        {
            System.out.print("Enter password: ");
            String password = input.nextLine();
            
            // This should only print when the correct password is entered
            if (password.equals(correctPassword)){
                System.out.println("Access granted.");
                return;
            }
        }

        // ANY CODE DOWN HERE SHOULD NEVER RUN
    }
}
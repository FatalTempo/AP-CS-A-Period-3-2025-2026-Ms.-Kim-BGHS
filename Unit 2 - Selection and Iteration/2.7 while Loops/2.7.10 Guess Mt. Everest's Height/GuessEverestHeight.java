import java.util.Scanner;
public class GuessEverestHeight
{ 
    static final int EVEREST_HEIGHT = 8848;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.\n");
        
        // Start the guessing...
        guessTheHeight();
    }
    
    // Allow the user to keep guessing until they guess the correct height
    public static void guessTheHeight() 
    {  
        // Your code goes here!
        System.out.println("\nGuess the height:");
        if (input.nextInt()!=EVEREST_HEIGHT){
            System.out.println("That's not it!");
            guessTheHeight();
        }
        System.out.println("Right! Mt. Everest is 8,848 meters tall!");
    }
}
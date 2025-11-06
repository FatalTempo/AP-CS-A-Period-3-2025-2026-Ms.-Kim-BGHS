import java.util.Scanner;

public class TeenRunner
{
    public static void main(String[] args)
    {
        // Creates a new Teen object and print it out
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
        System.out.println(myFriend);
        
        // Ask the user to input a text message
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text:");
        String str = input.nextLine();
        // Call teenTalk method to translate the message to teen talk
        System.out.println("\nThe modified text would be:");
        System.out.println(myFriend.teenTalk(str));
    }
}
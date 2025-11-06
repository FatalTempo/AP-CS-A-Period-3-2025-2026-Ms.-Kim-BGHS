import java.util.Scanner;

public class Palindromes
{
    public static void main(String[] args)
    {
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = input.nextLine();
        
        // Check if input is a palindrome, printing a response accordingly
        if (isPalindrome(text))
        {
            System.out.println("Your word is a palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome :(");
        }
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        // Your code goes here!
        return new StringBuilder(text).reverse().toString();
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text you want to check as a palindrome.
     * @return A boolean of whether or not it is a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        // Your code goes here!
        for (int i = 0, j = text.length()-1; i < j; i++, j--)
            if (text.charAt(i)!=text.charAt(j)) return false;
        return true;
    }
}
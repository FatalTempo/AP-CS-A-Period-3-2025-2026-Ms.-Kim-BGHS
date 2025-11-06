import java.util.Scanner;

public class Mystery
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String alg3 = q(str);
        System.out.println(alg3);
    }
    
    public static String q(String string)
    {
        String newString = "";
        for (int i = string.length() - 1; i >= 0; i--)
        {
            String letter = string.substring(i, i + 1);
            newString += letter;
        }
        return newString;
    }
}
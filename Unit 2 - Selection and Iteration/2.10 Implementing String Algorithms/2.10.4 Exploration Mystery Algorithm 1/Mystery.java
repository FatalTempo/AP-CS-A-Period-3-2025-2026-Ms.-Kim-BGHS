import java.util.Scanner;

public class Mystery
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int alg1 = countUpperCases(str);
        System.out.println(alg1);
    }
    
    public static int countUpperCases(String string)
    {
        int counter = 0;
        
        for (int i = 0; i < string.length(); i++)
        {
        	char letter = string.charAt(i);
        	if (Character.isUpperCase(letter))
        	{
        		counter++;
        	}
        }
        
        return counter;
    }
}
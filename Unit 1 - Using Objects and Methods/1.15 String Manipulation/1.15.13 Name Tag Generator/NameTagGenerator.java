import java.util.Scanner;

public class NameTagGenerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String a = input.nextLine();
        System.out.print("Enter a name: ");
        String b = input.nextLine();
        displayNameTag(a);
        displayNameTag(b);
        System.out.print("Are the two names the same?: ");
        System.out.print(a.equals(b));
    }
    
    
    /* Takes in a person's name and then 
    * prints a nametag, which includes the following:
    * Name
    * Number of characters in the name
    * Last letter in the name
    */
    public static void displayNameTag(String name)
    {
        System.out.println("****************");
        System.out.println("Name: "+name);
        System.out.println("Length: "+name.length()+" characters");
        System.out.println("Last Letter: "+name.substring(name.length()-1));
        System.out.println("****************");
    }
}
import java.util.Scanner;

public class StringExplorer
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input:
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their favorite school subject:
        String subject = input.nextLine();
        
    
        String subjectLowerCase = subject.toLowerCase();
        System.out.print("Your favorite subject in lower case: ");
        System.out.println(subjectLowerCase.length());

        boolean contains = subjectLowerCase.contains("computer");
        System.out.print("Subject contains \"computer\": ");
        System.out.println(contains);
    }
}
import java.util.Scanner;

public class Intros
{
    public static void main(String[] args)
    {
        // Write your code here:
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Please enter your grade: ");
        int grade = input.nextInt();
        input.nextLine();
        System.out.print("Please enter a fun fact about yourself: ");
        String fact = input.nextLine();
        input.close();
        printIntroduction(name,grade,fact);
    }
    
    public static void printIntroduction(String name, int grade, String fact) 
    {
        System.out.println("Name: "+name+"\nGrade: "+grade+"\nFun Fact: "+fact);
    }
}
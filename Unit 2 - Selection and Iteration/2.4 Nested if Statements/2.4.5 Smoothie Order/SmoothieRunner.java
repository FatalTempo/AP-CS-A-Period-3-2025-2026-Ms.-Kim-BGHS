import java.util.Scanner;

public class SmoothieRunner 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What type of boost would you like?");
        System.out.println("1. Protein");
        System.out.println("2. Spinach");
        System.out.println("3. Ginger");
        int boostInt = input.nextInt();
        
        // Write your code here
        Smoothie smoothie = new Smoothie(boostInt==1?"protein":boostInt==2?"spinach":"ginger");
        System.out.println(smoothie.getNutrients());
        System.out.println(smoothie);
    }
}
import java.util.Scanner;

public class PhotoWallPlanner
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("What is the height of each picture?");
        int a = x.nextInt();
        int b;
        int c;
        int d;
        System.out.println("Total rows (including partial rows): "+96.0/a);
        System.out.println("Complete rows: "+96/a);
        System.out.println("Inches leftover: "+96%a);
    }
}
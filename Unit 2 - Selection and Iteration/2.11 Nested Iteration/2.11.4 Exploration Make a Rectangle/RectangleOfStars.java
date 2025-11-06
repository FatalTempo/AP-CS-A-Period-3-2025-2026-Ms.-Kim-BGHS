public class RectangleOfStars
{
    public static void main(String[] args)
    {  
       // Call makeARectangle to produce a rectangle of stars *
       makeARectangle(10,5);
    }
       
    //Makes a rectangle of stars
    public static void makeARectangle(int a, int b)
    {
        // the outer loop represents the total number of rows
       while (b-->0)
       {
           // the inner loop represents the total number of columns per row
           for (int col = 0; col < a; col++) System.out.print("* ");
           System.out.println();
       }
    }
}
public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Prints an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        // Complete this method with nested loops
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
        
    }
}
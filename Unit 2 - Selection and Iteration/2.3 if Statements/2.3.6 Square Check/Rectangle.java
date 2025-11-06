public class Rectangle 
{
    // Instance variables
    private int width;
    private int height;

    // Constructor to initialize the rectangle's dimensions
    public Rectangle(int w, int h) 
    {
        width = w;
        height = h;
    }

    // Method to check if the rectangle is a square
    public void isSquare() 
    {
        // Complete this method
        if (width == height) System.out.println("This rectangle is a square.");
        else System.out.println("This rectangle is not a square.");
    }
}
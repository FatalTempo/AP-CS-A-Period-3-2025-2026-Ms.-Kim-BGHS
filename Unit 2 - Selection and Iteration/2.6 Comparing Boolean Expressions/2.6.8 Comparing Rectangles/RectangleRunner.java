public class RectangleRunner 
{
    public static void main(String[] args) 
    {
        // 1. Create two separate rectangle objects with same attributes
        Rectangle Rect1 = new Rectangle(1,1);
        Rectangle Rect2 = new Rectangle(1,1);
        // 2. Use == to see if their references are the same and print result
        System.out.println(Rect1==Rect2);
        
        // 3. Print out each rectangle's individual reference
        System.out.println(Rect1);
        System.out.println(Rect2);
        // 4. Use custom equals method to check to see if they are equivalent
        System.out.println(Rect1.equals(Rect2));
        
        // 5. Create a third rectangle variable and set equal to second rectangle
        Rectangle Rect3 = Rect2;

        // 6. Check to see if 2nd and 3rd rectangles have same references and print
        System.out.println(Rect2 == Rect3);
        
        // 7. Print out 2nd and 3rd rectangle individual references
        System.out.println(Rect2);
        System.out.println(Rect3);
    }
}
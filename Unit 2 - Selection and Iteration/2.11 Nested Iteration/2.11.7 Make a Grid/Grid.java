public class Grid 
{
    private int size;
    
    public Grid(int gridSize)
    {
        size = gridSize;
    }
    
    // Prints a grid of size `size`
    public void printGrid()
    {
        // Complete this method
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print("("+i+","+j+")");
            System.out.println();
        }
        
    }
    
    public String toString()
    {
        return "Grid with a size of " + size;
    }
}
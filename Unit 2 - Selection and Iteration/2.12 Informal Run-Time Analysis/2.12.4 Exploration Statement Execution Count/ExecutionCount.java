public class ExecutionCount
{
    public static void main(String[] args)
    {
        int j = -6;
        while (j <= 5)
        {
            for (int k = 4; k > 0; k-=2)
            {
                System.out.println("*");
            }
            System.out.println();
            j+=2;
        }
    }
}
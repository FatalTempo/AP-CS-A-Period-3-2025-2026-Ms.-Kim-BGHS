public class ForLoops 
{
    public static void main(String[] args) 
    {
        // Use this space to call each method after
        // you predict its output in Investigate.txt
        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
    }

    public static void loop1()
    {
        for (int i = 1; i < 6; i++) 
        {
            System.out.println(i);
        }
    }

    public static void loop2()
    {
        for (int i = 5; i > 0; i--) 
        {
            System.out.println(i);
        }
    }

    public static void loop3()
    {
        for (int i = 2; i <= 10; i += 2) 
        {
            System.out.println(i);
        }
    }

    public static void loop4()
    {
        for (int i = 3; i <= 12; i += 3) 
        {
            System.out.println(i);
        }
    }

    public static void loop5()
    {
        for (int i = 100; i >= 1; i /= 2) 
        {
            System.out.println(i);
        }
    }
}
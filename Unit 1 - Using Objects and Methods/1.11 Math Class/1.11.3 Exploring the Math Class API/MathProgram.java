public class MathProgram
{
    public static void main(String[] args)
    {
        double power = Math.pow(5, 3);
        System.out.print("5^3 = ");
        System.out.println(power);

        double absolute = Math.abs(-20);
        System.out.print("Absolute value of -20 = ");
        System.out.println(absolute);

        double square = Math.sqrt(144);
        System.out.print("Square root of 144 = ");
        System.out.println(square);

        int random = (int)(Math.random() * 11) + 10;
        System.out.print("Random int between 10 and 20 = ");
        System.out.println(random);

        /** 
        * Repeat the above structure for 4 other methods
        * from the Math class -- using it correctly and
        * then printing the value with a string that
        * describes what it is doing.
        */

        int max = Math.max(1,2);
        System.out.print("The bigger int value of (1,2) is = ");
        System.out.println(max);

        int min = Math.max(1,2);
        System.out.print("The smaller int value of (1,2) is = ");
        System.out.println(min);

        double rad = Math.toRadians(90);
        System.out.print("90 degrees in radians is = ");
        System.out.println(rad);

        double sin = Math.sin(rad);
        System.out.print("The sin of 1.57 radians is = ");
        System.out.println(sin);
    }
}
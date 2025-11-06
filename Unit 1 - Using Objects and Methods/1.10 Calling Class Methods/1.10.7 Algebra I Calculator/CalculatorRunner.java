public class CalculatorRunner 
{
    public static void main(String[] args) 
    {
        System.out.println("Slope: "+Calculator.slope(1,1,5,10));
        System.out.println("Distance: "+Calculator.distance(2,3,6,7));
        System.out.println("Roots: "+Calculator.quadRoots(1,2,-8));
    }
}
public class CircleRunner 
{
	public static void main(String[] args) 
	{
        // Create a new circle object
		Circle circ = new Circle(10);

        // Give it a new radius
        circ.setRadius(5);
        
        // Print out circle string
        System.out.println(circ);

        // Print out other circle measurements
        System.out.println("The diameter is " + circ.getDiameter());
        System.out.println("The perimeter is " + circ.getPerimeter());
	}
}
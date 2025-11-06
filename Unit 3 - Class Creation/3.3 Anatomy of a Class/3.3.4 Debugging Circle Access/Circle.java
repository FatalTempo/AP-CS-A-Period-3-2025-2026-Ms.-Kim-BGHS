public class Circle 
{
    // Attributes
	private double radius;

    // Constructor
	public Circle(double myRadius) 
	{
		radius = myRadius;
	}

    // // Methods // //
    
    public void setRadius(int myRadius)
    {
        radius = myRadius;
    }

	public double getDiameter() 
	{
		return radius * 2;
	}

	public double getRadius() 
	{
		return radius;
	}

	public double getPerimeter() 
	{
		return Math.PI * getDiameter();
	}

	public String toString() 
	{
		return "Circle with a radius of " + radius;
	}
}
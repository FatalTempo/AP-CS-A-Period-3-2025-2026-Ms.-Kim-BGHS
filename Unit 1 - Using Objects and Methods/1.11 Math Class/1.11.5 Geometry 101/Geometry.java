public class Geometry
{
    // Calculates and returns the area of a circle with the input radius
    public static double getCircleArea(double radius)
    {
        return Math.PI * Math.pow(radius,2);
    }
    
    // Calculates and returns the volume of a sphere with the input radius
    public static double getSphereVolume(double radius)
    {
        return 4*Math.PI/3*Math.pow(radius,3);
    }
}
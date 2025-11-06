public class DataPointRunner
{
    public static void main(String[] args)
    {
        DataPoint point1 = new DataPoint(10, 5);
        point1.set(4, 5);
        System.out.println(point1);

        DataPoint point2 = new DataPoint(1, 1);
        System.out.println(point2.distanceFrom(0,0));
        
        DataPoint point3 = new DataPoint();
        System.out.println(point3);
    }
}
public class BottleRunner 
{
    public static void main(String[] args) 
    {
        // Create a water bottle object and use the instance
        // methods and a print statement to match the desired
        // output:
        WaterBottle bottle = new WaterBottle(1,.7);
        System.out.println(bottle);
        bottle.drink(.7);
        bottle.refill();
        bottle.drink(.2);
        bottle.drink(.2);
        System.out.println(bottle);
    }
}
public class BalloonRunner 
{
    public static void main(String[] args) 
    {
        // Create two balloon objects
        Balloon balloon1 = new Balloon(1,"red");
        Balloon balloon2 = new Balloon(2,"blu");
        
        // Print out initial information of each balloon
        System.out.println(balloon1.toString());
        System.out.println(balloon2.toString());
        // Inflate first balloon
        balloon1.inflate(10);
        // Change the color of second balloon
        balloon2.changeColor("silver");

        // Print out final information of each balloon
        System.out.println(balloon1.toString());
        System.out.println(balloon2.toString());
                
    }
}
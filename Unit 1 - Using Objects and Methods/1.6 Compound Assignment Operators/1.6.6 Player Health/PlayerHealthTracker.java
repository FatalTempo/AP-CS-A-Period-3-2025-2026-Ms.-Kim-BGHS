public class PlayerHealthTracker
{
    public static void x(String m,int n){System.out.println("Health after "+m+n);}
    public static void main(String[] args)
    {
        int playerHealth = 100;
        x("eating hearty hazelnuts: ",playerHealth+=20);
        x("getting burned by the fire: ",playerHealth-=15);
        x("finding healing ointment: ",playerHealth+=10);
        x("getting poked by a stick: ",playerHealth/=2);
        x("taking super power potion: ",playerHealth*=3);
    }
}
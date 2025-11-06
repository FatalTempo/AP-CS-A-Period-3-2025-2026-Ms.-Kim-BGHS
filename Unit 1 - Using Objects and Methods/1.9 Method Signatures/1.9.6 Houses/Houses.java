public class Houses
{
    public static void main(String[] args)
    {
        // Create two different houses separated by a blank line
        buildRoof();
        buildLevel();
        buildLevel();
        buildSidewalk();
        System.out.println();
        buildRoof();
        buildLevel();
        buildLevel();
        buildLevel();
        buildLevel();
        buildSidewalk();
    }

    // Define your methods here
    public static void buildRoof() {
        System.out.println("   +\n  +++\n +++++\n+++++++");
    }

    public static void buildLevel() {
        System.out.println("|     |\n|  #  |\n|     |\n+++++++");
    }

    public static void buildSidewalk() {
        System.out.println("   =\n   =\n====");
    }
}
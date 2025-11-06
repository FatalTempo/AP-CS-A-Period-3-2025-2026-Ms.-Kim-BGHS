public class SimpleGreeter 
{
    public static void main(String[] args) 
    {
        // Create people
        String person1 = "Maria";
        String person2 = "Julian";

        // Greet first person
        greetEnglish(person1);

        // Introduce two people
        introduce(person1, person2);
    }
    /**
     * Converts a distance from kilometers to miles.
     * Preconditions: input must be a double representing real kilometers.
     * Postconditions: output is a double number representing converted miles.
     * @param kilometers the distance in kilometers
     * @return the equivalent distance in miles
     */
    public static void greetEnglish(String name) 
    {
        System.out.print("Hello ");
        System.out.println(name);
    }
    /**
     * Converts a distance from kilometers to miles.
     * Preconditions: input must be a double representing real kilometers.
     * Postconditions: output is a double number representing converted miles.
     * @param kilometers the distance in kilometers
     * @param kilometers the distance in kilometers
     * @return the equivalent distance in miles
     */
    public static void introduce(String name1, String name2) 
    {
        System.out.print(name1);
        System.out.print(", meet ");
        System.out.println(name2);
    }
}
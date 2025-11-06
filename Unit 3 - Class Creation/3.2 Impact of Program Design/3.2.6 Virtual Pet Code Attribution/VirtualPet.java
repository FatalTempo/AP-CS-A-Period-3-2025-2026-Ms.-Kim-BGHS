public class VirtualPet 
{
    private String name;
    private int hunger;
    private int happiness;
    private int energy;

    // Constructor to initialize the pet's attributes
    public VirtualPet(String pName) 
    {
        name = pName;
        hunger = (int)(Math.random() * 6);  // Random value between 0 and 5
        happiness = (int)(Math.random() * 6) + 5;// Random value between 5 and 10
        energy = (int)(Math.random() * 6) + 5; // Random value between 5 and 10
    }

    // Method to feed the pet
    public void feed() 
    {
        hunger -= (int)(Math.random() * 3) + 1; // Random value between 1 and 3
        if (hunger < 0) 
        {
            hunger = 0;
        }
        System.out.println(name + " is fed.");
        checkStatus();
    }

    // Method to play with the pet
    public void play() 
    {
        happiness += (int)(Math.random() * 3) + 1;  // Random value between 1 and 3
        energy -= (int)(Math.random() * 2) + 1;  // Random value between 1 and 2
        if (energy < 0) 
        {
            energy = 0;
        }
        if (happiness > 10)
        {
            happiness = 10;
        }
        System.out.println(name + " is playing.");
        checkStatus();
    }

    // Method to make the pet fall asleep
    public void sleep() 
    {
        energy += (int)(Math.random() * 3) + 2;  // Random value between 2 and 4
        if (energy > 10) 
        {
            energy = 10;
        }
        System.out.println(name + " is sleeping.");
        checkStatus();
    }
    
    public void passTime()
    {
        hunger += (int)(Math.random() * 3);  // Hunger increases by a random value between 0 and 2
        happiness -= (int)(Math.random() * 3);  // Happiness decreases by a random value between 0 and 2
        energy -= (int)(Math.random() * 3);  // Energy decreases by a random value between 0 and 2
    }
    
    public boolean checkRunAway()
    {
        if (hunger >= 10 || happiness <= 0 || energy <= 0) 
        {
            System.out.println("Oh no! " + name + " has run away...");
            return true;
        }
        else
        {
            return false;
        }
    }

    // Method to check and print the current status of the pet
    public void checkStatus() 
    {
        System.out.println("Status:");
        System.out.println("Hunger level: " + hunger);
        System.out.println("Happiness level: " + happiness);
        System.out.println("Energy level: " + energy);
        System.out.println("**********************");
    }
}
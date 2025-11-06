// Author comment:
// Written by Karel the Dog
// Feel free to adapt and use! Just give me credit :)

import java.util.Scanner;

public class VirtualPetSimulator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Get the name of the virtual pet from the user
        System.out.print("Enter a name for your virtual pet: ");
        String petName = input.nextLine();

        VirtualPet pet = new VirtualPet(petName);
        System.out.println("Welcome to the Virtual Pet Simulator, " + petName + "!");

        // Main game loop
        while (true) 
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Exit");
            
            int choice = input.nextInt();

            if (choice == 1)
            {
                pet.feed();
            }
            else if (choice == 2)
            {    
                pet.play();
            }
            else if (choice == 3)
            {
                pet.sleep();
            }
            else if (choice == 4)
            {
                System.out.println("Exiting program. Goodbye!");
                return;
            }
            else
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }    
            
            // Time passes      
            pet.passTime();
            
            // Check if the pet has run away
            if (pet.checkRunAway())
            {
                return;
            }
        }
    }
}
import java.util.Scanner;

public class DonationCollection
{
    public static void main(String[] args)
    {
        // Collect leftover cans to be donated
        int leftoverCans = collectDonations();

        System.out.println("There are " + leftoverCans + " leftover cans that can be donated.");
    }

    // Collects total cans from all crates and returns the number of leftovers
    // that do not fit into complete boxes
    public static int collectDonations()
    {
        Scanner input = new Scanner(System.in);

        // Constants for crate deliveries and box capacity
        final int NUM_CRATES = input.nextInt();
        final int NUM_CANS_PER_BOX = 15;

        int totalCans = 0;

        // Collect cans from each crate and accumulate total
        for (int i = 1; i <= NUM_CRATES; i++)
        {
            System.out.println("Number of cans in crate #" + i + ":");
            int cans = input.nextInt();
            // Add cans from crate to total collection
            totalCans += cans;
        }

        // Calculate only the leftover cans after boxing
        int leftovers = totalCans % NUM_CANS_PER_BOX;

        return leftovers;
    }
}
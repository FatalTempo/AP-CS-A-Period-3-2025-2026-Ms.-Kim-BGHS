public class LibraryRules 
{
    public static void main(String[] args) 
    {
        // Variables for testing
        boolean hasLibraryCard = true;
        int booksCheckedOut = 5;
        boolean hasUnpaidFines = false;
        boolean isQuiet = true;
        boolean isStudent = true;

        // Snippet 1: Library card and overdue books
        if (hasLibraryCard && booksCheckedOut < 10)
            System.out.println("You can check out new books.");
        // Snippet 2: Checking fines or library environment
        if (hasUnpaidFines || !isQuiet)
            System.out.println("Please visit the front desk.");
        // Snippet 3: If not a student or does not have a library card or has unpaid fines
        if (!isStudent || !hasLibraryCard || hasUnpaidFines)
            System.out.println("You don't have access to the study rooms.");
    }
}
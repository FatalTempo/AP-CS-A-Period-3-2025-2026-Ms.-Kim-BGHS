public class Teen 
{
    private String firstName;
    private String lastName;
    private int grade;

    // Constructor
    public Teen(String theFirstName, String theLastName, int theGrade)
    {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
    }
    
    // Replaces all '.' and '!' with '!!'
    public String teenTalk(String text)
    {
        // Complete this method
        return text.replaceAll("[.!]","!!");
    }
    
    // toString method to print out the state of teen object
    public String toString()
    {
        return firstName + " " + lastName + ", grade " + grade + ", is texting...\n";
    }
}
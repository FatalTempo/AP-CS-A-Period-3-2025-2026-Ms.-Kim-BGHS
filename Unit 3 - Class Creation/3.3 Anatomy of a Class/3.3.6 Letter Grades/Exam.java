public class Exam
{
    // Create instance variables for score and letterGrade:
    private int score;
    private String letterGrade;
    
    // Constructor: Sets the score and updates the letter grade.
    public Exam(int initialScore)
    {
        score = initialScore;
        // Update the letter grade based on the score
        updateLetterGrade();
    }
    
    /* 
    * Private helper method that updates letterGrade based on
    * the following score brackets:
    * score 90 - 100: A
    * score 80 - 89: B
    * score 70 - 79: C
    * score 60 - 69: D
    * score 0 - 59: F
    */
    private void updateLetterGrade()
    {
        // Complete this method
        if (score > 89) letterGrade = "A";
        else if (score > 79) letterGrade = "B";
        else if (score > 69) letterGrade = "C";
        else if (score > 59) letterGrade = "D";
        else letterGrade = "F";
    }
    
    // Method that returns score value
    public int getScore()
    {
        // Complete this method
        return score;
    }
    
    // Method that returns letter grade
    public String getLetterGrade()
    {
        // Complete this method
        return letterGrade;
    }
    
    // Updates the score and then recalculates the letter grade.
    public void retakeExam(int newScore)
    {
        // Complete this method
        score = newScore;
        updateLetterGrade();
    }
    
    // Returns a string representation of the exam details.
    public String toString()
    {
        return "Score: " + score + ", Grade: " + letterGrade;
    }
}
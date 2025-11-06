public class HomeworkTime
{
    public static void main(String[] args)
    {
        int hours = 2, minutes = 30, seconds = 45;
        
        int totalSeconds = hours * 3600 + minutes * 60;
        totalSeconds += seconds;
        // Add your code here
        System.out.println(totalSeconds);
    }
}
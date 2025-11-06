public class School
{
    public static void determineClassmates(Student one, Student two)
    {
        if (one.getName()==two.getName()) System.out.println("Same Student");
        else if (one.getTeacher().equals(two.getTeacher())) System.out.println("Same Class");
        else System.out.println("Different Class");
    }
}
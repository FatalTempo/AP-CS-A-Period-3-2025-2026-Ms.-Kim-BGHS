public class SchoolRunner
{
    public static void main(String[] args)
    {
        Teacher mathTeacher = new Teacher("Mr. Smith", "Math");
        Teacher scienceTeacher = new Teacher("Ms. Johnson", "Science");

        Student student1 = new Student("Alice", mathTeacher);
        Student student2 = new Student("Bob", mathTeacher);
        Student student3 = new Student("Charlie", scienceTeacher);
        Student student4 = student1;

        // Call determineClassmates with different student pairs
        School.determineClassmates(student1, student2);
        School.determineClassmates(student1, student3);
        School.determineClassmates(student1, student4);
    }
}
public class Student
{
    private String name;
    private Teacher teacher;

    public Student(String studentName, Teacher studentTeacher)
    {
        name = studentName;
        teacher = new Teacher(studentTeacher.getName(), studentTeacher.getSubject());
    }

    public String getName()
    {
        return name;
    }

    public Teacher getTeacher()
    {
        return teacher;
    }
}
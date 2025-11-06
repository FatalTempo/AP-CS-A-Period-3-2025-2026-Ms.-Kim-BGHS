public class Teacher
{
    private String name;
    private String subject;

    public Teacher(String teacherName, String teacherSubject)
    {
        name = teacherName;
        subject = teacherSubject;
    }

    public boolean equals(Teacher other)
    {
        return other != null &&
            name.equals(other.getName()) &&
            subject.equals(other.getSubject());
    }

    public String getName()
    {
        return name;
    }

    public String getSubject()
    {
        return subject;
    }
}
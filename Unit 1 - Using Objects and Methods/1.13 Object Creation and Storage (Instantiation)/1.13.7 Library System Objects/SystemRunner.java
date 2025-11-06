public class SystemRunner
{
    public static void main(String[] args)
    {
        // Create a library, book, and member object:
        Library library = new Library("Adrian","over there",67);
        Book book = new Book("Quarter Haircut","Enrique",41);
        Member member = new Member("Steven",69,true);
        // Print out each object:
        System.out.println(library);
        System.out.println(book);
        System.out.println(member);
    }
}
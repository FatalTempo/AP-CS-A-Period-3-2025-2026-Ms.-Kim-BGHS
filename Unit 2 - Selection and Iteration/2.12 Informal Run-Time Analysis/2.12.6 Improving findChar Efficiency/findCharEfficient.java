public class findCharEfficient
{
    public static void main(String[] args)
    {
        // Use this to test your algorithm
        String word = "This is a sentence";
        String key = "a";
        findChar(word, key);
    }
    
    public static void findChar(String str, String key)
    {
        // Write a more efficient version of the findChar method
        System.out.print(str.indexOf(key)!=-1?"Found!":"");
    }
}
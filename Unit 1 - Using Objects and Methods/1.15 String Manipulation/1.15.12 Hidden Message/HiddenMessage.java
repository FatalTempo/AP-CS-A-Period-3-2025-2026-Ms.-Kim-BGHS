public class HiddenMessage
{
    public static void main(String[] args)
    {
        String quote1 = "Coding like poetry";
        String quote2 = "should be short";
        String quote3 = "and concise.";
        String author = "Santosh Kalwar";
        //Write your code here!
        System.out.print(author.substring(9,11)+author.substring(1,3)+quote1.substring(6,7)+author.substring(3,4)+quote2.substring(3,4)+author.substring(13)+quote1.substring(3,6));
    }
}
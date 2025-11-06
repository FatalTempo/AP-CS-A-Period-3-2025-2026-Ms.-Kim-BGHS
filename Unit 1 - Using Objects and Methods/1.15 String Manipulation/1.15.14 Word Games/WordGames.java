public class WordGames
{
    
    public static String scramble(String word)
    {
        // switch first half
        // and second half
      return word.substring(word.length()/2)+word.substring(0,word.length()/2);
    }
    
    
    public static String bananaSplit(String word, int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
       return word.substring(0,insertIdx) + insertText + word.substring(insertIdx);
    }
    
    
    public static String bananaSplit(String word, String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int i = word.indexOf(insertChar);
        return word.substring(0,i) + insertText + word.substring(i);
    }

    
}
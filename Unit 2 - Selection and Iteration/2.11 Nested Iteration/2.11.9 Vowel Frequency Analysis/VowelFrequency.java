public class VowelFrequency
{
    public static void main(String[] args)
    {
        String sentence = "The most dangerous phrase in"
                + " the language is, 'We've always done"
                + " it this way.' - Grace Hopper";
        countVowels(sentence);
    }
    
    // Prints the number of each vowel in `sentence`
    public static void countVowels(String sentence)
    {
        // Complete this method
        String vowels = "aeiou";
        for (char v : vowels.toCharArray()) {
            int i = 0;
            for (char c : sentence.toCharArray()) if (c==v) i++;
            System.out.println(v+" : "+i);
        }
    }
}
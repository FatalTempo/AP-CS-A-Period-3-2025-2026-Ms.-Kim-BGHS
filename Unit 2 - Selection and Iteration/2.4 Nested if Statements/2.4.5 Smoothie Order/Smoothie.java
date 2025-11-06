public class Smoothie 
{
    private String boost;

    public Smoothie(String smoothieBoost) 
    {
        // Convert boost to lowercase to ensure case-insensitive comparisons
        boost = smoothieBoost.toLowerCase();
    }
    
    /**
     * Determines the nutritional benefits of the smoothie based on the boost ingredient.
     * Returns a string describing the additional nutrients provided.
     */
    public String getNutrients()
    {
        if (boost.equals("spinach"))
        {
            return "Your smoothie has extra vitamin A, vitamin B, and fiber!";
        } 
        else if (boost.equals("protein"))
        {
            return "Your smoothie has extra protein!";
        } 
        else // ginger boost
        {
            return "Your smoothie improves digestive health!";  
        }
    }
    
    public String toString()
    {
        return "smoothie with a boost of " + boost;
    }
}
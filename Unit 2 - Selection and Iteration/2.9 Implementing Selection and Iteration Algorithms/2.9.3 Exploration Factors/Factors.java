public class Factors 
{
    /**
     * This method checks to see if one number is a factor of another
     * 
     * @param number The base input number
     * @param factor The number to be checked if a factor
     * @return A boolean regarding if it is a factor
     */
    public static boolean checkFactors(int number, int factor)
    {
        // While number is still greater than factor, keep subtracting
        // the factor value
        return number%factor==0;
    }
}
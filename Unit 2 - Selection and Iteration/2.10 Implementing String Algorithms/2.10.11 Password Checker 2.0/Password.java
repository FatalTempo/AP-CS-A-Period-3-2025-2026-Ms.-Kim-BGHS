import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Add your test code here
        System.out.print(passwordCheck(new Scanner(System.in).nextLine()));
    }
    
    /* Returns true if the password meets the criteria:
    * at least 12 characters
    * at least 1 number
    * at least 1 letter
    * at least 1 special character */
    public static boolean passwordCheck(String password)
    {
        // Complete this method
        return password.matches("^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&*()\\-_=+|\\[\\]{};:/?.>]).{12,}$");
    }
}
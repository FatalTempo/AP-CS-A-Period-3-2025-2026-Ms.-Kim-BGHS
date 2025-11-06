public class Logger 
{
    // Adds an info message to the input log
    public static String logInfo(String log, String message) 
    {
        log += "\n[INFO]: " + message;
        return log;
    }

    // Adds a warning message to the input log
    public static String logWarning(String log, String message) 
    {
        log += "\n[WARNING]: " + message;
        return log;
    }

    // Adds an error message to the input log
    public static String logError(String log, String message) 
    {
        log += "\n[ERROR]: " + message;
        return log;
    }
}
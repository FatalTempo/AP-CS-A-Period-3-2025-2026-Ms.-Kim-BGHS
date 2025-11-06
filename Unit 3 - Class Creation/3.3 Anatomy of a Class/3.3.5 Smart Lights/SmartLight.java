public class SmartLight
{
    // Instance variable to store the light's on/off state
    private boolean isOn;
    
    // Instance variable to store the brightness level (expected range: 0-100)
    private int brightness;
    
    // Instance variable to store the color of the light
    private String color;
    
    // Constructor initializes the SmartLight with a given color and brightness.
    // The light is off by default.
    public SmartLight(String initialColor, int initialBrightness)
    {
        isOn = false; // Light is off when created
        color = initialColor; // Set the initial color
        brightness = validateBrightness(initialBrightness); // Validate and set the initial brightness
    }

    // Validates the brightness value. If the provided value is 
    // within the range 0-100, it returns that value. Otherwise, 
    // it returns the current brightness.
    private int validateBrightness(int value)
    {
        if (value >= 0 && value <= 100)
        {   
            return value;
        }
        else
        {
            return brightness;
        }
    }
    
    // Turns the smart light on by setting isOn to true.
    public void turnOn()
    {
        isOn = true;
    }
    
    // Turns the smart light off by setting isOn to false.
    public void turnOff()
    {
        isOn = false;
    }

    // Returns the current on/off state of the smart light.
    public boolean getIsOn()
    {
        return isOn;
    }
    
    // Returns the current brightness of the smart light.
    public int getBrightness()
    {
        return brightness;
    }
    
    // Returns the current color of the smart light.
    public String getColor()
    {
        return color;
    }
    
    // Sets the brightness to a new value after validating it.
    public void setBrightness(int newBrightness)
    {
        brightness = validateBrightness(newBrightness);
    }
    
    // Sets the color of the smart light.
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
    // Returns a string representation of the smart light's current state.
    public String toString()
    {
        return "SmartLight [On: " + isOn + ", Brightness: " + brightness + ", Color: " + color + "]";
    }
}
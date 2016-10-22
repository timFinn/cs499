/*
 * This is an object used to contain degrees, minutes, and seconds.
 * It will allow for easier conversions between DMS and decimal-degrees.
 * 
 */
package Model;

/**
 *
 * @author Evan McGraw
 */

// Object to hold degrees, minutes, and seconds for a star or other cellestial object.
public class DMSObject {
    // doubles for each field
    public double degrees;
    public double minutes;
    public double seconds;
    public char direction;
    
    // retrieves the degrees
    public double getDegrees() {
        return degrees;
    }
    
    // retrieves the minutes
    public double getMinutes() {
        return minutes;
    }
    
    // retrieves the seconds
    public double getSeconds() {
        return seconds;
    }
}



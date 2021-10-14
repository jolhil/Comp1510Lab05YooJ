/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Represent the Concept of Cone.
 * @author Junsang(Jason) Yoo
 * @version 2021
 *
 */

public class Cone {
    /** Constant value of three for formula.*/
    private final double three = 3.0;
    
    /** Radius.*/
    private double radius;
    
    /** Height.*/
    private double height;
    
    /** Constructor sets the radius and height of the cone.
     * @param r as a double.
     * @param h as a double. */
    public Cone(double r, double h) {
        radius = r;
        height = h;
    }
    
    /** Returns the radius value of the cone as a double.
     * @return radius as a double.*/
    public double getRadius() {
        return radius;
    }
    
    /** Returns the height value of the cone as a double.
     * @return height as a double.*/
    public double getHeight() {
        return height;
    }
    
    /** Sets the radius value to the specified value.
     * @param newR as a double.*/
    public void setRadius(double newR) {
        radius = newR;
    }
    
    /** Sets the height value to the specified value.
     * @param newH as a double.*/
    public void setHeight(double newH) {
        height = newH;
    }
    
    /** Calculate the volume of the cone and return the result.
     * @return volume as a double.*/
    public double volume() {
        double volume = 1 / three * Math.PI * Math.pow(radius, 2) * height;
        
        return volume;
    }
    
    /** Calculate the slant height of the cone and return the result.
     * @return slantHeight as a double.*/
    public double slantHeight() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) 
                + Math.pow(height, 2));
        
        return slantHeight;
    }
    
    /** Calculate the surface area of the cone and return the result.
     * @return surfaceArea as a double.*/
    public double surfaceArea() {
        double surfaceArea = Math.PI * Math.pow(radius, 2) 
                + Math.PI * radius * slantHeight();
        
        return surfaceArea;
    }
    
    /** Returns a string composed of the concatenation of the information
     * in the cone.
     * @return result as a string.*/
    public String toString() {
        String result = "The volume of the cone is" + volume()
                + "\n The slant height of the cone is " + slantHeight()
                + "\n The surface area of the cone is " + surfaceArea();
        
        return result;
    }
    
}

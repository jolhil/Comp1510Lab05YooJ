/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 *  Represent a Sphere concept.
 * 
 * @author Junsagn(Jason)Yoo
 * @version 2021
 */
public class Sphere {
    /** Constant value three for formula.*/
    public final int three = 3;
    
    /** Constant value four for formula.*/
    public final int four = 4;
    
    /** X-coordinate.*/
    private double x;
    
    /** Y-coordinate.*/
    private double y;
    
    /** Z-coordinate.*/
    private double z;
    
    /** Radius.*/
    private double radius;
    
    /**
     * Constructor sets the x, y, z coordinate and radius value of the sphere.
     * @param xValue as a double.
     * @param yValue as a double.
     * @param zValue as a double.
     * @param radiusValue as a double.
     * */
    public Sphere(double xValue, double yValue, 
            double zValue, double radiusValue) {
        x = xValue;
        y = yValue;
        z = zValue;
        radius = radiusValue;
    }
    
    /** Sets the X-coordinate value to the specified value.
     * @param newX as a double.*/
    public void setX(double newX) {
        this.x = newX;
    }
    
    /** Sets the Y-coordinate value to the specified value.
     * @param newY as a double.*/
    public void setY(double newY) {
        this.y = newY;
    }
    
    /** Sets the Z-coordinate value to the specified value.
     * @param newZ as a double.*/
    public void setZ(double newZ) {
        this.z = newZ;
    }
    
    /** Sets the radius value to the specified value.
     * @param newRadius as a double.*/
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    
    /** Returns the X-coordinate value as a double.
     * @return x as a double.*/
    public double getX() {
        return x;
    }
    
    /** Returns the Y-coordinate value as a double.
     * @return y as a double.*/
    public double getY() {
        return y;
    }
    
    /** Returns the Z-coordinate value as a double.
     * @return z as a double.*/
    public double getZ() {
        return z;
    }
    
    /** Returns the radius value as a double.
     * @return radius as a double.*/
    public double getRadius() {
        return radius;
    }
    
    /** Calculate the surface area of the sphere and returns the result.
     * @return surfaceArea as a double.*/
    public double surfaceArea() {
        double surfaceArea = four * Math.PI * Math.pow(radius, 2);
        
        return surfaceArea;
    }
    
    /** Calculate the volume of the sphere and returns the result.
     * @return volume as a double.*/
    public double volume() {
        double volume = four / three * Math.PI * Math.pow(radius, three);
        
        return volume;
    }
    
    /** Returns a string representation of the sphere information.
     * @return toString description.*/
    public String toString() {
        String result = "The surface area of the sphere is " 
                + Double.toString(surfaceArea()) 
                + "\nThe volume of the sphere is " 
                + Double.toString(volume()); 
        
        return result;
    }
}

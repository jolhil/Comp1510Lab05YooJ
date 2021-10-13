/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Represent the cube concept.
 * 
 * @author Junsang(Jason)Yoo
 * @version 2021
 *
 */
public class Cube {
    
    /** Constant value of three for formula.*/
    private final int three = 3;
    
    /** X-coordinate.*/
    private double xCoordinate;
    
    /** Y-coordinate.*/
    private double yCoordinate;
    
    /** Z-coordinate.*/
    private double zCoordinate;
    
    /** Edge length.*/
    private double edgeLength;
    
    /**
     * Constructor sets the x, y, and z coordinate and edge length.
     * @param x as a double.
     * @param y as a double.
     * @param z as a double.
     * @param eL as a double.
     * */
    public Cube(double x, double y, double z, double eL) {
        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
        edgeLength = eL;
    }
    
    /** Returns the x-coordinate as a double.
     * @return xCoordinate as a double.*/
    public double getX() {
        return xCoordinate;
    }
    
    /** Returns the y-coordinate as a double.
     * @return yCoordinate as a double.*/
    public double getY() {
        return yCoordinate;
    }
    
    /** Returns the z-coordinate as a double.
     * @return zCoordinate as a double.*/
    public double getZ() {
        return zCoordinate;
    }
    
    /** Returns the edge length as a double.
     * @return edgeLength as a double. */
    public double getEdgeLength() {
        return edgeLength;
    }
    
    /** Sets the x-coordinate value to the specified value.
     * @param newX as a double.*/
    public void setX(double newX) {
        xCoordinate = newX;
    }
    
    /** Sets the y-coordinate value to the specified value.
     * @param newY as a double.*/
    public void setY(double newY) {
        yCoordinate = newY;
    }
    
    /** Sets the z-coordinate value to the specified value.
     * @param newZ as a double.*/
    public void setZ(double newZ) {
        zCoordinate = newZ;
    }
    
    /** Sets the edge length value to the specified value.
     * @param newEdge as a double.*/
    public void setEdgeLength(double newEdge) {
        edgeLength = newEdge;
    }
    
    /** Returns a string representation of the cube information.
     * @return result as a string.*/
    public String toString() {
        String result = "The surface area of the cube is ";
        
        return result;
    
    }
    
}

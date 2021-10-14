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
    
    /** Constant value of six for formula.*/
    private final int six = 6;
    
    /** X-coordinate.*/
    private double xCoordinate;
    
    /** Y-coordinate.*/
    private double yCoordinate;
    
    /** Z-coordinate.*/
    private double zCoordinate;
    
    /** Edge length.*/
    private double edgeLength;
    
    /**
     * Constructor sets the x, y, and z coordinate and edge length of the cube.
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
    
    /** Returns the x-coordinate of the cube as a double.
     * @return xCoordinate as a double.*/
    public double getX() {
        return xCoordinate;
    }
    
    /** Returns the y-coordinate of the cube as a double.
     * @return yCoordinate as a double.*/
    public double getY() {
        return yCoordinate;
    }
    
    /** Returns the z-coordinate of the cube as a double.
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
    
    /** Calculate the surface area of the cube and returns the result.
     * @return surfaceArea as a double*/
    public double surfaceArea() {
        double surfaceArea = six * Math.pow(edgeLength, 2);
        
        return surfaceArea;
    }
    
    /** Calculate the volume of the cube and returns the result.
     * @return volume as a double.*/
    public double volume() {
        double volume = Math.pow(edgeLength, three);
        
        return volume;
    }
    
    /** Calculate the face diagonal of the cube and returns the result.
     * @return faceDiagonal as a double*/
    public double faceDiagonal() {
        double faceDiagonal = Math.sqrt(2) * edgeLength;
        
        return faceDiagonal;
    }
    
    /** Calculate the space diagonal of the cube and returns the result.
     * @return spaceDiagonal as a double.*/
    public double spaceDiagonal() {
        double spaceDiagonal = Math.sqrt(three) * edgeLength;
        
        return spaceDiagonal;
    }
    
    /** Returns a string representation of the cube information.
     * @return result as a string.*/
    public String toString() {
        String result = "The surface area of the cube is "
                + Double.toString(surfaceArea())
                + "\n The volume of the cube is " 
                + Double.toString(volume())
                + "\n The face diagonal of the cube is "
                + Double.toString(faceDiagonal())
                + "\n The space diagonal of the cube is "
                + Double.toString(spaceDiagonal());
        
        return result;
    
    }
    
}

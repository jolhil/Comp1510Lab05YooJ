package ca.bcit.comp1510.lab05;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Demonstrates the use of an if-else statement.
 * 
 * @author Junsang(Jason) Yoo
 * @version 2021
 */

public class GeometryDriver {

    /**
     * Drives the program.
     * 
     * @param args (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat decimal = new DecimalFormat("#.###");
        
        System.out.println("Enter the radius of the sphere");
        double rS = scan.nextDouble();
        
        System.out.println("Enter the X-coordinate of the sphere");
        double xS = scan.nextDouble();
        
        System.out.println("Enter the Y-coordinate of the sphere");
        double yS = scan.nextDouble();
        
        System.out.println("Enter the Z-coordinate of the sphere");
        double zS = scan.nextDouble();
        
        Sphere sphere = new Sphere(xS, yS, zS, rS);
        
        decimal.format(sphere.surfaceArea());
        decimal.format(sphere.volume());
        
        System.out.println(sphere.toString());
        
        System.out.println("Enter the edge length of the cube");
        double a = scan.nextDouble();
        
        System.out.println("Enter the centre coordinate (x, y, z)"
                + " of the cube");
        double xC = scan.nextDouble();
        double yC = scan.nextDouble();
        double zC = scan.nextDouble();
        
        Cube cube = new Cube(xC, yC, zC, a);
        
        decimal.format(cube.surfaceArea());
        decimal.format(cube.volume());
        decimal.format(cube.faceDiagonal());
        decimal.format(cube.spaceDiagonal());
        
        System.out.println(cube.toString());
        
        System.out.println("Enter the radius of the cone");
        double rCone = scan.nextDouble();
        
        System.out.println("Enter the height of the cone");
        double hCone = scan.nextDouble();
        
        Cone cone = new Cone(rCone, hCone);
        
        decimal.format(cone.volume());
        decimal.format(cone.slantHeight());
        decimal.format(cone.surfaceArea());
        
        System.out.println(cone.toString());
        
        scan.close();
    }

}

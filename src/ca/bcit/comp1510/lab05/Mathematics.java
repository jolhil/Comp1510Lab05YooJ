/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Represent the concept of mathematics.
 * 
 * @author Jason(Junsang)Yoo
 * @version 2021
 */

public class Mathematics {

    /** Constant PI.*/
    public static final double PI = Math.PI;

    /** Returns the area of the circle with the specified radius.
     * @param radius of the circle..
     * @return area as a double*/
    public double getCircleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        
        return area;
    }

    /** Returns the sum of the positive integers between 0 and the specified
     * number inclusive. If the specified number is negative, returns zero.
     * 
     * @param number upper bound
     * @return sum as an integer*/
    public int sumOfInts(int number) {
        int sum = number * (number + 1) / 2;
        if (number > 0) {
            return sum;
        } else {
            return 0;
        }
    }

    /** Returns sum of the even numbers between 0 and the specified value,
     * inclusive. The value can be positive, negative, or zero.
     * 
     * @param number upper bound
     * @return sum of the even numbers between 0 and number*/
    public int sumOfEvens(int number) {
        int evensum = 0;
        if (number > 0) {
            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) {
                    evensum = evensum + i;
                }
            }
            return evensum;
        } else if (number < 0) {
            for (int i = 0; i >= number; i--) {
                if (i % 2 == 0) {
                    evensum = evensum + i;
                }
            }
            return evensum;
        } else {
            return 0; 
        }
        
    }
    
    /** Returns true if the specified value is even, else false.
     * 
     * @param number to test
     * @return true if number is even, else false.*/
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
    
    /** Returns true if the specifed value is positive, else false.
     * 
     * @param number to test
     * @return true if number is positive, else false.*/
    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }

}

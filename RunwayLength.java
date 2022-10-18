/*
 * Project #2
 * Source Code File: RunwayLength.java
 * Programmer: Arjun Suresh Kumar
 * Due: 9/29/21
 * Description: A program that calculates 
 * the minimum runway length when given 
 * the inputs of speed and acceleration.
 */

package Project2;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed (meters/second): ");
        double velocity = scanner.nextDouble();
        
        System.out.print("Enter rate of acceleration (meters/second^2): ");
        double acceleration = scanner.nextDouble();

        scanner.close();

        System.out.println("The minimum runway length is " + Math.round(0.5 * velocity * (velocity/acceleration) * 1000)/1000.0 + " meters");
    }
}

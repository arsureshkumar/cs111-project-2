/*
 * Project #2
 * Source Code File: CostOfDriving.java
 * Programmer: Arjun Suresh Kumar
 * Due: 9/29/21
 * Description: A program that calculates 
 * the price of fuel when given the inputs 
 * driving distance, fuel efficiency, and 
 * price of fuel.
 */

package Project2;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double drivingDistance = scanner.nextDouble();
        
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        scanner.close();

        System.out.println("The cost of driving is $" + Math.round((drivingDistance/milesPerGallon) * pricePerGallon * 100)/100.0);
    }

}

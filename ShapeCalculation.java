
package Chunk2Methods;

import java.util.Scanner;

public class ShapeCalculation {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nEnter side length of cube:\n");
        double volumeQuestion = userInput.nextInt();
        System.out.println("\nVolume of Cube: " + calcVolumeOfCube(volumeQuestion));
        
        System.out.println("\nEnter cylinder radius:\n");
        double radius = userInput.nextInt();
        System.out.println("\nEnter cylinder height:\n");
        double height = userInput.nextInt();
        double returnedValue = calcVolumeOfCylinder(radius, height);
        System.out.println("\nVolume of Cylinder: " + returnedValue);
        System.out.println("\nEnter first side length:\n");
        double userb1 = userInput.nextDouble();
        System.out.println("\nEnter second side length:\n");
        double userb2 = userInput.nextDouble();
        System.out.println("\nEnter height:\n");
        double trapHeight = userInput.nextDouble();
        double returnedTrap = calcVolumeOfTrapezoid(userb1, userb2, trapHeight);
        System.out.println("\nArea of Trapezoid: " + returnedTrap);
        
    } // close main
    
    public static double calcVolumeOfCube(double sideLength) {
        
        double cubeVolume = Math.pow(sideLength, 3);
        
        return cubeVolume;
                            
    } // close VolumeOfCube
    
    public static double calcVolumeOfCylinder(double radius, double height) {
        
        final double PI = 3.1416;
        
        double cylVol = PI * (radius * radius) * height;
        
        return cylVol;
        
    } // close VolumeOfCylinder
    
    public static double calcVolumeOfTrapezoid(double firstLength, double secondLength, double trapHeight) {
        
        double trapArea = (0.5) * (firstLength + secondLength) * trapHeight;
        
        return trapArea;
        
    } // close VolumeOfTrapezoid
    
} // close class

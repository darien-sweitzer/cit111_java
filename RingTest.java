
package ClassStructure;

import java.util.Random;

public class RingTest {
    
    public static int daysLeft = 7;
    
    public static Random randomMachine = new Random();
    
    public static int numViewersSwallowedByRing = 0;
    
    public static void main(String[] args) {
        
        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";
        
        displayAllLives(viewer1, viewer2, viewer3, viewer4, viewer5);
        
        makeCopy(viewer1);
        makeCopy(viewer2);
        makeCopy(viewer3);
        makeCopy(viewer4);
        makeCopy(viewer5);
       
    } // close main
    
    public static void dayLeft(String name) {
        System.out.println(name + ": " + daysLeft + " days left");
    } // close show daysLeft
    
    public static void makeCopy(String name) {
        
        boolean madeCopy = randomMachine.nextBoolean();
        
        System.out.print("\nDid " + name + " make a copy?\n");
        
        if(madeCopy){
            System.out.println(name + " is safe from The Ring!\n");
            daysLeft = daysLeft - 1;
        } else {
            System.out.println("No! " + name + " is dead.\n");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
    } // close makeCopy
    
    public static void displayAllLives(String name1,String name2,String name3,String name4,String name5) {
        System.out.println("\n--------------------");
        dayLeft(name1);
        dayLeft(name2);
        dayLeft(name3);
        dayLeft(name4);
        dayLeft(name5);
        System.out.println("--------------------");
    } // close displayLives
    
} // close class
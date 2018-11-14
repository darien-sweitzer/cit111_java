
package JavaObjects;

import java.util.Scanner;

public class Jungle {
    
    static int days = 1;
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Animal lion = new Animal();
        lion.role = "Predator";
        lion.size = 10;
        lion.speed = 10;
        lion.stamina = 10;
        lion.overall = 30;
        
        Animal gazelle = new Animal();
        gazelle.role = "Prey";
        gazelle.size = 4;
        gazelle.speed = 8;
        gazelle.stamina = 9;
        gazelle.overall = 21;
        
        Animal jaguar = new Animal();
        jaguar.role = "Predator";
        jaguar.size = 10;
        jaguar.speed = 10;
        jaguar.stamina = 10;
        jaguar.overall = 30;
        
        Animal chipmunk = new Animal();
        chipmunk.role = "Prey";
        chipmunk.size = 2;
        chipmunk.speed = 5;
        chipmunk.stamina = 4;
        
        System.out.println("\n-Welcome to Lion Simulator 2018-");
        System.out.println("\nYou are a Lion, the King of the Jungle!\n");
        System.out.println("Start Day " + days + ": Enter 1\n");
        userInput.nextInt();
        
        
        System.out.println("\n1 = Hunt : 2 = Rest : 3 = Play");
        
    } // close main
    
} // close class

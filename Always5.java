

package ControlStructures;

import java.util.Scanner;

public class Always5 {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nThink of a number and stick with it. No matter what number you chose the answser will always be 5!");
        System.out.println("\nType your number in.\n");
        
        int theirNumber = userInput.nextInt();
        
        System.out.println("\nNow take " + theirNumber + " and double it.");
        System.out.println("\nType your new number.\n");
        
        int secondNumber = userInput.nextInt();
        
        System.out.println("\nNow take " + secondNumber + " and add 10.");
        System.out.println("\nType your new number.\n");
        
        int thirdNumber = userInput.nextInt();
        
        System.out.println("\nNow take " + thirdNumber + " and half it.");
        System.out.println("\nType your new number.\n");
        
        int fourthNumber = userInput.nextInt();
        
        System.out.println("\nNow take " + fourthNumber + " and subtract the first number you chose.");
        System.out.println("\nType your new number.\n");
        
        int finalNumber = userInput.nextInt();
        
        if(finalNumber == 5) {
            
            System.out.println("\nGood job!");
            
        } else {
            
            System.out.println("\nCheck your math!");
            
        } // close final answer
        
    } // close main
    
} // close class

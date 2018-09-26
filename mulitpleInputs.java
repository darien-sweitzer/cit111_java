package ControlStructures;

import java.util.Scanner;



public class mulitpleInputs {
    public static void main(String[] args) {
        
        Scanner mindReader = new Scanner(System.in);
        
        int earnedPoints = 0;
        
        int sampleQuestion;
        
        System.out.println("\nWhat is your favorite restaraunt? 1 = primantis 2 = tgi fridays 3 = eatnpark\n");
        
        
        sampleQuestion = mindReader.nextInt();
        
        if(sampleQuestion == 1) {
            earnedPoints = earnedPoints + 50;
            System.out.println("\nYes! + 50\n");
        }
        
        if(sampleQuestion == 2) {
            earnedPoints = earnedPoints + 25;
            System.out.println("\nOkay! + 25\n");
        }
        
        if(sampleQuestion == 3) {
            earnedPoints = earnedPoints + 10;
            System.out.println("\nAw! + 10\n");
        }
        
        
    } // close main
} // close class

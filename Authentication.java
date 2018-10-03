package ControlStructures;

import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);

        int passwordQuestion;
        int attempts = 0;
        final int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.println("\nEnter your 4 digit authorization code:\n");

            passwordQuestion = keyboardReader.nextInt();

            if (passwordQuestion == 4321) {

                System.out.println("\nCongrats, you get a cookie!\n");
                break;

            } else {

                attempts = attempts + 1;
                System.out.println("\nWrong, try again:\n");
                System.out.println("\nYou have made " + attempts + "/" + maxAttempts + " attempts.\n");
            } // close if else 

            if (attempts == 3) {
                System.out.println("\nIntruder alert!\n");
            } // close if    

        } // close while    
        
    } // close main

} // close class

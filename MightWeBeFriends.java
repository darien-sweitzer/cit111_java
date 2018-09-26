package ControlStructures;

import java.util.Scanner;

/**
 * implement logic for checking
 * friend compatability to practice
 * if statements
 * @author darien.sweitzer
 */
public class MightWeBeFriends {
    public static void main(String[] args){
        
        // builds a scanner object and stores
        // in variable my scanner2
        
        Scanner myScanner = new Scanner(System.in);
        
        // read a line from the user and store in variable
//        String userInput = myScanner.next();
//        System.out.println("You Typed: " + userInput);
        

        int pointsPossible = 200;
        int earnedPoints = 0;
        
        
        // TODO: Replace hard-code with user input
        
        System.out.println("Welcome to friend picker!");
        System.out.println(""
                + "");
        
        System.out.println("- Are you a boy or girl? 1 = boy / 2 = girl");
            System.out.println(""
                    + "");
        int boyQuestion = myScanner.nextInt();
                
        
                
        if(boyQuestion == 1){
            
            earnedPoints = earnedPoints + 100;
            System.out.println(""
                    + "");
            System.out.println("Brother! +100");
            System.out.println(""
                    + "");
                    
            // hard coded user answer
            
            System.out.println("- Do you like sports? 1 = yes / 2 = no");
            System.out.println(""
                    + "");
            
            int sportQuestion = myScanner.nextInt();
            
            if(sportQuestion == 1) {
                
                earnedPoints = earnedPoints + 50;
                System.out.println(""
                        + "");
                System.out.println("FOOTBALL! +50");
                System.out.println(""
                        + "");
                
                System.out.println("- Do you like the Steelers? 1 = yes / 2 = no");
                System.out.println(""
                        + "");
                
                int steelerQuestion = myScanner.nextInt();
                
                if(steelerQuestion == 1) {
                    earnedPoints = earnedPoints + 25;
                    System.out.println(""
                            + "");
                    System.out.println("Wow, Steel City! +25");
                    System.out.println(""
                            + "");
                } else {
                    System.out.println(""
                            + "");
                    System.out.println("Bummer:(");
                    System.out.println(""
                            + "");
                }
            } else {
                System.out.println(""
                        + "");
                System.out.println("Bummer:(");
                System.out.println(""
                        + "");
            }
            
            System.out.println("- Do you like soccer? 1 = yes / 2 = no");
            System.out.println(""
                    + "");
            
            int soccerQuestion = myScanner.nextInt();
            
            if(soccerQuestion == 1) {
                earnedPoints = earnedPoints + 25;
                System.out.println(""
                        + "");
                System.out.println("Soccer for the win! + 25");
                System.out.println(""
                        + "");
            } else {
                System.out.println(""
                        + "");
                System.out.println("Bummer:(");
                System.out.println(""
                        + "");
            }
        } else {
            earnedPoints = earnedPoints + 50;
            System.out.println("\nSister! + 50");
            System.out.println(""
                    + "");
            
            System.out.println("\n- Do you like Shopping? 1 = yes 2 = no\n");
            System.out.println(""
                    + "");
            
            int shoppingQuestion = myScanner.nextInt();
            
            if(shoppingQuestion == 1) {
                earnedPoints = earnedPoints + 25;
                System.out.println("\nMall! + 25");
                System.out.println(""
                        + "");
            } else {
                System.out.println("\nBummer:(\n");
            }
            
            System.out.println("\n- Do you like yoga? 1 = yes 2 = no\n");
            
            int yogaQ = myScanner.nextInt();
            
            if(yogaQ == 1) {
                earnedPoints = earnedPoints + 25;
                System.out.println("\nMe too! + 25\n");
            } else {
                System.out.println(":((");
            }
                
            
            System.out.println("\n- Do you like music? 1 = yes 2 = no\n");
            
            int musicQ = myScanner.nextInt();
            
            if(musicQ == 1) {
                earnedPoints = earnedPoints + 25;
                System.out.println("\nSweet! + 25\n");
            }
            
            
            
            
        } // closes if/else chain 
        
        System.out.println("Points: " + earnedPoints + "/" + pointsPossible);
    } // close main method
} // close class
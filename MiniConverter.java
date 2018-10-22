package Chunk2Methods;

import java.util.Scanner;

public class MiniConverter {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        while (true) {

            System.out.println("\nWould you like to convert Miles to Football Fields, Height to Pencils, or Minutes to Seconds?\n\n 1 = Miles : 2 = Height : 3 = Minutes\n");
            int firstQuestion = userInput.nextInt();

            if (firstQuestion == 1) {

                System.out.println("\nEnter distance in Miles:\n");
                double distanceMiles = userInput.nextDouble();
                double returnedFields = convertMilesToFootballFields(distanceMiles);
                System.out.println("\n" + distanceMiles + " Miles = " + returnedFields + " Football Fields");
                System.out.println("\nWould you like to choose again?");
                System.out.println("\n1 = Yes 2 = No\n");
                
                int replayQuestion = userInput.nextInt();
                
                if (replayQuestion == 1) {
                } else {
                    break;
                } // close replay
                
            } // close miles

            if (firstQuestion == 2) {
                
                System.out.println("\nEnter your Height in Inches:\n");
                double personalHeight = userInput.nextDouble();
                double returnedShaqs = convertHeightToShaqs(personalHeight);
                System.out.println("\nYou are " + returnedShaqs + " pencils tall");
                System.out.println("\nWould you like to choose again?");
                System.out.println("\n1 = Yes 2 = No\n");
                
                int replayQuestion = userInput.nextInt();
                
                if (replayQuestion == 1) {
                } else {
                    break;
                } // close replay
                
            } // close height

            if (firstQuestion == 3) {

                System.out.println("\nEnter time in Minutes:\n");
                double ammountOfMinutes = userInput.nextDouble();
                double returnedSeconds = convertMinutesToSeconds(ammountOfMinutes);
                System.out.println("\n" + ammountOfMinutes + " Minutes = " + returnedSeconds + " Seconds");
                
                System.out.println("\nWould you like to choose again?");
                System.out.println("\n1 = Yes 2 = No\n");
                
                int replayQuestion = userInput.nextInt();
                
                if (replayQuestion == 1) {
                } else {
                    break;
                } // close replay
                
            } // close minutes
            
        } // close while

    } // close main

    public static double convertMilesToFootballFields(double miles) {

        double footballFields = (miles) * (17.6);

        return footballFields;

    }

    public static double convertMinutesToSeconds(double minutes) {

        double totalSeconds = (minutes) * (60);

        return totalSeconds;

    }

    public static double convertHeightToShaqs(double yourHeight) {

        double ammountOfShaq = (yourHeight) / (7.5);

        return ammountOfShaq;

    }

} // close class

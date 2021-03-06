package fundamentals;

import java.util.Scanner;

import java.util.Random;

public class RideSimulator {

    private static int totalRiders = 0;

    private static int totalFailedRideAttempts = 0;

    private static int totalSickRiders = 0;

    static final int minimumHeightWidow = 50;

    static final int minimumHeightMerry = 30;

    static Random rand = new Random();

    static int dayNumber = 0;

    static int seasonNumber = 0;

    static int multipleSeasons = 365;

    public static void ride() {

        int limitGroup = 10;

        int limitHeight = 100;

        int day = 1;
        int night = 10;

        int hours = 1;
        int shift = 10;

        while (hours < shift) {

            while (day < night) {

                int groupNumber = rand.nextInt(limitGroup);
                int groupHeight = rand.nextInt(limitHeight);

                rideBlackWidow(groupNumber, groupHeight);

                day = day + 9;

            } // close while

            day = day - 9;

            while (day < night) {
                
                int groupHeight = rand.nextInt(limitHeight);
                int groupNumber = rand.nextInt(limitGroup);

                rideMerryGoRound(groupNumber, groupHeight);

                day = day + 9;

            } // close while

            day = day - 9;

            hours = hours + 1;

        } // close big while 

    } // close ride

    public static void main(String[] args) {

        int date = 0;
        int season = 364;

        while (true) {

            while (date <= season) {

                ride();

                date = date + 1;

                dayNumber = dayNumber + 1;
                
                if (date == 365) {
                    seasonNumber = seasonNumber + 1;
                } // close set season
                
                if (date == 365) {
                    if (seasonNumber > 1) {
                        multipleSeasons = multipleSeasons + 365;
                    }
                    
                } // close set Multiple Seasons
                
                printRideStats();
                printSeasonStats();
                
            } // close season

            System.out.println("\nAnother Season? Yes = 1 No = 2\n");
            Scanner userInput = new Scanner(System.in);
            int seasonQuestion = userInput.nextInt();

            if (seasonQuestion == 1) {

                date = date - 365;

            } else {

                break;

            } // close anotherSeason

        } // close seasonLoop

    } // close main

    public static void rideBlackWidow(int riders, int avgHeight) {

        if (avgHeight >= minimumHeightWidow) {

            System.out.println("\nEveryone rides the Black Widow.");
            totalRiders = totalRiders + riders;
            
            if (riders != 0) {
                
                int numSickRiders = rand.nextInt(riders);
                totalSickRiders = totalSickRiders + numSickRiders;
                
            } else {
                
            } // close sickRider

        } else {

            System.out.println("\n" + riders + " riders turned away sad: too short");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;

        } // close height

    } // close rideBlackWidow

    public static void rideMerryGoRound(int riders, int avgHeight) {

        if (avgHeight >= minimumHeightMerry) {

            System.out.println("\nEveryone rides the Merry-Go-Round.");
            totalRiders = totalRiders + riders;
            if (riders != 0) {

                int numSickRiders = rand.nextInt(riders);
                totalSickRiders = totalSickRiders + numSickRiders;

            } else {

            } // close sickRider

        } else {

            System.out.println("\n" + riders + " riders turned away sad: too short");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;

        }

    } // close MerryGoRound

    public static void printRideStats() {

        if (dayNumber != multipleSeasons) {
            System.out.println("\nRide Stats After Day: " + dayNumber);
            System.out.println("\n- Total Riders Who Got On: " + totalRiders);
            System.out.println("\n- Total Riders Turned Away: " + totalFailedRideAttempts);
            System.out.println("\n- Total Sick Riders: " + totalSickRiders);
        }

    } // close RideStats

    public static void printSeasonStats() {

        if (dayNumber == multipleSeasons) {
            System.out.println("\nRide Stats After Season: " + seasonNumber);
            System.out.println("\n- Total Riders Who Got On: " + totalRiders);
            System.out.println("\n- Total Riders Turned Away: " + totalFailedRideAttempts);
            System.out.println("\n- Total Sick Riders: " + totalSickRiders);
        }

    } // close printseasonstats method

} // close class

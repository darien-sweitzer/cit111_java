package ClassStructure;

import java.util.Scanner;

import java.util.Random;

public class RestuarantManager {

    private static int numPizzaSlidersOrdered = 0;

    private static Scanner userInput = new Scanner(System.in);

    static Random rand = new Random();

    private static int priceTotal = 0;

    private static int totalChaos = 0;

    private static int maxAnarchy = 100000;

    private static int totalCitiesFled = 0;

    public static void main(String[] args) {

//        System.out.println("\nEnter City and Start Killing: Enter 1");
//        int enterCity = userInput.nextInt();
//        while (enterCity == 1) {
        while (totalChaos <= maxAnarchy) {

            orderHitmen();
            displayOrderTotals();

        } // close mainCall

        if (totalChaos >= maxAnarchy) {

            totalCitiesFled = totalCitiesFled + 1;

        } // close fleeCity

//        } // close while
    } // close main

    public static void orderHitmen() {

        int limitOrder = 3;

        int order = rand.nextInt(limitOrder);

        if (order == 0) {

            int limitMercenary = 8;
            int mercenaryNumber = rand.nextInt(limitMercenary);

            orderMercenary(mercenaryNumber);

        } // close orderMercenary

        if (order == 1) {

            int limitAssassin = 4;
            int assassinNumber = rand.nextInt(limitAssassin);

            orderAssassin(assassinNumber);

        } // close orderAssassin

        if (order == 2) {

            int limitMilitia = 251;
            int militiaNumber = rand.nextInt(limitMilitia);

            orderMilitia(militiaNumber);

        } // close orderMilitia

    } // close orderHitmen

    public static void orderMercenary(int totalMercenaries) {

        int eachPerson = 500;
        int personMath = totalMercenaries * eachPerson;
        priceTotal = priceTotal + personMath;
        int eachChaos = 750;
        int mercenaryMath = totalMercenaries * eachChaos;
        totalChaos = totalChaos + mercenaryMath;
        System.out.println("\nMercenaries Bought: " + totalMercenaries);
        System.out.println("\nChaos Caused: " + mercenaryMath);

    } // close orderMercenary

    public static void orderAssassin(int totalAssassins) {

        int eachPerson = 1000;
        int personMath = totalAssassins * eachPerson;
        priceTotal = priceTotal + personMath;
        int eachChaos = 500;
        int assassinMath = totalAssassins * eachChaos;
        totalChaos = totalChaos + assassinMath;
        System.out.println("\nAssassins Bought: " + totalAssassins);
        System.out.println("\nChaos Caused: " + assassinMath);

    } // close orderAssassins

    public static void orderMilitia(int totalMilitia) {
        
        
        int eachPerson = 100;
        int personMath = totalMilitia * eachPerson;
        priceTotal = priceTotal + personMath;
        int eachChaos = 50;
        int militiaMath = totalMilitia * eachChaos;
        totalChaos = totalChaos + militiaMath;
        System.out.println("\nMilitia Members Bought: " + totalMilitia);
        System.out.println("\nChaos Caused: " + militiaMath);

    } // close orderMilita

    public static void displayOrderTotals() {

        System.out.println("\nTotal Price: $" + priceTotal);
        System.out.println("\nTotal Chaos: " + totalChaos);
        if (totalChaos >= maxAnarchy) {
            
            System.out.println("\nCities Fled: " + totalCitiesFled + "\n");
            
        } // close citiesFledPrint
        
    } // close displayOrderTotals

} // close class

package fundamentals;

import java.util.Scanner;

import java.util.Random;

public class Hitmen {

    private static Scanner userInput = new Scanner(System.in);

    static Random rand = new Random();

    private static int priceTotal = 0;

    private static int totalChaos = 0;

    private static final int maxAnarchy = 100000;

    private static int totalCitiesFled = 0;

    private static int totalKills = 0;

    public static void main(String[] args) {

        System.out.println("\nEnter City and Start Killing: 1 = Start\n");
        int enterCity = userInput.nextInt();
        
        while (enterCity == 1) {
            
            while (totalChaos <= maxAnarchy) {

                orderHitmen();

            } // close mainCall

            System.out.println("\n- Anarchy Achieved");

            if (totalChaos >= maxAnarchy) {

                totalCitiesFled = totalCitiesFled + 1;
                displayOrderTotals();

            } // close fleeCity
            
            totalChaos = 0;
            
            System.out.println("\nEnter Next City ? 1 = Next 2 = Rest\n");
            int nextCity = userInput.nextInt();
            if (nextCity == 1) {
                
            } else {
                
                break;
                
            }
            
        } // close while
        
    } // close main

    public static void orderHitmen() {

        int limitOrder = 3;

        int order = rand.nextInt(limitOrder);

        if (order == 0) {

            int limitMercenary = 21;
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

        int eachPerson = 50;
        int personMath = totalMercenaries * eachPerson;
        priceTotal = priceTotal + personMath;
        int limitKills = 6;
        int eachKill = rand.nextInt(limitKills);
        int killTotal = totalMercenaries * eachKill;
        totalKills = totalKills + killTotal;
        int eachChaos = 50;
        int mercenaryMath = killTotal * eachChaos;
        totalChaos = totalChaos + mercenaryMath;
        System.out.println("\nMercenaries Bought: " + totalMercenaries);
        System.out.println("People Killed: " + killTotal);
        System.out.println("Chaos Caused: " + mercenaryMath);

    } // close orderMercenary

    public static void orderAssassin(int totalAssassins) {

        int eachPerson = 100;
        int personMath = totalAssassins * eachPerson;
        priceTotal = priceTotal + personMath;
        int limitKills = 101;
        int eachKill = rand.nextInt(limitKills);
        int killTotal = totalAssassins * eachKill;
        totalKills = totalKills + killTotal;
        int eachChaos = 8;
        int assassinMath = killTotal * eachChaos;
        totalChaos = totalChaos + assassinMath;
        System.out.println("\nAssassins Bought: " + totalAssassins);
        System.out.println("People Killed: " + killTotal);
        System.out.println("Chaos Caused: " + assassinMath);

    } // close orderAssassins

    public static void orderMilitia(int totalMilitia) {

        int eachPerson = 10;
        int personMath = totalMilitia * eachPerson;
        priceTotal = priceTotal + personMath;
        int limitKills = 11;
        int eachKill = rand.nextInt(limitKills);
        int killTotal = totalMilitia * eachKill;
        totalKills = totalKills + killTotal;
        int eachChaos = 15;
        int militiaMath = killTotal * eachChaos;
        totalChaos = totalChaos + militiaMath;
        System.out.println("\nMilitia Members Bought: " + totalMilitia);
        System.out.println("People Killed: " + killTotal);
        System.out.println("Chaos Caused: " + militiaMath);

    } // close orderMilita

    public static void displayOrderTotals() {
        System.out.println("\n--------------------");
        System.out.println("Cities Fled: " + totalCitiesFled);
        System.out.println("\nTotal Price: $" + priceTotal);
        System.out.println("\nPeople Dead: " + totalKills);
        System.out.println("--------------------");

    } // close displayOrderTotals

} // close class

package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class RingTest {

    public static Random randomMachine = new Random();
    public static Scanner userInput = new Scanner(System.in);

    public static int numViewersSwallowedByRing = 0;

    public static String viewer1 = "Katie";
    public static String viewer2 = "Josh";
    public static String viewer3 = "Rachel";
    public static String viewer4 = "Noah";
    public static String viewer5 = "Aiden";

    public static int daysLeft = 7;

    public static int Copied1 = 1;
    public static int Copied2 = 1;
    public static int Copied3 = 1;
    public static int Copied4 = 1;
    public static int Copied5 = 1;

    public static void main(String[] args) {

        ringTest();

    } // close main

    public static void dayLeft(String name) {
        System.out.println("- " + name + ": " + daysLeft + " days left");
    } // close show daysLeft

    public static void makeCopy1(String name) {

        int copyLimit = 10;
        int madeCopy = randomMachine.nextInt(copyLimit);

        if (madeCopy >= 9) {
            System.out.println(name + " makes a copy and is safe from the Ring!\n");
            Copied1 = 2;
        } else {
            System.out.println(name + " fails to make a copy.\n");
        }

    } // close makeCopy1

    public static void makeCopy2(String name) {

        int copyLimit = 10;
        int madeCopy = randomMachine.nextInt(copyLimit);

        if (madeCopy >= 9) {
            System.out.println(name + " makes a copy and is safe from the Ring!\n");
            Copied2 = 2;
        } else {
            System.out.println(name + " fails to make a copy.\n");
        }

    } // close makeCopy1

    public static void makeCopy3(String name) {

        int copyLimit = 10;
        int madeCopy = randomMachine.nextInt(copyLimit);

        if (madeCopy >= 9) {
            System.out.println(name + " makes a copy and is safe from the Ring!\n");
            Copied3 = 2;
        } else {
            System.out.println(name + " fails to make a copy.\n");
        }

    } // close makeCopy1

    public static void makeCopy4(String name) {

        int copyLimit = 10;
        int madeCopy = randomMachine.nextInt(copyLimit);

        if (madeCopy >= 9) {
            System.out.println(name + " makes a copy and is safe from the Ring!\n");
            Copied4 = 2;
        } else {
            System.out.println(name + " fails to make a copy.\n");
        }

    } // close makeCopy1

    public static void makeCopy5(String name) {

        int copyLimit = 10;
        int madeCopy = randomMachine.nextInt(copyLimit);

        if (madeCopy >= 9) {
            System.out.println(name + " makes a copy and is safe from the Ring!\n");
            Copied5 = 2;
        } else {
            System.out.println(name + " fails to make a copy.\n");
        }

    } // close makeCopy1

    public static void makeAllCopies() {

        if (daysLeft != 0) {
            if (Copied1 == 1) {
                makeCopy1(viewer1);
            }
        } else {
            if (Copied1 == 1) {
                getEaten(viewer1);
            }
        }
        if (daysLeft != 0) {
            if (Copied2 == 1) {
                makeCopy2(viewer2);
            }
        } else {
            if (Copied2 == 1) {
                getEaten(viewer2);
            }
        }
        if (daysLeft != 0) {
            if (Copied3 == 1) {
                makeCopy3(viewer3);
            }
        } else {
            if (Copied3 == 1) {
                getEaten(viewer3);
            }
        }
        if (daysLeft != 0) {
            if (Copied4 == 1) {
                makeCopy4(viewer4);
            }
        } else {
            if (Copied4 == 1) {
                getEaten(viewer4);
            }
        }
        if (daysLeft != 0) {
            if (Copied5 == 1) {
                makeCopy5(viewer5);
            }
        } else {
            if (Copied5 == 1) {
                getEaten(viewer5);
            }
        }

    } // close makeAllCopies

    public static void displayAllLives() {
        System.out.println("--------------------");
        if (Copied1 == 1) {
            dayLeft(viewer1);
        }
        if (Copied2 == 1) {
            dayLeft(viewer2);
        }
        if (Copied3 == 1) {
            dayLeft(viewer3);
        }
        if (Copied4 == 1) {
            dayLeft(viewer4);
        }
        if (Copied5 == 1) {
            dayLeft(viewer5);
        }
        System.out.println("--------------------\n");
    } // close displayLives

    public static void getEaten(String name) {

        System.out.println(name + " gets swallowed by the Ring.\n");

    } // close getEaten

    public static void endGame() {

        System.out.println("--------------------");
        if (Copied1 == 2) {
            System.out.println(viewer1 + " survived!");
        } else {
            System.out.println(viewer1 + " died!");
        }
        if (Copied2 == 2) {
            System.out.println(viewer2 + " survived!");
        } else {
            System.out.println(viewer2 + " died!");
        }
        if (Copied3 == 2) {
            System.out.println(viewer3 + " survived!");
        } else {
            System.out.println(viewer3 + " died!");
        }
        if (Copied4 == 2) {
            System.out.println(viewer4 + " survived!");
        } else {
            System.out.println(viewer4 + " died!");
        }
        if (Copied5 == 2) {
            System.out.println(viewer5 + " survived!");
        } else {
            System.out.println(viewer5 + " died!");
        }
        System.out.println("--------------------\n");

    } // close endGame

    public static void ringTest() {

        while (true) {

            int date = 0;
            int total = 7;

            while (date <= total) {

                displayAllLives();

                makeAllCopies();

                daysLeft = daysLeft - 1;
                date = date + 1;

                if (date != 8) {

                    if (date != 7) {

                        if (date == 1) {
                            System.out.println(date + " Day Down: Enter 1 to Continue\n");
                        } else {
                            System.out.println(date + " Days Down: Enter 1 to Continue\n");
                        }
                        int question = userInput.nextInt();
                        System.out.println("");
                        
                    } else {
                        
                        System.out.println(date + "th Day! Here She Comes: Enter 1\n");
                        userInput.nextInt();
                        System.out.println("");
                        
                    }
                    
                }
                
            } // close 7Days

            endGame();

            System.out.println("Play Again? 1 = Yes 2 = No\n");
            int againQuestion = userInput.nextInt();
            System.out.println("");

            if (againQuestion == 2) {
                break;
            } else {
                date = 0;
                daysLeft = 7;
                Copied1 = 1;
                Copied2 = 1;
                Copied3 = 1;
                Copied4 = 1;
                Copied5 = 1;
            }

        } // close while

    } // close ringTest

} // close class

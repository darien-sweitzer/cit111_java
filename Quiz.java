package ControlStructures;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int attempts = 0;
        int attemptsMax = 3;
        final int answer = 5;

        while (attempts < attemptsMax) {

            System.out.println("\nWhat is (3 + 2) * 5 - 20?\n");

            int mathQuestion = userInput.nextInt();

            if (mathQuestion == 5) {

                System.out.println("\nCongrats you got the right answer!");
                System.out.println("\nLets make this harder! What is (5 ^ 3) * 3 ?\n");

                int secondQuestion = userInput.nextInt();

                if (secondQuestion == 375) {

                    System.out.println("\nGood job, that was a tough one!");
                    System.out.println("\nCan you go one more level? What is [(15 * 3) / 5] * 6 ?)\n");

                    int thirdQuestion = userInput.nextInt();

                    if (thirdQuestion == 54) {

                        System.out.println("\nCongrats, your a math wizard!");
                        break;

                    } else {

                        attempts = attempts + 1;
                        System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                        System.out.println("\nIncorrect, try again! What is [(15 * 3) / 5)] * 6 ?\n");

                        int thirdAgain = userInput.nextInt();

                        if (thirdAgain == 54) {

                            System.out.println("\nCongrats, your a math wizard!");
                            break;

                        } else {

                            attempts = attempts + 1;
                            System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                            System.out.println("\nIncorrect, try again! What is [(15 * 3) / 5)] * 6 ?\n");

                            int thirdFinal = userInput.nextInt();

                            if (thirdFinal == 54) {

                                System.out.println("\nCongrats, your a math wizard!");
                                break;

                            } else {

                                attempts = attempts + 1;
                                System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);

                            } // close final third attempt

                        } // close third again

                    } // close third question

                } else {

                    attempts = attempts + 1;
                    System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                    System.out.println("\nIncorrect, try again! What is (5 ^ 3) * 3 ?\n");

                    int secondAgain = userInput.nextInt();

                    if (secondAgain == 375) {

                        System.out.println("\nGood job, that was a tough one!");
                        System.out.println("\nCan you go one more level? What is [(15 * 3) / 5] * 6 ?)\n");

                        int thirdQuestion = userInput.nextInt();

                        if (thirdQuestion == 54) {

                            System.out.println("\nCongrats, your a math wizard!");
                            break;

                        } else {

                            attempts = attempts + 1;
                            System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                            System.out.println("\nIncorrect, try again! What is [(15 * 3) / 5)] * 6 ?\n");

                            int thirdAgain = userInput.nextInt();

                            if (thirdAgain == 54) {

                                System.out.println("\nCongrats, your a math wizard!");
                                break;

                            } else {

                                attempts = attempts + 1;
                                System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                                System.out.println("\nIncorrect, try again! What is [(15 * 3) / 5)] * 6 ?\n");

                                int thirdFinal = userInput.nextInt();

                                if (thirdFinal == 54) {

                                    System.out.println("\nCongrats, your a math wizard!");
                                    break;

                                } else {

                                    attempts = attempts + 1;
                                    System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);

                                } // close final third attempt

                            } // close third again

                        } // close third question

                    } else {

                        attempts = attempts + 1;
                        System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                        System.out.println("\nIncorrect, try again! What is (5 ^ 3) * 3 ?\n");

                        int secondFinal = userInput.nextInt();

                        if (secondFinal == 375) {

                            System.out.println("\nGood job, that was a tough one!");
                            System.out.println("\nCan you go one more level? What is [(15 * 3) / 5] * 6 ?)\n");

                            int thirdQuestion = userInput.nextInt();

                            if (thirdQuestion == 54) {

                                System.out.println("\nCongrats, your a math wizard!");
                                break;

                            } else {

                                attempts = attempts + 1;
                                System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                                System.out.println("\nIncorrect, try again! What is [(15 * 3) / 5)] * 6 ?\n");

                                int thirdAgain = userInput.nextInt();

                                if (thirdAgain == 54) {

                                    System.out.println("\nCongrats, your a math wizard!");
                                    break;

                                } else {

                                    attempts = attempts + 1;
                                    System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                                    System.out.println("\nIncorrect, try again! What is [(15 * 3) / 5)] * 6 ?\n");

                                    int thirdFinal = userInput.nextInt();

                                    if (thirdFinal == 54) {

                                        System.out.println("\nCongrats, your a math wizard!");
                                        break;

                                    } else {

                                        attempts = attempts + 1;
                                        System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);

                                    } // close third final

                                } // close third again

                            } // close third question

                        } else {
                            
                            attempts = attempts + 1;
                            System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);
                            
                        } // close second final

                    } // close second again

                } // close second question

            } else {

                attempts = attempts + 1;
                System.out.println("\nAttempts: " + attempts + "/" + attemptsMax);

            } // close first question

            if (attempts == attemptsMax) {
                System.out.println("\nSorry come back later!");
                break;
            }

            System.out.println("\nIncorrect try again!");

        } // close while    

    } // close main

} // close class

package Game;

import java.util.Scanner;
import java.util.Random;

public class Dungeon {

    public static Scanner userInput = new Scanner(System.in);
    public static Random randomizer = new Random();
    public static int rounds = 1;
    public static int displayTotal = 0;

    public static void main(String[] args) {

        Abilities warriorSpell = new Abilities();
        Abilities wizardSpell = new Abilities();
        Abilities boss1Spell = new Abilities();
        Abilities boss2Spell = new Abilities();
        Abilities boss3Spell = new Abilities();
        Abilities boss4Spell = new Abilities();
        Abilities boss5Spell = new Abilities();

        Character warrior = new Character();
        warrior.role = "Warrior";
        warrior.name = "Ragnar";
        warrior.health = 10000;

        Character wizard = new Character();
        wizard.role = "Wizard";
        wizard.name = "Blaze";
        wizard.health = 10000;

        Character boss1 = new Character();
        boss1.role = "Orc";
        boss1.name = "The Orc King";
        boss1.health = 10000;

        Character boss2 = new Character();
        boss2.role = "Wizard";
        boss2.name = "Blaze";
        boss2.health = 10000;

        Character boss3 = new Character();
        boss3.role = "Wizard";
        boss3.name = "Blaze";
        boss3.health = 10000;

        Character boss4 = new Character();
        boss4.role = "Wizard";
        boss4.name = "Blaze";
        boss4.health = 10000;

        Character boss5 = new Character();
        boss5.role = "Wizard";
        boss5.name = "Blaze";
        boss5.health = 10000;

        warrior.Character(warriorSpell);
        warrior.abilityobject.ability = "Whirlwind";
        warrior.abilityobject.damage = 75;
        warrior.abilityobject.ability2 = "Haymaker";
        warrior.abilityobject.damage2 = 450;
        warrior.abilityobject.ability3 = "Backstab";
        warrior.abilityobject.damage3 = 175;

        wizard.Character(wizardSpell);
        wizard.abilityobject.ability = "Lighting Bolt";
        wizard.abilityobject.damage = 250;
        wizard.abilityobject.ability2 = "Meteor Shower";
        wizard.abilityobject.damage2 = 0;
        wizard.abilityobject.ability3 = "Conjure Beast";
        wizard.abilityobject.damage3 = 175;

        boss1.Character(boss1Spell);
        boss1.abilityobject.ability = "Stomp";
        boss1.abilityobject.damage = 250;
        boss1.abilityobject.ability2 = "Double-Sided Axe";
        boss1.abilityobject.damage2 = 450;
        boss1.abilityobject.ability3 = "Flank";
        boss1.abilityobject.damage3 = 175;

        System.out.println("--------------------");
        System.out.println("Welcome To The Dungeon");
        System.out.println("--------------------");
        System.out.println("\nYOU MUST DEFEAT 5 BOSSES TO ESCAPE. THEY WILL GET INCREASINGLY HARDER TO DEFEAT.");
        System.out.println("\nPick a class: 1 = " + warrior.role + " 2 = " + wizard.role + "\n");
        int roleQuestion = userInput.nextInt();

        if (roleQuestion == 1) {
            System.out.println("\nYou have chosen " + warrior.name + " the " + warrior.role + "!");
            System.out.println("\nAbilities:\n - " + warriorSpell.ability + ": Spin Your Axe Around Dealing (75 - 125) Damage 3 Times");
            System.out.println(" - " + warriorSpell.ability2 + ": Swing Your Axe with All Your Force Dealing (450 - 600) Damage with a 50% Chance to Miss");
            System.out.println(" - " + warriorSpell.ability3 + ": Sneak Up Behind Your Opponent and Stab Them in the Back Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
        } else {
            System.out.println("\nYou have chosen " + wizard.name + " the " + wizard.role + "!");
            System.out.println("\nAbilities:\n - " + wizardSpell.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
            System.out.println(" - " + wizardSpell.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
            System.out.println(" - " + wizardSpell.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
        }

        

        System.out.println("\nTime to Fight! Are you ready? Enter 5 to Start\n");
        int startGame = userInput.nextInt();

        while (startGame == 5) {
            
            if (roleQuestion == 1) {

                int death = 0;
                int AI = 1;
                int notAI = 2;
                
                if (rounds == 1) {
                    System.out.println("\nYou unlock the towering dungeon gate. Before you even have time to step inside, a giant orc starts charging at you.");
                }
                
                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println(boss1.name + ": " + boss1.health + " Health");
                System.out.println("--------------------\n");

                System.out.println(" - " + warrior.name + "s Turn");
                boss1.health = castWarriorAbility(notAI, warrior.name, warrior.health, boss1.health, warriorSpell.ability, warriorSpell.damage, warriorSpell.ability2, warriorSpell.damage2, warriorSpell.ability3, warriorSpell.damage3);

                int endGame = death(warrior.health, warrior.name, boss1.health, boss1.name);

                if (endGame == 1) {
                    break;
                }

                System.out.println("\nStart " + boss1.name + "s Turn: Enter 1\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n - " + boss1.name + "s Turn");
                    warrior.health = castWizardAbility(AI, wizard.name, wizard.health, warrior.health, wizardSpell.ability, wizardSpell.damage, wizardSpell.ability2, wizardSpell.damage2, wizardSpell.ability3, wizardSpell.damage3);

                    int endGame1 = death(warrior.health, warrior.name, wizard.health, wizard.name);

                    if (endGame1 == 1) {
                        break;
                    }

                } // close letOpponentStart

                rounds = rounds + 1;

            } // close warriorBattle

            if (roleQuestion == 2) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(wizard.name + ": " + wizard.health + " Health");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println("--------------------\n");

                System.out.println(" - " + wizard.name + "s Turn");
                warrior.health = castWizardAbility(notAI, wizard.name, wizard.health, warrior.health, wizardSpell.ability, wizardSpell.damage, wizardSpell.ability2, wizardSpell.damage2, wizardSpell.ability3, wizardSpell.damage3);

                int endGame1 = death(warrior.health, warrior.name, wizard.health, wizard.name);

                if (endGame1 == 1) {
                    break;
                }

                System.out.println("\nStart " + warrior.name + "s Turn: Enter 1\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n - " + warrior.name + "s Turn");
                    wizard.health = castWarriorAbility(AI, warrior.name, warrior.health, wizard.health, warriorSpell.ability, warriorSpell.damage, warriorSpell.ability2, warriorSpell.damage2, warriorSpell.ability3, warriorSpell.damage3);

                    int endGame = death(warrior.health, warrior.name, wizard.health, wizard.name);

                    if (endGame == 1) {
                        break;
                    }

                } // close letWarriorGo

                rounds = rounds + 1;

            } // close wizardBattle

        } // close startGame

    } // close main

    public static int castWarriorAbility(int AI, String warriorName, int warriorHealth, int wizardHealth, String warriorSpell, int warriorSpellDamage, String warriorSpell2, int warriorSpellDamage2, String warriorSpell3, int warriorSpellDamage3) {

        int castAbility;

        if (AI == 1) {

            int choose = 3;
            castAbility = randomizer.nextInt(choose);

        } else {

            System.out.println("Cast Ability: 1 = " + warriorSpell + ", 2 = " + warriorSpell2 + ", 3 = " + warriorSpell3 + "\n");
            castAbility = userInput.nextInt();
            castAbility = castAbility - 1;

        }

        if (castAbility == 0) {

            System.out.println("\n" + warriorName + " executes " + warriorSpell + "!\n");
            int loop = 0;
            while (loop < 3) {
                int max = 50;
                int moreDamage = randomizer.nextInt(max);
                warriorSpellDamage = warriorSpellDamage + moreDamage;
                System.out.println("*" + warriorSpellDamage + " Damage");
                loop = loop + 1;
                wizardHealth = wizardHealth - warriorSpellDamage;
                warriorSpellDamage = 75;
            }

        } // close castAbility1

        if (castAbility == 1) {

            int miss = 2;
            int hitTarget = randomizer.nextInt(miss);

            if (hitTarget != 1) {

                int max = 150;
                int moreDamage = randomizer.nextInt(max);
                warriorSpellDamage2 = warriorSpellDamage2 + moreDamage;
                System.out.println("\n" + warriorName + " executes " + warriorSpell2 + "!\n");
                System.out.println("*" + warriorSpellDamage2 + " Damage");
                wizardHealth = wizardHealth - (warriorSpellDamage2);

            } else {

                System.out.println("\n" + warriorName + " Misses!\n");
                System.out.println("*0 Damage");

            } // close hitTarget

        } // close castAbility2

        if (castAbility == 2) {

            int chance = 2;
            int critical = randomizer.nextInt(chance);

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            warriorSpellDamage3 = warriorSpellDamage3 + moreDamage;

            System.out.println("\n" + warriorName + " executes " + warriorSpell3 + "!\n");

            if (critical == 1) {

                System.out.println("*" + warriorSpellDamage3 + " Damage");
                wizardHealth = wizardHealth - (warriorSpellDamage3);

            } else {

                System.out.println("Critical Hit!");
                System.out.println("*" + (warriorSpellDamage3 * 2) + " Damage");
                wizardHealth = wizardHealth - (warriorSpellDamage3 * 2);

            }

        } // close castAbility3

        return wizardHealth;

    } // close warriorAbility

    public static int castWizardAbility(int AI, String wizardName, int wizardHealth, int warriorHealth, String wizardSpell, int wizardSpellDamage, String wizardSpell2, int wizardSpellDamage2, String wizardSpell3, int wizardSpellDamage3) {

        int castAbility;

        if (AI == 1) {

            int choose = 3;
            castAbility = randomizer.nextInt(choose);

        } else {

            System.out.println("Cast Ability: 1 = " + wizardSpell + ", 2 = " + wizardSpell2 + ", 3 = " + wizardSpell3 + "\n");
            castAbility = userInput.nextInt();
            castAbility = castAbility - 1;

        }

        if (castAbility == 0) {

            int max = 100;
            int moreDamage = randomizer.nextInt(max);
            wizardSpellDamage = wizardSpellDamage + moreDamage;

            System.out.println("\n" + wizardName + " executes " + wizardSpell + "!\n");
            System.out.println("*" + wizardSpellDamage + " Damage");

            warriorHealth = warriorHealth - (wizardSpellDamage);

        } // close ability1

        if (castAbility == 1) {

            int start = 0;
            int total = 5;

            System.out.println("\n" + wizardName + " executes " + wizardSpell2 + "!\n");

            while (start < total) {

                int chance = 3;
                int hitTarget = randomizer.nextInt(chance);

                if (hitTarget == 2) {

                    System.out.println("Miss!");

                } else {

                    wizardSpellDamage2 = 75;
                    int max = 50;
                    int moreDamage = randomizer.nextInt(max);
                    wizardSpellDamage2 = wizardSpellDamage2 + moreDamage;
                    System.out.println("Hit! *" + wizardSpellDamage2);
                    warriorHealth = warriorHealth - wizardSpellDamage2;
                    displayTotal = displayTotal + wizardSpellDamage2;

                } // close hit or miss

                start = start + 1;

            } // close while

            System.out.println("*" + displayTotal + " Damage");
            displayTotal = 0;

        } // close ability2

        if (castAbility == 2) {

            System.out.println("\n" + wizardName + " executes " + wizardSpell3 + "!\n");
            int which = 2;
            int animal = randomizer.nextInt(which);

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            wizardSpellDamage3 = wizardSpellDamage3 + moreDamage;

            if (animal == 0) {

                System.out.println("*" + wizardSpellDamage3 + " Damage");
                warriorHealth = warriorHealth - wizardSpellDamage3;

            } else {

                System.out.println("Critical Hit!");
                System.out.println("*" + (wizardSpellDamage3 * 2) + " Damage");
                warriorHealth = warriorHealth - (wizardSpellDamage3 * 2);

            } // close chooseAnimal

        } // close ability3

        return warriorHealth;

    } // close wizardAbility

    public static int death(int warriorHealth, String warriorName, int wizardHealth, String wizardName) {

        int death = 0;

        if (warriorHealth <= death) {
            System.out.println("\n" + warriorName + " has died! " + wizardName + " wins!");
            death = 1;
        } // close warriorDeath

        if (wizardHealth <= death) {
            System.out.println("\n" + wizardName + " has died! " + warriorName + " wins!");
            death = 1;
        } // close wizardDeath

        return death;

    } // close death

} // close class

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
        boss1.health = 400;

        Character boss2 = new Character();
        boss2.role = "Priest";
        boss2.name = "High Priest Genji";
        boss2.health = 400;

        Character boss3 = new Character();
        boss3.role = "Lizard";
        boss3.name = "Reptilian";
        boss3.health = 400;

        Character boss4 = new Character();
        boss4.role = "Mech";
        boss4.name = "Kill-A-Tron 3000";
        boss4.health = 10000;

        Character boss5 = new Character();
        boss5.role = "Spirit";
        boss5.name = "Death";
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
        boss1.abilityobject.ability3 = "Charge";
        boss1.abilityobject.damage3 = 175;

        boss2.Character(boss2Spell);
        boss2.abilityobject.ability = "Smite";
        boss2.abilityobject.damage = 250;
        boss2.abilityobject.ability2 = "Invocation";
        boss2.abilityobject.damage2 = 400;
        boss2.abilityobject.ability3 = "Shadow Bolt";
        boss2.abilityobject.damage3 = 175;

        boss3.Character(boss3Spell);
        boss3.abilityobject.ability = "Acid Spit";
        boss3.abilityobject.damage = 250;
        boss3.abilityobject.ability2 = "Devour";
        boss3.abilityobject.damage2 = 125;
        boss3.abilityobject.ability3 = "Dash";
        boss3.abilityobject.damage3 = 175;
        
        boss4.Character(boss4Spell);
        boss4.abilityobject.ability = "MiniGun";
        boss4.abilityobject.damage = 75;
        boss4.abilityobject.ability2 = "Heat Seeking Missles";
        boss4.abilityobject.damage2 = 75;
        boss4.abilityobject.ability3 = "Double Katana";
        boss4.abilityobject.damage3 = 275;
        
        boss5.Character(boss5Spell);
        boss5.abilityobject.ability = "Haunt";
        boss5.abilityobject.damage = 375;
        boss5.abilityobject.ability2 = "Drain-Soul";
        boss5.abilityobject.damage2 = 25;
        boss5.abilityobject.ability3 = "Corrupt";
        boss5.abilityobject.damage3 = 225;
        
        System.out.println("--------------------");
        System.out.println("Welcome To The Dungeon");
        System.out.println("--------------------");
        System.out.println("\nYOU MUST DEFEAT 5 BOSSES TO ESCAPE. THEY WILL GET INCREASINGLY HARDER TO DEFEAT.");
        System.out.println("\nPick a class: 1 = " + warrior.role + " 2 = " + wizard.role + "\n");
        int roleQuestion = userInput.nextInt();

        if (roleQuestion == 1) {
            System.out.println("\n----- " + warrior.name + " the " + warrior.role + "! -----");
            System.out.println("\nAbilities:\n - " + warriorSpell.ability + ": Spin Your Axe Around Dealing (75 - 125) Damage 3 Times");
            System.out.println(" - " + warriorSpell.ability2 + ": Swing Your Axe with All Your Force Dealing (450 - 600) Damage with a 50% Chance to Miss");
            System.out.println(" - " + warriorSpell.ability3 + ": Sneak Up Behind Your Opponent and Stab Them in the Back Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
        } else {
            System.out.println("\n----- " + wizard.name + " the " + wizard.role + "! -----");
            System.out.println("\nAbilities:\n - " + wizardSpell.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
            System.out.println(" - " + wizardSpell.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
            System.out.println(" - " + wizardSpell.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
        }

        System.out.println("\nEnter 1 to Descend into the Dungeon\n");
        int startGame = userInput.nextInt();

        while (startGame == 1) {

            if (roleQuestion == 1) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 1: THE ORC KING -----");
                    System.out.println("- Green : 12' Tall : 550 Pounds : Sharp Tusks -");
                    System.out.println("- Dim-Witted : Savage : Fierce : Angry -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss1.abilityobject.ability + ": Jump High Into The Air & Land on Your Opponent, Crushing Them & Dealing (250 - 350) Damage");
                    System.out.println("- " + boss1.abilityobject.ability2 + ": Swing Your Axe With All Your Body Weight for an Overpowered Attack Dealing (450 - 600) Damage with a 50% Chance to Miss");
                    System.out.println("- " + boss1.abilityobject.ability3 + ": Sprint Directly at Your Opponent & Trample Over Them Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight The Orc King\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println(boss1.name + ": " + boss1.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + warrior.name + "s Turn -----");
                boss1.health = castWarriorAbility(notAI, warrior.name, warrior.health, boss1.health, warrior.abilityobject.ability, warrior.abilityobject.damage, warrior.abilityobject.ability2, warrior.abilityobject.damage2, warrior.abilityobject.ability3, warrior.abilityobject.damage3);

                int endGame = death(warrior.health, warrior.name, boss1.health, boss1.name);

                if (endGame == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart != 0) {

                    System.out.println("\n----- " + boss1.name + "s Turn -----");
                    warrior.health = castOrcKingAbility(AI, boss1.name, boss1.health, warrior.health, boss1.abilityobject.ability, boss1.abilityobject.damage, boss1.abilityobject.ability2, boss1.abilityobject.damage2, boss1.abilityobject.ability3, boss1.abilityobject.damage3);

                    int endGame1 = death(warrior.health, warrior.name, boss1.health, boss1.name);

                    if (endGame1 == 1) {
                        break;
                    }
                    
                } // close letOpponentStart
                
                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close warriorBattle

            if (roleQuestion == 2) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 1: THE ORC KING -----");
                    System.out.println("- Green : 12' Tall : 550 Pounds : Sharp Tusks -");
                    System.out.println("- Dim-Witted : Savage : Fierce : Angry -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss1.abilityobject.ability + ": Jump High Into The Air & Land on Your Opponent, Crushing Them & Dealing (250 - 350) Damage");
                    System.out.println("- " + boss1.abilityobject.ability2 + ": Swing Your Axe With All Your Body Weight for an Overpowered Attack Dealing (450 - 600) Damage");
                    System.out.println("- " + boss1.abilityobject.ability3 + ": Sprint Directly at Your Opponent & Trample Over Them Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight The Orc King\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(wizard.name + ": " + wizard.health + " Health");
                System.out.println(boss1.name + ": " + boss1.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + wizard.name + "s Turn -----");
                boss1.health = castWizardAbility(notAI, wizard.name, wizard.health, boss1.health, wizard.abilityobject.ability, wizard.abilityobject.damage, wizard.abilityobject.ability2, wizard.abilityobject.damage2, wizard.abilityobject.ability3, wizard.abilityobject.damage3);

                int endGame1 = death(boss1.health, boss1.name, wizard.health, wizard.name);

                if (endGame1 == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n----- " + boss1.name + "s Turn -----");
                    wizard.health = castOrcKingAbility(AI, boss1.name, boss1.health, wizard.health, boss1.abilityobject.ability, boss1.abilityobject.damage, boss1.abilityobject.ability2, boss1.abilityobject.damage2, boss1.abilityobject.ability3, boss1.abilityobject.damage3);

                    int endGame = death(boss1.health, boss1.name, wizard.health, wizard.name);

                    if (endGame == 1) {
                        break;
                    }

                } // close letWarriorGo

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close wizardBattle

        } // close startGame

        warrior.health = 10000;
        wizard.health = 10000;
        rounds = 1;
        
        System.out.println("\nEnter 1 to Descend Deeper\n");
        userInput.nextInt();
        
        while (startGame == 1) {

            if (roleQuestion == 1) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 2: HIGH PRIEST GENJI -----");
                    System.out.println("- Elf : Blonde Hair : Blue Eyes : Pointy Ears -");
                    System.out.println("- Extremely Intelligent : Egotistical : Insane -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss2.abilityobject.ability + ": Strike Down Your Opponent With Holy Light Dealing (250 - 350) Damage");
                    System.out.println("- " + boss2.abilityobject.ability2 + ": Restore (450 - 600) Health to Yourself");
                    System.out.println("- " + boss2.abilityobject.ability3 + ": Call Upon Evil to Harness Dark Magic & Then Project the Energy Forward Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight High Priest Genji\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println(boss2.name + ": " + boss2.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + warrior.name + "s Turn -----");
                boss2.health = castWarriorAbility(notAI, warrior.name, warrior.health, boss2.health, warrior.abilityobject.ability, warrior.abilityobject.damage, warrior.abilityobject.ability2, warrior.abilityobject.damage2, warrior.abilityobject.ability3, warrior.abilityobject.damage3);

                int endGame = death(warrior.health, warrior.name, boss2.health, boss2.name);

                if (endGame == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart != 0) {

                    System.out.println("\n----- " + boss2.name + "s Turn -----");
                    warrior.health = castPriestAbility(AI, boss2.name, boss2.health, warrior.health, boss2.abilityobject.ability, boss2.abilityobject.damage, boss2.abilityobject.ability2, boss2.abilityobject.damage2, boss2.abilityobject.ability3, boss2.abilityobject.damage3);

                    int endGame1 = death(warrior.health, warrior.name, boss2.health, boss2.name);

                    if (endGame1 == 1) {
                        break;
                    }

                } // close letOpponentStart

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close warriorBattle

            if (roleQuestion == 2) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 2: HIGH PRIEST GENJI -----");
                    System.out.println("- Elf : Blonde Hair : Blue Eyes : Pointy Ears -");
                    System.out.println("- Extremely Intelligent : Egotistical : Insane -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss2.abilityobject.ability + ": Strike Down Your Opponent With Holy Light Dealing (250 - 350) Damage");
                    System.out.println("- " + boss2.abilityobject.ability2 + ": Restore (450 - 600) Health to Yourself");
                    System.out.println("- " + boss2.abilityobject.ability3 + ": Call Upon Evil to Harness Dark Magic & Then Project the Energy Forward Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight High Priest Genji\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(wizard.name + ": " + wizard.health + " Health");
                System.out.println(boss2.name + ": " + boss2.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + wizard.name + "s Turn -----");
                boss2.health = castWizardAbility(notAI, wizard.name, wizard.health, boss2.health, wizard.abilityobject.ability, wizard.abilityobject.damage, wizard.abilityobject.ability2, wizard.abilityobject.damage2, wizard.abilityobject.ability3, wizard.abilityobject.damage3);

                int endGame1 = death(boss2.health, boss2.name, wizard.health, wizard.name);

                if (endGame1 == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n----- " + boss2.name + "s Turn -----");
                    wizard.health = castPriestAbility(AI, boss2.name, boss2.health, wizard.health, boss2.abilityobject.ability, boss2.abilityobject.damage, boss2.abilityobject.ability2, boss2.abilityobject.damage2, boss2.abilityobject.ability3, boss2.abilityobject.damage3);

                    int endGame = death(boss2.health, boss2.name, wizard.health, wizard.name);

                    if (endGame == 1) {
                        break;
                    }

                } // close letWarriorGo

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close wizardBattle

        } // close startGame2
        
        warrior.health = 10000;
        wizard.health = 10000;
        rounds = 1;
        
        System.out.println("\nEnter 1 to Descend Deeper\n");
        userInput.nextInt();
        
        while (startGame == 1) {

            if (roleQuestion == 1) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 3: REPTILIAN -----");
                    System.out.println("- Lizard : Green : Slimey : Scaled -");
                    System.out.println("- Incredible Speed : Deranged : Frenzied -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss3.abilityobject.ability + ": Shoot a Ball of Acid From Your Stomach at Your Opponent Dealing (250 - 350) Damage");
                    System.out.println("- " + boss3.abilityobject.ability2 + ": Take a Bite Out of Your Opponents Neck Causing Them to Bleed Out Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each");
                    System.out.println("- " + boss3.abilityobject.ability3 + ": Dart to Your Opponent & Slash Their Chest With Your Claws Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight Reptilian\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println(boss3.name + ": " + boss3.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + warrior.name + "s Turn -----");
                boss3.health = castWarriorAbility(notAI, warrior.name, warrior.health, boss3.health, warrior.abilityobject.ability, warrior.abilityobject.damage, warrior.abilityobject.ability2, warrior.abilityobject.damage2, warrior.abilityobject.ability3, warrior.abilityobject.damage3);

                int endGame = death(warrior.health, warrior.name, boss3.health, boss3.name);

                if (endGame == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart != 0) {

                    System.out.println("\n----- " + boss3.name + "s Turn -----");
                    warrior.health = castReptilianAbility(AI, boss3.name, boss3.health, warrior.health, boss3.abilityobject.ability, boss3.abilityobject.damage, boss3.abilityobject.ability2, boss3.abilityobject.damage2, boss3.abilityobject.ability3, boss3.abilityobject.damage3);

                    int endGame1 = death(warrior.health, warrior.name, boss3.health, boss3.name);

                    if (endGame1 == 1) {
                        break;
                    }

                } // close letOpponentStart

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close warriorBattle

            if (roleQuestion == 2) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 3: REPTILIAN -----");
                    System.out.println("- Lizard : Green : Slimey : Scaled -");
                    System.out.println("- Incredible Speed : Deranged : Frenzied -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss3.abilityobject.ability + ": Shoot a Ball of Acid From Your Stomach at Your Opponent Dealing (250 - 350) Damage");
                    System.out.println("- " + boss3.abilityobject.ability2 + ": Take a Bite Out of Your Opponents Neck Causing Them to Bleed Out Dealing (125 - 175) Damage 4 Times with a 33% Chance to Miss Each");
                    System.out.println("- " + boss3.abilityobject.ability3 + ": Dart to Your Opponent & Slash Their Chest With Your Claws Dealing (175 - 225) Damage with a 50% Chance to Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight Reptilian\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(wizard.name + ": " + wizard.health + " Health");
                System.out.println(boss3.name + ": " + boss3.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + wizard.name + "s Turn -----");
                boss3.health = castWizardAbility(notAI, wizard.name, wizard.health, boss3.health, wizard.abilityobject.ability, wizard.abilityobject.damage, wizard.abilityobject.ability2, wizard.abilityobject.damage2, wizard.abilityobject.ability3, wizard.abilityobject.damage3);

                int endGame1 = death(boss3.health, boss3.name, wizard.health, wizard.name);

                if (endGame1 == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n----- " + boss3.name + "s Turn -----");
                    wizard.health = castReptilianAbility(AI, boss3.name, boss3.health, wizard.health, boss3.abilityobject.ability, boss3.abilityobject.damage, boss3.abilityobject.ability2, boss3.abilityobject.damage2, boss3.abilityobject.ability3, boss3.abilityobject.damage3);

                    int endGame = death(boss3.health, boss3.name, wizard.health, wizard.name);

                    if (endGame == 1) {
                        break;
                    }

                } // close letWarriorGo

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close wizardBattle

        } // close startGame3
        
        warrior.health = 10000;
        wizard.health = 10000;
        rounds = 1;
        
        System.out.println("\nEnter 1 to Descend Deeper\n");
        userInput.nextInt();
        
        while (startGame == 1) {

            if (roleQuestion == 1) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 4: KILL-A-TRON 3000 -----");
                    System.out.println("- Mech : Steel : Robot : Weaponized -");
                    System.out.println("- Emotionless : Aggressive : Designed to Kill -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss4.abilityobject.ability + ": Convert Your Arms Into Gatlin Guns and Unload Dealing (75 - 125) Damage 4 Times");
                    System.out.println("- " + boss4.abilityobject.ability2 + ": Convert Your Arms Into a Rocket Launcher and Fire Missles Dealing (75 - 125) Damage 6 Times with a 33% Chance to Miss Each");
                    System.out.println("- " + boss4.abilityobject.ability3 + ": Convert Your Arms Into Two Samurai Swords and Attempt to Slash Your Opponent Dealing (275 - 325) Damage with a 75% Chance to Hit, if Attack Hits Perform Attack again with a 50% Chance to Hit");
                    System.out.println("\nEnter 1 to Fight Kill-A-Tron 3000\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println(boss4.name + ": " + boss4.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + warrior.name + "s Turn -----");
                boss4.health = castWarriorAbility(notAI, warrior.name, warrior.health, boss4.health, warrior.abilityobject.ability, warrior.abilityobject.damage, warrior.abilityobject.ability2, warrior.abilityobject.damage2, warrior.abilityobject.ability3, warrior.abilityobject.damage3);

                int endGame = death(warrior.health, warrior.name, boss4.health, boss4.name);

                if (endGame == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart != 0) {

                    System.out.println("\n----- " + boss4.name + "s Turn -----");
                    warrior.health = castMechAbility(notAI, boss4.name, boss4.health, warrior.health, boss4.abilityobject.ability, boss4.abilityobject.damage, boss4.abilityobject.ability2, boss4.abilityobject.damage2, boss4.abilityobject.ability3, boss4.abilityobject.damage3);

                    int endGame1 = death(warrior.health, warrior.name, boss4.health, boss4.name);

                    if (endGame1 == 1) {
                        break;
                    }

                } // close letOpponentStart

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close warriorBattle

            if (roleQuestion == 2) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 4: KILL-A-TRON 3000 -----");
                    System.out.println("- Mech : Steel : Robot : Weaponized -");
                    System.out.println("- Emotionless : Aggressive : Designed to Kill -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss4.abilityobject.ability + ": Convert Your Arms Into Gatlin Guns and Unload Dealing (75 - 125) Damage 4 Times");
                    System.out.println("- " + boss4.abilityobject.ability2 + ": Convert Your Arms Into a Rocket Launcher and Fire Missles Dealing (75 - 125) Damage 6 Times with a 33% Chance to Miss Each");
                    System.out.println("- " + boss4.abilityobject.ability3 + ": Convert Your Arms Into Two Samurai Swords and Attempt to Slash Your Opponent Dealing (275 - 325) Damage with a 75% Chance to Hit, if Attack Hits Perform Attack again with a 50% Chance to Hit");
                    System.out.println("\nEnter 1 to Fight Kill-A-Tron 3000\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(wizard.name + ": " + wizard.health + " Health");
                System.out.println(boss4.name + ": " + boss4.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + wizard.name + "s Turn -----");
                boss4.health = castWizardAbility(notAI, wizard.name, wizard.health, boss4.health, wizard.abilityobject.ability, wizard.abilityobject.damage, wizard.abilityobject.ability2, wizard.abilityobject.damage2, wizard.abilityobject.ability3, wizard.abilityobject.damage3);

                int endGame1 = death(boss4.health, boss4.name, wizard.health, wizard.name);

                if (endGame1 == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n----- " + boss4.name + "s Turn -----");
                    wizard.health = castMechAbility(AI, boss4.name, boss4.health, wizard.health, boss4.abilityobject.ability, boss4.abilityobject.damage, boss4.abilityobject.ability2, boss4.abilityobject.damage2, boss4.abilityobject.ability3, boss4.abilityobject.damage3);

                    int endGame = death(boss4.health, boss4.name, wizard.health, wizard.name);

                    if (endGame == 1) {
                        break;
                    }

                } // close letWarriorGo

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close wizardBattle

        } // close startGame4
        
        warrior.health = 10000;
        wizard.health = 10000;
        rounds = 1;
        
        System.out.println("\nEnter 1 to Descend Deeper\n");
        userInput.nextInt();
        
        while (startGame == 1) {

            if (roleQuestion == 1) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 5: DEATH -----");
                    System.out.println("- Spirit : Dark : Shadow : Reaper -");
                    System.out.println("- Feels Nothing : Drags People to Underworld : Unstoppable -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss5.abilityobject.ability + ": Terrify Your Opponent by Following Them But Never Confronting Them Dealing (375 - 425) Damage");
                    System.out.println("- " + boss5.abilityobject.ability2 + ": Drain the Life Force Out of Your Opponent Dealing (25 - 75) Damage 10 Times with a 33% Chance to Miss Each");
                    System.out.println("- " + boss5.abilityobject.ability3 + ": Rot Your Opponents Body Dealing (225 - 275) Damage with a 50% Chance to Corrupt Internal Organs & Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight Death\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println(boss5.name + ": " + boss5.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + warrior.name + "s Turn -----");
                boss5.health = castWarriorAbility(notAI, warrior.name, warrior.health, boss5.health, warrior.abilityobject.ability, warrior.abilityobject.damage, warrior.abilityobject.ability2, warrior.abilityobject.damage2, warrior.abilityobject.ability3, warrior.abilityobject.damage3);

                int endGame = death(warrior.health, warrior.name, boss5.health, boss5.name);

                if (endGame == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart != 0) {

                    System.out.println("\n----- " + boss5.name + "s Turn -----");
                    warrior.health = castDeathAbility(AI, boss5.name, boss5.health, warrior.health, boss5.abilityobject.ability, boss5.abilityobject.damage, boss5.abilityobject.ability2, boss5.abilityobject.damage2, boss5.abilityobject.ability3, boss5.abilityobject.damage3);

                    int endGame1 = death(warrior.health, warrior.name, boss5.health, boss5.name);

                    if (endGame1 == 1) {
                        break;
                    }

                } // close letOpponentStart

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close warriorBattle

            if (roleQuestion == 2) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                if (rounds == 1) {
                    System.out.println("\n----- Level 5: DEATH -----");
                    System.out.println("- Spirit : Dark : Shadow : Reaper -");
                    System.out.println("- Feels Nothing : Drags People to Underworld : Unstoppable -");
                    System.out.println("----------- Abilities -----------");
                    System.out.println("- " + boss5.abilityobject.ability + ": Terrify Your Opponent by Following Them But Never Confronting Them Dealing (375 - 425) Damage");
                    System.out.println("- " + boss5.abilityobject.ability2 + ": Drain the Life Force Out of Your Opponent Dealing (25 - 75) Damage 10 Times with a 33% Chance to Miss Each");
                    System.out.println("- " + boss5.abilityobject.ability3 + ": Rot Your Opponents Body Dealing (225 - 275) Damage with a 50% Chance to Corrupt Internal Organs & Deal Critical Damage");
                    System.out.println("\nEnter 1 to Fight Death\n");
                    userInput.nextInt();
                }

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(wizard.name + ": " + wizard.health + " Health");
                System.out.println(boss5.name + ": " + boss5.health + " Health");
                System.out.println("--------------------\n");

                System.out.println("----- " + wizard.name + "s Turn -----");
                boss5.health = castWizardAbility(notAI, wizard.name, wizard.health, boss5.health, wizard.abilityobject.ability, wizard.abilityobject.damage, wizard.abilityobject.ability2, wizard.abilityobject.damage2, wizard.abilityobject.ability3, wizard.abilityobject.damage3);

                int endGame1 = death(boss5.health, boss5.name, wizard.health, wizard.name);

                if (endGame1 == 1) {
                    break;
                }

                System.out.println("\n----- Start Enemy Turn: Enter 1 -----\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n----- " + boss5.name + "s Turn -----");
                    wizard.health = castDeathAbility(AI, boss5.name, boss5.health, wizard.health, boss5.abilityobject.ability, boss5.abilityobject.damage, boss5.abilityobject.ability2, boss5.abilityobject.damage2, boss5.abilityobject.ability3, boss5.abilityobject.damage3);

                    int endGame = death(boss5.health, boss5.name, wizard.health, wizard.name);

                    if (endGame == 1) {
                        break;
                    }

                } // close letWarriorGo

                System.out.println("\n----- End Turn: Enter 1 -----\n");
                userInput.nextInt();
                
                rounds = rounds + 1;

            } // close wizardBattle

        } // close startGame5

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

            System.out.println("\n- " + warriorSpell + "! -\n");
            int loop = 0;
            while (loop < 3) {
                int max = 50;
                int moreDamage = randomizer.nextInt(max);
                warriorSpellDamage = warriorSpellDamage + moreDamage;
                System.out.println("*" + warriorSpellDamage + " Damage");
                loop = loop + 1;
                wizardHealth = wizardHealth - warriorSpellDamage;
                displayTotal = displayTotal + warriorSpellDamage;
                warriorSpellDamage = 75;
            }
            
            System.out.println("----------");
            System.out.println("*" + displayTotal + " Total");
            displayTotal = 0;
            
        } // close castAbility1

        if (castAbility == 1) {

            int miss = 2;
            int hitTarget = randomizer.nextInt(miss);

            if (hitTarget != 1) {

                int max = 150;
                int moreDamage = randomizer.nextInt(max);
                warriorSpellDamage2 = warriorSpellDamage2 + moreDamage;
                System.out.println("\n- " + warriorSpell2 + "! -\n");
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

            System.out.println("\n- " + warriorSpell3 + "! -\n");

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

            System.out.println("\n- " + wizardSpell + "! -\n");
            System.out.println("*" + wizardSpellDamage + " Damage");

            warriorHealth = warriorHealth - (wizardSpellDamage);

        } // close ability1

        if (castAbility == 1) {

            int start = 0;
            int total = 5;

            System.out.println("\n- " + wizardSpell2 + "!- \n");

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

            System.out.println("----------");
            System.out.println("*" + displayTotal + " Total");
            displayTotal = 0;

        } // close ability2

        if (castAbility == 2) {

            System.out.println("\n- " + wizardSpell3 + "! -\n");
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

    public static int castOrcKingAbility(int AI, String orcName, int orcHealth, int warriorHealth, String orcSpell, int orcSpellDamage, String orcSpell2, int orcSpellDamage2, String orcSpell3, int orcSpellDamage3) {

        int castAbility;

        if (AI == 1) {

            int choose = 3;
            castAbility = randomizer.nextInt(choose);

        } else {

            System.out.println("Cast Ability: 1 = " + orcSpell + ", 2 = " + orcSpell2 + ", 3 = " + orcSpell3 + "\n");
            castAbility = userInput.nextInt();
            castAbility = castAbility - 1;

        }

        if (castAbility == 0) {

            int max = 100;
            int moreDamage = randomizer.nextInt(max);
            orcSpellDamage = orcSpellDamage + moreDamage;

            System.out.println("\n- " + orcSpell + "! -\n");
            System.out.println("*" + orcSpellDamage + " Damage");

            warriorHealth = warriorHealth - (orcSpellDamage);

        } // close ability1

        if (castAbility == 1) {

            System.out.println("\n- " + orcSpell2 + "! -");
            int miss = 2;
            int hitTarget = randomizer.nextInt(miss);

            if (hitTarget != 1) {

                int max = 150;
                int moreDamage = randomizer.nextInt(max);
                orcSpellDamage2 = orcSpellDamage2 + moreDamage;

                System.out.println("\n*" + orcSpellDamage2 + " Damage");
                warriorHealth = warriorHealth - (orcSpellDamage2);

            } else {

                System.out.println("\n" + orcName + " Misses!");
                System.out.println("*0 Damage");

            } // close hitTarget

        } // close castAbility2

        if (castAbility == 2) {

            System.out.println("\n- " + orcSpell3 + "! -\n");
            int which = 2;
            int animal = randomizer.nextInt(which);

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            orcSpellDamage3 = orcSpellDamage3 + moreDamage;

            if (animal == 0) {

                System.out.println("*" + orcSpellDamage3 + " Damage");
                warriorHealth = warriorHealth - orcSpellDamage3;

            } else {

                System.out.println("Critical Hit!");
                System.out.println("*" + (orcSpellDamage3 * 2) + " Damage");
                warriorHealth = warriorHealth - (orcSpellDamage3 * 2);

            } // close chooseAnimal

        } // close ability3

        return warriorHealth;

    } // close orcAbility

    public static int castPriestAbility(int AI, String priestName, int priestHealth, int warriorHealth, String priestSpell, int priestSpellDamage, String priestSpell2, int priestSpellDamage2, String priestSpell3, int priestSpellDamage3) {

        int castAbility;

        if (AI == 1) {

            int choose = 3;
            castAbility = randomizer.nextInt(choose);

        } else {

            System.out.println("Cast Ability: 1 = " + priestSpell + ", 2 = " + priestSpell2 + ", 3 = " + priestSpell3 + "\n");
            castAbility = userInput.nextInt();
            castAbility = castAbility - 1;

        }

        if (castAbility == 0) {

            int max = 100;
            int moreDamage = randomizer.nextInt(max);
            priestSpellDamage = priestSpellDamage + moreDamage;

            System.out.println("\n- " + priestSpell + "! -\n");
            System.out.println("*" + priestSpellDamage + " Damage");

            warriorHealth = warriorHealth - (priestSpellDamage);

        } // close ability1

        if (castAbility == 1) {

            System.out.println("\n- " + priestSpell2 + "! -");
            int miss = 2;
            int hitTarget = randomizer.nextInt(miss);

            if (hitTarget != 1) {

                int max = 150;
                int moreDamage = randomizer.nextInt(max);
                priestSpellDamage2 = priestSpellDamage2 + moreDamage;

                System.out.println("\n*" + priestSpellDamage2 + " Damage");
                warriorHealth = warriorHealth - (priestSpellDamage2);

            } else {

                System.out.println("\n" + priestName + " Misses!");
                System.out.println("*0 Damage");

            } // close hitTarget

        } // close castAbility2

        if (castAbility == 2) {

            System.out.println("\n- " + priestSpell3 + "! -\n");
            int which = 2;
            int animal = randomizer.nextInt(which);

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            priestSpellDamage3 = priestSpellDamage3 + moreDamage;

            if (animal == 0) {

                System.out.println("*" + priestSpellDamage3 + " Damage");
                warriorHealth = warriorHealth - priestSpellDamage3;

            } else {

                System.out.println("Critical Hit!");
                System.out.println("*" + (priestSpellDamage3 * 2) + " Damage");
                warriorHealth = warriorHealth - (priestSpellDamage3 * 2);

            } // close chooseAnimal

        } // close ability3

            return warriorHealth;

    } // close priestAbility
    
    public static int castReptilianAbility(int AI, String lizardName, int lizardHealth, int warriorHealth, String lizardSpell, int lizardSpellDamage, String lizardSpell2, int lizardSpellDamage2, String lizardSpell3, int lizardSpellDamage3) {

        int castAbility;

        if (AI == 1) {

            int choose = 3;
            castAbility = randomizer.nextInt(choose);

        } else {

            System.out.println("Cast Ability: 1 = " + lizardSpell + ", 2 = " + lizardSpell2 + ", 3 = " + lizardSpell3 + "\n");
            castAbility = userInput.nextInt();
            castAbility = castAbility - 1;

        }

        if (castAbility == 0) {

            int max = 100;
            int moreDamage = randomizer.nextInt(max);
            lizardSpellDamage = lizardSpellDamage + moreDamage;

            System.out.println("\n- " + lizardSpell + "! -\n");
            System.out.println("*" + lizardSpellDamage + " Damage");

            warriorHealth = warriorHealth - (lizardSpellDamage);

        } // close ability1

        if (castAbility == 1) {

            int start = 0;
            int total = 4;

            System.out.println("\n- " + lizardSpell2 + "!- \n");

            while (start < total) {

                int chance = 3;
                int hitTarget = randomizer.nextInt(chance);

                if (hitTarget == 2) {

                    System.out.println("Miss!");

                } else {

                    lizardSpellDamage2 = 125;
                    int max = 50;
                    int moreDamage = randomizer.nextInt(max);
                    lizardSpellDamage2 = lizardSpellDamage2 + moreDamage;
                    System.out.println("Hit! *" + lizardSpellDamage2);
                    warriorHealth = warriorHealth - lizardSpellDamage2;
                    displayTotal = displayTotal + lizardSpellDamage2;

                } // close hit or miss

                start = start + 1;

            } // close while

            System.out.println("*" + displayTotal + " Damage");
            displayTotal = 0;

        } // close castAbility2

        if (castAbility == 2) {

            System.out.println("\n- " + lizardSpell3 + "! -\n");
            int which = 2;
            int animal = randomizer.nextInt(which);

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            lizardSpellDamage3 = lizardSpellDamage3 + moreDamage;

            if (animal == 0) {

                System.out.println("*" + lizardSpellDamage3 + " Damage");
                warriorHealth = warriorHealth - lizardSpellDamage3;

            } else {

                System.out.println("Critical Hit!");
                System.out.println("*" + (lizardSpellDamage3 * 2) + " Damage");
                warriorHealth = warriorHealth - (lizardSpellDamage3 * 2);

            } // close chooseAnimal

        } // close ability3

            return warriorHealth;

    } // close reptilianAbility
    
    public static int castMechAbility(int AI, String mechName, int mechHealth, int warriorHealth, String mechSpell, int mechSpellDamage, String mechSpell2, int mechSpellDamage2, String mechSpell3, int mechSpellDamage3) {

        int castAbility;

        if (AI == 1) {

            int choose = 3;
            castAbility = randomizer.nextInt(choose);

        } else {

            System.out.println("Cast Ability: 1 = " + mechSpell + ", 2 = " + mechSpell2 + ", 3 = " + mechSpell3 + "\n");
            castAbility = userInput.nextInt();
            castAbility = castAbility - 1;

        }

        if (castAbility == 0) {

            System.out.println("\n- " + mechSpell + "! -\n");
            int loop = 0;
            while (loop < 4) {
                int max = 50;
                int moreDamage = randomizer.nextInt(max);
                mechSpellDamage = mechSpellDamage + moreDamage;
                System.out.println("*" + mechSpellDamage + " Damage");
                loop = loop + 1;
                warriorHealth = warriorHealth - mechSpellDamage;
                displayTotal = displayTotal + mechSpellDamage;
                mechSpellDamage = 75;
            }
            
            System.out.println("----------");
            System.out.println("*" + displayTotal + " Total");
            displayTotal = 0;
            
        } // close castAbility1

        if (castAbility == 1) {

            int start = 0;
            int total = 6;

            System.out.println("\n- " + mechSpell2 + "!- \n");

            while (start < total) {

                int chance = 3;
                int hitTarget = randomizer.nextInt(chance);

                if (hitTarget == 2) {

                    System.out.println("Miss!");

                } else {

                    mechSpellDamage2 = 75;
                    int max = 50;
                    int moreDamage = randomizer.nextInt(max);
                    mechSpellDamage2 = mechSpellDamage2 + moreDamage;
                    System.out.println("Hit! *" + mechSpellDamage2);
                    warriorHealth = warriorHealth - mechSpellDamage2;
                    displayTotal = displayTotal + mechSpellDamage2;

                } // close hit or miss

                start = start + 1;

            } // close while

            System.out.println("*" + displayTotal + " Damage");
            displayTotal = 0;

        } // close castAbility2

        if (castAbility == 2) {

            System.out.println("\n- " + mechSpell3 + "! -\n");
            int which = 4;
            int animal = randomizer.nextInt(which);

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            mechSpellDamage3 = mechSpellDamage3 + moreDamage;

            if (animal != 0) {

                System.out.println("*" + mechSpellDamage3 + " Damage");
                warriorHealth = warriorHealth - mechSpellDamage3;

            } else {

                System.out.println("Miss!");

            } // close chooseAnimal
            
            mechSpellDamage3 = 275;
            
            int hello = 2;
            int hope = randomizer.nextInt(hello);
            
            int again = 50;
            int againDamage = randomizer.nextInt(again);
            mechSpellDamage3 = mechSpellDamage3 + againDamage;
            
            if(hope != 0) {
            
                System.out.println("\n*" + mechSpellDamage3 + " Damage");
                warriorHealth = warriorHealth - mechSpellDamage3;
                
            } else {
                
                System.out.println("\nMiss!");
                
            }

        } // close ability3

            return warriorHealth;

    } // close mechAbility

    public static int castDeathAbility(int AI, String deathName, int deathHealth, int warriorHealth, String deathSpell, int deathSpellDamage, String deathSpell2, int deathSpellDamage2, String deathSpell3, int deathSpellDamage3) {

        int castAbility;

        if (AI == 1) {

            int choose = 3;
            castAbility = randomizer.nextInt(choose);

        } else {

            System.out.println("Cast Ability: 1 = " + deathSpell + ", 2 = " + deathSpell2 + ", 3 = " + deathSpell3 + "\n");
            castAbility = userInput.nextInt();
            castAbility = castAbility - 1;

        }

        if (castAbility == 0) {

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            deathSpellDamage = deathSpellDamage + moreDamage;

            System.out.println("\n- " + deathSpell + "! -\n");
            System.out.println("*" + deathSpellDamage + " Damage");

            warriorHealth = warriorHealth - (deathSpellDamage);

        } // close ability1

        if (castAbility == 1) {

            int start = 0;
            int total = 10;

            System.out.println("\n- " + deathSpell2 + "!- \n");

            while (start < total) {

                int chance = 3;
                int hitTarget = randomizer.nextInt(chance);

                if (hitTarget == 2) {

                    System.out.println("Miss!");

                } else {

                    deathSpellDamage2 = 25;
                    int max = 50;
                    int moreDamage = randomizer.nextInt(max);
                    deathSpellDamage2 = deathSpellDamage2 + moreDamage;
                    System.out.println("Hit! *" + deathSpellDamage2);
                    warriorHealth = warriorHealth - deathSpellDamage2;
                    displayTotal = displayTotal + deathSpellDamage2;

                } // close hit or miss

                start = start + 1;

            } // close while

            System.out.println("*" + displayTotal + " Damage");
            displayTotal = 0;

        } // close castAbility2

        if (castAbility == 2) {

            System.out.println("\n- " + deathSpell3 + "! -\n");
            int which = 2;
            int animal = randomizer.nextInt(which);

            int max = 50;
            int moreDamage = randomizer.nextInt(max);
            deathSpellDamage3 = deathSpellDamage3 + moreDamage;

            if (animal == 0) {

                System.out.println("*" + deathSpellDamage3 + " Damage");
                warriorHealth = warriorHealth - deathSpellDamage3;

            } else {

                System.out.println("Critical Hit!");
                System.out.println("*" + (deathSpellDamage3 * 2) + " Damage");
                warriorHealth = warriorHealth - (deathSpellDamage3 * 2);

            } // close chooseAnimal

        } // close ability3

            return warriorHealth;

    } // close deathAbility
    
    public static int death(int warriorHealth, String warriorName, int wizardHealth, String wizardName) {

        int death = 0;

        if (warriorHealth <= death) {
            System.out.println("\n- " + warriorName + " has died! " + wizardName + " wins! -");
            death = 1;
        } // close warriorDeath

        if (wizardHealth <= death) {
            System.out.println("\n- " + wizardName + " has died! " + warriorName + " wins! -");
            death = 1;
        } // close wizardDeath

        return death;

    } // close death

} // close class
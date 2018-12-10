package Game;

import java.util.Scanner;
import java.util.Random;

public class Battle {

    public static int rounds = 1;

    public static Scanner userInput = new Scanner(System.in);
    public static Random randomizer = new Random();

    public static int displayTotal = 0;

    public static void main(String[] args) {

        Abilities warriorSpell = new Abilities();
        Abilities wizardSpell = new Abilities();
        Abilities assassinSpell = new Abilities();
        Abilities alchemistSpell = new Abilities();
        Abilities necromancerSpell = new Abilities();
        Abilities boxerSpell = new Abilities();
        
        Character warrior = new Character();
        warrior.role = "Warrior";
        warrior.name = "Ragnar";
        warrior.health = 10000;

        Character wizard = new Character();
        wizard.role = "Wizard";
        wizard.name = "Blaze";
        wizard.health = 10000;

        Character assassin = new Character();
        assassin.role = "Assassin";
        assassin.name = "Shadow";
        assassin.health = 10000;

        Character alchemist = new Character();
        alchemist.role = "Alchemist";
        alchemist.name = "One-Eye";
        alchemist.health = 10000;

        Character necromancer = new Character();
        necromancer.role = "Necromancer";
        necromancer.name = "Rot";
        necromancer.health = 10000;

        Character boxer = new Character();
        boxer.role = "Boxer";
        boxer.name = "Steve";
        boxer.health = 10000;

        Character ranger = new Character();
        ranger.role = "Ranger";
        ranger.name = "Edge"; // maybe edge or razor 
        ranger.health = 10000;

        Character shapeshifter = new Character();
        ranger.role = "Shape-Shifter";
        ranger.name = "Raven";
        ranger.health = 10000;

        Character cyborg = new Character();
        ranger.role = "Cyborg";
        ranger.name = "The Machine";
        ranger.health = 10000;

        Character demonslayer = new Character();
        ranger.role = "Demon-Slayer"; // maybe "Dragon-Slayer"
        ranger.name = "Fel King";
        ranger.health = 10000;

        warrior.Character(warriorSpell);
        warrior.abilityobject.ability = "Whirlwind";
        warrior.abilityobject.damage = 75;
        warrior.abilityobject.ability2 = "Haymaker";
        warrior.abilityobject.damage2 = 450;
        warrior.abilityobject.ability3 = "Catapult";
        warrior.abilityobject.damage3 = 175;

        wizard.Character(wizardSpell);
        wizard.abilityobject.ability = "Lighting Bolt";
        wizard.abilityobject.damage = 250;
        wizard.abilityobject.ability2 = "Meteor Shower";
        wizard.abilityobject.damage2 = 0;
        wizard.abilityobject.ability3 = "Conjure Beast";
        wizard.abilityobject.damage3 = 175;

        assassin.Character(assassinSpell);
        assassin.abilityobject.ability = "Tricks";
        assassin.abilityobject.damage = 250;
        assassin.abilityobject.ability2 = "Backstab";
        assassin.abilityobject.damage2 = 175;
        assassin.abilityobject.ability3 = "Shurikens";
        assassin.abilityobject.damage3 = 75;

        alchemist.Character(alchemistSpell);
        alchemist.abilityobject.ability = "Fire Bomb";
        alchemist.abilityobject.damage = 250;
        alchemist.abilityobject.ability2 = "Freeze Concoction";
        alchemist.abilityobject.damage2 = 0;
        alchemist.abilityobject.ability3 = "Time Potion";
        alchemist.abilityobject.damage3 = 175;

        necromancer.Character(necromancerSpell);
        necromancer.abilityobject.ability = "Manipulate Fel";
        necromancer.abilityobject.damage = 250;
        necromancer.abilityobject.ability2 = "Raise Army";
        necromancer.abilityobject.damage2 = 25;
        necromancer.abilityobject.ability3 = "Possess Ogre";
        necromancer.abilityobject.damage3 = 175;
        
        boxer.Character(boxerSpell);
        boxer.abilityobject.ability = "Manipulate Fel";
        boxer.abilityobject.damage = 250;
        boxer.abilityobject.ability2 = "Raise Army";
        boxer.abilityobject.damage2 = 25;
        boxer.abilityobject.ability3 = "Possess Ogre";
        boxer.abilityobject.damage3 = 175;
        
        System.out.println("\nPick a class: 1 = " + warrior.role + " 2 = " + wizard.role + "\n");
        int roleQuestion = userInput.nextInt();

        if (roleQuestion == 1) {
            System.out.println("\n----- " + warrior.name + " the " + warrior.role + "! -----");
            System.out.println("- Giant : Armored : Dual-Wielded Longswords : Trained -");
            System.out.println("- Inspirational : Extremely Strong : Righteous -");
            System.out.println("----------- Abilities -----------");
            System.out.println("- " + warrior.abilityobject.ability + ": Spin Your Axe Around Dealing (75 - 125) Damage 3 Times");
            System.out.println("- " + warrior.abilityobject.ability2 + ": Swing Your Axe with All Your Force Dealing (450 - 600) Damage with a 50% Chance to Miss");
            System.out.println("- " + warrior.abilityobject.ability3 + ": Grab an Object Near You & Hurl it Towards Your Opponenent Dealing (175 - 225) Damage with a 50% Chance to Grab a Heavy Object & Deal Critical Damage");
        } else {
            System.out.println("\n----- " + wizard.name + " the " + wizard.role + "! -----");
            System.out.println("- Elf : Long Staff : Fiery Eyes : Disciplined -");
            System.out.println("- Telekenetic : Controls Elements : Can Fly -");
            System.out.println("----------- Abilities -----------");
            System.out.println("- " + wizard.abilityobject.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
            System.out.println("- " + wizard.abilityobject.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
            System.out.println("- " + wizard.abilityobject.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
        }

        System.out.println("\nEACH ROUND YOU AND YOUR OPPONENT WILL CHOOSE ONE ABILITY TO CAST. LAST CHAMPION STANDING WINS.");
        System.out.println("\nTime to Fight! Are you ready? Enter 5 to Start\n");
        int startGame = userInput.nextInt();

        while (startGame == 5) {

            if (roleQuestion == 1) {

                int death = 0;
                int AI = 1;
                int notAI = 2;

                System.out.println("\n--------------------");
                System.out.println("Round: " + rounds + "!");
                System.out.println(warrior.name + ": " + warrior.health + " Health");
                System.out.println(wizard.name + ": " + wizard.health + " Health");
                System.out.println("--------------------\n");

                System.out.println(" - " + warrior.name + "s Turn");
                wizard.health = castWarriorAbility(notAI, warrior.name, warrior.health, wizard.health, warriorSpell.ability, warriorSpell.damage, warriorSpell.ability2, warriorSpell.damage2, warriorSpell.ability3, warriorSpell.damage3);

                int endGame = death(warrior.health, warrior.name, wizard.health, wizard.name);

                if (endGame == 1) {
                    break;
                }

                System.out.println("\nStart " + wizard.name + "s Turn: Enter 1\n");
                int opponentStart = userInput.nextInt();

                if (opponentStart == 1) {

                    System.out.println("\n - " + wizard.name + "s Turn");
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

} // close Class


//                                  if (rounds == 1) {
//                                System.out.println("\n----- Hero 4: ONE-EYE -----");
//                                System.out.println("- Goblin : Hysterical : Glass Eye : Always Joking Around -");
//                                System.out.println("- Scientist : Potions : Doesnt Care -");
//                                System.out.println("----------- Abilities -----------");
//                                System.out.println("- " + alchemist.abilityobject.ability + ": Brew a Potion Infused with Fire & Glass & Throw it at Your Opponent Dealing (250 - 350) Damage");
//                                System.out.println("- " + alchemist.abilityobject.ability2 + ": Brew a Potion Infused with Ice & Attempt to Freeze Your Opponent Dealing (450 - 600) Damage with a 50% Chance to Freeze Yourself on Accident & Miss");
//                                System.out.println("- " + alchemist.abilityobject.ability3 + ": Brew a Potion Infused with the Sun & the Moon to Slow Time Down Dealing (75 - 125) Damage Twice with a 33% Chance to Deal Critical Damage on Each Hit");
//                                System.out.println("\nEnter 1 to Fight One-Eye\n");
//                                userInput.nextInt();
//                            }
//                                  if (rounds == 1) {
//                                System.out.println("\n----- Hero 5: ROT -----");
//                                System.out.println("- Undead : Corrupted Staff : Withered : Dark -");
//                                System.out.println("- Green Energy : Raise Dead as Minions : Always Thunderstorms Around Him -");
//                                System.out.println("----------- Abilities -----------");
//                                System.out.println("- " + necromancer.abilityobject.ability + ": Control Fel ( Green Energy ) to Destroy & Ruin the Entire Surface of the Earth Beneath Your Opponent Dealing (250 - 350) Damage");
//                                System.out.println("- " + necromancer.abilityobject.ability2 + ": Pull Over a Thousand Corpses From Their Graves to Swarm Your Opponent Dealing (25 - 75) Damage 10 Times with a 33% Chance to Miss Each Shot");
//                                System.out.println("- " + necromancer.abilityobject.ability3 + ": Resurrect an Ancient Being to do Your Bidding & Attack Your Opponent Dealing (175 - 225) Damage with a 50% Chance to Resurrect an Undead Dragon to Deal Critical Damage");
//                                System.out.println("\nEnter 1 to Fight Rot\n");
//                                userInput.nextInt();
//                            }
//                                  if (rounds == 1) {
//                                System.out.println("\n----- Hero 6: STEVE -----");
//                                System.out.println("- Wizard : Long Staff : Fiery Eyes : Disciplined -");
//                                System.out.println("- Telekenetic : Controls Elements : Can Fly -");
//                                System.out.println("----------- Abilities -----------");
//                                System.out.println("- " + wizard.abilityobject.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
//                                System.out.println("- " + wizard.abilityobject.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
//                                System.out.println("- " + wizard.abilityobject.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
//                                System.out.println("\nEnter 1 to Fight Blaze\n");
//                                userInput.nextInt();
//                            }
//                                  if (rounds == 1) {
//                                System.out.println("\n----- Hero 7: EDGE -----");
//                                System.out.println("- Wizard : Long Staff : Fiery Eyes : Disciplined -");
//                                System.out.println("- Telekenetic : Controls Elements : Can Fly -");
//                                System.out.println("----------- Abilities -----------");
//                                System.out.println("- " + wizard.abilityobject.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
//                                System.out.println("- " + wizard.abilityobject.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
//                                System.out.println("- " + wizard.abilityobject.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
//                                System.out.println("\nEnter 1 to Fight Blaze\n");
//                                userInput.nextInt();
//                            }
//                                  if (rounds == 1) {
//                                System.out.println("\n----- Hero 8: RAVEN -----");
//                                System.out.println("- Wizard : Long Staff : Fiery Eyes : Disciplined -");
//                                System.out.println("- Telekenetic : Controls Elements : Can Fly -");
//                                System.out.println("----------- Abilities -----------");
//                                System.out.println("- " + wizard.abilityobject.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
//                                System.out.println("- " + wizard.abilityobject.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
//                                System.out.println("- " + wizard.abilityobject.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
//                                System.out.println("\nEnter 1 to Fight Blaze\n");
//                                userInput.nextInt();
//                            }
//                                  if (rounds == 1) {
//                                System.out.println("\n----- Hero 9: THE MACHINE -----");
//                                System.out.println("- Wizard : Long Staff : Fiery Eyes : Disciplined -");
//                                System.out.println("- Telekenetic : Controls Elements : Can Fly -");
//                                System.out.println("----------- Abilities -----------");
//                                System.out.println("- " + wizard.abilityobject.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
//                                System.out.println("- " + wizard.abilityobject.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
//                                System.out.println("- " + wizard.abilityobject.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
//                                System.out.println("\nEnter 1 to Fight Blaze\n");
//                                userInput.nextInt();
//                            }
//                                  if (rounds == 1) {
//                                System.out.println("\n----- Hero 10: FEL KING -----");
//                                System.out.println("- Wizard : Long Staff : Fiery Eyes : Disciplined -");
//                                System.out.println("- Telekenetic : Controls Elements : Can Fly -");
//                                System.out.println("----------- Abilities -----------");
//                                System.out.println("- " + wizard.abilityobject.ability + ": Direct a Blast of Energy Dealing (250 - 350) Damage");
//                                System.out.println("- " + wizard.abilityobject.ability2 + ": Rain Fire Down on Your Opponent Dealing (75 - 125) Damage 5 Times with a 33% Chance to Miss Each Shot");
//                                System.out.println("- " + wizard.abilityobject.ability3 + ": Summons a Wolf to Attack for you Dealing (175 - 225) Damage with a 50% Chance to Summon a Lion to Deal Critical Damage");
//                                System.out.println("\nEnter 1 to Fight Blaze\n");
//                                userInput.nextInt();
//                            }

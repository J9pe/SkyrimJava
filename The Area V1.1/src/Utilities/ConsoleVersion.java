package Utilities;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JTextArea;

import Equipment.*;
import Races.*;
import Section3_DuelSimulation.*;

public class ConsoleVersion {
	
	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: tired
	 * ##############################################################################################
	 */ 
	/*
	 *======================================================================================================
	 * I hope you look at this class second
	 * 
	 * This class is for the console Version
	 * 
	 * First of all, it contains only static variables and methods because
	 * I don't need to create an object, and also it would be much easier and efficient to use from the main
	 * Because of the sheer fact that I am not creating an object
	 * ======================================================================================================
	 */
	

	//Firstly, I need to create a variable that stores my input for the desired distance
	private static int myDistance;
	//Next I created the static variables for storing my selection of my desired race, weapon, and armour
	private static int myRace=0;
	private static int myWeapon=0;
	private static int myArmour=0;
	//same with the enemy, I created variables for the enemy weapon, race, and armour number
	private static int enemyRace=0;
	private static int enemyWeapon=0;
	private static int enemyArmour=0;//Note: keep in mind that 0 is my initialisation, if you have zero, 
										//its blank; to run the dual simulation, your race num can't be zero,
										//and the weapon is required to be not zero either, but armour can be zero,
										//meaning unarmoured.
	//mutator methods
		public static int getmyRace(){				//These are my mutator methods for my variables above
			return myRace;
		}
		public static int getmyWeapon(){
			return myWeapon;
		}
		public static int getmyArmour(){
			return myArmour;
		}
		
		public static int getenemyRace(){
			return enemyRace;
		}
		public static int getenemyWeapon(){
			return enemyWeapon;
		}
		public static int getenemyArmour(){
			return enemyArmour;
		}
		
	
	private static BattleFieldConsoleDealer land;//Two classes, the BattleFieldConsoleDealer, and the TesterForData,
												//are required to run the dual simulation class
	private static TesterForData testLand;		//these classes contains methods that affect the variables of player and enemy
												//such as health

	
	////////////////////////
	//"ENGINE" METHODS
	////////////////////////
	/*
	 *======================================================================================================
	 * below is my methods that generate the text menu on the console version
	 * I used scanner for the user input
	 * ======================================================================================================
	 */

	public static void mainMenu()
	{	
		//Firstly, I need to initialise a scanner, which I call it console.
		Scanner console = new Scanner(System.in);
		boolean endLoop=false;
		ShortcutMethods.generateSpaces(3);//this generates 3 spaces, which makes may output look more smooth and not cramped with information
		int choosingNumber=0;//My choosingNumber is what determines what the next option will be
			while (!endLoop)//this code is in a while loop 
			{	
				
				System.out.println("1-Fight \n2-Instructions\n3-item displacement\n4-Exit" +
						"\n5-QUICKMODE\n6-TESTMODE\n\n(numbers only please)");//This displays the allowed options
				try{
					choosingNumber=console.nextInt();
					if (choosingNumber==1){
						choosingDistance();//these scanner is for obtaining the user's desired distance
						choosingContestants();//these are each methods that will set the data for the weapons, armour, and race
						weaponDescisioner();
						armourDescisioner();
						land.battleMenu();//land is the BattleFieldforConsole, and battleMenu will be launched to start the program
						System.out.print("\nYour enemy is a random opponent\n");//prints out extra information
						
					}
					else if (choosingNumber==2){
						gameInstructions();//This reveals the game instructions
					}
					else if (choosingNumber==3){
						System.out.print("\nSorry, this is not an valid option; it's only available in the GUI\n");
					}
					else if (choosingNumber==4){
						endLoop=true;//this exits the console version by breaking the loop--then the exit program method will follow
					}
					else if (choosingNumber==5){
						choosingDistance();//this method obtains the distance that you desired
						//below is the quick mode, which means I the choices are not from scanners, but directly obtained below
						myRace=4;myWeapon=3;myArmour=4;//QUICK MODE it just uses what is give here
						land.battleMenu();//The it launches the battlefield
						System.out.print("\nYour enemy is a random opponent\n");//the enemy information is generated in the battlefield menu
						
					}
					else if (choosingNumber==6){
						choosingDistance_test();//this obtains the data desired for the distance for test mode
		
						myRace=3;myWeapon=1;myArmour=3;//here you can change the data anytime
						enemyRace=3;enemyWeapon=4;enemyArmour=3;//enemy information is edited here also, not randomly generated
						JTextArea none = null;//Why did I put this here, well, this is for the method battleMenu. This is because
						//for my tester, it is both compatible for the GUI and console version, if JText Area is null, then the
						//tester will output the information through System.out.print

						System.out.print("WELCOME TO TEST, THIS WILL GENERATE " +
								"THE RESULT OF 100 BATTLES BETWEEN THESE 2 CHARACTERS " +
								"WITH THEIR WEAPONS AND ARMOUR \nYour enemy is a random opponent\n");
						testLand.battleMenu(100,myRace,myWeapon,myArmour,
						enemyRace,enemyWeapon,enemyArmour,none);//because this is my tester class,
						//enter the data of the enemy information on the testLand
						
					}
					else{
						System.out.println("Please only type number in the menu");//self explainatory
						//reveal information about accesibility of the game
					}
				}
				catch (InputMismatchException e) {
					System.out.println(">>>>>>\nERROR(syntax error)--You may need to press a key then press enter now");
					choosingNumber = 0;
					console.next();
					}
			}
		
	}

	/*
	 *======================================================================================================
	 * below is my method for obtaining the distance for my game, this class is only for regular mode
		//for the test mode, it is kind of different
	 * ======================================================================================================
	 */

	private static void choosingDistance(){//only this class can access this, hence private, my decision:)
		Scanner console = new Scanner(System.in);
		boolean endLoop=false;
		ShortcutMethods.generateSpaces(3);
		int choosingNumber=0;
			while (!endLoop) 
			{
				
				
				System.out.println("Please choose your distance, 5 to 1000 feet, type any non-int to exit");

					choosingNumber=console.nextInt();
				
					 if (choosingNumber>=5 && choosingNumber<=1000) 
					 {	myDistance=choosingNumber;
						land = new BattleFieldConsoleDealer(myDistance);
						
						endLoop=true;
					 }
					else
					{
						System.out.println("Please type within the range");
					}
				
			}
	}
	/*
	 *======================================================================================================
	 * below is my method for obtaining the distance for my game, this class is only for 
		//the test mode, it is kind of different because it creates testland instead of land
		//I realise that I could of just created a method that returns an integer, which
		//is slightly more efficient--I just don't have the time to polish my code
	 * ======================================================================================================
	 */
	private static void choosingDistance_test(){
		Scanner console = new Scanner(System.in);
		boolean endLoop=false;
		ShortcutMethods.generateSpaces(3);
		int choosingNumber=0;
			while (!endLoop) 
			{
				
				
				System.out.println("Please choose your distance, 5 to 1000 feet, type any non-int to exit");

					choosingNumber=console.nextInt();
				
					 if (choosingNumber>=5 && choosingNumber<=1000) 
					 {	myDistance=choosingNumber;
						testLand = new TesterForData(myDistance);
						
						endLoop=true;
					 }
					else
					{
						System.out.println("Please type within the range");
					}
			}
	}

	/*
	 *======================================================================================================
	 * below is my method for obtaining the race number and outputing the description for the desired race
	 * note that there is no return option, the only way to do this is by inputing a letter, that 
	 * would quit the console.
	 * ======================================================================================================
	 */
	private static void choosingContestants(){
		
		Scanner console = new Scanner(System.in);
		boolean endLoop=false;
		ShortcutMethods.generateSpaces(3);
		int choosingNumber=0;
			while (!endLoop) 
			{
				
				//as you can see, my choices are alphabetical
				//this is easier to deal with since, at least this is an universal possible order
				System.out.println("Please choose your race:\n1-Blood\n2-Bit\n3-Bosmer\n4-Darkman\n5-GreenNeck\n6-Huang\n7-Imperial\n8-Khajiit\n8-Nord\n9Stickman\n10-Orc\n(numbers only please)");

					choosingNumber=console.nextInt();
					if (choosingNumber==1){
						System.out.print(gameObjects.blood.getDescription());
						//GameObjects is in the package utilities, which
						//provides necessary universal information for other
						//classes to exploit
						myRace=1;
						endLoop=true;
						break;
					}
					else if (choosingNumber==2){
						System.out.print(gameObjects.bit.getDescription());
						//the rest is the same, except the numbers, so I will not be redudant						
						myRace=2;
						endLoop=true;
						break;
					}
					else if (choosingNumber==3){
						System.out.print(gameObjects.bosmer.getDescription());
						//the rest is the same, except the numbers, so I will not be redudant						
						myRace=3;
						endLoop=true;
						break;
					}
					else if (choosingNumber==4){
						System.out.print(gameObjects.darkman.getDescription());
						//the rest is the same, except the numbers, so I will not be redudant						
						myRace=4;
						endLoop=true;
						break;
					}
					else if (choosingNumber==5){
						System.out.print(gameObjects.greenNeck.getDescription());
						//the rest is the same, except the numbers, so I will not be redudant						
						myRace=5;
						endLoop=true;
						break;
					}
					else if (choosingNumber==6){
						System.out.print(gameObjects.huang.getDescription());
						myRace=6;
						endLoop=true;
						break;
					}
					if (choosingNumber==7)
					{
						System.out.print(gameObjects.imperial.getDescription());
						myRace=7;
						endLoop=true;
						break;
					}
					else if (choosingNumber==8)
					{
						System.out.print(gameObjects.Khajiit.getDescription());
						myRace=8;
						endLoop=true;
						break;
					}
					else if (choosingNumber==9)
					{
						System.out.print(gameObjects.nord.getDescription());
						myRace=9;
						endLoop=true;
						break;
					}
					else if (choosingNumber==10){
						System.out.print(gameObjects.stickman.getDescription());
						//the rest is the same, except the numbers, so I will not be redudant						
						myRace=10;
						endLoop=true;
						break;
					}
					else if (choosingNumber==11)
					{
						System.out.print(gameObjects.orc.getDescription());
						myRace=11;
						endLoop=true;
						break;
					}					
					else
					{//if you don't type within the range, this is what happens
						System.out.println("Please only type number in the menu");
					}
				
			}
	}

	/*
	 *======================================================================================================
	 * are you sure just gives you the option yes or 2-let me think
		* Yes continues, and the funny thing is 2 just reloops and asks you are you sure again
		* To actually say no, you have to type a String, and it will catch and error and return
	 * ======================================================================================================
	 */

	private static void areYouSure(){
		boolean validData=false;
		Scanner console = new Scanner(System.in);
		int playerDecision=0;
		while (validData!=true){
			
			
			System.out.println("Are you sure?1-yes, 2-let me think.., \ntype a String to exit back to main menu");						
			playerDecision=console.nextInt();
				if (playerDecision==1)
				{
					validData=true;	
					
				}
				else if (playerDecision==2)
				{
					playerDecision=0;
					validData=false;
					
				}
				else
				{
					System.out.println("Please only type number in the menu");
					validData=false;
				}
				
		}
	}
	
	/*
	 *======================================================================================================
	 * below is my method for obtaining the weapon number and outputing the description for the desired weapon
	 * note that there is no return option, the only way to do this is by inputing a letter, that 
	 * would quit the console.
	 * ======================================================================================================
	 */
	private static void weaponDescisioner(){
		boolean endLoop=false;
		Scanner console = new Scanner(System.in);
		int playerDecision=0;
		while (endLoop!=true)
		{
			
			//this is also in alphabetical order
			//{"Great Axe","Long Sword","Short Spear","Short Sword","Steel Crossbow","Tomhawk","War Hammer","Wooden Bat","Yew Longbow"}; //alphabetical
			System.out.println("What Weapon\n1.Greataxe\n2.Longsword\n3.Short Spear" +
						"\n4.Shortsword\n5.Steel Crossbow\n6.Tomhawk\n7.War Hammer\n8.Wooden Bat\n9.Yew LongBow");						
			playerDecision=console.nextInt();
			//Below are the actions, end loop does not end the loop before this one, only this one, which means that it will
			//continue what the upper loop had given to be executed
			if (playerDecision==1)
			{
				System.out.print(gameObjects.Greataxe1.getDescription());
				myWeapon=1;	
				endLoop=true;
				
			}	
			else if (playerDecision==2)
			{
				System.out.print(gameObjects.Longsword1.getDescription());
				myWeapon=2;	
				endLoop=true;
					
			}
			else if (playerDecision==3)
			{
				System.out.print(gameObjects.ShortSpear1.getDescription());
				myWeapon=3;	
				endLoop=true;
				
			}
			else if (playerDecision==4)
			{
				System.out.print(gameObjects.Shortsword1.getDescription());
				myWeapon=4;	
				endLoop=true;
				
			}
			else if (playerDecision==5)
			{
				System.out.print(gameObjects.Steel_Crossbow1.getDescription());
				myWeapon=5;	
				endLoop=true;
				
			}
			
			else if (playerDecision==6)
			{
				System.out.print(gameObjects.Tomhawk1.getDescription());
				myWeapon=6;	
				endLoop=true;
					
			}
			
			else if (playerDecision==7)
			{
				System.out.print(gameObjects.WarHammer1.getDescription());
				myWeapon=7;	
				endLoop=true;
					
			}
			else if (playerDecision==8)
			{
				System.out.print(gameObjects.Wooden_Stick1.getDescription());
				myWeapon=8;	
				endLoop=true;
			}
			else if (playerDecision==9)
			{
				System.out.print(gameObjects.YewLongbow1.getDescription());
				myWeapon=9;	
				endLoop=true;
					
			}



			else
			{
				System.out.println("Please only type number in the menu");
				endLoop=false;
			}
		}
	}

	/*
	 *======================================================================================================
	 * below is my method for obtaining the armour number and outputing the description for the desired armour
	 * note that there is no return option, the only way to do this is by inputing a letter, that 
	 * would quit the console.
	 * ======================================================================================================
	 */
	private static void armourDescisioner(){
		boolean endLoop=false;
		Scanner console = new Scanner(System.in);
		int playerDecision=0;
		while (endLoop!=true){
				
			//The following is also in alphabetical order
			System.out.println("What Armour\n1.IronPlatedArmour\n2.IronHelmet"+
				"\n3.LeatherBoots\n4.VikingShield");						
			playerDecision=console.nextInt();

					if (playerDecision==1)
					{
						System.out.print(gameObjects.IronBodyArmour1.getDescription());
						myArmour=1;	
						endLoop=true;
					}
					else if (playerDecision==2)
					{
						System.out.print(gameObjects.IronHelmet1.getDescription());
						myArmour=2;	
						endLoop=true;
					}
					else if (playerDecision==3)
					{
						System.out.print(gameObjects.LeatherBoots1.getDescription());
						myArmour=3;	
						endLoop=true;
					}
					else if (playerDecision==4)
					{
						System.out.print(gameObjects.VikingShield1.getDescription());
						myArmour=4;	
						endLoop=true;
					}
					else
					{
						System.out.println("Please only type number in the menu");
						endLoop=false;
					}
			}
	}
	
		
	////////////////////////
	//TEXT METHODS
	////////////////////////
	/*
	 *======================================================================================================
	 * These methods below just output strings, that's it.
	 * Of course, if I have time, I can have a lot more strings
	 * They are here to display information for the user to understand how to play and what the game is about
	 * ======================================================================================================
	 */
	public static void introductionMethod(){//public because other classes now have potential to get access to the text
		System.out.println("\nWELCOME TO DUALSIMULATION");
	}
	public static void gameInstructions(){//public because other classes now have potential to get access to the text
		System.out.println("\nFight till whoever survives, the rest of the instructions are on the GUI.");//=W=
	}
	public static void endProgramMethod(){//public because other classes now have potential to get access to the text
		System.out.println("\nGOODBYE-PROGRAM EXITING");
	}
	
	
}
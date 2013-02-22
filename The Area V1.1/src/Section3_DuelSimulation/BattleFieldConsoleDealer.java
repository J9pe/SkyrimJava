package Section3_DuelSimulation;
import java.util.InputMismatchException;
import java.util.Scanner;

import Section2_Preparation.Contestant;
import Utilities.*;

public class BattleFieldConsoleDealer 
{

	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: excited


	*WELCOME WELCOME!!! THIS CONTAINS ALL THE METHODS FOR THE DUAL SIMULATION TO AMEND THE VARIABLES FOR BOTH 
	*THE PLAYER AND ENEMY

	 * ##############################################################################################
	 */ 



////////////////////Distance////////////////////
	private int distance;//in feet
	

	
	public int getDistance()
	{
		return distance;
	}
	public void setDistance(int d)
	{
		distance=d;
	}
	
////////////////////Status Variables////////////////////
	
	//THESE VARIABLES ARE SELF-EXPLAINATORY,
	//HENCE I WON'T EXPLAIN MOST OF WHAT THEY MEAN
	//EXCEPT A FEW

	Contestant contestant1;//The contestant is initialized
	Contestant contestant2;
	
	String playerName;
	String enemyName;
	
	int playerStr;	int enemyStr;//the strength, affects how much damage you cause the your opponent
	
	int playerDefence;//the defence is your natural defence, and when the enemy attacks you, its attack 
			  // will be reduced from your defence 
	int enemyDefence;//remeber that it depends on what move the enemy plays on you, that your defence will counter
	
	int playerDefence_Piercing;//these variables are defence for the specific type of attack
	int playerDefence_Slash;
	int playerDefence_Crush;
	
	int enemyDefence_Piercing;
	int enemyDefence_Slash;
	int enemyDefence_Crush;
 

 
	int playerGrd;	int enemyGrd;//how much you can block
	int playerHp;	int enemyHp;//YOUR HEALTH
	
	int playerSpd;	int enemySpd;//affects how much feet you will move per round
	int playerAgl;	int enemyAgl;//affects on how high of a chance that you will dodge

	int playerTraining_1;//these affect how accurately you can hit the enemy	
	int playerTraining_2;	
	int playerTraining_3;	
	int playerTraining_4;	
	int playerTraining_5;
	int enemyTraining_1; 	
	int enemyTraining_2;	
	int enemyTraining_3;	
	int enemyTraining_4;	
	int enemyTraining_5;
	
	
	int playerEdc;//edurace affects your stamina
	int enemyEdc;

	int playerStamina;//weight and your endurace will affect your stamina 
		//stamina=playerEdc-playerWeight+initiative+other little factors
	int enemyStamina;


	int playerWgt;int enemyWgt;//this stands for player weight
 
	
	int playerWeaponRgn;	int enemyWeaponRgn;//this is the range of you weapon,
						//the range is > than the distance, you can attack,.
						//else you will advance instead
	int playerWeaponSpd;	int enemyWeaponSpd;//how fast you will attack
					//if this is 1, that means it takes 1 round to perform an attack
					//if this is 2, that means it takes 2 rounds to perform one single attack
	
	
	int playerWeaponSpdValue;//The same concept	
	int enemyWeaponSpdValue;
	
	String playerWeapon;
	String enemyWeapon;

	int playerMve; //this actually means the amount of damage that you will 
		       //inflict before counting defence and guard
	int enemyMve;
	
	int playerMve_Piercing;//these are moves specific to the type of damage
	int playerMve_Slash;
	int playerMve_Crush;
	int playerMve_Shoot;
	
	int enemyMve_Piercing;
	int enemyMve_Slash;
	int enemyMve_Crush;
	int enemyMve_Shoot;

	String playerArmour;
	String enemyArmour;
	
	int playerArmourDefence_Piercing;//the amount you will subtract from the enemy's damage
	int playerArmourDefence_Slash;
	int playerArmourDefence_Crush;
	int enemyArmourDefence_Piercing;
	int enemyArmourDefence_Slash;
	int enemyArmourDefence_Crush;
	
	int myRace;//this is the number index of the order of the list of races/weapon/armour
	int myWeapon;
	int myArmour;
	int hisRace;
	int hisWeapon;
	int hisArmour;
	
	
////////////////////Mode Variables////////////////////
	//the following below are for if you dodged or are you guarding
	//then determine the mode/style that you are fighting
	boolean displayMoreFightingStatus=false;
	
	boolean enemyTurn=false;
	
	boolean playerskip=false;
	boolean enemyskip=false;
	
	boolean playerGuarding=false;
	boolean enemyGuarding=false
	;
	boolean playerStartsFirst;
	

	boolean exitSwitch=false;//if exit switch is turned on, the program will exit
	boolean validDataBattle=false;
	
	//primary stands for primary weapon
	boolean player_primaryIsMelee=false;
	boolean player_primaryIsRanged=false;
	boolean enemy_primaryIsMelee=false;
	boolean enemy_primaryIsRanged=false;
	
	Scanner console;
	int choosingNumberBattle=0;
	
	
	//CONSTRUCTOR//
	public BattleFieldConsoleDealer(int d)
	{
		distance=d;
	}
	


	/* ##############################################################################################



//This is for running the entire battle. First it generates all the data of the contestants, then
//it will display all the information, and depending on who starts first, it will run the playerTurn/Enemy Turn 
//then the other one
//After every turn it will use the judge method to determine if everyone is still alive
//if someone's hp<0, then the judge method will go to the user option restart method

	 * ##############################################################################################
	 */ 	
	//ACTION METHODS//
	public void battleMenu()
	{
		System.out.print("You picked race "+ConsoleVersion.getmyRace()+"\n");
		
		
		obtainContestantData();//loads the data of each contestant, the player and the enemy

		distanceStatus();
		fightingStatus();
		
		whoStartsFirst();//Check to see who starts first

		while (validDataBattle!=true)
		{
			 try
			 {
				if (playerStartsFirst==true)
				{
					console = new Scanner (System.in);
					judge(enemyHp,playerHp);
					playerTurn();
					judge(enemyHp,playerHp);
					enemyTurn();
				}
				if (playerStartsFirst==false)
				{
					judge(enemyHp,playerHp);
					enemyTurn();
					judge(enemyHp,playerHp);
					console = new Scanner (System.in);
					playerTurn();	
				}
			}
			catch(InputMismatchException e) 
			{
				System.out.println(">>>>>>\nERROR(syntax error)--You may need to press a key then press enter now");
				choosingNumberBattle = 0;
				console.next();
			}
		}
	}
	


//##############################################################################################

//This method makes the attack of who ever asked for it... it will use the inputer's staima
//ex: player1 attacks, then d==false, so playerTurn_Attack method will launch, and some stamina will 
//be consumed

//##############################################################################################
	///////////////////////////
	private int makingAttack(int xStamina, int num, boolean d, String a, String b){
		if (xStamina>0)
		{//when doing different moves I will use the if statement according to what move
			if (d==true)
			{
				computerTurn_Attack();
			}
			else if (d==false)
			{
				playerTurn_Attack();
			}
			xStamina-=num;
			if (xStamina<0)
				{
					xStamina=0;
				}
			}
		else
		{
			System.out.print(a+"'s Stamina is too low, so "+b+" missed entirely");
		}
		return xStamina;
	}

 //##############################################################################################

//This method makes the attack of the computer, it will affect the health of the player

 //##############################################################################################
	
	private void computerTurn_Attack()
	{
		System.out.print("\nEnemy's Turn\n");
		//when computer ATKs
		ShortcutMethods.generateSpaces(2);
		fightActionText("The computer attempts to attack\nWait for next round to see the effect\n");

		if (enemy_primaryIsMelee==true)//see if the computer is using a melee weapon
		{
			if (contestant2.getContestantWeaponType()==1)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_1, enemyTraining_1);
			}
		
			if (contestant2.getContestantWeaponType()==3)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_3, enemyTraining_3);
			}
			
			if (contestant2.getContestantWeaponType()==4)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_4, enemyTraining_4);
			}
			
			if (contestant2.getContestantWeaponType()==5)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_5, enemyTraining_5);//this is for dodgeing
				//it returns a boolean
			}
		}

			//note 	that the enemy's training determines his ability to control with his weapon
		else if (enemy_primaryIsRanged==true)//see if the computer is using a ranged weapon
		{
			enemyskip=dodgingChance(playerAgl, playerTraining_2,enemyTraining_2);
		}
			
		if (enemyWeaponSpdValue==10)//now its about the weapon spd
		{
			enemyWeaponSpdValue=10-enemyWeaponSpd;
		}
				//Maximum of 10 rounds to hit once
		if (distance<=enemyWeaponRgn)//if the weapon is within range
		{
			//

				if (enemyWeaponSpdValue==9)//if the spd weapon value is set to 9
				{
					if (enemyskip==false)//if the enemy does not miss

					{	
						if (playerGuarding==true){
							playerDefence+=playerGrd;
							if (playerDefence<(enemyStr+enemyMve)){
								playerHp=blockDefendAbsorb(playerHp, (enemyStr+enemyMve), playerDefence, "Defence nulled the attack","Your Guard did not guard completely");
								playerDefence-=playerGrd;}
							else{
								playerHp=blockDefendAbsorb(playerHp, (enemyStr+enemyMve), playerDefence, "Defence nulled the attack","Your Guard guarded completely");
								playerDefence-=playerGrd;}
							}
						else{
							playerHp=blockDefendAbsorb(playerHp, (enemyStr+enemyMve), playerDefence, "Defence nulled the attack","");}
					}
					else {fightActionText("The player dodges");}//if he does miss, then this is outputed
				}
				else//then that means he is still in progress to perform the attack
				{
					if 	(enemy_primaryIsMelee==true)
						{
						System.out.print("\nThe enemy's melee weapon is so heavy, that he is still in the progress of using the weapon!\nRound ends\n");
						}
					else if (enemy_primaryIsRanged==true)
					{
						if (enemyWeaponSpdValue==4)//the s for grammar
							{System.out.print("He puts down his weapon");}//Crossbow 
						if (enemyWeaponSpdValue==5)
							{System.out.print("He cocks his weapon");}//Crossbow
						if (enemyWeaponSpdValue==6)
							{System.out.print("He raises his weapon");}//Crossbow
						if (enemyWeaponSpdValue==7)
							{System.out.print("He loads an shaft on his ranged equipment");}//Crossbow&bow
						if (enemyWeaponSpdValue==8)
							{System.out.print("He takes aim");}//Crossbow&bow
					
					}
				}
				enemyWeaponSpdValue+=1;System.out.print("\n");//now we increase the speed value, until its 9, the user can never attack
		}
		else//this means that the distance is too far away
		{
			enemyStamina-=enemySpd/4;
			fightActionText("The enemy can't hit you yet, too far away, so he advanced");
			distance-=enemySpd/2;
			if (distance<0){distance=0;}
		}
			
	}
	

//* ##############################################################################################

//This method is to turn the computer into guard mode, which allows his damage to decrease with 
//his defence and guard

//* ##############################################################################################

	private void computerTurn_Guard()
	{
		//GUARD
		ShortcutMethods.generateSpaces(2);
		fightActionText("The computer defends\n");
		enemyGuarding=true;
	}

// ##############################################################################################

//The same concepts follow with the player, its too redudent so I won't explain it

//##############################################################################################
	
	private void playerTurn_Attack()
	{
		//ATK				
		ShortcutMethods.generateSpaces(2);
		fightActionText("The player attempts to attack\nWait for next round to see the effect\n");
		
		if (playerWeaponSpdValue==10)
		{
			playerWeaponSpdValue=10-playerWeaponSpd;
		}//reset
		if (distance<=playerWeaponRgn)
		{
				if (playerWeaponSpdValue==9)
				{
					//
					if (playerskip==false)
					{
						if (enemyGuarding==true)
						{	
							enemyDefence+=enemyGrd;
							if (enemyDefence<(playerStr+playerMve)){
								enemyHp=blockDefendAbsorb(enemyHp,(playerStr+playerMve), enemyDefence, "Defence nulled the attack","The enemy's Guard did not guard completely\n");
								enemyDefence-=enemyGrd;}
							else{
								enemyHp=blockDefendAbsorb(enemyHp, (playerStr+playerMve), enemyDefence, "Defence nulled the attack","The enemy's Guard guarded completely\n");
								enemyDefence-=enemyGrd;
								}
						}
						else
						{
							enemyHp=blockDefendAbsorb(enemyHp,(playerStr+playerMve), enemyDefence, "Defence nulled the attack","");
						}
						//
					}
					else {fightActionText("The enemy dodges\n");}
				}	
				else 
				{
					if 	(player_primaryIsMelee==true)
						{
						System.out.print("\nYour melee weapon is so heavy, that you are still in the progress of using the weapon!\nRound ends\n");
						}
					else if (player_primaryIsRanged==true)
					{
						if (playerWeaponSpdValue==4)
							{System.out.print("You put down your weapon");}//crossbow 
						if (playerWeaponSpdValue==5)
							{System.out.print("You cock your weapon");}//crossbow
						if (playerWeaponSpdValue==6)
							{System.out.print("You raise your weapon");}//crossbow
						if (playerWeaponSpdValue==7)
							{System.out.print("You load an shaft on your ranged equipment");}//crossbow&bow
						if (playerWeaponSpdValue==8)
							{System.out.print("You take aim");}//crossbow&bow
						
					}
					
				}
				playerWeaponSpdValue+=1;System.out.print("\n");	
		}
		else
		{
			playerStamina-=playerSpd/4;
			fightActionText("You can't hit him yet, too far away, so you advanced");
			distance-=playerSpd/2;
			if (distance<0)
			{
				distance=0;
			}
		}
			
	}
	
	
	private void playerTurn_Guard()
	{
		//GUARD
		ShortcutMethods.generateSpaces(2);
		fightActionText("The player defends\n");
		playerGuarding=true;
	}
	

// ##############################################################################################

//Now its the Turns, this basically organises the attack before hand

// ##############################################################################################

	private void playerTurn()
	{
		enemyTurn=false;
		//FIGHTER'S INFORMATION
		ShortcutMethods.generateSpaces(1);
		
		distanceStatus();
		fightingStatus();
		ShortcutMethods.generateSpaces(1);
		
		//Player's turn
		System.out.print("\nYour Turn\n");
		ShortcutMethods.generateSpaces(1);
		
		playerGuarding=false;
		
		CommandText();
		boolean endLoop=false;
		
		while (!endLoop)
		{
			choosingNumberBattle=console.nextInt();
			if (choosingNumberBattle==1)
			{
				moveDecisioner(true);
				if (player_primaryIsMelee==true)
				{
					if (contestant1.getContestantWeaponType()==1){
						playerskip=dodgingChance(enemyAgl,enemyTraining_1,playerTraining_1);	
					}
					if (contestant1.getContestantWeaponType()==3){
						playerskip=dodgingChance(enemyAgl,enemyTraining_3,playerTraining_3);	
					}
					if (contestant1.getContestantWeaponType()==4){
						playerskip=dodgingChance(enemyAgl,enemyTraining_4,playerTraining_4);
					}
					if (contestant1.getContestantWeaponType()==5){
						playerskip=dodgingChance(enemyAgl,enemyTraining_5,playerTraining_5);	
					}
					
				}
				
					//note that the player's training determines his ability to control with his weapon
				else if (player_primaryIsRanged==true)
				{
					playerskip=dodgingChance(enemyAgl, enemyTraining_2,playerTraining_2);
						
				}
				//note that the player's training determines his ability to control with his weapon
				//the attack and Stamina reducer here
				playerStamina=makingAttack(playerStamina, 15, enemyTurn, "Your", "you");
				System.out.print("TURN ENDS");endLoop=true;
				
			}
			else if (choosingNumberBattle==2){
				if (playerStamina>0){//when doing different moves I will use the if statement according to what move
					playerTurn_Guard();
						playerStamina-=5;
						if (playerStamina<0)
						{playerStamina=0;}
					
				}
				else{System.out.print("Your Stamina is too low, so you failed, while humiliating yourself");}
				System.out.print("TURN ENDS");endLoop=true;
			}
			else if (choosingNumberBattle==3){
				if (distance>0){
					if (playerStamina>0)
					{
						playerStamina-=playerSpd/2;
						if (playerStamina<0){playerStamina=0;}
						fightActionText("You charged");distance-=playerSpd;if (distance<0){distance=0;}
						System.out.print("TURN ENDS");endLoop=true;
					}
					else
					{
						System.out.print("Your Stamina is too low, so you failed, while humiliating yourself");
					}
				}
				else {System.out.print("You guys are too close to be advancing! continue your choice..");CommandText();}
				
			}
			else if (choosingNumberBattle==4){
				if (distance<(1000-(playerSpd/2))){
					playerStamina-=playerSpd/8;if (playerStamina<0){playerStamina=0;}
				fightActionText("You backed based on your speed");distance+=playerSpd/4;if (distance<0){distance=0;}
				System.out.print("TURN ENDS");endLoop=true;
				}
				else {System.out.print("Dude, stop being a chicken!!! continue your choice..");CommandText();}
				
			}
			else if (choosingNumberBattle==5){
				displayMoreFightingStatus=true;
				fightingStatus();
				displayMoreFightingStatus=false;
				
				System.out.print("TURN ENDS");
				endLoop=true;
			}
			else{
				ShortcutMethods.generateSpaces(2);
				System.out.print("You hold position, may have recovered some Stamina\n");
				if (playerStamina<300)
				{
					playerStamina+=30;
					if (playerStamina>300){playerStamina=300;
					System.out.println("\nStamina can only be added to a maxinum of 300\n");CommandText();}
					endLoop=true;
				}
			
			}
		}
		ShortcutMethods.generateSpaces(1);
		
		distanceStatus();
		fightingStatus();
		if (exitSwitch==false){
			ShortcutMethods.generateSpaces(1);
			}
		}

	private void enemyTurn(){
		enemyTurn=true;
		// Enemy's turn
		
		ShortcutMethods.generateSpaces(1);
		enemyGuarding=false;
		moveDecisioner(false);
		computerAI_randomMovesWithAttackAsFocus();//<=====edit anytime I WANT, i can even switch styles, heck, if i have time to implement that
		ShortcutMethods.generateSpaces(1);
		
	}

//Welcome to the judge method, if you die, then user option restart appears, if he dies, the same, but you win;
//if you are both alive, well, continue, if you both die, user option restart will still appear
	
	private void judge(int m, int n){//m is enemy
		if (m<=0&&n>0)
		{
			System.out.print("\n__________Result_________\nYou won\n_________________________\n");
			fightingStatus();
			
			userOptionRestart();
		}
		if (n<=0&&m>0)
		{
			System.out.print("\n__________Result_________\nYou lost\n_________________________\n");
			fightingStatus();
			
			userOptionRestart();
		}
		if (n<=0&&m<=0)
		{
			System.out.print("\n__________Result_________\nYou both died at same time\n_________________________\n");
			fightingStatus();
			
			userOptionRestart();
		}
		else if (n>=0&&m>=0)
		{
			System.out.print("\n__________Result_________\nYou both are still alive\n_________________________");
			
		}
	}

//this is for determining who starts first depending on the speed
	private void whoStartsFirst()
	{//m is enemy
		if (enemySpd>playerSpd)
		{
			playerStartsFirst=false;
			System.out.println("\nYou are slower than the enemy, so the enemy started first\n");
		}
		else if (enemySpd<playerSpd)
		{
			playerStartsFirst=true;
			System.out.println("\nYou are faster than the enemy, so the you started first\n");
		}
		else 
		{
			playerStartsFirst=true;
			System.out.println("\nboth of you are fast, you are just lucky to start first\n");
		}
	}

//Here the calculation Damage-defence-Guard will be performed
	private int blockDefendAbsorb(int a, int b, int c, String e, String f)
	{		
		int temp  = b-c;
		if(temp > 0)
		{
			a += (-temp);
		}
		else
		{
			System.out.print(e);
		}
		System.out.print(f);
		return a;
	}

//This is to determine if you successfully dodged the enemy/or the enemy dodged the player
	private boolean dodgingChance//targeTraining is specific to the attack the person creating the type of attack
		(int targetAgl,int targetTraining,int self_Training)
	//There are two barriers, first your pure speed, second your training
	//all determined within 100%
	{//dodging //decision method! THIS CLASS NEEDS SOME TESTING
		int rndYourNumber=ShortcutMethods.randomNumberGeneratorMethod(100);
		int rndYourNumber2=ShortcutMethods.randomNumberGeneratorMethod(100);
		boolean skip = false;
		if (rndYourNumber>(targetAgl))//ARMOUR WOULD REDUCE THIS ONE
		{//THE SMALLER YOUR RIGHT SIDE,THE MORE LIKELY TO HIT
			if (rndYourNumber2>((50-(self_Training*2))+(targetTraining))) 
					{skip=false;System.out.print("\n-hit-\n");} 					
			else if (rndYourNumber2<((50-(self_Training*2))+(targetTraining)))
					{skip=true;System.out.print("\n-dodged-\n");}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
		}
			else 	{skip=true;System.out.print("\n-miss-\n");}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
		return skip;
	}
	
//This is for the weapon Type
//First it will initialize the data of the training
//then it will reveal what type of weapon the enemy/player is equipped with, and the output
	private void weaponTypeDealer(int w, boolean isPlayer ){
		if (isPlayer==true){
			 playerTraining_1=contestant1.getContestantTraining_1 ();
			 playerTraining_2=contestant1.getContestantTraining_2 ();
			 playerTraining_3=contestant1.getContestantTraining_3 ();
			 playerTraining_4=contestant1.getContestantTraining_4 ();
			 playerTraining_5=contestant1.getContestantTraining_5 ();	 
			if (w==0){
				 player_primaryIsMelee=false;
				 player_primaryIsRanged=false;
				 System.out.print("\nYour primary weapon is nothing\n"); 
					
				}
			else if (w==1){
				 player_primaryIsMelee=true;
				 System.out.print("\nYour primary weapon is a moderate melee one\n"); 	
				 player_primaryIsRanged=false;
			}
			else if (w==2){
				 player_primaryIsRanged=true; 
				 System.out.print("\nYour primary weapon is an ranged one\n");
				 player_primaryIsMelee=false;
			}
			else if (w==3){
				 player_primaryIsRanged=false; 
				 System.out.print("\nYour primary weapon is an heavy melee one\n");
				 player_primaryIsMelee=true;						
			}
			else if (w==4){
				 player_primaryIsRanged=false; 
			 	 System.out.print("\nYour primary weapon is a light melee one\n");
				 player_primaryIsMelee=true;
			}
			else if (w==5){
				 player_primaryIsRanged=false;
				 System.out.print("\nYour primary weapon is a pole arm one\n");
				 player_primaryIsMelee=true;
			}
		}
		else{
			 enemyTraining_1=contestant2.getContestantTraining_1 ();
			 enemyTraining_2= contestant2.getContestantTraining_2 ();
			 enemyTraining_3=contestant2.getContestantTraining_3 ();
			 enemyTraining_4=contestant2.getContestantTraining_4 ();
			 enemyTraining_5=contestant2.getContestantTraining_5 ();
			if (w==0){
				 enemy_primaryIsMelee=false;
				 enemy_primaryIsRanged=false;
				 System.out.print("\nThe enemy's primary weapon is nothing\n");
				 }
			else if (w==1){
				 enemy_primaryIsMelee=true;
				 System.out.print("\nThe enemy's primary weapon is a melee one\n");
				 enemy_primaryIsRanged=false;
			}
			else if (w==2){
				 enemy_primaryIsRanged=true;
				 System.out.print("\nThe enemy's primary weapon is a ranged one\n");
				 enemy_primaryIsMelee=false;
			}
			else if (w==3){
				 enemy_primaryIsRanged=false; 
				 System.out.print("\nThe enemy's primary weapon is an heavy melee one\n");
				 enemy_primaryIsMelee=true;
			}
			else if (w==4){
				 enemy_primaryIsRanged=false; 
				 System.out.print("\nThe enemy's primary weapon is a light melee one\n");
				 enemy_primaryIsMelee=true;
			}
			else if (w==5){
				 enemy_primaryIsRanged=false; 
				 System.out.print("\nThe enemy's primary weapon is a pole arm one\n");
				 enemy_primaryIsMelee=true;
			}
		}
	}

	////////////////////////
	//additional SHORTCUT METHODS
	////////////////////////
	//These just gives a nice visual frame
	private void fightActionText(String a){
		System.out.print("\n-\\\\\\\\\\\\\\ACTION//////////////-\n");
		System.out.print(a);
		System.out.print("\n-\\\\\\\\\\\\\\\\--////////////////-\n");
	}
	//this resets the data
	private void resetData() 
	{
		System.out.print("RESETING DATA\n");
		
		obtainContestantData();	
		System.out.print("RESET COMPLETE\n");
		fightingStatus();
		
		
	}	
	//This is to set all the data for the contestants
	//used before the battle
	public void obtainContestantData(){
	
		myRace=ConsoleVersion.getmyRace();
		myWeapon=ConsoleVersion.getmyWeapon();
		myArmour=ConsoleVersion.getmyArmour();
		
		hisRace=ShortcutMethods.randomNumberGeneratorMethod(5);
		hisWeapon=ShortcutMethods.randomNumberGeneratorMethod(8);//AMEND!
		hisArmour=ShortcutMethods.randomNumberGeneratorMethod(3);//AMEND!
		
		contestant1 = new Contestant(true, "you",myRace, myWeapon, myArmour);
		contestant2 = new Contestant(true, "the enemy's",hisRace, hisWeapon, hisArmour);

		
	 playerName=contestant1.getContestantName();
	 enemyName=contestant2.getContestantName();
		
	 playerStr=contestant1.getContestantAtk();
	 enemyStr=contestant2.getContestantAtk();
		
	 playerGrd=contestant1.getContestantGrd();
	 enemyGrd=contestant2.getContestantGrd();
		
	 playerHp=contestant1.getContestantHp();
	 enemyHp=contestant2.getContestantHp();
	 
	//all self explainatory
	 playerDefence_Slash=contestant1.getContestantDefence_SLASH();
	 enemyDefence_Slash=contestant2.getContestantDefence_SLASH();
	 
	 playerDefence_Piercing=contestant1.getContestantDefence_PIERCING();
	 enemyDefence_Piercing=contestant2.getContestantDefence_PIERCING();
	 
	 playerDefence_Crush=contestant1.getContestantDefence_CRUSH();
	 enemyDefence_Crush=contestant2.getContestantDefence_CRUSH();
	 
	 playerArmourDefence_Slash=contestant1.getContestantArmourDefence_SLASH();
	 enemyArmourDefence_Slash=contestant2.getContestantArmourDefence_SLASH();
	 
	 playerArmourDefence_Piercing=contestant1.getContestantArmourDefence_PIERCING();
	 enemyArmourDefence_Piercing=contestant2.getContestantArmourDefence_PIERCING();
	 
	 playerArmourDefence_Crush=contestant1.getContestantArmourDefence_CRUSH();
	 enemyArmourDefence_Crush=contestant2.getContestantArmourDefence_CRUSH();
	 
	 
	 playerSpd=contestant1.getContestantSpd();
	 enemySpd=contestant2.getContestantSpd();
		
	 playerAgl=contestant1.getContestantAgl();
	 enemyAgl=contestant2.getContestantAgl();

	 playerEdc=contestant1.getContestantEdc();
	 enemyEdc=contestant2.getContestantEdc();
		
	 playerStamina=contestant1.getContestantStamina();
	 enemyStamina=contestant2.getContestantStamina();
		
	 playerWgt=contestant1.getContestantWgt();
	 enemyWgt=contestant2.getContestantWgt();
			 
	 playerWeapon=contestant1.getContestantWeapon();
	 enemyWeapon=contestant2.getContestantWeapon();
	 
	 playerMve_Slash=contestant1.getContestantMve_Slash();
	 enemyMve_Slash=contestant2.getContestantMve_Slash();
	 
	 playerMve_Piercing=contestant1.getContestantMve_Piercing();
	 enemyMve_Piercing=contestant2.getContestantMve_Piercing();

	 playerMve_Crush=contestant1.getContestantMve_Crush();
	 enemyMve_Crush=contestant2.getContestantMve_Crush();
	 
	 playerMve_Shoot=contestant1.getContestantMve_Shoot();
	 enemyMve_Shoot=contestant2.getContestantMve_Shoot();
	 
	 playerWeaponRgn=contestant1.getContestantWeaponRgn();
	 enemyWeaponRgn=contestant2.getContestantWeaponRgn();
		
	 playerWeaponSpd=contestant1.getContestantWeaponAtkSpd();
	 enemyWeaponSpd=contestant2.getContestantWeaponAtkSpd();
	 
	 weaponTypeDealer(contestant1.getContestantWeaponType(),true);
   	 weaponTypeDealer(contestant2.getContestantWeaponType(),false);	
     
	 playerWeaponSpdValue=10-playerWeaponSpd;//Maxinum of 10 rounds to hit once
	 enemyWeaponSpdValue=10-enemyWeaponSpd;//Maxinum of 10 rounds to hit once
	 
	 playerArmour=contestant1.getContestantArmour();
	 enemyArmour=contestant2.getContestantArmour();
		}
	
	private void distanceStatus(){
		System.out.print("\nYou and the enemy are "+distance+" feet apart.\n");
	}
	//these are just strings to display the data
	private void CommandText(){
		System.out.print("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"FIGHT--1 to attack, 2 to Guard for one round, 3 to charge, 4 to back up, " +
				"\n5 to display data)" +
				" \n\n......anything ELSE is to do NOthing\n" +
				"\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");	
	}
	private void AtkCommandText(){
		System.out.print("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"1 to SLASH\n2 to PIERCE\n3 to CRUSH\n4 to SHOOT"+
				" \n\n" +
				"\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");	
	}
	//This just displays the data on console
	private void fightingStatus(){
		
		System.out.print("\n~*~~*~~*~~*Status~*~~*~~*~~*~\n");
		
		System.out.print("\n~*~~*~~*~~*MAIN~*~~*~~*~~*~\n");
		System.out.print("\n   |  You:"+playerName);
		System.out.print("\n   |  The enemy:"+enemyName+"\n");
		System.out.print("   |  Your health: "+playerHp+"\n");
		System.out.print("   |  Your Stamina: "+playerStamina+"\n");//CANNOT BE OVER 300
		System.out.print("   |  Your weapon: "+playerWeapon+"\n");
		System.out.print("   |  Your strength: "+playerStr+"\n");
	   	System.out.print("   |  Your Armour Name: "+playerArmour+"\n");	
		System.out.print("   |  The enemy's health: "+enemyHp+"\n");
		System.out.print("   |  The enemy's Stamina: "+enemyStamina+"\n");
		System.out.print("   |  The enemy's weapon: "+enemyWeapon+"\n");
		System.out.print("   |  The enemy's strength: "+enemyStr+"\n");	
	   	System.out.print("   |  The enemy's Armour Name: "+enemyArmour+"\n");
		System.out.print("   THE REST OF THE DATA IS AVAILABLE if you can see the enemy in detail\n");
		System.out.print("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n");
		
		if (displayMoreFightingStatus==true && (distance<playerAgl*(enemySpd*10/100)))
		{
				System.out.print("\n~*~~*~~*~~*OTHER INFO~*~~*~~*~~*~\n");
				System.out.print("   |  The enemy's guard: "+enemyGrd+"\n");
				System.out.print("   |   Enemy's enemy Defence_Piercing: "+enemyDefence_Piercing+"\n");
				System.out.print("   |   Enemy's enemy Defence_Slash: "+enemyDefence_Slash+"\n");
				System.out.print("   |   Enemy's enemy Defence_Crush: "+enemyDefence_Crush+"\n");
				System.out.print("   |  The enemy's speed: "+enemySpd+"\n");
				System.out.print("   |  The enemy's agility: "+enemyAgl+"\n");
				System.out.print("   |  The enemy's endurance: "+enemyEdc+"\n");
				System.out.print("   |  The enemy'sweight: "+enemyWgt+"\n\n");
				
				System.out.print("   |  Your guard: "+playerGrd+"\n");
				System.out.print("   |  Your player Defence_Piercing: "+playerDefence_Piercing+"\n");
				System.out.print("   |  Your player Defence_Slash: "+playerDefence_Slash+"\n");
				System.out.print("   |  Your player Defence_Crush: "+playerDefence_Crush+"\n");
				System.out.print("   |  Your speed: "+playerSpd+"\n");
				System.out.print("   |  Your agility: "+playerAgl+"\n");
				System.out.print("   |  Your endurance: "+playerEdc+"\n");
				System.out.print("   |  Your weight: "+playerWgt+"\n");
				System.out.print("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n");
				System.out.print("\n~*~~*~~*~~*Weapons~~*~~*~~*~~*~~*~~*~~*~\n\n");
				System.out.print("   |  Your weapon Range: "+playerWeaponRgn+"\n");
				
				if (player_primaryIsMelee==true )
				{
					System.out.print("   |  Your slash attack: "+playerMve_Slash+"\n");
					System.out.print("   |  Your Piercing attack: "+playerMve_Piercing+"\n");
					System.out.print("   |  Your crush attack: "+playerMve_Crush+"\n");
				}
				if (player_primaryIsRanged==true )
				{
					System.out.print("   |  Your shoot attack: "+playerMve_Shoot+"\n");
				}
				
				System.out.print("   |  Your Atk Spd with prm Weapon: "+playerWeaponSpd+"\n");
				System.out.print("   |  Enemy's Atk Spd with prm Weapon: "+enemyWeaponSpd+"\n");
				System.out.print("   |  The enemy'sweapon Range: "+enemyWeaponRgn+"\n");
				
				if (enemy_primaryIsMelee==true )
				{
					System.out.print("   |  The enemy's slash attack: "+enemyMve_Slash+"\n");
					System.out.print("   |  The enemy's Piercing attack: "+enemyMve_Piercing+"\n");
					System.out.print("   |  The enemy's crush attack: "+enemyMve_Crush+"\n");
				}
				if (enemy_primaryIsRanged==true )
				{
					System.out.print("   |  The enemy'sshoot attack: "+enemyMve_Shoot+"\n");
				}
				
				weaponTypeDealer(contestant1.getContestantWeaponType(),true);
			   	weaponTypeDealer(contestant2.getContestantWeaponType(),false);	
			   	
			   	System.out.print("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n\n");
			   	System.out.print("\n~*~~*~~*~~*Armour~~*~~*~~*~~*~~*~~*~~*~\n\n");
			   	System.out.print("   |  Your Armour slash Defence: "+playerArmourDefence_Slash+"\n");
				System.out.print("   |  Your Armour piercing Defence: "+playerArmourDefence_Piercing+"\n");
				System.out.print("   |  Your Armour crush Defence: "+playerArmourDefence_Crush+"\n");
				System.out.print("   |  Your Armour Type: "+contestant1.getContestantArmourType()+"\n");
				System.out.print("   |  Your Armour Weight: "+contestant1.getContestantArmourWeight()+"\n");
				System.out.print("   |  Your Armour Guard Boost: "+contestant1.getContestantArmourGuardBooster()+"\n");
				System.out.print("   |  Your Armour Speed Boost: "+contestant1.getContestantArmourSpeedBooster()+"\n");
				
				System.out.print("   |  The enemy's Armour slash Defence: "+enemyArmourDefence_Slash+"\n");
				System.out.print("   |  The enemy's Armour piercing Defence: "+enemyArmourDefence_Piercing+"\n");
				System.out.print("   |  The enemy's Armour crush Defence: "+enemyArmourDefence_Crush+"\n");
				System.out.print("   |  The enemy's Armour Type: "+contestant2.getContestantArmourType()+"\n");
				System.out.print("   |  The enemy's Armour Weight: "+contestant2.getContestantArmourWeight()+"\n");
				System.out.print("   |  The enemy's Armour Guard Boost: "+contestant2.getContestantArmourGuardBooster()+"\n");
				System.out.print("   |  The enemy's Armour Speed Boost: "+contestant2.getContestantArmourSpeedBooster()+"\n");
			   	System.out.print("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n\n");
				System.out.print("\n~*~~*~~*~TRAINING*~~*~~*~~*~\n");
				System.out.print("   |  Your Training in moderate melee: "+playerTraining_1+"\n");
				System.out.print("   |  Your Training in heavy melee: "+playerTraining_3+"\n");
				System.out.print("   |  Your Training in light melee: "+playerTraining_4+"\n");
				System.out.print("   |  Your Training in pole arms: "+playerTraining_5+"\n");
				System.out.print("   |  Your Training in ranged: "+playerTraining_2+"\n");
				
				System.out.println(" ");
				
				System.out.print("   |  The enemy's Training in moderate melee: "+enemyTraining_1+"\n");
				System.out.print("   |  The enemy's Training in heavy melee: "+enemyTraining_3+"\n");
				System.out.print("   |  The enemy's Training in light melee: "+enemyTraining_4+"\n");
				System.out.print("   |  The enemy's Training in pole arms: "+enemyTraining_5+"\n");

				System.out.print("   |  The enemy's Training in ranged: "+enemyTraining_2+"\n");
				System.out.print("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n");
				CommandText();
				
		}
	}
//This allows the user to restart the entire game
	private void userOptionRestart() 
	{	
		fightingStatus();
		System.out.print("would you like to restart?");
		Scanner console = new Scanner(System.in);
		boolean endMethod=false;
		int choosingNumber=0;
		ShortcutMethods.generateSpaces(3);
		while (!endMethod) 
			{	
				System.out.print("1-Exit 2-restart(all data back to zero)\n\n(numbers only please)\n\n");
				try
				{
					choosingNumber=console.nextInt();
					if (choosingNumber==1)
					{
						System.out.println("\nBye then\n");
						endMethod=true;validDataBattle=true;exitSwitch=true;System.exit(0);
					}
					else if (choosingNumber==2)
					{
						resetData();break;
					}
					else
					{
						System.out.println("Please only type number in the menu");
					}
				}
				catch (InputMismatchException e) 
				{
					System.out.println(">>>>>>\nERROR(syntax error)--You may need to press a key then press enter now");
					choosingNumber = 0;
					console.next();
				}
			}
	}	
	
	////////////////////////////////////////////////////////////////////////
	//AI COMBAT STYLES
	
//Now its all about what move the user/enemy makes, the move(damage) will be stored to the playerMve per turn,
//then its reset to allow a different type of move
	private void moveDecisioner(boolean myTurn)
	{	
		playerMve=0;
		enemyMve=0;
		playerDefence=0;
		enemyDefence=0;
		//This is for player
		if (myTurn==true)
		{
			boolean endLoop=false;
			while (!endLoop)
			{	
				AtkCommandText();
				choosingNumberBattle=console.nextInt();
				try
				{
					
					
					if (choosingNumberBattle==1&&player_primaryIsMelee==true&&player_primaryIsRanged==false)
					{
						playerMve=playerMve_Slash;
						playerDefence=playerDefence_Slash+playerArmourDefence_Slash;
						enemyDefence=enemyDefence_Slash+enemyArmourDefence_Slash;
						endLoop=true;
					}
					else if (choosingNumberBattle==2&&player_primaryIsMelee==true&&player_primaryIsRanged==false)
					{
						playerMve=playerMve_Piercing;
						playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
						enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
						endLoop=true;
					}
					else if (choosingNumberBattle==3&&player_primaryIsMelee==true&&player_primaryIsRanged==false)
					{
						playerMve=playerMve_Crush;
						playerDefence=playerDefence_Crush+playerArmourDefence_Crush;
						enemyDefence=enemyDefence_Crush+enemyArmourDefence_Crush;
						endLoop=true;
					}
					else if (choosingNumberBattle==4&&player_primaryIsMelee==false&&player_primaryIsRanged==true)
					{
						playerMve=playerMve_Shoot;
						playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
						enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
						endLoop=true;
					}
					else
					{
						System.out.print("\nInvalid option, your weapon is not suitable for that attack!\n");
					}
				}
				catch(Exception e)
				{
					System.out.print("INVALID");
				}
			}
		}
		//this is for the computer
		else{
			int randomNumber2=ShortcutMethods.randomNumberGeneratorMethod(3);
			if (randomNumber2==1)
			{
				if(enemy_primaryIsMelee==true&&enemy_primaryIsRanged==false)
				{
					enemyMve=enemyMve_Slash;
					enemyDefence=enemyDefence_Slash+enemyArmourDefence_Slash;
					playerDefence=playerDefence_Slash+playerArmourDefence_Slash;
				}
				else
				{
					enemyMve=enemyMve_Shoot;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
					}
				}
			else if (randomNumber2==2)
			{
				if(enemy_primaryIsMelee==true&&enemy_primaryIsRanged==false)
				{
					enemyMve=enemyMve_Piercing;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
				}
				else
				{
					enemyMve=enemyMve_Shoot;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
				}
			}
			else if (randomNumber2==3)
			{
				if(enemy_primaryIsMelee==true&&enemy_primaryIsRanged==false)
				{
					enemyMve=enemyMve_Crush;
					enemyDefence=enemyDefence_Crush+enemyArmourDefence_Crush;
					playerDefence=playerDefence_Crush+playerArmourDefence_Crush;
				}
				else
				{
					enemyMve=enemyMve_Shoot;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
				}
			}
			else
			{
				System.out.print("\nThe enemy is fighting without a weapon\n");
			}
		}
	}

	//This is a computer Artificial intelligence, it is mainly random moves, except that it has a slight bias on attack
	private void computerAI_randomMovesWithAttackAsFocus()
	{
		int randomNumber;
		//employing the random computer AI
		randomNumber=ShortcutMethods.randomNumberGeneratorMethod(6);
			//so higher chance to attack
		if (randomNumber==1)
		{//attack or advance
			if (distance<(enemyWeaponRgn))
			{
				enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he");
			}
			else 
			{
				enemyStamina-=enemySpd/4;
				if (enemyStamina<0)
				{
					enemyStamina=0;
				}
				distance-=enemySpd/2;
				if (distance<0)
				{
					distance=0;
				}
				System.out.print("He advanced..");
			}
		}
		else if (randomNumber==2)
		{//attack or advance
			if (distance<(enemyWeaponRgn))
			{
				enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he");
			}
			else 
			{
				enemyStamina-=enemySpd/4;
				if (enemyStamina<0)
				{
					enemyStamina=0;
				}
				distance-=enemySpd/2;
				if (distance<0)
				{
					distance=0;
				}
				System.out.print("He advanced..");
			}
		}	
		else if (randomNumber==3)
		{//back up if close, or charge
			if (distance<=enemySpd*2)
			{
				enemyStamina-=enemySpd/8;
				fightActionText("He backed based on his speed");distance+=enemySpd/4;
				if (distance<0)
				{
					distance=0;
				}
			}
			else 
			{
				enemyStamina-=enemySpd/2;
				if (enemyStamina<0)
				{
					enemyStamina=0;
				}
				distance-=enemySpd;
				if (distance<0)
				{
					distance=0;
				}
				System.out.print("He charged..");
			}
		}
		else if (randomNumber==4)
		{
			int randomnum=ShortcutMethods.randomNumberGeneratorMethod(4);
			if (randomnum==1){
			if (enemyStamina>0)
			{//when doing different moves I will use the if statement according to what move
				computerTurn_Guard();
					enemyStamina-=5;
					if (enemyStamina<0)
					{
						enemyStamina=0;
					}
			}
			else
			{
				System.out.print("Enemy's Stamina is too low, so he failed, while humiliating himself");
			}}
			else{//attack or advance
				if (distance<(enemyWeaponRgn))
				{
					enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he");
				}
				else 
				{
					enemyStamina-=enemySpd/4;
					if (enemyStamina<0)
					{
						enemyStamina=0;
					}
					distance-=enemySpd/2;
					if (distance<0)
					{
						distance=0;
					}
					System.out.print("He advanced..");
				}}
		}
		
		else if (randomNumber==5)
		{
			ShortcutMethods.generateSpaces(2);
			System.out.print("He holds position, may have recovered some Stamina\n");
			if (enemyStamina<300)
				{
					enemyStamina+=30;
					if (enemyStamina>300)
					{
						enemyStamina=300;
						if (distance<0)
						{
							distance=0;
						}
						System.out.println("Enemy's Stamina does not go any higher");
					}
				}	
			System.out.print("\ncontinue...\n");
			}
		else if (randomNumber==6)
		{//attack or advance
			if (distance<(enemyWeaponRgn))
			{
				enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he");
			}
			else 
			{
				enemyStamina-=enemySpd/4;
				if (enemyStamina<0)
				{
					enemyStamina=0;
				}
				distance-=enemySpd/2;
				if (distance<0)
				{
					distance=0;
				}
				System.out.print("He advanced..");
			}
		}	
	}

}//END CLASS BATTLEFIELD CONSOLE DEALER

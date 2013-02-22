package Section3_DuelSimulation;
import java.util.Scanner;

import javax.swing.JTextArea;

import Section2_Preparation.Contestant;
import Utilities.ConsoleVersion;
import Utilities.ShortcutMethods;

//need to implement the closer it is , the more accurate
public class TesterForData
{

	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: bored
	 * ##############################################################################################
	 */ 
	//MRS.CLARK, this is for the GUI and , in fact this is so similar to the BattleFieldConsoleVersion that
	//it is basically the same, the only difference, is that it runs x amount of times, than just once, depending
	//on your input for how many times to run.
	//Hence all the commenting here is on BattleFieldConsoleVersion

////////////////////Distance////////////////////
	private int distance;//in feet
	

	
	public int getDistance()
	{
		return distance;
	}
	int originalDistance;;
	public void setDistance(int d)
	{
		distance=d;
	}
	
////////////////////Status Variables////////////////////
	
	int matchNum;//these three variables are the only difference from the console Battle Field, it stores
			//how many matches are played and how many matches you and him have won
	int IWIN;
	int ENEMYWIN;
	
	Contestant contestant1;
	Contestant contestant2;
	
	String playerName;
	String enemyName;
	
	int playerStr;	int enemyStr;//the strength
	
	int playerDefence; 
	int enemyDefence;
	
	int playerDefence_Piercing;
	int playerDefence_Slash;
	int playerDefence_Crush;
	
	int enemyDefence_Piercing;
	int enemyDefence_Slash;
	int enemyDefence_Crush;
 
	int playerMve; 
	int enemyMve;
	
	int playerMve_Piercing;
	int playerMve_Slash;
	int playerMve_Crush;
	int playerMve_Shoot;
	
	int enemyMve_Piercing;
	int enemyMve_Slash;
	int enemyMve_Crush;
	int enemyMve_Shoot;
 
	int playerGrd;	int enemyGrd;
	int playerHp;	int enemyHp;
	
	int playerSpd;	int enemySpd;
	int playerAgl;	int enemyAgl;

	int playerTraining_1; 	
	int playerTraining_2;	
	int playerTraining_3;	
	int playerTraining_4;	
	int playerTraining_5;
	int enemyTraining_1; 	
	int enemyTraining_2;	
	int enemyTraining_3;	
	int enemyTraining_4;	
	int enemyTraining_5;
	
	
	int playerEdc;	int enemyEdc;
	int playerStamina;	int enemyStamina;
	int playerWgt;	int enemyWgt;
 
	
	int playerWeaponRgn;	int enemyWeaponRgn;
	int playerWeaponSpd;	int enemyWeaponSpd;
	
	
	private int playerWeaponSpdValue;	
	private int enemyWeaponSpdValue;
	
	String playerWeapon;
	String enemyWeapon;

	String playerArmour;
	String enemyArmour;
	
	int playerArmourDefence_Piercing;
	int playerArmourDefence_Slash;
	int playerArmourDefence_Crush;
	int enemyArmourDefence_Piercing;
	int enemyArmourDefence_Slash;
	int enemyArmourDefence_Crush;
	
	int myRace;
	int myWeapon;
	int myArmour;
	int hisRace;
	int hisWeapon;
	int hisArmour;
	
	
////////////////////Action Variables////////////////////
	
	
	boolean playerskip=false;
	boolean enemyskip=false;
	
	boolean playerGuarding=false;
	boolean enemyGuarding=false	;
	boolean playerStartsFirst;
	
	boolean exitSwitch=false;
	boolean validDataBattle=false;
	
	boolean player_primaryIsMelee=false;
	boolean player_primaryIsRanged=false;
	boolean enemy_primaryIsMelee=false;
	boolean enemy_primaryIsRanged=false;
	
	Scanner console;
	int choosingNumberBattle=0;
	
	
	//CONSTRUCTOR//
	public TesterForData(int d)
	{
		distance=d;
		originalDistance=d;
	}
	
	
	//ACTION METHODS//

public void battleMenu(int howManyTimes,int myRacePARA, int myWeaponPARA, int myArmourChoicePARA, 
		int enemyR, int enemyW, int enemyArmourChoicePARA, JTextArea outputer){
	System.out.print("You picked race "+ConsoleVersion.getmyRace()+"\n");
	obtainContestantData(myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
			enemyR, enemyW,  enemyArmourChoicePARA);
	System.out.print(fightingStatus());
	
	whoStartsFirst();

	while (validDataBattle!=true)
	{
		//the most basic "progress bar" xd
		System.out.print("\n"+matchNum+"\n");		
		//keep looping my friend
		if (matchNum<howManyTimes)
		{		
			if (playerStartsFirst==true)
			{
				judge(enemyHp,playerHp,myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
						enemyR, enemyW,  enemyArmourChoicePARA);
				playerTurn();
				judge(enemyHp,playerHp,myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
						enemyR, enemyW,  enemyArmourChoicePARA);
				enemyTurn();
			}
			if (playerStartsFirst==false)
			{
				judge(enemyHp,playerHp,myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
						enemyR, enemyW,  enemyArmourChoicePARA);
				enemyTurn();
				judge(enemyHp,playerHp,myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
						enemyR, enemyW,  enemyArmourChoicePARA); 
				playerTurn();	
			}	
		}
		
		else 
		{
			System.out.println(fightingStatus()+"\n========================================\n");
			System.out.println("100 BATTLES COMPLETE");
			System.out.println("you won"+IWIN);
			System.out.println("He won"+ENEMYWIN);
			System.out.println("last DISTANCE at last round when someone died:"+distance+" feet");
			System.out.println("original input DISTANCE:"+ originalDistance+" feet");
			
			validDataBattle=true;
			}
		}
	if(outputer!=null){
	outputer.append("100 BATTLES COMPLETE\n"+"You won:"+IWIN+"battles\n"+"The enemy won:"+ENEMYWIN+"battles\n" +
			"SEE YOUR CONSOLE FOR MORE INFORMATION\n");}
	}


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
			
		}
		return xStamina;
	}
	
	private void computerTurn_Attack()
	{
		
		//when computer Strs

		if (enemy_primaryIsMelee==true)
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
				enemyskip=dodgingChance(playerAgl,playerTraining_5, enemyTraining_5);
			}
		}

			//note 	that the enemy's training determines his ability to control with his weapon
		else if (enemy_primaryIsRanged==true)
		{
			enemyskip=dodgingChance(playerAgl, playerTraining_2,enemyTraining_2);
		}
			
		if (enemyWeaponSpdValue==10)
		{
			enemyWeaponSpdValue=10-enemyWeaponSpd;
		}
				//Maximum of 10 rounds to hit once
		if (distance<=enemyWeaponRgn)
		{
			//

				if (enemyWeaponSpdValue==9)
				{
					if (enemyskip==false)
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
					else {}
				}
				else
				{
					if 	(enemy_primaryIsMelee==true)
						{
						}
					else if (enemy_primaryIsRanged==true)
					{
					
					}
				}
				enemyWeaponSpdValue+=1;
		}else{enemyStamina-=enemySpd/4;distance-=enemySpd/2;if (distance<0){distance=0;}}
			
	}
	
	private void computerTurn_Guard()
	{
		//GUARD
		
		enemyGuarding=true;
	}
	
	private void playerTurn_Attack()
	{
		if (player_primaryIsMelee==true)
		{
			if (contestant1.getContestantWeaponType()==1){
				playerskip=dodgingChance(enemyAgl,enemyTraining_1,playerTraining_1);}
			
			if (contestant1.getContestantWeaponType()==3){
				playerskip=dodgingChance(enemyAgl,enemyTraining_3,playerTraining_3);}
			
			if (contestant1.getContestantWeaponType()==4){
				playerskip=dodgingChance(enemyAgl,enemyTraining_4,playerTraining_4);}
			
			if (contestant1.getContestantWeaponType()==5){
				playerskip=dodgingChance(enemyAgl,enemyTraining_5,playerTraining_5);}
		}
			//note that the player's training determines his ability to control with his weapon
		else if (player_primaryIsRanged==true)
		{
			playerskip=dodgingChance(enemyAgl, enemyTraining_2,playerTraining_2);
		}
				
		if (playerWeaponSpdValue==10){playerWeaponSpdValue=10-playerWeaponSpd;}//Maximum of 10 rounds to hit once}
		if (distance<=playerWeaponRgn){
				if (playerWeaponSpdValue==9){
						//
					if (playerskip==false)
					{
						if (enemyGuarding==true)
						{	
							enemyDefence+=enemyGrd;
							if (enemyDefence<(playerStr+playerMve)){
								enemyHp=blockDefendAbsorb(enemyHp, (playerStr+playerMve), enemyDefence, "","");
								enemyDefence-=enemyGrd;}
							else{
								enemyHp=blockDefendAbsorb(enemyHp, (playerStr+playerMve), enemyDefence, "","");
								enemyDefence-=enemyGrd;
								}
						}
						else{
							enemyHp=blockDefendAbsorb(enemyHp, (playerStr+playerMve), enemyDefence, "","");}

					}
					else {}
				}	
				else 
				{
				}
				playerWeaponSpdValue+=1;	}
		else{playerStamina-=playerSpd/3;distance-=playerSpd;if (distance<0){distance=0;}}
	}
	
	
	private void playerTurn_Guard()
	{
		//GUARD
		
		playerGuarding=true;
	}
	
	private void playerTurn()
	{
		// player's turn
		
	
		playerGuarding=false;
		moveDecisioner(true);
		playerAILogical();
	
		}

	private void enemyTurn(){
		// Enemy's turn
		
	
		enemyGuarding=false;
		moveDecisioner(false);
		computerAILogical();
	
	}
	
	private void judge(int m, int n,int myRacePARA, int myWeaponPARA, int myArmourChoicePARA, 
			int enemyR, int enemyW, int enemyArmourChoicePARA){//m is enemy
		if (m<=0&&n>0)
		{
			IWIN++;obtainContestantData(myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
			enemyR, enemyW,  enemyArmourChoicePARA);matchNum++;distance=originalDistance;
			
		}
		else if (n<=0&&m>0)
		{
			ENEMYWIN++;obtainContestantData(myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
					enemyR, enemyW,  enemyArmourChoicePARA);matchNum++;distance=originalDistance;
			
		}
		else if (n<=0&&m<=0)
		{
			obtainContestantData(myRacePARA, myWeaponPARA,  myArmourChoicePARA, 
					enemyR, enemyW,  enemyArmourChoicePARA);matchNum+=1;distance=originalDistance;
			

		}
		else if (n>=0&&m>=0)
		{
			
		}
	}
	
	private void whoStartsFirst()
	{//m is enemy
		if (enemySpd>playerSpd)
		{
			playerStartsFirst=false;
		}
		else if (enemySpd<playerSpd)
		{
			playerStartsFirst=true;
		}
		else 
		{
			playerStartsFirst=true;
		}
	}
	private int blockDefendAbsorb(int a, int b, int c, String e, String f)
	{		
		int temp  = b-c;
		if(temp > 0)
		{
			a += (-temp);
		}
		else
		{
		}
		
		return a;
	}
	
	private boolean dodgingChance//targeTraining is specific to the attack the person creating the type of attack
		(int targetAgl,int targetTraining,int self_Training)
	{//dodging //decision method! THIS CLASS NEEDS SOME TESTING
		int rndYourNumber=ShortcutMethods.randomNumberGeneratorMethod(100);
		int rndYourNumber2=ShortcutMethods.randomNumberGeneratorMethod(100);
		boolean skip = false;
		if (rndYourNumber>(targetAgl))//ARMOUR WOULD REDUCE THIS ONE
		{//THE SMALLER YOUR RIGHT SIDE,THE MORE LIKELY TO HIT
			if (rndYourNumber2>((50-(self_Training*2))+(targetTraining))) 
					{skip=false;} 					
			else if (rndYourNumber2<((50-(self_Training*2))+(targetTraining)))
					{skip=true;}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
		}
			else 	{skip=true;}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
		return skip;
	}
	
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
					
				}
			else if (w==1){
				 player_primaryIsMelee=true;	
				 player_primaryIsRanged=false;
			}
			else if (w==2){
				 player_primaryIsRanged=true; 
				 player_primaryIsMelee=false;
			}
			else if (w==3){
				 player_primaryIsRanged=false; 
				 player_primaryIsMelee=true;						
			}
			else if (w==4){
				 player_primaryIsRanged=false; 
				 player_primaryIsMelee=true;
			}
			else if (w==5){
				 player_primaryIsRanged=false; 
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
				 }
			else if (w==1){
				 enemy_primaryIsMelee=true;
				 enemy_primaryIsRanged=false;
			}
			else if (w==2){
				 enemy_primaryIsRanged=true;
				 enemy_primaryIsMelee=false;
			}
			else if (w==3){
				 enemy_primaryIsRanged=false; 
				 enemy_primaryIsMelee=true;
			}
			else if (w==4){
				 enemy_primaryIsRanged=false;
				 enemy_primaryIsMelee=true;
			}
			else if (w==5){
				 enemy_primaryIsRanged=false;
				 enemy_primaryIsMelee=true;
			}
		}
	}

	////////////////////////
	//additional SHORTCUT METHODS
	////////////////////////

	

	public void obtainContestantData(int myRacePARA, int myWeaponPARA, int myArmourChoicePARA, 
		int enemyR, int enemyW, int enemyArmourChoicePARA){
	
		myRace=myRacePARA;
		myWeapon=myWeaponPARA;
		
		hisRace=enemyR;
		hisWeapon=enemyW;
		
		myArmour=myArmourChoicePARA;
		hisArmour=enemyArmourChoicePARA;
		
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
	


	private String fightingStatus(){
		
	String outputer=(("\n~*~~*~~*~~*Status~*~~*~~*~~*~\n")
		
		+("\n~*~~*~~*~~*MAIN~*~~*~~*~~*~\n")
		+("\n   |  You:"+playerName)
		+("\n   |  The enemy:"+enemyName+"\n")
		+("   |  Your health: "+playerHp+"\n")
		+("   |  Your Stamina: "+playerStamina+"\n")//CANNOT BE OVER 300
		+("   |  Your weapon: "+playerWeapon+"\n")
		+("   |  Your strength: "+playerStr+"\n")
	   	+("   |  Your Armour Name: "+playerArmour+"\n")	
		+("   |  The enemy's health: "+enemyHp+"\n")
		+("   |  The enemy's Stamina: "+enemyStamina+"\n")
		+("   |  The enemy's weapon: "+enemyWeapon+"\n")
		+("   |  The enemy's strength: "+enemyStr+"\n")	
	   	+("   |  The enemy's Armour Name: "+enemyArmour+"\n")
		+("   THE REST OF THE DATA IS AVAILABLE if you can see the enemy in detail\n")
		+("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n")
		
				+("\n~*~~*~~*~~*OTHER INFO~*~~*~~*~~*~\n")
				+("   |  The enemy's guard: "+enemyGrd+"\n")
				+("   |   Enemy's enemy Defence_Piercing: "+enemyDefence_Piercing+"\n")
				+("   |   Enemy's enemy Defence_Slash: "+enemyDefence_Slash+"\n")
				+("   |   Enemy's enemy Defence_Crush: "+enemyDefence_Crush+"\n")
				+("   |  The enemy's speed: "+enemySpd+"\n")
				+("   |  The enemy's agility: "+enemyAgl+"\n")
				+("   |  The enemy's endurance: "+enemyEdc+"\n")
				+("   |  The enemy'sweight: "+enemyWgt+"\n\n")
				
				+("   |  Your guard: "+playerGrd+"\n")
				+("   |  Your player Defence_Piercing: "+playerDefence_Piercing+"\n")
				+("   |  Your player Defence_Slash: "+playerDefence_Slash+"\n")
				+("   |  Your player Defence_Crush: "+playerDefence_Crush+"\n")
				+("   |  Your speed: "+playerSpd+"\n")
				+("   |  Your agility: "+playerAgl+"\n")
				+("   |  Your endurance: "+playerEdc+"\n")
				+("   |  Your weight: "+playerWgt+"\n")
				+("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n")
				+("\n~*~~*~~*~~*Weapons~~*~~*~~*~~*~~*~~*~~*~\n\n")
				+("   |  Your weapon Range: "+playerWeaponRgn+"\n")
				
				
					+("   |  Your slash attack: "+playerMve_Slash+"\n")
					+("   |  Your Piercing attack: "+playerMve_Piercing+"\n")
					+("   |  Your crush attack: "+playerMve_Crush+"\n")
				
				
					+("   |  Your shoot attack: "+playerMve_Shoot+"\n")
				
				
				+("   |  Your Str Spd with prm Weapon: "+playerWeaponSpd+"\n")
				+("   |  Enemy's Str Spd with prm Weapon: "+enemyWeaponSpd+"\n")
				+("   |  The enemy'sweapon Range: "+enemyWeaponRgn+"\n")
				
					+("   |  The enemy's slash attack: "+enemyMve_Slash+"\n")
					+("   |  The enemy's Piercing attack: "+enemyMve_Piercing+"\n")
					+("   |  The enemy's crush attack: "+enemyMve_Crush+"\n")
				
					+("   |  The enemy'sshoot attack: "+enemyMve_Shoot+"\n")
				
				
			   	+("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n\n")
			   	+("\n~*~~*~~*~~*Armour~~*~~*~~*~~*~~*~~*~~*~\n\n")
			   	+("   |  Your Armour slash Defence: "+playerArmourDefence_Slash+"\n")
				+("   |  Your Armour piercing Defence: "+playerArmourDefence_Piercing+"\n")
				+("   |  Your Armour crush Defence: "+playerArmourDefence_Crush+"\n")
				+("   |  Your Armour Type: "+contestant1.getContestantArmourType()+"\n")
				+("   |  Your Armour Weight: "+contestant1.getContestantArmourWeight()+"\n")
				+("   |  Your Armour Guard Boost: "+contestant1.getContestantArmourGuardBooster()+"\n")
				+("   |  Your Armour Speed Boost: "+contestant1.getContestantArmourSpeedBooster()+"\n")
				
				+("   |  The enemy's Armour slash Defence: "+enemyArmourDefence_Slash+"\n")
				+("   |  The enemy's Armour piercing Defence: "+enemyArmourDefence_Piercing+"\n")
				+("   |  The enemy's Armour crush Defence: "+enemyArmourDefence_Crush+"\n")
				+("   |  The enemy's Armour Type: "+contestant2.getContestantArmourType()+"\n")
				+("   |  The enemy's Armour Weight: "+contestant2.getContestantArmourWeight()+"\n")
				+("   |  The enemy's Armour Guard Boost: "+contestant2.getContestantArmourGuardBooster()+"\n")
				+("   |  The enemy's Armour Speed Boost: "+contestant2.getContestantArmourSpeedBooster()+"\n")
			   	+("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n\n")
				+("\n~*~~*~~*~TRAINING*~~*~~*~~*~\n")
				+("   |  Your Training in moderate melee: "+playerTraining_1+"\n")
				+("   |  Your Training in heavy melee: "+playerTraining_3+"\n")
				+("   |  Your Training in light melee: "+playerTraining_4+"\n")
				+("   |  Your Training in pole arms: "+playerTraining_5+"\n")
				+("   |  Your Training in ranged: "+playerTraining_2+"\n")
				
				+("\n")
				
				+("   |  The enemy's Training in moderate melee: "+enemyTraining_1+"\n")
				+("   |  The enemy's Training in heavy melee: "+enemyTraining_3+"\n")
				+("   |  The enemy's Training in light melee: "+enemyTraining_4+"\n")
				+("   |  The enemy's Training in pole arms: "+enemyTraining_5+"\n")

				+("   |  The enemy's Training in ranged: "+enemyTraining_2+"\n")
				+("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n"));
		
				return outputer;
	}	
	
	////////////////////////////////////////////////////////////////////////
	//AI COMBAT STYLES
	private void moveDecisioner(boolean myTurn)
	{	
		playerMve=0;
		enemyMve=0;
		playerDefence=0;
		enemyDefence=0;
		
		if (myTurn==true)
		{
	
			int randomNumber=ShortcutMethods.randomNumberGeneratorMethod(3);
			if (randomNumber==1)
			{
				if(player_primaryIsMelee==true&&player_primaryIsRanged==false)
				{
					playerMve=playerMve_Slash;
					playerDefence=playerDefence_Slash+playerArmourDefence_Slash;
					enemyDefence=enemyDefence_Slash+enemyArmourDefence_Slash;
				}
				else
				{
					playerMve=playerMve_Shoot;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
					}
				}
			else if (randomNumber==2)
			{
				if(player_primaryIsMelee==true&&player_primaryIsRanged==false)
				{
					playerMve=playerMve_Piercing;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
				}
				else
				{
					playerMve=playerMve_Shoot;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
				}
			}
			else if (randomNumber==3)
			{
				if(player_primaryIsMelee==true&&player_primaryIsRanged==false)
				{
					playerMve=playerMve_Crush;
					playerDefence=playerDefence_Crush+playerArmourDefence_Crush;
					enemyDefence=enemyDefence_Crush+enemyArmourDefence_Crush;
				}
				else
				{
					playerMve=playerMve_Shoot;
					playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
					enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
				}
			}
			else
			{
				
			}
			
		}
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
				
			}
		}
	}
	//////////////////////////AI STYLES	//////////////////////////<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	///////////////////////////////////
	/////////////////////////////////
	///////////////////////
	/////////////
	//////
//	//
	private void playerAILogical(){
		int r=ShortcutMethods.randomNumberGeneratorMethod(5);
		if (playerHp<(enemyStr+enemyMve)&&r==2)
		{//guard
			if (playerGrd>(enemyStr+enemyMve))
			{
				if (playerStamina>0)
				{//when doing different moves I will use the if statement according to what move
					playerTurn_Guard();//watch out WHEN COPYING AND PASTING
		
					playerStamina-=5;
					if (playerStamina<0)
					{playerStamina=0;}
				}
				else{}
			}
			else 
			{//back up			
				if (distance<(1000-(playerSpd/2))){
				playerStamina-=playerSpd/8;if (playerStamina<0){playerStamina=0;}
				
				distance+=playerSpd/4;
				}
				else{if (distance<(playerWeaponRgn)){
					playerStamina=makingAttack(playerStamina, 15,false, "", "");
				}
				else {playerStamina-=playerSpd/4;if (playerStamina<0){playerStamina=0;}distance-=playerSpd/2;if (distance<0){distance=0;};}
					
				}
			}
		}	
		else if (playerStamina<15){
			if (playerStamina<300)
				{
				playerStamina+=30;
				if (playerStamina>300){playerStamina=300;if (distance<0){distance=0;}}
				}	
			}
		else if (distance>100){//charge--this guy is brave presumably
			if (distance<(playerWeaponRgn)){
			playerStamina=makingAttack(playerStamina, 15,false, "", "");
			}
			else {playerStamina-=playerSpd/2;if (playerStamina<0){playerStamina=0;}distance-=playerSpd;if (distance<0){distance=0;}}
		}
		else {//offensive/ attack or advance
			if (distance<(playerWeaponRgn)){
			playerStamina=makingAttack(playerStamina, 15,false, "", "");
			}
			else {playerStamina-=playerSpd/4;if (playerStamina<0){playerStamina=0;}distance-=playerSpd/2;if (distance<0){distance=0;}}
		}
		}
	private void computerAILogical(){
		int r=ShortcutMethods.randomNumberGeneratorMethod(5);
		if (enemyHp<(playerStr+playerMve)&&r==2)//tired of backing all the time
		{//guard
			if (enemyGrd>(playerStr+playerMve))
			{
				if (enemyStamina>0)
				{//when doing different moves I will use the if statement according to what move
					computerTurn_Guard();
		
					enemyStamina-=5;
					if (enemyStamina<0)
					{enemyStamina=0;}
				}
				else{}
			}
			else 
			{//back up			
				if (distance<(1000-(enemySpd/2))){
				enemyStamina-=enemySpd/8;if (enemyStamina<0){enemyStamina=0;}
				
				distance+=enemySpd/4;
				}
				else{if (distance<(enemyWeaponRgn)){
					enemyStamina=makingAttack(enemyStamina, 15,true, "", "");
				}
				else {enemyStamina-=enemySpd/4;if (enemyStamina<0){enemyStamina=0;}distance-=enemySpd/2;if (distance<0){distance=0;};}
					
				}
			}	
		}	
		else if (enemyStamina<15){
			if (enemyStamina<300)
				{
				enemyStamina+=30;
				if (enemyStamina>300){enemyStamina=300;if (distance<0){distance=0;}}
				}	
			}
		else if (distance>100){//charge--this guy is brave presumably
			if (distance<(enemyWeaponRgn)){
			enemyStamina=makingAttack(enemyStamina, 15,true, "", "");
			}
			else {enemyStamina-=enemySpd/2;if (enemyStamina<0){enemyStamina=0;}distance-=enemySpd;if (distance<0){distance=0;}}
		}
		else {//offensive/ attack or advance
			if (distance<(enemyWeaponRgn)){
			enemyStamina=makingAttack(enemyStamina, 15,true, "", "");
			}
			else {enemyStamina-=enemySpd/4;if (enemyStamina<0){enemyStamina=0;}distance-=enemySpd/2;if (distance<0){distance=0;}}
		}
	
		}


}//END CLASS BATTLEFIELD CONSOLE DEALER
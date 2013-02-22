package Section3_DuelSimulation;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Section1_GUI_Interface.TheArenaGameGUI;
import Section2_Preparation.Contestant;
import Utilities.ShortcutMethods;
import Utilities.gameObjects;

//need to implement the closer it is , the more accurate
public class BattleFieldGUIDealer {
	/* ##############################################################################################
	 * By Ankun Fang	
	 * Date: 2012/1/20
	 * Mood: annoyed
	 * ##############################################################################################
	 */ 
	//MRS.CLARK, this is for the GUI, in fact this is so similar to the BattleFieldConsoleVersion that
	// it is basically the same, the only difference, is that it outputs a JTextArea
	//Hence all the commenting here is on BattleFieldConsoleVersion



	//THE MAX DISTANCE IS 500 FEET IN THIS VERSION

	
	
	public BattleFieldGUIDealer(){
	
	}
	public int maxStamina=300;
	public int distance;
	public int getDistance()
	{
		return distance;
	}
	
	Contestant contestant1;
	Contestant contestant2;
	
	public Contestant getcontestant1(){
		return contestant1;
	}
	public Contestant getcontestant2(){
		return contestant2;
	}
	String playerName;
	String enemyName;
	int playerOriginalHp=0;	int enemyOriginalHp=0;
		public int getOriginalplayerHp(){
			return playerOriginalHp;	
			}
		public int getOriginalenemyHp(){
			return enemyOriginalHp;	
			}
	int playerHp;	int enemyHp;
		public void setplayerHp(int h){
			playerHp=h;	
			}
		public void setenemyHp(int h){
			enemyHp=h;	
			}
	
	int playerStr=0;	int enemyStr=0;//the strength
	public void setplayerStr(int playerStr) {
		this.playerStr = playerStr;
	}
	public int getplayerStr() {
		return playerStr;
	}
	
	
	int playerMve=0; int enemyMve=0;
    int playerMve_Piercing=0;int playerMve_Slash=0;int playerMve_Crush=0;int playerMve_Shoot=0;
	int enemyMve_Piercing=0;int enemyMve_Slash=0;int enemyMve_Crush=0;int enemyMve_Shoot=0;
	public void setPlayerMve_Piercing(int playerMve_Piercing) {
		this.playerMve_Piercing = playerMve_Piercing;
	}
	public int getPlayerMve_Piercing() {
		return playerMve_Piercing;
	}
	
	int playerDefence=0; 
	int enemyDefence=0;
	
	int playerDefence_Piercing=0;
	int playerDefence_Slash=0;
	int playerDefence_Crush=0;
	
	int enemyDefence_Piercing=0;
	int enemyDefence_Slash=0;
	int enemyDefence_Crush=0;
	
	int playerGrd=0;	int enemyGrd=0;
	

	int playerMoney=0; int enemyMoney=0;
	public int getplayerMoney()
	{
		return playerMoney;
	}
	public int setplayerMoney(int playerMoneySetAmount)
	{
		return playerMoney=playerMoneySetAmount;
	}
	public int getenemyMoney()
	{
		return enemyMoney;
	}
	public int setenemyMoney(int enemyMoneySetAmount)
	{
		return enemyMoney=enemyMoneySetAmount;
	}
	
	//mutator for HP Variable
	public int getPlayerHp(){return playerHp;}
	public int getEnemyHp(){return enemyHp;}
	
	int playerSpd=0;	int enemySpd=0;
	public void setplayerSpd(int playerSpd) {
		this.playerSpd = playerSpd;
	}
	public int getplayerSpd() {
		return playerSpd;
	}
	int playerAgl=0;	int enemyAgl=0;
	public void setplayerAgl(int playerAgl) {
		this.playerAgl = playerAgl;
	}
	public int getplayerAgl() {
		return playerAgl;
	}
	
	public int initialStamina=maxStamina/2;
	
	int playerTraining_1=0; 	int playerTraining_2=0;	int playerTraining_3=0;	int playerTraining_4=0;	int playerTraining_5=0;
	int enemyTraining_1=0; 	int enemyTraining_2=0;	int enemyTraining_3=0;	int enemyTraining_4=0;	int enemyTraining_5=0;
	public void setplayerTraining_1(int playerTraining_1) {
		this.playerTraining_1 = playerTraining_1;
	}
	public int getplayerTraining_1() {
		return playerTraining_1;
	}
	public void setplayerTraining_2(int playerTraining_2) {
		this.playerTraining_2 = playerTraining_2;
	}
	public int getplayerTraining_2() {
		return playerTraining_2;
	}
	public void setplayerTraining_3(int playerTraining_3) {
		this.playerTraining_3 = playerTraining_3;
	}
	public int getplayerTraining_3() {
		return playerTraining_3;
	}
	public void setplayerTraining_4(int playerTraining_4) {
		this.playerTraining_4 = playerTraining_4;
	}
	public int getplayerTraining_4() {
		return playerTraining_4;
	}
	public void setplayerTraining_5(int playerTraining_5) {
		this.playerTraining_5 = playerTraining_5;
	}
	public int getplayerTraining_5() {
		return playerTraining_5;
	}
	
	int playerEdc=0;	int enemyEdc=0;
	public void setplayerEdc(int playerEdc) {
		this.playerEdc = playerEdc;
	}
	public int getplayerEdc() {
		return playerEdc;
	}
	
	int playerInitiative=0; int enemyInitiative=0;
	public void setplayerInitiative(int playerInitiative) {
		this.playerInitiative = playerInitiative;
	}
	public int getplayerInitiative() {
		return playerInitiative;
	}
	
	int playerStamina;	int enemyStamina;
	public int getPlayerStamina(){
		return playerStamina;	
		}
	public int getEnemyStamina(){
		return enemyStamina;	
		}
	
	int playerWgt;	int enemyWgt;
 
	
	int playerWeaponRgn;	int enemyWeaponRgn;
	int playerWeaponSpd;	int enemyWeaponSpd;
	
	
	public int playerWeaponSpdValue;	
	public int enemyWeaponSpdValue;
	
	String playerWeaponString;
	String enemyWeaponString;

	public boolean displayMoreFightingStatus=false;

	boolean playerskip=false;
	boolean enemyskip=false;
	
	boolean playerGuarding=false;
	boolean enemyGuarding=false;
	
	boolean exitSwitch=false;
	boolean validDataBattle=false;
	
	boolean player_primaryIsMelee=false;
	boolean player_primaryIsRanged=false;
	boolean enemy_primaryIsMelee=false;
	boolean enemy_primaryIsRanged=false;
	
	int choosingNumberBattle=0;
	

	int playerVision; 
	public int getMyVision(){return playerVision;}
	
	int myRace;
	int myWeapon;
	int hisRace;
	int hisWeapon;
	
	String playerArmour;
	String enemyArmour;
	
	int playerArmourDefence_Piercing;
	int playerArmourDefence_Slash;
	int playerArmourDefence_Crush;
	
	int enemyArmourDefence_Piercing;
	int enemyArmourDefence_Slash;
	int enemyArmourDefence_Crush;
	
	int maxDistance=10;
	int myArmourChoice ,hisArmourChoice;
	
	public void initialization(JTextArea outputer)
	{
		distance=TheArenaGameGUI.playerVictories*12^2+maxDistance/4+ShortcutMethods.randomNumberGeneratorMethod(maxDistance/2-1);
		if (distance>10000){distance=(10000-ShortcutMethods.randomNumberGeneratorMethod(5000));}
		outputer.append("You guys will be fighting with a distance of "+distance+" feet!\nDistances increases" +
				" as you win more\nEnemies are harder as player victories add\n");
		
		outputer.append("\n"+"Player Name: "+playerName+"\n"+ " Enemy Name: "+enemyName);
		
		outputer.append("\n"+"Player Weapon Name: "+playerWeaponString+"\n"+ "Enemy Weapon Name: "+enemyWeaponString);
	}

	
	///////////////////////////
	private int makingAttack(int xStamina, int num, boolean d, String a, String b,JTextArea outputer){
		if (xStamina>0)
		{ShortcutMethods.stall(100);
			//when doing different moves I will use the if statement according to what move
			if (d==true)
			{
				computerTurn_Attack(outputer);
			}
			else if (d==false)
			{
				playerTurn_Attack(outputer);
			}
			xStamina-=num;
			if (xStamina<0)
				{
					xStamina=0;
				}
			}
		else
		{
			fightActionText(a+"'s Stamina is too low, so "+b+" missed entirely", outputer);
		}
		return xStamina;
	}
	
	private void computerTurn_Attack(JTextArea outputer)
	{
		ShortcutMethods.stall(500);
		outputer.append("\nEnemy's Turn\n");
		//when computer ATKs
		
		fightActionText("The computer attempts to attack\n",outputer);

		if (enemy_primaryIsMelee==true)
		{
			if (contestant2.getContestantWeaponType()==1)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_1, enemyTraining_1,outputer);
			}
		
			if (contestant2.getContestantWeaponType()==3)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_3, enemyTraining_3,outputer);
			}
			
			if (contestant2.getContestantWeaponType()==4)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_4, enemyTraining_4,outputer);
			}
			
			if (contestant2.getContestantWeaponType()==5)
			{
				enemyskip=dodgingChance(playerAgl,playerTraining_5, enemyTraining_5,outputer);
			}
		}

			//note 	that the enemy's training determines his ability to control with his weapon
		else if (enemy_primaryIsRanged==true)
		{
			enemyskip=dodgingChance(playerAgl, playerTraining_2,enemyTraining_2,outputer);
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
								playerHp=blockDefendAbsorb("to playerHp",playerHp, (enemyStr+enemyMve), playerDefence, "Defence nulled the attack","Your Guard did not guard completely",outputer,playerStamina,playerSpd);
								playerDefence-=playerGrd;playerGuarding=false;}
							else{
								playerHp=blockDefendAbsorb("to playerHp",playerHp, (enemyStr+enemyMve), playerDefence, "Defence nulled the attack","Your Guard guarded almost completely",outputer,playerStamina,playerSpd);
								playerDefence-=playerGrd;playerGuarding=false;}
							}
						else{
							playerHp=blockDefendAbsorb("to playerHp",playerHp, (enemyStr+enemyMve), playerDefence, "Defence nulled the attack","...",outputer,playerStamina,playerSpd);}
					}
					else {fightActionText("The player dodges",outputer);}
				}
				else
				{
					if 	(enemy_primaryIsMelee==true)
						{
						
						fightActionText("\nThe enemy is in the progress of using his weapon!\nRound ends\n",outputer);
						}
					else if (enemy_primaryIsRanged==true)
					{
						if (enemyWeaponSpdValue==4)//the s for grammar
							{outputer.append("He puts down his weapon");}//Crossbow/musket 
						if (enemyWeaponSpdValue==5)
							{outputer.append("He resets his weapon");}//Crossbow
						if (enemyWeaponSpdValue==6)
							{outputer.append("He raises his weapon");}//Crossbow
						if (enemyWeaponSpdValue==7)
							{outputer.append("He puts ammo on his ranged equipment");}//Crossbow&bow
						if (enemyWeaponSpdValue==8)
							{outputer.append("He takes aim");}//Crossbow&bow
					
					}
				}
				enemyWeaponSpdValue+=1;outputer.append("\n");
		}else
		{
			enemyStamina-=enemySpd/4;
			if (enemyStamina<0)
			{
				enemyStamina=0;
			}
			fightActionText("The enemy can't hit you yet, too far away, so he advanced",outputer);
			distance-=enemySpd;if (distance<0){distance=0;}
		}
			
	}
	
	private void computerTurn_Guard(JTextArea outputer)
	{
		//GUARD
		fightActionText("The computer defends\n",outputer);
		enemyGuarding=true;
	}
	
	private void playerTurn_Attack(JTextArea outputer)
	{
		ShortcutMethods.stall(500);
		//ATK				
		
		fightActionText("The player attempts to attack\n",outputer);
		
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
								enemyHp=blockDefendAbsorb("to enemyHp",enemyHp,(playerStr+playerMve), enemyDefence, "Defence nulled the attack","The enemy's Guard did not guard completely\n",outputer,enemyStamina,enemySpd);
								enemyDefence-=enemyGrd;enemyGuarding=false;}
							else{
								enemyHp=blockDefendAbsorb("to enemyHp",enemyHp, (playerStr+playerMve), enemyDefence, "Defence nulled the attack","The enemy's Guard guarded almost completely\n",outputer,enemyStamina,enemySpd);
								enemyDefence-=enemyGrd;enemyGuarding=false;;
								}
						}
						else{
							enemyHp=blockDefendAbsorb("to enemyHp",enemyHp,(playerStr+playerMve), enemyDefence, "Defence nulled the attack","...",outputer,enemyStamina,enemySpd);}
						//
					}
					else {fightActionText("The enemy dodges\n",outputer);}
				}	
				else 
				{
					if 	(player_primaryIsMelee==true)
						{
						outputer.append("\nYour still in the progress of using your weapon!\nRound ends\n");
						}
					else if (player_primaryIsRanged==true)
					{
						if (playerWeaponSpdValue==4)
							{outputer.append("You put down your weapon");}//
						if (playerWeaponSpdValue==5)
							{outputer.append("You set your weapon");}//
						if (playerWeaponSpdValue==6)
							{outputer.append("You raise your weapon");}//crossbow
						if (playerWeaponSpdValue==7)
							{outputer.append("You put ammo on your ranged equipment");}//crossbow&bow
						if (playerWeaponSpdValue==8)
							{outputer.append("You take aim");}//crossbow&bow
						
					}
					
				}
				playerWeaponSpdValue+=1;outputer.append("\n");	
		}
		else
		{
			playerStamina-=playerSpd/4;
			if (playerStamina<0)
			{
				playerStamina=0;
			}
			fightActionText("You can't hit him yet, too far away, so you advanced",outputer);
			distance-=playerSpd;
			if (distance<0)
			{
				distance=0;
			}
		}
			
	}
	
	private void playerTurn_Guard(JTextArea outputer)
	{
		//GUARD
		fightActionText("The player defends\n",outputer);
		playerGuarding=true;
	}
	
	public void playerTurn(JTextArea outputer,int userSelectedMove, boolean playerTurnStill)
	{	
		//FIGHTER'S INFORMATION

		
		//Player's turn
		outputer.append("\nYour Turn\n");
		

			choosingNumberBattle=userSelectedMove;
			if (choosingNumberBattle==1)
			{
				playerTurnStill=false;
				if (playerStamina>0){//when doing different moves I will use the if statement according to what move
					playerTurn_Guard(outputer);
						
					playerStamina+=5;
					if (playerStamina>=maxStamina){playerStamina=maxStamina;}	
						if (playerStamina<0)
						{
							playerStamina=0;
						}
					
				}
				else{outputer.append("\nYour Stamina is too low\n");playerTurnStill=true;}
				outputer.append("TURN ENDS\n\n\n");
			}
			else if (choosingNumberBattle==2)
			{
				playerTurnStill=false;
				if (distance>0)
				{
					if (playerStamina>0)
					{
						playerStamina-=playerSpd/2;
						if (playerStamina<0)
						{
							playerStamina=0;
						}	
						fightActionText("You charged",outputer);					
						distance-=playerSpd*2;
						if (distance<0)
						{
							distance=0;
						}
					}
					else{outputer.append("\nYour Stamina is too low\n");playerTurnStill=true;}
					outputer.append("TURN ENDS\n\n\n");
				}
				else {outputer.append("\nYou guys are too close to be advancing! continue your choice..\n");
				playerTurnStill=true;}
				
			}
			else if (choosingNumberBattle==3)
			{playerTurnStill=false;
				
				
				fightActionText("You hold position, may have recovered some Stamina\n",outputer);
				if (playerStamina<maxStamina)
				{
					playerStamina+=30;
					if (playerStamina>maxStamina)
					{
						playerStamina=maxStamina;
						outputer.append("\nStamina can only be added to a maxinum of maxStamina\n");
						playerTurnStill=true;
					}
					
				}
			}
			else if (choosingNumberBattle==4)
			{	playerTurnStill=true;
				
				displayMoreFightingStatus=true;
				
				if (distance> playerVision*2)
				{
					outputer.append("\n\n=====================NOTE=====================\n\nYOU CANNOT SEE THE ENEMY IN DETAIL YET, " +
					"GO CLOSER OR HAVE HIGER AGILITY!\n\n\n\n=====================NOTE=====================\n\n\n\n");
					displayMoreFightingStatus=false;}
				
				outputer.append("CONTINUE\n\n\n");
				
				
			}
			else if (choosingNumberBattle==5)
			{
				playerTurnStill=false;
				//backup
				if (playerStamina>0){
				if (distance<(300-(playerSpd/2))){
					playerStamina-=playerSpd/4;if (playerStamina<0){playerStamina=0;}
				fightActionText("You backed based on your speed",outputer);distance+=playerSpd/4;if (distance<0){distance=0;}
				outputer.append("TURN ENDS");
				}
				else {outputer.append("The crowd is booing, \nso you do not plan to back up further\n");}}
				else{outputer.append("Too tired\n");}
			}
			
			
			else if (choosingNumberBattle>=10&&choosingNumberBattle<=20)
			{//opens move menu
			
				try
				{
					if (choosingNumberBattle==10&&player_primaryIsMelee==true&&player_primaryIsRanged==false)
					{
						playerMve=playerMve_Slash;
						playerDefence=playerDefence_Slash+playerArmourDefence_Slash;
						enemyDefence=enemyDefence_Slash+enemyArmourDefence_Slash;
						playerTurnStill=false;
						playerTurnMakeMove(outputer);
					}
					else if (choosingNumberBattle==11&&player_primaryIsMelee==true&&player_primaryIsRanged==false)
					{
						playerMve=getPlayerMve_Piercing();
						playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
						enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
						playerTurnStill=false;
						playerTurnMakeMove(outputer);
					}
					else if (choosingNumberBattle==12&&player_primaryIsMelee==true&&player_primaryIsRanged==false)
					{
						playerMve=playerMve_Crush;
						playerDefence=playerDefence_Crush+playerArmourDefence_Crush;
						enemyDefence=enemyDefence_Crush+enemyArmourDefence_Crush;
						playerTurnStill=false;
						playerTurnMakeMove(outputer);
					}
					else if (choosingNumberBattle==13&&player_primaryIsMelee==false&&player_primaryIsRanged==true)
					{
						playerMve=playerMve_Shoot;
						playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
						enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
						playerTurnStill=false;
						playerTurnMakeMove(outputer);
					}
					else
					{
						outputer.append("\nInvalid option, your weapon is not suitable for that attack!\n");
						playerTurnStill=true;
					}
					
				}
				catch(Exception e)
				{
					outputer.append("INVALID");playerTurnStill=true;
				}
				
				outputer.append("TURN ENDS\n\n\n");
				
			}
			
			else
			{
				outputer.append("Continue your choice...");
				playerTurnStill=true;
			}
			

		
		
		
	}
	private void playerTurnMakeMove(JTextArea outputer)
	{
		if (player_primaryIsMelee==true)
		{
			if (contestant1.getContestantWeaponType()==1)
			{
				playerskip=dodgingChance(enemyAgl,enemyTraining_1,playerTraining_1,outputer);	
			}
			if (contestant1.getContestantWeaponType()==3)
			{
				playerskip=dodgingChance(enemyAgl,enemyTraining_3,playerTraining_3,outputer);	
			}
			if (contestant1.getContestantWeaponType()==4)
			{
				playerskip=dodgingChance(enemyAgl,enemyTraining_4,playerTraining_4,outputer);
			}
			if (contestant1.getContestantWeaponType()==5)
			{
				playerskip=dodgingChance(enemyAgl,enemyTraining_5,playerTraining_5,outputer);	
			}
			
		}
			//note that the player's training determines his ability to control with his weapon
		else if (player_primaryIsRanged==true)
		{
			playerskip=dodgingChance(enemyAgl, enemyTraining_2,playerTraining_2,outputer);
				
		}
		playerStamina=makingAttack(playerStamina, 15, false, "Your", "you",outputer);
	}
	public void enemyTurn(JTextArea outputer){
	
		// Enemy's turn
		enemyGuarding=false;
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
				enemyMve=enemyMve_Shoot;}
			enemyDefence=enemyDefence_Piercing+enemyArmourDefence_Piercing;
			playerDefence=playerDefence_Piercing+playerArmourDefence_Piercing;
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
			outputer.append("\nThe enemy is fighting without a weapon\n");
		}
		computerAI_randomMovesWithAttackAsFocus(outputer);//<=====edit anytime I WANT, i can even switch styles, heck, if i have time to implement that

		
		
	}
	
	public int judge(int enemyHealth, int playerHealth, JTextArea outputer, int sceneNum){//m is enemy
		if (enemyHealth<=0&&playerHealth>0)
		{
			outputer.setText("===========Result:\n===========YOU WON");
			sceneNum=GameResult(outputer,sceneNum);
		}
		else if (playerHealth<=0&&enemyHealth>0)
		{
			outputer.setText("===========Result:\n===========YOU LOSE");
			sceneNum=GameResult(outputer,sceneNum);
		}
		else if (playerHealth<=0&&enemyHealth<=0)
		{
			outputer.setText("===========Result:\n===========TIED");
			sceneNum=GameResult(outputer,sceneNum);
		}
		else if (playerHealth>=0&&enemyHealth>=0)
		{
			outputer.setText("===========Result:\n===========BOTH ALIVE");
		}
		return sceneNum;
	}
	
	
	public boolean whoStartsFirst(JTextArea outputer){//m is enemy
		if (enemySpd>playerSpd){			
			outputer.append("\n\n~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~\nyou are slower than the enemy, so the enemy started first" +
					"\n~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~\n");
			return false;
		}
		else if (enemySpd<playerSpd){			
			outputer.append("\n\n~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~\nyou are faster than the enemy, so you started first" +
					"\n~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~\n");
			return true;
		}
		else {			
			outputer.append("\n\n~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~\nboth of you are fast, you are just lucky to start first" +
					"\n~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~~~*~~~*~~\n");
			return true;
		}
		
	}
	
	private int blockDefendAbsorb(String id,int a, int b, int c, String e, String f,JTextArea outputer, int opponentSp,int opponentSpeed){		
		
		int temp  = b-c;
		if(temp > 0){a += (-temp);opponentSp-=2;if (opponentSp<=0){opponentSp=2;}
		opponentSpeed-=1;if (opponentSpeed<=0){opponentSpeed=1;}
			if(id.matches("to playerHp")){playerStamina=opponentSp;playerSpd=opponentSpeed;}
			else if(id.matches("to enemyHp")){enemyStamina=opponentSp;enemySpd=opponentSpeed;}
			else{System.out.print("something is fucked up");}
		}
		else{outputer.append(e);a-=5;}//the one is so that there is 10 damage reduced instead of none
		outputer.append(f);
		return a;
	}
	
	private boolean dodgingChance(int targetAgl,int targetTraining,//targeTraining is specific to the attack the person creating the type of attack
				int self_Training,JTextArea outputer)
	{//dodging //decision method! THIS CLASS NEEDS SOME TESTING
		int rndYourNumber=ShortcutMethods.randomNumberGeneratorMethod(100);
		int rndYourNumber2=ShortcutMethods.randomNumberGeneratorMethod(100);
		boolean skip = false;
		int dumbLuck=ShortcutMethods.randomNumberGeneratorMethod(7);
		if (dumbLuck==3){skip=false;return skip;}
		else if (dumbLuck==4)//factor of 3
			{
				if (rndYourNumber2>((50-(self_Training*3))+(targetTraining/4))) 
				{skip=false;outputer.append("\n-hit-\n");} 					
				else if (rndYourNumber2<((50-(self_Training*3))+(targetTraining/4)))
				{skip=true;outputer.append("\n-dodged-\n");}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
				
				else{skip=true;outputer.append("\n-miss-\n");}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
				return skip;
				}
	
		else{//factor of 2
			if (rndYourNumber>(targetAgl))//ARMOUR WOULD REDUCE THIS ONE
			{//THE SMALLER YOUR RIGHT SIDE,THE MORE LIKELY TO HIT
				if (rndYourNumber2>((50-(self_Training*2))+(targetTraining/3))) 
						{skip=false;outputer.append("\n-hit-\n");} 					
				else if (rndYourNumber2<((50-(self_Training*2))+(targetTraining/3)))
						{skip=true;outputer.append("\n-dodged-\n");}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
			}
			else 	{skip=true;outputer.append("\n-miss-\n");}//THE PERSON WITH THIS METHOD WILL SKIP NEXT TURN
			return skip;
			}
	}
	
	
	public int[] obtainContestantData(JTextArea outputer, int myRacePARA, int myWeaponPARA, int myArmourChoicePARA, 
		int enemyR, int enemyW, int enemyA){
			
		myRace=myRacePARA+1;
		myWeapon=myWeaponPARA;
		myArmourChoice=myArmourChoicePARA;
		
		hisRace=enemyR;
		hisWeapon=enemyW;
		hisArmourChoice=enemyA;
				boolean enemycanafford=false;//see if the enemy can afford his weapon
		int failCounter=0;
		while (enemycanafford==false)
		{
			hisWeapon=ShortcutMethods.randomNumberGeneratorMethod(gameObjects.numWeapons-1);
			
			if (TheArenaGameGUI.playerVictories>=12){
			hisWeapon=ShortcutMethods.randomNumberGeneratorMethodMinIncluded(32, gameObjects.numWeapons-1);}
			System.out.print(hisWeapon);
			hisArmourChoice=ShortcutMethods.randomNumberGeneratorMethod(gameObjects.numArmour-1);
			enemyMoney=gameObjects.raceArray[hisRace].getInitialWealth();	
			
			if(gameObjects.weaponArray[hisWeapon-1].getWeaponCost()<(enemyMoney+TheArenaGameGUI.playerVictories*5+(TheArenaGameGUI.playerVictories*4)^2))
				{
					if(gameObjects.armourArray[hisArmourChoice-1].getArmourCost()<(enemyMoney+TheArenaGameGUI.playerVictories*5+(TheArenaGameGUI.playerVictories*4)^2)-gameObjects.weaponArray[hisWeapon].getWeaponCost())
					{
					enemycanafford=true;
					}
					
					else{hisArmourChoice=9;//cardboardArmour
					System.out.print("\nenemy has no money so he puts on free cardboard armour\n");
					enemycanafford=true;}
				}
			else{
				if (failCounter>3000+ShortcutMethods.randomNumberGeneratorMethod(20))
				{
					if (TheArenaGameGUI.playerVictories>=12){
						hisWeapon=34;}
					else{hisWeapon=9;}
					hisArmourChoice=ShortcutMethods.randomNumberGeneratorMethod(gameObjects.numArmour-1);enemycanafford=true;
				}
				else{failCounter++;enemycanafford=false;}
			}
		}
		
		//claw or fist
		if (hisWeapon==46&&(hisRace==8||hisRace==12))
		{hisWeapon=47;System.out.print("he gets 47");}
		if (hisWeapon==47&&(hisRace!=8||hisRace!=12))
		{hisWeapon=46;System.out.print("he gets 46");}
//GENERATE CONTESTANTS
		
		contestant1=new Contestant(true,"You",myRace,myWeapon,myArmourChoice);
		contestant2=new Contestant(true,"The enemy",hisRace,hisWeapon,hisArmourChoice);
				
		 playerName=contestant1.getContestantName();
		 enemyName=contestant2.getContestantName();
			
		 playerStr+=contestant1.getContestantAtk();
		 enemyStr+=contestant2.getContestantAtk();
			
		 playerGrd+=contestant1.getContestantGrd();
		 enemyGrd+=contestant2.getContestantGrd();
			
		 playerHp=contestant1.getContestantHp();
		 enemyHp=contestant2.getContestantHp();
		 
		 playerOriginalHp=contestant1.getContestantHp();
		 enemyOriginalHp=contestant2.getContestantHp();
			
		 playerDefence_Slash+=contestant1.getContestantDefence_SLASH();
		 enemyDefence_Slash+=contestant2.getContestantDefence_SLASH();
		 
		 playerDefence_Piercing+=contestant1.getContestantDefence_PIERCING();
		 enemyDefence_Piercing+=contestant2.getContestantDefence_PIERCING();
		 
		 playerDefence_Crush+=contestant1.getContestantDefence_CRUSH();
		 enemyDefence_Crush+=contestant2.getContestantDefence_CRUSH();
		 
		 playerArmourDefence_Slash+=contestant1.getContestantArmourDefence_SLASH();
		 enemyArmourDefence_Slash+=contestant2.getContestantArmourDefence_SLASH();
		 
		 playerArmourDefence_Piercing+=contestant1.getContestantArmourDefence_PIERCING();
		 enemyArmourDefence_Piercing+=contestant2.getContestantArmourDefence_PIERCING();
		 
		 playerArmourDefence_Crush+=contestant1.getContestantArmourDefence_CRUSH();
		 enemyArmourDefence_Crush+=contestant2.getContestantArmourDefence_CRUSH();
			
		 playerSpd+=contestant1.getContestantSpd();
		 enemySpd+=contestant2.getContestantSpd();
			
		 playerAgl+=contestant1.getContestantAgl();
		 enemyAgl+=contestant2.getContestantAgl();

		 playerEdc+=contestant1.getContestantEdc();
		 enemyEdc+=contestant2.getContestantEdc();
			
		 playerStamina+=contestant1.getContestantStamina()+initialStamina;
		 enemyStamina+=contestant2.getContestantStamina()+initialStamina;
		 
		 playerInitiative+=contestant1.getContestantInitiative();
		 enemyInitiative+=contestant2.getContestantInitiative();	
			
		 playerWgt+=contestant1.getContestantWgt();
		 enemyWgt+=contestant2.getContestantWgt();
				 
		 playerWeaponString=contestant1.getContestantWeapon();
		 enemyWeaponString=contestant2.getContestantWeapon();
		 
		 playerMve_Slash+=contestant1.getContestantMve_Slash();
		 enemyMve_Slash+=contestant2.getContestantMve_Slash();
		 
		 playerMve_Piercing+=contestant1.getContestantMve_Piercing();
		 enemyMve_Piercing+=contestant2.getContestantMve_Piercing();

		 playerMve_Crush+=contestant1.getContestantMve_Crush();
		 enemyMve_Crush+=contestant2.getContestantMve_Crush();
		 
		 playerMve_Shoot+=contestant1.getContestantMve_Shoot();
		 enemyMve_Shoot+=contestant2.getContestantMve_Shoot();
		 
		 playerWeaponRgn+=contestant1.getContestantWeaponRgn();
		 enemyWeaponRgn+=contestant2.getContestantWeaponRgn();
			
		 playerWeaponSpd+=contestant1.getContestantWeaponAtkSpd();
		 enemyWeaponSpd+=contestant2.getContestantWeaponAtkSpd();
		 
		 playerTraining_1+=contestant1.getContestantTraining_1 ();
		 playerTraining_2+=contestant1.getContestantTraining_2 ();
		 playerTraining_3+=contestant1.getContestantTraining_3 ();
		 playerTraining_4+=contestant1.getContestantTraining_4 ();
		 playerTraining_5+=contestant1.getContestantTraining_5 ();
		 
		 enemyTraining_1+=contestant2.getContestantTraining_1 ();
		 enemyTraining_2+=contestant2.getContestantTraining_2 ();
		 enemyTraining_3+=contestant2.getContestantTraining_3 ();
		 enemyTraining_4+=contestant2.getContestantTraining_4 ();
		 enemyTraining_5+=contestant2.getContestantTraining_5 ();
		 
		 weaponTypeDealer(contestant1.getContestantWeaponType(),true, outputer);
	   	 weaponTypeDealer(contestant2.getContestantWeaponType(),false, outputer);	
	     
		 playerWeaponSpdValue+=10-playerWeaponSpd;//Maxinum of 10 rounds to hit once
		 enemyWeaponSpdValue+=10-enemyWeaponSpd;//Maxinum of 10 rounds to hit once
		 
		 playerArmour=contestant1.getContestantArmour();
		 enemyArmour=contestant2.getContestantArmour();
		 
		 playerVision+=((playerAgl-(enemySpd*10/100))*10);
		
		 if (playerSpd<=0){playerSpd=5;}
		 if (enemySpd<=0){enemySpd=5;}
		 
		 
		 int[] enemyselection=new int[2];//2 choices
		 enemyselection[0]=(hisWeapon);
		 enemyselection[1]=(hisArmourChoice);
		 
		 return enemyselection;
		 

		 
		 //my Vision is related to how high my agility and how slow the enemy Spd
		 
		 
			}
	
	public void restoreRegData(JTextArea outputer)
	{
		
			completeRestoreRegData();


			 enemyStr+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));//everything that that is += will be back to get sth.
			 enemyGrd+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
			 enemyHp=0;
			 enemyOriginalHp=contestant2.getContestantHp();
			 enemyDefence_Slash+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
			 enemyDefence_Piercing+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
		     enemyDefence_Crush+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
		     enemyArmourDefence_Slash=0;
			 enemyArmourDefence_Piercing=0;
			 enemyArmourDefence_Crush=0;
			 enemySpd+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
		     enemyAgl+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
		     enemyEdc+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
		 	 enemyStamina+=(ShortcutMethods.randomNumberGeneratorMethod(50));if (enemyStamina>maxStamina){enemyStamina=40;}
		 	 enemyInitiative+=ShortcutMethods.randomNumberGeneratorMethod(5);

			 enemyWgt+=(ShortcutMethods.randomNumberGeneratorMethod(5)-10);
			 enemyMve_Slash=0;
			 enemyMve_Piercing=0;
			 enemyMve_Crush=0;
			 enemyMve_Shoot=0;
			 enemyWeaponRgn=0;
			 enemyWeaponSpd=0;
			 enemyWeaponSpdValue=0;//Maxinum of 10 rounds to hit once

			 enemyTraining_1+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
			 enemyTraining_2+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
			 enemyTraining_3+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
			 enemyTraining_4+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));
			 enemyTraining_5+=(ShortcutMethods.randomNumberGeneratorMethod(6*(TheArenaGameGUI.playerVictories)));	 

			enemyMoney=contestant2.getContestantInitialWealth();

	}
	public void completeRestoreRegData()
	{
		    playerStr=0;//everything that that is += will be back to get sth.
			playerGrd=0;
			playerHp=0;
			playerOriginalHp=0;
			playerDefence_Slash=0;
		 	playerDefence_Piercing=0;
		 	playerDefence_Crush=0;
		 
		    playerArmourDefence_Slash=0;
		    playerArmourDefence_Piercing=0;
		    playerArmourDefence_Crush=0;
		    playerSpd=0;
		    playerAgl=0;
		    playerEdc=0;
		 	playerStamina=0;
	 	 	playerInitiative=0;

	 	 	playerWgt=0;
			playerMve_Slash=0;
			playerMve_Piercing=0;
			playerMve_Crush=0;
			playerMve_Shoot=0;
			playerWeaponRgn=0;
			playerWeaponSpd=0;
			playerWeaponSpdValue=0;//Maxinum of 10 rounds to hit once

		     playerVision=0;
		 
		 	 playerTraining_1=0;
			 playerTraining_2=0;
			 playerTraining_3=0;
			 playerTraining_4=0;
			 playerTraining_5=0;

			 enemyStr=(0);//everything that that is += will be back to get sth.
			 enemyGrd=(0);
			 enemyHp=0;
			 enemyOriginalHp=contestant2.getContestantHp();
			 enemyDefence_Slash=(0);
			 enemyDefence_Piercing=(0);
		     enemyDefence_Crush=(0);
		     enemyArmourDefence_Slash=0;
			 enemyArmourDefence_Piercing=0;
			 enemyArmourDefence_Crush=0;
			 enemySpd=(0);
		     enemyAgl=(0);
		     enemyEdc=(0);
		 	 enemyStamina=0;
		 	 enemyInitiative=0;

			 enemyWgt=0;
			 enemyMve_Slash=0;
			 enemyMve_Piercing=0;
			 enemyMve_Crush=0;
			 enemyMve_Shoot=0;
			 enemyWeaponRgn=0;
			 enemyWeaponSpd=0;
			 enemyWeaponSpdValue=0;//Maxinum of 10 rounds to hit once

			 enemyTraining_1=(0);
			 enemyTraining_2=(0);
			 enemyTraining_3=(0);
			 enemyTraining_4=(0);
			 enemyTraining_5=(0);	 

			enemyMoney=contestant2.getContestantInitialWealth();

	}	
	
	private void weaponTypeDealer(int w, boolean isPlayer, JTextArea outputer){
			if (isPlayer==true){
	 
				if (w==0){
					 player_primaryIsMelee=false;
					 player_primaryIsRanged=false;
					 outputer.append("\nYour primary weapon is nothing\n"); 
						
					}
				else if (w==1){
					 player_primaryIsMelee=true;
					 outputer.append("\nYour primary weapon is a moderate melee one\n"); 	
					 player_primaryIsRanged=false;
				}
				else if (w==2){
					 player_primaryIsRanged=true; 
					 outputer.append("\nYour primary weapon is an ranged one\n");
					 player_primaryIsMelee=false;
				}
				else if (w==3){
					 player_primaryIsRanged=false; 
					 outputer.append("\nYour primary weapon is an heavy melee one\n");
					 player_primaryIsMelee=true;						
				}
				else if (w==4){
					 player_primaryIsRanged=false; 
					 outputer.append("\nYour primary weapon is a light melee one\n");
					 player_primaryIsMelee=true;
				}
				else if (w==5){
					 player_primaryIsRanged=false; 
					 outputer.append("\nYour primary weapon is a pole arm one\n");
					 player_primaryIsMelee=true;
				}
			}
			else{

				if (w==0){
					 enemy_primaryIsMelee=false;
					 enemy_primaryIsRanged=false;outputer.append("\nThe enemy's primary weapon is nothing\n");
					 }
				else if (w==1){
					 enemy_primaryIsMelee=true;outputer.append("\nThe enemy's primary weapon is a melee one\n");
					 enemy_primaryIsRanged=false;
				}
				else if (w==2){
					 enemy_primaryIsRanged=true;outputer.append("\nThe enemy's primary weapon is a ranged one\n");
					 enemy_primaryIsMelee=false;
				}
				else if (w==3){
					 enemy_primaryIsRanged=false; outputer.append("\nThe enemy's primary weapon is an heavy melee one\n");
					 enemy_primaryIsMelee=true;
				}
				else if (w==4){
					 enemy_primaryIsRanged=false; outputer.append("\nThe enemy's primary weapon is a light melee one\n");
					 enemy_primaryIsMelee=true;
				}
				else if (w==5){
					 enemy_primaryIsRanged=false; outputer.append("\nThe enemy's primary weapon is a pole arm one\n");
					 enemy_primaryIsMelee=true;
				}
			}
		}

	
	///STRING METHODS///
	/////////////////////////////////
	
	public void distanceStatus(JTextArea outputer){
		outputer.setText("\nDistance:\nYou and the enemy are "+distance+" feet apart.\n\n");
	}

	public void fightingStatus(JTextArea outputer){
		outputer.append("\n~*~~*~~*~~*Status~*~~*~~*~~*~\n");
		outputer.append("\n~*~~*~~*~~*MAIN~*~~*~~*~~*~\n");
		outputer.append("\n   |  You:"+playerName);
		outputer.append("\n   |  The enemy:"+enemyName+"\n");
		outputer.append("   |  Your health: "+playerHp+"\n");
		outputer.append("   |  Your Stamina: "+playerStamina+"\n");//CANNOT BE OVER maxStamina
		outputer.append("   |  Your weapon: "+playerWeaponString+"\n");
		outputer.append("   |  Your strength: "+playerStr+"\n");
		outputer.append("   |  Your initiative: "+playerInitiative+"\n");	
	   	outputer.append("   |  Your Armour Name: "+playerArmour+"\n");	
		outputer.append("   |  The enemy's health: "+enemyHp+"\n");
		outputer.append("   |  The enemy's Stamina: "+enemyStamina+"\n");
		outputer.append("   |  The enemy's weapon: "+enemyWeaponString+"\n");
		outputer.append("   |  The enemy's strength: "+enemyStr+"\n");	
		outputer.append("   |  The enemy's initiative: "+enemyInitiative+"\n");	
	   	outputer.append("   |  The enemy's Armour Name: "+enemyArmour+"\n");
	   	outputer.append("\n");
	   	outputer.append("YOU HAVE: "+playerMoney+" $'s\n");	
	   	outputer.append("THE ENEMY HAVE: "+enemyMoney+" $'s\n");	
		outputer.append("   |  Your Training in moderate melee: "+playerTraining_1+"\n");
		outputer.append("   |  Your Training in heavy melee: "+playerTraining_3+"\n");
		outputer.append("   |  Your Training in light melee: "+playerTraining_4+"\n");
		outputer.append("   |  Your Training in pole arms: "+playerTraining_5+"\n");
		outputer.append("   |  Your Training in ranged: "+playerTraining_2+"\n");
		outputer.append("   |  Your guard: "+playerGrd+"\n");
		outputer.append("   |  Your player Defence_Piercing: "+playerDefence_Piercing+"\n");
		outputer.append("   |  Your player Defence_Slash: "+playerDefence_Slash+"\n");
		outputer.append("   |  Your player Defence_Crush: "+playerDefence_Crush+"\n");
		outputer.append("   |  Your speed: "+playerSpd+"\n");
		outputer.append("   |  Your agility: "+playerAgl+"\n");
		outputer.append("   |  Your endurance: "+playerEdc+"\n");
		outputer.append("   |  Your weight: "+playerWgt+"\n");
		outputer.append("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n");
		outputer.append("\n~*~~*~~*~~*Weapons~~*~~*~~*~~*~~*~~*~~*~\n\n");
		outputer.append("   |  Your weapon Range: "+playerWeaponRgn+"\n");
		
		if (player_primaryIsMelee==true )
		{
			outputer.append("   |  Your slash attack: "+playerMve_Slash+"\n");
			outputer.append("   |  Your Piercing attack: "+getPlayerMve_Piercing()+"\n");
			outputer.append("   |  Your crush attack: "+playerMve_Crush+"\n");
		}
		if (player_primaryIsRanged==true )
		{
			outputer.append("   |  Your shoot attack: "+playerMve_Shoot+"\n");
		}
		outputer.append("   |  Your Atk Spd with prm Weapon: "+playerWeaponSpd+"\n");
		outputer.append("\n");
		outputer.append("\n~*~~*~~*~~*Armour~~*~~*~~*~~*~~*~~*~~*~\n\n");
	   	outputer.append("   |  Your Armour slash Defence: "+playerArmourDefence_Slash+"\n");
		outputer.append("   |  Your Armour piercing Defence: "+playerArmourDefence_Piercing+"\n");
		outputer.append("   |  Your Armour crush Defence: "+playerArmourDefence_Crush+"\n");
		outputer.append("   |  Your Armour Type: "+contestant1.getContestantArmourType()+"\n");
		outputer.append("   |  Your Armour Weight: "+contestant1.getContestantArmourWeight()+"\n");
		outputer.append("   |  Your Armour Guard Boost: "+contestant1.getContestantArmourGuardBooster()+"\n");
		outputer.append("   |  Your Armour Speed Boost: "+contestant1.getContestantArmourSpeedBooster()+"\n");
		outputer.append("\n");
		outputer.append("   THE REST OF THE DATA IS AVAILABLE if you can see the enemy in detail\n");
		outputer.append("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n");
		
		if (displayMoreFightingStatus==true && (distance<playerVision*2))//YEAH MORE INFO IS ALWAYS GOOD
		{
				outputer.append("\n~*~~*~~*~~*OTHER INFO~*~~*~~*~~*~\n");
				outputer.append("   |  The enemy's guard: "+enemyGrd+"\n");
				outputer.append("   |   Enemy's enemy Defence_Piercing: "+enemyDefence_Piercing+"\n");
				outputer.append("   |   Enemy's enemy Defence_Slash: "+enemyDefence_Slash+"\n");
				outputer.append("   |   Enemy's enemy Defence_Crush: "+enemyDefence_Crush+"\n");
				outputer.append("   |  The enemy's speed: "+enemySpd+"\n");
				outputer.append("   |  The enemy's agility: "+enemyAgl+"\n");
				outputer.append("   |  The enemy's endurance: "+enemyEdc+"\n");
				outputer.append("   |  The enemy'sweight: "+enemyWgt+"\n\n");			
				outputer.append("   |  Enemy's Atk Spd with prm Weapon: "+enemyWeaponSpd+"\n");
				outputer.append("   |  The enemy'sweapon Range: "+enemyWeaponRgn+"\n");
				if (enemy_primaryIsMelee==true )
				{
					outputer.append("   |  The enemy's slash attack: "+enemyMve_Slash+"\n");
					outputer.append("   |  The enemy's Piercing attack: "+enemyMve_Piercing+"\n");
					outputer.append("   |  The enemy's crush attack: "+enemyMve_Crush+"\n");
				}
				if (enemy_primaryIsRanged==true )
				{
					outputer.append("   |  The enemy'sshoot attack: "+enemyMve_Shoot+"\n");
				}
				weaponTypeDealer(contestant1.getContestantWeaponType(),true,outputer);
			   	weaponTypeDealer(contestant2.getContestantWeaponType(),false,outputer);	
			   	outputer.append("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n\n");
				outputer.append("   |  The enemy's Armour slash Defence: "+enemyArmourDefence_Slash+"\n");
				outputer.append("   |  The enemy's Armour piercing Defence: "+enemyArmourDefence_Piercing+"\n");
				outputer.append("   |  The enemy's Armour crush Defence: "+enemyArmourDefence_Crush+"\n");
				outputer.append("   |  The enemy's Armour Type: "+contestant2.getContestantArmourType()+"\n");
				outputer.append("   |  The enemy's Armour Weight: "+contestant2.getContestantArmourWeight()+"\n");
				outputer.append("   |  The enemy's Armour Guard Boost: "+contestant2.getContestantArmourGuardBooster()+"\n");
				outputer.append("   |  The enemy's Armour Speed Boost: "+contestant2.getContestantArmourSpeedBooster()+"\n");
			   	outputer.append("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n\n");
				outputer.append("\n~*~~*~~*~TRAINING*~~*~~*~~*~\n");
				outputer.append("   |  The enemy's Training in moderate melee: "+enemyTraining_1+"\n");
				outputer.append("   |  The enemy's Training in heavy melee: "+enemyTraining_3+"\n");
				outputer.append("   |  The enemy's Training in light melee: "+enemyTraining_4+"\n");
				outputer.append("   |  The enemy's Training in pole arms: "+enemyTraining_5+"\n");
				outputer.append("   |  The enemy's Training in ranged: "+enemyTraining_2+"\n");
				outputer.append("\n~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n");
		}
	
	}
	
	public void fightActionText(String a, JTextArea outputer){
		outputer.append("\nACTION: ");
		outputer.append(a);
		outputer.append("\n\n\n");
	}
	
	private int GameResult(JTextArea outputer, int sceneNum) //unavailable
	{	
		outputer.append("\n\n\n\n");
		if (playerHp<=0)
		{
			outputer.append("\nYOU LOST");
			sceneNum=4;
		}
		else if (playerHp>0)
		{
			outputer.append("\nYOU ARE STILL ALIVE");	
		}
		
		if (enemyHp<=0){
			outputer.append("\nTHE ENEMY LOST");
			sceneNum=1;//back to room	
		}
		else if (enemyHp>0){
			outputer.append("\nTHE ENEMY STILL ALIVE");	
			
			}
		
		JOptionPane.showMessageDialog(outputer,
				"	BATTLE OVER\n"+
				"\nOK", "RETURN", 
				JOptionPane.PLAIN_MESSAGE);
		
		return sceneNum;
		//IMPLEMENT
	}	
	
	//additional stuff

	
	//
	////////////////////////////////////////////////////////////////////////
	//AI COMBAT STYLES

	private void computerAI_randomMovesWithAttackAsFocus(JTextArea outputer)
	{
		if (enemyStamina<50)		
		{
			fightActionText("\nYour enemy takes a breath\n", outputer);

			if (enemyStamina<maxStamina)
				{
					enemyStamina+=30;
					if (enemyStamina>maxStamina)
					{
						enemyStamina=maxStamina;
						outputer.append("Enemy's Stamina does not go any higher");
					}
				}	
		}
		else{//UNIQUE TO THE ENEMY
			if (distance>(300+enemyInitiative*2))
						{
				        enemyStamina-=enemySpd*(7/3);
						if (enemyStamina<0)
						{
							enemyStamina=0;
						}
						distance-=enemySpd*2;
						if (distance<0)
						{
							distance=0;
						}
						fightActionText("\nHe charged fully!\n", outputer);
						}
			else{
				int randomNumber;
				//employing the random computer AI
				randomNumber=ShortcutMethods.randomNumberGeneratorMethod(6);
					//so higher chance to attack
				if (randomNumber==1)
				{//attack or advance
					if (distance<(enemyWeaponRgn))
					{
						enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he",outputer);
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
						fightActionText("\nHe advanced", outputer);
					}
				}
				else if (randomNumber==2)
				{//attack or advance
					if (distance<(enemyWeaponRgn))
					{
						enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he",outputer);
					}
					else 
					{
						enemyStamina-=enemySpd/2;
						if (enemyStamina<0)
						{
							enemyStamina=0;
						}
						distance-=enemySpd*2;
						if (distance<0)
						{
							distance=0;
						}
						fightActionText("\nHe charged!\n", outputer);
					}
				}	
				else if (randomNumber==3)
				{//back up if close, or charge
					if (distance==0)
					{
						enemyStamina-=enemySpd/8;
						fightActionText("\nHe backed up based on his speed!", outputer);
						distance+=enemySpd/4;
						if (distance<0)
						{
							distance=0;
						}
						if (enemyStamina<0)
						{
							enemyStamina=0;
						}
					}
					else 
					{
						if (distance<(enemyWeaponRgn))
						{
							enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he",outputer);
						}
						else 
						{
							enemyStamina-=enemySpd/4;
							if (enemyStamina<0)
							{
								enemyStamina=0;
							}
							distance-=enemySpd;
							if (distance<0)
							{
								distance=0;
							}
							fightActionText("\nHe advanced", outputer);
						}
						
					}
				}
				else if (randomNumber==4)
				{
					if (enemyStamina>0)
					{//when doing different moves I will use the if statement according to what move
						computerTurn_Guard(outputer);
							enemyStamina+=5;
							if (enemyStamina<0)
							{
								enemyStamina=0;
							}
					}
					else
					{
						fightActionText("\nEnemy's Stamina is too low, so he failed, while humiliating himself", outputer);
					}
				}	
				else if (randomNumber==5)
				{
					fightActionText("\nHe holds position, may have recovered some Stamina\n", outputer);
		
					if (enemyStamina<maxStamina)
						{
							enemyStamina+=30;
							if (enemyStamina>maxStamina)
							{
								enemyStamina=maxStamina;
								outputer.append("Enemy's Stamina does not go any higher");
							}
						}	
				}
				else if (randomNumber==6)
				{//attack or advance
					if (distance<(enemyWeaponRgn))
					{
						enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he",outputer);
					}
					else 
					{
						enemyStamina-=enemySpd/4;
						if (enemyStamina<0)
						{
							enemyStamina=0;
						}
						distance-=enemySpd;
						if (distance<0)
						{
							distance=0;
						}
						fightActionText("\nHe advanced..", outputer);
					}
				}	
				else 
				{//attack or advance
					if (distance<(enemyWeaponRgn))
					{
						enemyStamina=makingAttack(enemyStamina, 15,true, "Enemy", "he",outputer);
					}
					else 
					{
						enemyStamina-=enemySpd/4;
						if (enemyStamina<0)
						{
							enemyStamina=0;
						}
						distance-=enemySpd;
						if (distance<0)
						{
							distance=0;
						}
						fightActionText("\nHe advanced..", outputer);
					}
				}
		}
	}
	}
	
	
	}

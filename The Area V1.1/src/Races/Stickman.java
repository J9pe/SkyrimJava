

package Races;

public class Stickman extends MythicalRaceAttributes {
	
	public Stickman(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Stickman");
		setHealth(100);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(1);//hand to hand-fist n' toes
		setGuard(15);//for guarding only
		setDefence(15);//all time protection
		setSpeed(60);//the variable that decides who goes first
		setAgility(95);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(15);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(16);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(15);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(65);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(15);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(100);
		setInitialWealth(15);//highest is 30 
		setInitiative(40);//100%
		setEndurance(50);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
		
		
	
		setDescription("\nThis dude is sooooo skinny that you will almost never hit him. But he doesn't deliver much of a blow either.." +
		
				"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
				"\nHealth:**\nAttack:*\nGuard:*\nDefence:*\nSpeed:***\nAgility:MAX\nTraining in Moderate Melee:*" +
				"\nTraining in Range:*\nTtraining in Heavy Melee:*\nTraining in Light Melee:***\nTraining in PoleArms:*"+
				"\nEndurance:**"+
				"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
				+"\n\n\n");
	}
}

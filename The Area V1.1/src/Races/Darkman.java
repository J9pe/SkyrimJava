package Races;

public class Darkman extends MythicalRaceAttributes {
	
	public Darkman(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Darkman");
		setHealth(150);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(10);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(5);//all time protection
		setSpeed(90);//the variable that decides who goes first
		setAgility(80);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(25);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(26);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(15);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(35);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(25);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(100);
		setInitialWealth(15);//highest is 30 
		setInitiative(40);//100%
		setEndurance(50);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
		
		
	
		setDescription("\nThe darkman is like a shadow, u can almost never hit him, but he can almost never hit you too. That said, without being trained." +
		
				"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
				"\nHealth:***\nAttack:*\nGuard:*\nDefence:*\nSpeed:MAX\nAgility:MAX\nTraining in Moderate Melee:*" +
				"\nTraining in Range:*\nTtraining in Heavy Melee:*\nTraining in Light Melee:*\nTraining in PoleArms:*"+
				"\nEndurance:**"+
				"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
				+"\n\n\n");
	}
}

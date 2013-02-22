package Races;

public class Huang extends MythicalRaceAttributes {
	
	public Huang(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Huang");
		setHealth(105);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(15);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(35);//all time protection
		setSpeed(25);//the variable that decides who goes first
		setAgility(25);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(40);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(60);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(55);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(60);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(75);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(100);
		setInitialWealth(20);//highest is 30 
		setInitiative(30);//100%
		setEndurance(30);//a variable that gets consumed after a move
		setplayerWeight(5);//Endurance-playerWeight=Stamina
		
	
	
	setDescription("\nThe Huang race are from the far East, well educated people; military wise,\n " +
			"they are very conservative and defensive-minded, which makes them good at\n" +
			"militia training and ranged weapons, they are known for their handling with light spears\n" +
				
	"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
	"\nHealth:***\nAttack:*\nGuard:*\nDefence:***\nSpeed:**\nAgility:**\nTraining in Moderate Melee:**" +
	"\nTraining in Range:***\nTtraining in Heavy Melee:**\nTraining in Light Melee:***\nTraining in PoleArms:****"+
	"\nEndurance:**"+
	"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
	+"\n\n\n");
	
	}
	
	
}

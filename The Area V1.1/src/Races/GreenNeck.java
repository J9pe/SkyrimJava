package Races;

public class GreenNeck extends MythicalRaceAttributes {
	
	public GreenNeck(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("GreenNeck");
		setHealth(275);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(5);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(10);//all time protection
		setSpeed(35);//the variable that decides who goes first
		setAgility(25);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(31);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(55);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(100);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(31);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(31);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(100);
		setInitialWealth(1);//highest is 30, except the greenNeck
		setInitiative(100);//100%
		setEndurance(200);//a variable that gets consumed after a move
		setplayerWeight(15);//Endurance-playerWeight=Stamina
		
		
	
		setDescription("\nThis guys is boss. Almost never gets tired, just like his trucks. " +
				"\nWeapon of Choice:Loves to use two by fours and leaf spring bars" +
				"\nFor some reason, these guys poor!"+
		
		"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
		"\nHealth:***\nAttack:*\nGuard:*\nDefence:*\nSpeed:**\nAgility:*\nTraining in Moderate Melee:*" +
		"\nTraining in Range:**\nTtraining in Heavy Melee:*****\nTraining in Light Melee:*\nTraining in PoleArms:*"+
		"\nEndurance:MAX"+
		"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
		+"\n\n\n");
	}
}

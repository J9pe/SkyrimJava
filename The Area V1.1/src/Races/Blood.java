package Races;

public class Blood extends MythicalRaceAttributes {
	
	public Blood(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Blood");
		setHealth(400);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(1);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(0);//all time protection
		setSpeed(5);//the variable that decides who goes first
		setAgility(5);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(40);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(35);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(35);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(35);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(35);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(5);
		setInitialWealth(10);//highest is 30 
		setInitiative(40);//100%
		setEndurance(1);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
		
		
	
		setDescription("\nHe has lots of HP. He has lots. He might donate you some if you have type K blood." +
		
				"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
				"\nHealth:MAX\nAttack:*\nGuard:*\nDefence:*\nSpeed:*\nAgility:*\nTraining in Moderate Melee:**" +
				"\nTraining in Range:*\nTtraining in Heavy Melee:*\nTraining in Light Melee:*\nTraining in PoleArms:*"+
				"\nEndurance:*"+
				"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
				+"\n\n\n");
	}
}

package Races;

public class Cheetaman extends MythicalRaceAttributes {
	
	public Cheetaman(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Cheetaman");
		setHealth(160);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(20);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(13);//all time protection
		setSpeed(160);//the variable that decides who goes first
		setAgility(40);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(45);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(55);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(35);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(70);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(85);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(10);
		setInitialWealth(10);//highest is 30 
		setInitiative(50);//100%
		setEndurance(0);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
				
		setDescription("\nNo other character can run faster than Cheetaman\n" +
				"" 
				+
		"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
		"\nHealth**\nAttack**\nGuard*\nDefence**\nSpeed MAX\nAgility***\nTraining in Moderate Melee**" +
		"\nTraining in Range****\nTtraining in Heavy Melee*\nTraining in Light Melee*****\nTraining in PoleArms*****"+
		"\nEndurance:**"+
		"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
		+"\n\n\n");
	}
}

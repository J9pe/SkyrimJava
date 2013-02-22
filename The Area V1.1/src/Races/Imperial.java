package Races;

public class Imperial extends MythicalRaceAttributes {
	
	public Imperial(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Imperial");
		setHealth(200);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(12);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(15);//all time protection
		setSpeed(20);//the variable that decides who goes first
		setAgility(15);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(40);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(30);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(25);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(30);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(30);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(70);
		setInitialWealth(50);//highest is 50 
		setInitiative(40);//100%
		setEndurance(20);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
		
	
	
	setDescription("\nNatives of the civilized, cosmopolitan province of Cyrodiil," +
				"\nthe Imperials are well-educated and well-spoken. Imperials are also " +
				"\nknown for the discipline and training of their citizen armies. With this" +
				"\nthey were able to fight off the Redguard and control most of Tamriel. " +
				"\nThough physically less imposing than the other races, the Imperials " +
				"\nhave proved to be shrewd diplomats and traders, and these traits, along" +
				"\nwith their remarkable skill and training as light infantry, have enabled" +
				"\nthem to subdue all the other nations and races, and to have erected the " +
				"\nmonument to peace and prosperity that comprises the Glorious Empire. \n" +
				
	"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
	"\nHealth:****\nAttack:*\nGuard:*\nDefence:*\nSpeed:**\nAgility:*\nTraining in Moderate Melee:*" +
	"\nTraining in Range:*****\nTtraining in Heavy Melee:**\nTraining in Light Melee:*\nTraining in PoleArms:*"+
	"\nEndurance:**"+
	"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
	+"\n\n\n");
	
	}
	
	
}

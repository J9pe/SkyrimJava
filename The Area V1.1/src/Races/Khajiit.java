package Races;

public class Khajiit extends MythicalRaceAttributes {
	
	public Khajiit(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Khajiit");
		setHealth(180);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(25);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(13);//all time protection
		setSpeed(85);//the variable that decides who goes first
		setAgility(50);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(45);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(30);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(25);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(90);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(35);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(100);
		setInitialWealth(7);//highest is 30 
		setInitiative(60);//100%
		setEndurance(20);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
				
		setDescription("\nThe Khajiiti race is made up of several subtypes with very distinct appearances." +
				"\nAll Khajiit are feline in appearance, placing them among the group known as 'beast races'" +
				"\nby the human and mer inhabitants of Tamriel. The exact appearance of a particular Khajiit" +
				"\nis determined primarily by the phases of the moon at the time he or she was born. According " +
				"\nto recent studies in Elsweyr, it appears that the phases of the moon Massar determine the " +
				"\nprimary form, ranging from humanoid to resembling a domesticated cat; the phases of the moon" +
				"\nSecunda determine the relative size. Some scholars have claimed as many as twenty different" +
				"\nsubtypes, but only about a dozen have been identified and named to date. \n" +
				"" 
				+
		"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
		"\nHealth**\nAttack***\nGuard*\nDefence**\nSpeed*****\nAgility****\nTraining in Moderate Melee**" +
		"\nTraining in Range**\nTtraining in Heavy Melee*\nTraining in Light Melee*****\nTraining in PoleArms*"+
		"\nEndurance:**"+
		"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
		+"\n\n\n");
	}
}

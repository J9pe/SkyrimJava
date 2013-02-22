package Races;

public class Bosmer extends MythicalRaceAttributes {
	
	public Bosmer(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Bosmer");
		setHealth(170);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(10);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(5);//all time protection
		setSpeed(45);//the variable that decides who goes first
		setAgility(65);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(45);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(95);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(35);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(45);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(50);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(100);
		setInitialWealth(15);//highest is 30 
		setInitiative(40);//100%
		setEndurance(50);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
		
		
	
		setDescription("\nThe Bosmer are the Elven clan-folk of Valenwood,\n" +
				" a forested province in southwestern Tamriel. In the Empire,\n" +
				" they are often referred to as Wood Elves, but Bosmer, Boiche,\n" +
				" or the Tree-Sap People is what they call themselves. \n" +
				"Bosmer rejected the stiff, formal traditions of Aldmeri\n" +
				" high culture, preferring a more romantic, simple existence\n" +
				" in harmony with the land, its wild beauty and wild creatures.\n" +
				" They are relatively nimble and quick in body and wit compared \n" +
				"to their more 'civilized' Elven cousins, making them well-suited \n" +
				"for a variety of professions, including scouts, thieves, traders \n" +
				"and scholars. The best archers in all of Tamriel, the Bosmer snatch\n " +
				"and fire arrows in one continuous motion; they are even rumored to \n" +
				"have invented the bow." +
		
				"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
				"\nHealth:*\nAttack:*\nGuard:*\nDefence:*\nSpeed:***\nAgility:****\nTraining in Moderate Melee:**" +
				"\nTraining in Range:*****\nTtraining in Heavy Melee:**\nTraining in Light Melee:***\nTraining in PoleArms:***"+
				"\nEndurance:***"+
				"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
				+"\n\n\n");
	}
}

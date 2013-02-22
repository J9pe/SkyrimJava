package Races;

public class Nord extends MythicalRaceAttributes {
	
	public Nord(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Nord");
		setHealth(220);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(25);//hand to hand-fist n' toes
		setGuard(5);//for guarding only
		setDefence(17);//all time protection
		setSpeed(40);//the variable that decides who goes first
		setAgility(30);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(55);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(30);//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(65);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(40);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(45);//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(100);
		setInitialWealth(8);//highest is 30 
		setInitiative(75);//100%
		setEndurance(60);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina

	
		setDescription("\nThe Nords are a tall and fair-haired people from Skyrim who are known" +
				"\nfor their incredible resistance to cold and even magical frost. " +
				"\nThey are enthusiastic warriors, and act as soldiers and mercenaries " +
				"\nall over Tamriel. Eager to augment their martial skills beyond the " +
				"\ntraditional methods of Skyrim, they excel in all manner of warfare. " +
				"\nThey thrive in the cold, reminiscent of their native Atmora, and are " +
				"\nknown as a militant people by their neighbours. Nords are also natural seamen," +
				"\nand have benefited from nautical trade since their first migrations across " +
				"\nthe sea from Atmora. They captain and crew the merchant fleets of many regions," +
				"\nand may be found all along Tamriel's coasts.\n" +
//				
//				"\nStrong tall, and ripped. Oh yeah, this sexy blonde dude, for people who wanna get crushed" +
//				"\nAn excellent choice! Um, be wise though, they are ain't have money man! Well, " +
//				"\nit is a fact! Ok being serious now, they are powerful and tough," +
//				"\nand fairly agile. Stronger than imperial, less hp than orcs though"+
		
		"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
		"\nHealth***\nAttack***\nGuard*\nDefence**\nSpeed***\nAgility**\nTraining in Moderate Melee***" +
		"\nTraining in Range*\nTtraining in Heavy Melee****\nTraining in Light Melee**\nTraining in PoleArms**"+
		"\nEndurance:****"+
		"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~\n\n\n");
	}
}
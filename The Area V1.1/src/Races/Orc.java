package Races;

public class Orc extends MythicalRaceAttributes{

	public Orc(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Orc");
		setHealth(250);//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(30);//hand to hand-fist n' toes
		setGuard(10);//for guarding only
		setDefence(20);//all time protection
		setSpeed(25);//the variable that decides who goes first
		setAgility(10);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(50);//
		setplayerTraining_2(1);//
		setplayerTraining_3(70);//
		setplayerTraining_4(40);//
		setplayerTraining_5(45);//
		setStamina(100);
		setInitialWealth(5);//highest is 30 
		setInitiative(85);//100%
		setEndurance(30);//a variable that gets consumed after a move
		setplayerWeight(0);//Endurance-playerWeight=Stamina
		
		setDescription("\nThe orcs" +
				"are the sophisticated barbarian peoples of the Wrothgarian" +
				"\nand Dragontail Mountains. Though they are common in the walking " +
				"\ncity of Bosmer kings, Falinesti, and in other great cities throughout" +
				"\nTamriel. They are in-fact elves or mer, hence the name Orsimer, meaning " +
				"\n'Corrupt Elves'. They are noted for their unshakeable courage in war and " +
				"\ntheir unflinching endurance of hardships. In the past, Orcs have been widely " +
				"\nfeared and hated by the other nations and races of Tamriel, but they have slowly " +
				"\nwon acceptance in the Empire, in particular for their distinguished service in " +
				"\nthe Imperial Legion. \n" +
		
		"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
		"\nHealth:*****\nAttack:**\nGuard:*\nDefence:****\nSpeed:**\nAgility:*\nTraining in Moderate Melee:***" +
		"\nTraining in Range:N/A\nTtraining in Heavy Melee:****\nTraining in Light Melee:***\nTraining in PoleArms:***"+
		"\nEndurance::**"+
		"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~\n\n\n");
	}
}


package Races;

import Utilities.ShortcutMethods;

public class Bit extends MythicalRaceAttributes {
	
	public Bit(){
		super("",0,0,0,0,0,0,0,0,0,0,0,"","",0,0,0,0,0);
		setraceName("Bit");
		setHealth(100+ShortcutMethods.randomNumberGeneratorMethod(200));//the decision of the winner, 0 is the loser; Health is your life points, when its 0, you are dead
		setAttack(ShortcutMethods.randomNumberGeneratorMethod(100)/5);//hand to hand-fist n' toes
		setGuard(ShortcutMethods.randomNumberGeneratorMethod(30));//for guarding only
		setDefence(ShortcutMethods.randomNumberGeneratorMethod(30));//all time protection
		setSpeed(ShortcutMethods.randomNumberGeneratorMethod(50)+15);//the variable that decides who goes first
		setAgility(ShortcutMethods.randomNumberGeneratorMethod(50)+15);//0 to get hit by the opponent all the time, 100 to dodge every attack
		setplayerTraining_1(ShortcutMethods.randomNumberGeneratorMethod(100));//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_2(ShortcutMethods.randomNumberGeneratorMethod(100));//x/2 percent of additional damage is inflicted upon enemy
				       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_3(ShortcutMethods.randomNumberGeneratorMethod(100));//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_4(ShortcutMethods.randomNumberGeneratorMethod(100));//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setplayerTraining_5(ShortcutMethods.randomNumberGeneratorMethod(100));//x/2 percent of additional damage is inflicted upon enemy
	       //100-x percent chance to miss from yourself even after the emeny did not dodge
		setStamina(ShortcutMethods.randomNumberGeneratorMethod(100)+50);
		setInitialWealth(ShortcutMethods.randomNumberGeneratorMethod(50)/2);//highest is 30 
		setInitiative(ShortcutMethods.randomNumberGeneratorMethod(50));//100%
		setEndurance(ShortcutMethods.randomNumberGeneratorMethod(50));//a variable that gets consumed after a move
		setplayerWeight(ShortcutMethods.randomNumberGeneratorMethod(10));//Endurance-playerWeight=Stamina
		
		
	
		setDescription("\nRetro 90's bro, his status are randomly generated...:**(" +
		
				"\n\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"+
				"\nHealth:?\nAttack:?\nGuard:?\nDefence:?\nSpeed:?\nAgility:?\nTraining in Moderate Melee:?" +
				"\nTraining in Range:?\nTtraining in Heavy Melee:?\nTraining in Light Melee:?\nTraining in PoleArms:?"+
				"\nEndurance:?"+
				"\n~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~~~~8~~~"
				+"\n\n\n");
	}
}

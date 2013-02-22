package Equipment;

public class RepeatingCrossbow extends Weapons{
		public RepeatingCrossbow(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Repeating Crossbow");
			setTwoHanded(false);
			setAttack_SLASH(0);
			setAttack_CRUSH(5);
			setAttack_PIERCING(20);
			setWeaponRange(100);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(1);//4 for range
			setWeaponWeight(2);
			setWeaponCost(25);
			setDescription("\n\nThe fastest range weapon in the game. Invented in China. Simple but effective.\n"
					
					+
					"\n" +
					"================================" +
					"\nA crossbow\n"+					
					"POWER *\n"+
					"SPEED MAX\n"+
					"RANGE ***\n"+
					
					"PRICE *\n"+
					"\n"+	
					"================================" +
					"\n"
					);
		}
	

}
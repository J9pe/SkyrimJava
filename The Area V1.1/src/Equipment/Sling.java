package Equipment;

public class Sling extends Weapons{
		public Sling(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Sling");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(15);
			setAttack_PIERCING(0);
			setWeaponRange(100);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(2);//4 for reg bows
			setWeaponWeight(0);
			setWeaponCost(0);
			setDescription("\n\nFree ranged weapon. Unique that it does crush damage."
					+
					"\n" +
					"================================" +
					"\nSling\n"+					
					"POWER *\n"+
					"SPEED ****\n"+
					"RANGE **\n"+
					"PRICE FREE\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}

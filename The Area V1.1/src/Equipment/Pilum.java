package Equipment;

public class Pilum extends Weapons{
		public Pilum(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Pilum");
			setTwoHanded(true);
			setAttack_SLASH(5);
			setAttack_CRUSH(25);
			setAttack_PIERCING(55);
			setWeaponRange(50);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(3);//4 for reg bows
			setWeaponWeight(13);
			setWeaponCost(15);
			setDescription("\n\nHeavy Dart/Javelin designed against shields."
					+
					"\n" +
					"================================" +
					"\nA Spear Thrower\n"+					
					"POWER *****\n"+
					"SPEED ****\n"+
					"RANGE **\n"+
					"PRICE ***\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}

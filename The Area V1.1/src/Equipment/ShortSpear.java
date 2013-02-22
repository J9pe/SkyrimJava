package Equipment;

public class ShortSpear extends Weapons{
		public ShortSpear(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("ShortSpear");
			setTwoHanded(false);
			setAttack_SLASH(5);
			setAttack_CRUSH(5);
			setAttack_PIERCING(45);
			setWeaponRange(13);
			setWeaponType(5);//1 is melee, 2 is archery,5 is pole arm
			setAttackSpeed(1);//4 for range
			setWeaponWeight(15);
			setWeaponCost(10);
			setDescription("\n\nA basic and short spear, \n" +
					"useful for stabbing. Slightly longer \n" +
					"than one's height, but\n"+
					"its well balanced with speed and \n" +
					"flexibility as a versatile weapon\n"+"\n\n"
			
			+
			"\n" +
			"================================" +
			"\nA PoleArm"+					
			"POWER ****\n"+
			"SLASH *\n"+
			"CRUSH *\n"+
			"STAB  ****\n"+
			"SPEED *\n"+
			"RANGE *\n"+
			
			"PRICE ***\n"+
			"\n"+	
			"================================" +
			"\n");
		}
	

}
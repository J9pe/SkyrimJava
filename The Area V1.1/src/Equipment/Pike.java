package Equipment;

public class Pike extends Weapons{
		public Pike(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Pike");
			setTwoHanded(false);
			setAttack_SLASH(5);
			setAttack_CRUSH(0);
			setAttack_PIERCING(85);
			setWeaponRange(30);
			setWeaponType(5);//1 is melee, 2 is archery,5 is pole arm
			setAttackSpeed(2);//4 for range
			setWeaponWeight(20);
			setWeaponCost(18);
			setDescription("\n\nA basic long pike, \n" +
					"useful for stabbing. Slightly longer \n" +
					"than one's height, but\n"+
					"its well balanced with speed and \n" +
					"flexibility as a versatile weapon\n"+"\n\n"
			
			+
			"\n" +
			"================================" +
			"\nA Polearm\n"+					
			"POWER ****\n"+
			"SLASH *\n"+
			"CRUSH *\n"+
			"STAB  ****\n"+
			"SPEED **\n"+
			"RANGE ****\n"+
			
			"PRICE ***\n"+
			"\n"+	
			"================================" +
			"\n");
		}
	

}
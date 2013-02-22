package Equipment;

public class WarHammer extends Weapons{

		public WarHammer(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("WarHammer");
			setTwoHanded(false);
			setAttack_SLASH(10);
			setAttack_CRUSH(60);
			setAttack_PIERCING(10);
			setWeaponRange(9);
			setWeaponType(3);//1 is MODERATE melee, 2 is archery, 3IS HEAVY MELEE, 4 IS LIGHT MELEE
			setAttackSpeed(1);
			setWeaponWeight(30);
			setWeaponCost(19);
			setDescription("\n\nA war hammer is a late medieval \n" +
					"weapon of war intended for close combat action," +
					" the design of which resembles the hammer.\n" +
					" The war hammer consists of a handle and a head.\n" +
					" The handle may be of different lengths, \n" +
					"the longest being roughly equivalent to the halberd,\n" +
					" and the shortest about the same as a mace. "
					
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER *****\n"+
					"CRUSH *****\n"+
					"SPEED ***\n"+
					"RANGE N/A\n"+
					
					"PRICE ****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	
}

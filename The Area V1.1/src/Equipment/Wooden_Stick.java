package Equipment;

public class Wooden_Stick extends Weapons{
		public Wooden_Stick(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Wooden Stick");
			setTwoHanded(false);
			setAttack_SLASH(10);
			setAttack_CRUSH(20);
			setAttack_PIERCING(10);
			setWeaponRange(10);
			setWeaponType(1);//1 is melee, 2 is archery
			setAttackSpeed(1);//
			setWeaponWeight(10);
			setWeaponCost(0);
			setDescription("\n\nA basic cheap crude weapon,\n" +
					" its so bad that the guy is willing to give\nyou it for free\n" +
					"well balanced weapon desipite low combat effectiveness\n"+

					"\n\n"
					
					+
					"\n" +
					"================================" +
					"\nA Weapon\n"+					
					"POWER **\n"+
					"CRUSH ***\n"+
					"SPEED ****\n"+
					"RANGE N/A\n"+
					
					"PRICE FREE\n"+
					"\n"+	
					"================================" +
					"\n"
					
					);
			
			
			
		}
	

}
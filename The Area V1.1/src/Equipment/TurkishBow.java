package Equipment;

public class TurkishBow extends Weapons{
		public TurkishBow(){
			super("",false,0,0,0,0,0,0,"","",0,0);
			setweaponName("Turkish Bow");
			setTwoHanded(true);
			setAttack_SLASH(0);
			setAttack_CRUSH(5);
			setAttack_PIERCING(40);
			setWeaponRange(600);
			setWeaponType(2);//1 is melee, 2 is archery
			setAttackSpeed(4);//4 for reg bows
			setWeaponWeight(8);
			setWeaponCost(60);
			setDescription("\n\nThe bow with the longest bow-range in the game"
					+
					"\n" +
					"================================" +
					"\nA Bow\n"+					
					"POWER **\n"+
					"SPEED ***\n"+
					"RANGE *****\n"+
					"PRICE ****\n"+
					"\n"+	
					"================================" +
					"\n"
					);
			
			
		}
	

}
